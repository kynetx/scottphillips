window['kobj_ts'] = '20101011153552';/*  -----------------------------------------
 This is the object that manages a dynamic load of JS or CSS
 ------------------------------------------ */
function KrlExternalResource(url)
{
    this.url = url;
    this.loaded = false;
    this.requested = false;
    this.type = null;
    this.css_selector = null;
}

/*
 * Allow request a external resource to be loaded.   If it is already
 * request this will do nothing.
 */
KrlExternalResource.prototype.load = function() {
    if (this.requested)
    {
        return;
    }
    if (this.type == "css") {
        // Style sheets are hard to know if they loaded so just say they did.
        KOBJ.load_style_sheet_link(this.url);
        this.did_load();
    }
    else
    {
        KOBJ.require(this.url);
    }
};

/*
 * Checks to see if a resource is loaded. In the case of a javascript we will
 * be called back by the browser and will know for sure it was loaded but in
 * the case of css we only can check to see if the link is there.
 */
KrlExternalResource.prototype.is_loaded = function() {
    if (this.type == "css")
    {
        this.loaded = true;
        return this.loaded;
        //        return KOBJ.did_stylesheet_load(this.url);
    }
    return this.loaded;
};


/*
 * Sets the state of this resource as loaded so it will not
 * be loaded a second time.
 */
KrlExternalResource.prototype.did_load = function() {
    this.loaded = true;
    this.requested = false;

    $KOBJ.each(KOBJ.applications, function(index, app) {
        app.execute_pending_closures();
    });
};

/*  -----------------------------------------
 This is the object that manages a dataset in the runtime
 ------------------------------------------ */

function KrlDataSet(config)
{
    this.name = config["name"];
    this.data = config["data"];
}

/*  -----------------------------------------
 This is the object that manages a single application in the runtime.
 ------------------------------------------ */
function KrlApplication(app)
{
    // This applications id
    this.app_id = app;

    this.data_set_load_requested = false;

    // List of external resources needed for this app
    this.external_resources = null;

    // Data sets registered fro this app
    this.data_sets = null;

    this.delay_execution = false;
    this.page_params = {};

    // Defaults for request to server
    this.version = "blue";

    this.app_vars = {};

    // Closures that will execute after all resources and data is loaded
    this.pending_closures = {};
}


KrlApplication.prototype.store_data_sets = function(datasetdata)
{
    this.data_sets = datasetdata;
    // Execute and closures pending because they were waiting for resources.
    this.execute_pending_closures();
};

/*
 Add what external resources we need for THIS app
 */
KrlApplication.prototype.add_external_resources = function(resources)
{
    var my_resources = this.external_resources || {};
    $KOBJ.each(resources, function (index) {
        var a_resource = resources[index];
        my_resources[a_resource.url] = a_resource;
    });
    this.external_resources = my_resources;
};

/*
 * Tells us if the datasets have been loaded
 */
KrlApplication.prototype.is_data_loaded = function()
{
    return this.data_sets != null;
};

/*
 * This basicly resets the application and submits the pageview event again.
 */
KrlApplication.prototype.reload = function()
{
    KOBJEventManager.add_out_of_bound_event(this, "pageview");
};


/*
 Reload the application some time later.
 */
KrlApplication.prototype.reload_later = function(delay)
{
    var func = "KOBJ.get_application('" + this.app_id + "').reload();";
    setTimeout(func, delay);
};


KrlApplication.prototype.raise_event = function(event_name,parameters,other_app_id)
{
    var other_app = null;
    if(typeof(other_app_id) != "undefined" && other_app_id != null)
    {
        // If we are doing an event on another app it must be registered in order to
        // work.  So find it and add it if needed
        other_app = KOBJ.get_application(other_app_id);
        if(other_app == null)
        {
            other_app = KOBJ.add_app_config({rids: [other_app_id]});
            other_app = KOBJ.get_application(other_app_id);
            other_app.clone_app_params(this);
        }
    }
    else
    {
        other_app = this;
    }

    var all_data = {};

    if(typeof(parameters)  != "undefined" && parameters != null) {
        var found_data = [];
        $KOBJ.each(parameters, function(name,v) {
            found_data.push({name: name,value:v });
        });
        all_data["param_data"] = found_data;
    }

    KOBJEventManager.add_out_of_bound_event(other_app, event_name, true, all_data);

};



KrlApplication.prototype.clone_app_params = function(app) {
    var other_app_id = app.app_id;

    var myself = this;
    // right now we only need to know about app version
    $KOBJ.each(app.page_params, function(k, v) {
        // Because of an issue where people were passing in comma seperated list of app version we need
        // to apply a rule that if dev is found then that will be used if not found then the first one will be used.

        if (k == other_app_id + ":kynetx_app_version")
        {
          if(v.indexOf("dev") != -1)
          {
              myself.page_params[myself.app_id + ":kynetx_app_version"] = "dev" ;
          }
          else
          {
              myself.page_params[myself.app_id + ":kynetx_app_version"] = v.split(",")[0] ;
          }
        }
    });

};

KrlApplication.prototype.page_vars_as_url = function() {
    var param_str = "";
    var our_app_id = this.app_id;

    $KOBJ.each(this.page_params, function(k, v) {
        // Because of an issue where people were passing in comma seperated list of app version we need
        // to apply a rule that if dev is found then that will be used if not found then the first one will be used.

        if (k == our_app_id + ":kynetx_app_version")
        {
          if(v.indexOf("dev") != -1)
          {
              param_str += "&" + k + "=dev" ;
          }
          else
          {
              param_str += "&" + k + "=" + v.split(",")[0];
          }
        }
        else
        {
            param_str += "&" + k + "=" + v;
        }
    });


    return param_str;
};


/*
 * This will return true if all the resources are loaded.
 */
KrlApplication.prototype.are_resources_loaded = function()
{
    var is_loaded = true;
    if (this.external_resources != null)
    {
        $KOBJ.each(this.external_resources, function(index, value) {
            if (!value.is_loaded()) {
                is_loaded = false;
            }
        });
    }
    return is_loaded;
};

/*
 * Request a closure be executed. If the needed resources or data have not
 * been loaded then it is stored in a pending state to be executed when the
 * resources are loaded.
 */

KrlApplication.prototype.execute_closure = function(guid, a_closure)
{
    if (!this.is_data_loaded() || !this.are_resources_loaded())
    {
        KOBJ.itrace("Adding closure to pending list " + this.app_id + " : " + guid);
        this.pending_closures[guid] = a_closure;
    }
    else
    {
        this.pending_closures[guid] = a_closure;
        this.execute_pending_closures();
    }

};

/*
 * Because closures can be delayed because of needed resources or data
 * we store them off.  This method will execute the pending closures.
 */
KrlApplication.prototype.execute_pending_closures = function()
{

    if (!this.is_data_loaded() || !this.are_resources_loaded())
    {
        return;
    }

    var myself = this;
    $KOBJ.each(this.pending_closures, function(guid, the_closure) {
        KOBJ.itrace("Executing Closure " + myself.app_id + " - " + guid);
        try
        {
                the_closure($KOBJ);
        }
        catch(err)
        {
            KOBJ.loggers.general.error("Closure Executed with error " + myself.app_id + " - " + guid, err);
            KOBJ.errorstack_submit(KOBJ.default_error_stack_key, err, {name: "unknown", id: myself.app_id}  );
        }
        KOBJEventManager.event_fire_complete(guid,myself);
    });

    this.pending_closures = {};

};

KrlApplication.prototype.run = function()
{
    this.load_data_sets();
    KOBJEventManager.add_out_of_bound_event(this, "pageview");
};


KrlApplication.prototype.fire_event = function(event, data, guid,domain)
{
    this.load_data_sets();


    var url = [KOBJ.proto() +
               KOBJ.eval_host +
               KOBJ.kns_port,
        this.version,
        'event',
        domain,
        event,
        this.app_id,
        guid
    ].join("/");


    var all_vars = {};
    // If the old global kvars are defined add them
    if (typeof(kvars) != "undefined" || typeof(kvars) == "object") {
        $KOBJ.extend(true, all_vars, kvars);
    }
    $KOBJ.extend(true, all_vars, this.app_vars) ;

    params = [];

    // Someone want to put some extra parameters on the url.  This is used, for example
    // in the case of page_content events.
    if (data["param_data"] != null)
    {
        params = params.concat(data["param_data"]);
    }

    // If we have form data we need to transalate it.
    if (data["submit_data"] != null)
    {
        // In order for the engine to know how to deal with form fields we need
        // to translate from "name" to "app_id:name".

        var this_app = this;
        $KOBJ.each(data["submit_data"], function(index) {
            value = data["submit_data"][index];
            params.push({ "name"  : (this_app.app_id + ":" + value["name"]),
                "value" :  value["value"]});
        });
    }

    if (event != "pageview") {
        params.push({name: "element", value: data.selector});
    }


    params.push({name: "kvars", value: $KOBJ.toJSON(all_vars)});
    if(event == "pageview") {
        params.push({name: "caller", value: KOBJ.location('href')});
        params.push({name: "referer", value: KOBJ.document.referrer});
        params.push({name: "title", value: KOBJ.document.title});
    }

    var event_url = url + "?" +
                    $KOBJ.param(params) +
                    KOBJ.extra_page_vars_as_url() +
                    this.page_vars_as_url();


    KOBJ.require(event_url);
};


/*
 Execute the app by loading its javascript
 */
KrlApplication.prototype.fire_callbacks = function(guid)
{
    //TODO: Looks like callback_url is not used anywhere.
    //    KOBJ.callback_url = KOBJ.proto() + KOBJ.callback_host + KOBJ.kns_port + "/callback/" + KOBJ.siteIds();
};


/*
 Load up this applications datasets
 */
KrlApplication.prototype.load_data_sets = function()
{
    // We only try to load the data one time.  This is because if data is returned it would be
    // Cached by the browser for 24 hours.  Any data not to be cached for 24 hours or more will
    // not come back in this call anyway.
    if (!this.is_data_loaded() && !this.data_set_load_requested)
    {
        var data_url = KOBJ.proto() + KOBJ.init_host + KOBJ.kns_port + "/js/datasets/" + this.app_id + "/?t=t" +
                        this.page_vars_as_url();
        KOBJ.require(data_url);
    }
};


/*
 Reloads this apps configuration or create a new application from the config.
 */
KrlApplication.prototype.update_from_config = function(a_config)
{
    // TODO: this is here for backwards compatablity.
    if (a_config.delayExecution) {
        this.delay_execution = true;
    }

    // Search for page parameters.  They start with the app_id
    var my_self = this;
    $KOBJ.each(a_config, function(key, value) {
        if (key.match("^" + my_self.app_id)) {
            my_self.page_params[key] = value;
        }
        else
        {
            KOBJ.add_extra_page_var(key, value);
        }
    });
};


if (typeof($KOBJ) == 'undefined') {

    /* If there is a $ then we need to track it so we can set it back when we are done loading */
    if(typeof($) != 'undefined')
    {
        $$PREKOBJ = $;
    }

/*!
 * jQuery JavaScript Library v1.4.2
 * http://jquery.com/
 *
 * Copyright 2010, John Resig
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * Includes Sizzle.js
 * http://sizzlejs.com/
 * Copyright 2010, The Dojo Foundation
 * Released under the MIT, BSD, and GPL Licenses.
 *
 * Date: Sat Feb 13 22:33:48 2010 -0500
 */
(function( window, undefined ) {

// Define a local copy of jQuery
var jQuery = function( selector, context ) {
		// The jQuery object is actually just the init constructor 'enhanced'
		return new jQuery.fn.init( selector, context );
	},

	// Map over jQuery in case of overwrite
	_jQuery = window.jQuery,

	// Map over the $ in case of overwrite
	_$ = window.$,

	// Use the correct document accordingly with window argument (sandbox)
	document = window.document,

	// A central reference to the root jQuery(document)
	rootjQuery,

	// A simple way to check for HTML strings or ID strings
	// (both of which we optimize for)
	quickExpr = /^[^<]*(<[\w\W]+>)[^>]*$|^#([\w-]+)$/,

	// Is it a simple selector
	isSimple = /^.[^:#\[\.,]*$/,

	// Check if a string has a non-whitespace character in it
	rnotwhite = /\S/,

	// Used for trimming whitespace
	rtrim = /^(\s|\u00A0)+|(\s|\u00A0)+$/g,

	// Match a standalone tag
	rsingleTag = /^<(\w+)\s*\/?>(?:<\/\1>)?$/,

	// Keep a UserAgent string for use with jQuery.browser
	userAgent = navigator.userAgent,

	// For matching the engine and version of the browser
	browserMatch,

	// Has the ready events already been bound?
	readyBound = false,

	// The functions to execute on DOM ready
	readyList = [],

	// The ready event handler
	DOMContentLoaded,

	// Save a reference to some core methods
	toString = Object.prototype.toString,
	hasOwnProperty = Object.prototype.hasOwnProperty,
	push = Array.prototype.push,
	slice = Array.prototype.slice,
	indexOf = Array.prototype.indexOf;

jQuery.fn = jQuery.prototype = {
	init: function( selector, context ) {
		var match, elem, ret, doc;

		// Handle $(""), $(null), or $(undefined)
		if ( !selector ) {
			return this;
		}

		// Handle $(DOMElement)
		if ( selector.nodeType ) {
			this.context = this[0] = selector;
			this.length = 1;
			return this;
		}

		// The body element only exists once, optimize finding it
		if ( selector === "body" && !context ) {
			this.context = document;
			this[0] = document.body;
			this.selector = "body";
			this.length = 1;
			return this;
		}

		// Handle HTML strings
		if ( typeof selector === "string" ) {
			// Are we dealing with HTML string or an ID?
			match = quickExpr.exec( selector );

			// Verify a match, and that no context was specified for #id
			if ( match && (match[1] || !context) ) {

				// HANDLE: $(html) -> $(array)
				if ( match[1] ) {
					doc = (context ? context.ownerDocument || context : document);

					// If a single string is passed in and it's a single tag
					// just do a createElement and skip the rest
					ret = rsingleTag.exec( selector );

					if ( ret ) {
						if ( jQuery.isPlainObject( context ) ) {
							selector = [ document.createElement( ret[1] ) ];
							jQuery.fn.attr.call( selector, context, true );

						} else {
							selector = [ doc.createElement( ret[1] ) ];
						}

					} else {
						ret = buildFragment( [ match[1] ], [ doc ] );
						selector = (ret.cacheable ? ret.fragment.cloneNode(true) : ret.fragment).childNodes;
					}

					return jQuery.merge( this, selector );

				// HANDLE: $("#id")
				} else {
					elem = document.getElementById( match[2] );

					if ( elem ) {
						// Handle the case where IE and Opera return items
						// by name instead of ID
						if ( elem.id !== match[2] ) {
							return rootjQuery.find( selector );
						}

						// Otherwise, we inject the element directly into the jQuery object
						this.length = 1;
						this[0] = elem;
					}

					this.context = document;
					this.selector = selector;
					return this;
				}

			// HANDLE: $("TAG")
			} else if ( !context && /^\w+$/.test( selector ) ) {
				this.selector = selector;
				this.context = document;
				selector = document.getElementsByTagName( selector );
				return jQuery.merge( this, selector );

			// HANDLE: $(expr, $(...))
			} else if ( !context || context.jquery ) {
				return (context || rootjQuery).find( selector );

			// HANDLE: $(expr, context)
			// (which is just equivalent to: $(context).find(expr)
			} else {
				return jQuery( context ).find( selector );
			}

		// HANDLE: $(function)
		// Shortcut for document ready
		} else if ( jQuery.isFunction( selector ) ) {
			return rootjQuery.ready( selector );
		}

		if (selector.selector !== undefined) {
			this.selector = selector.selector;
			this.context = selector.context;
		}

		return jQuery.makeArray( selector, this );
	},

	// Start with an empty selector
	selector: "",

	// The current version of jQuery being used
	jquery: "1.4.2.kobj",

	// The default length of a jQuery object is 0
	length: 0,

	// The number of elements contained in the matched element set
	size: function() {
		return this.length;
	},

	toArray: function() {
		return slice.call( this, 0 );
	},

	// Get the Nth element in the matched element set OR
	// Get the whole matched element set as a clean array
	get: function( num ) {
		return num == null ?

			// Return a 'clean' array
			this.toArray() :

			// Return just the object
			( num < 0 ? this.slice(num)[ 0 ] : this[ num ] );
	},

	// Take an array of elements and push it onto the stack
	// (returning the new matched element set)
	pushStack: function( elems, name, selector ) {
		// Build a new jQuery matched element set
		var ret = jQuery();

		if ( jQuery.isArray( elems ) ) {
			push.apply( ret, elems );

		} else {
			jQuery.merge( ret, elems );
		}

		// Add the old object onto the stack (as a reference)
		ret.prevObject = this;

		ret.context = this.context;

		if ( name === "find" ) {
			ret.selector = this.selector + (this.selector ? " " : "") + selector;
		} else if ( name ) {
			ret.selector = this.selector + "." + name + "(" + selector + ")";
		}

		// Return the newly-formed element set
		return ret;
	},

	// Execute a callback for every element in the matched set.
	// (You can seed the arguments with an array of args, but this is
	// only used internally.)
	each: function( callback, args ) {
		return jQuery.each( this, callback, args );
	},

	ready: function( fn ) {
		// Attach the listeners
		jQuery.bindReady();

		// If the DOM is already ready
		if ( jQuery.isReady ) {
			// Execute the function immediately
			fn.call( document, jQuery );

		// Otherwise, remember the function for later
		} else if ( readyList ) {
			// Add the function to the wait list
			readyList.push( fn );
		}

		return this;
	},

	eq: function( i ) {
		return i === -1 ?
			this.slice( i ) :
			this.slice( i, +i + 1 );
	},

	first: function() {
		return this.eq( 0 );
	},

	last: function() {
		return this.eq( -1 );
	},

	slice: function() {
		return this.pushStack( slice.apply( this, arguments ),
			"slice", slice.call(arguments).join(",") );
	},

	map: function( callback ) {
		return this.pushStack( jQuery.map(this, function( elem, i ) {
			return callback.call( elem, i, elem );
		}));
	},

	end: function() {
		return this.prevObject || jQuery(null);
	},

	// For internal use only.
	// Behaves like an Array's method, not like a jQuery method.
	push: push,
	sort: [].sort,
	splice: [].splice
};

// Give the init function the jQuery prototype for later instantiation
jQuery.fn.init.prototype = jQuery.fn;

jQuery.extend = jQuery.fn.extend = function() {
	// copy reference to target object
	var target = arguments[0] || {}, i = 1, length = arguments.length, deep = false, options, name, src, copy;

	// Handle a deep copy situation
	if ( typeof target === "boolean" ) {
		deep = target;
		target = arguments[1] || {};
		// skip the boolean and the target
		i = 2;
	}

	// Handle case when target is a string or something (possible in deep copy)
	if ( typeof target !== "object" && !jQuery.isFunction(target) ) {
		target = {};
	}

	// extend jQuery itself if only one argument is passed
	if ( length === i ) {
		target = this;
		--i;
	}

	for ( ; i < length; i++ ) {
		// Only deal with non-null/undefined values
		if ( (options = arguments[ i ]) != null ) {
			// Extend the base object
			for ( name in options ) {
				src = target[ name ];
				copy = options[ name ];

				// Prevent never-ending loop
				if ( target === copy ) {
					continue;
				}

				// Recurse if we're merging object literal values or arrays
				if ( deep && copy && ( jQuery.isPlainObject(copy) || jQuery.isArray(copy) ) ) {
					var clone = src && ( jQuery.isPlainObject(src) || jQuery.isArray(src) ) ? src
						: jQuery.isArray(copy) ? [] : {};

					// Never move original objects, clone them
					target[ name ] = jQuery.extend( deep, clone, copy );

				// Don't bring in undefined values
				} else if ( copy !== undefined ) {
					target[ name ] = copy;
				}
			}
		}
	}

	// Return the modified object
	return target;
};

jQuery.extend({
	noConflict: function( deep ) {
		window.$ = _$;

		if ( deep ) {
			window.jQuery = _jQuery;
		}

		return jQuery;
	},

	// Is the DOM ready to be used? Set to true once it occurs.
	isReady: false,

	// Handle when the DOM is ready
	ready: function() {
		// Make sure that the DOM is not already loaded
		if ( !jQuery.isReady ) {
			// Make sure body exists, at least, in case IE gets a little overzealous (ticket #5443).
			if ( !document.body ) {
				return setTimeout( jQuery.ready, 13 );
			}

			// Remember that the DOM is ready
			jQuery.isReady = true;

			// If there are functions bound, to execute
			if ( readyList ) {
				// Execute all of them
				var fn, i = 0;
				while ( (fn = readyList[ i++ ]) ) {
					fn.call( document, jQuery );
				}

				// Reset the list of functions
				readyList = null;
			}

			// Trigger any bound ready events
			if ( jQuery.fn.triggerHandler ) {
				jQuery( document ).triggerHandler( "ready" );
			}
		}
	},

	bindReady: function() {
		if ( readyBound ) {
			return;
		}

		readyBound = true;

		// Catch cases where $(document).ready() is called after the
		// browser event has already occurred.
		if ( document.readyState === "complete" ) {
			return jQuery.ready();
		}

		// Mozilla, Opera and webkit nightlies currently support this event
		if ( document.addEventListener ) {
			// Use the handy event callback
			document.addEventListener( "DOMContentLoaded", DOMContentLoaded, false );

			// A fallback to window.onload, that will always work
			window.addEventListener( "load", jQuery.ready, false );

		// If IE event model is used
		} else if ( document.attachEvent ) {
			// ensure firing before onload,
			// maybe late but safe also for iframes
			document.attachEvent("onreadystatechange", DOMContentLoaded);

			// A fallback to window.onload, that will always work
			window.attachEvent( "onload", jQuery.ready );

			// If IE and not a frame
			// continually check to see if the document is ready
			var toplevel = false;

			try {
				toplevel = window.frameElement == null;
			} catch(e) {}

			if ( document.documentElement.doScroll && toplevel ) {
				doScrollCheck();
			}
		}
	},

	// See test/unit/core.js for details concerning isFunction.
	// Since version 1.3, DOM methods and functions like alert
	// aren't supported. They return false on IE (#2968).
	isFunction: function( obj ) {
		return toString.call(obj) === "[object Function]";
	},

	isArray: function( obj ) {
		return toString.call(obj) === "[object Array]";
	},

	isPlainObject: function( obj ) {
		// Must be an Object.
		// Because of IE, we also have to check the presence of the constructor property.
		// Make sure that DOM nodes and window objects don't pass through, as well
		if ( !obj || toString.call(obj) !== "[object Object]" || obj.nodeType || obj.setInterval ) {
			return false;
		}

		// Not own constructor property must be Object
		if ( obj.constructor
			&& !hasOwnProperty.call(obj, "constructor")
			&& !hasOwnProperty.call(obj.constructor.prototype, "isPrototypeOf") ) {
			return false;
		}

		// Own properties are enumerated firstly, so to speed up,
		// if last one is own, then all properties are own.

		var key;
		for ( key in obj ) {}

		return key === undefined || hasOwnProperty.call( obj, key );
	},

	isEmptyObject: function( obj ) {
		for ( var name in obj ) {
			return false;
		}
		return true;
	},

	error: function( msg ) {
		throw msg;
	},

	parseJSON: function( data ) {
		if ( typeof data !== "string" || !data ) {
			return null;
		}

		// Make sure leading/trailing whitespace is removed (IE can't handle it)
		data = jQuery.trim( data );

		// Make sure the incoming data is actual JSON
		// Logic borrowed from http://json.org/json2.js
		if ( /^[\],:{}\s]*$/.test(data.replace(/\\(?:["\\\/bfnrt]|u[0-9a-fA-F]{4})/g, "@")
			.replace(/"[^"\\\n\r]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g, "]")
			.replace(/(?:^|:|,)(?:\s*\[)+/g, "")) ) {

			// Try to use the native JSON parser first
			return window.JSON && window.JSON.parse ?
				window.JSON.parse( data ) :
				(new Function("return " + data))();

		} else {
			jQuery.error( "Invalid JSON: " + data );
		}
	},

	noop: function() {},

	// Evalulates a script in a global context
	globalEval: function( data ) {
		if ( data && rnotwhite.test(data) ) {
			// Inspired by code by Andrea Giammarchi
			// http://webreflection.blogspot.com/2007/08/global-scope-evaluation-and-dom.html
			var head = document.getElementsByTagName("head")[0] || document.documentElement,
				script = document.createElement("script");

			script.type = "text/javascript";

			if ( jQuery.support.scriptEval ) {
				script.appendChild( document.createTextNode( data ) );
			} else {
				script.text = data;
			}

			// Use insertBefore instead of appendChild to circumvent an IE6 bug.
			// This arises when a base node is used (#2709).
			head.insertBefore( script, head.firstChild );
			head.removeChild( script );
		}
	},

	nodeName: function( elem, name ) {
		return elem.nodeName && elem.nodeName.toUpperCase() === name.toUpperCase();
	},

	// args is for internal usage only
	each: function( object, callback, args ) {
		var name, i = 0,
			length = object.length,
			isObj = length === undefined || jQuery.isFunction(object);

		if ( args ) {
			if ( isObj ) {
				for ( name in object ) {
					if ( callback.apply( object[ name ], args ) === false ) {
						break;
					}
				}
			} else {
				for ( ; i < length; ) {
					if ( callback.apply( object[ i++ ], args ) === false ) {
						break;
					}
				}
			}

		// A special, fast, case for the most common use of each
		} else {
			if ( isObj ) {
				for ( name in object ) {
					if ( callback.call( object[ name ], name, object[ name ] ) === false ) {
						break;
					}
				}
			} else {
				for ( var value = object[0];
					i < length && callback.call( value, i, value ) !== false; value = object[++i] ) {}
			}
		}

		return object;
	},

	trim: function( text ) {
		return (text || "").replace( rtrim, "" );
	},

	// results is for internal usage only
	makeArray: function( array, results ) {
		var ret = results || [];

		if ( array != null ) {
			// The window, strings (and functions) also have 'length'
			// The extra typeof function check is to prevent crashes
			// in Safari 2 (See: #3039)
			if ( array.length == null || typeof array === "string" || jQuery.isFunction(array) || (typeof array !== "function" && array.setInterval) ) {
				push.call( ret, array );
			} else {
				jQuery.merge( ret, array );
			}
		}

		return ret;
	},

	inArray: function( elem, array ) {
		if ( array.indexOf ) {
			return array.indexOf( elem );
		}

		for ( var i = 0, length = array.length; i < length; i++ ) {
			if ( array[ i ] === elem ) {
				return i;
			}
		}

		return -1;
	},

	merge: function( first, second ) {
		var i = first.length, j = 0;

		if ( typeof second.length === "number" ) {
			for ( var l = second.length; j < l; j++ ) {
				first[ i++ ] = second[ j ];
			}

		} else {
			while ( second[j] !== undefined ) {
				first[ i++ ] = second[ j++ ];
			}
		}

		first.length = i;

		return first;
	},

	grep: function( elems, callback, inv ) {
		var ret = [];

		// Go through the array, only saving the items
		// that pass the validator function
		for ( var i = 0, length = elems.length; i < length; i++ ) {
			if ( !inv !== !callback( elems[ i ], i ) ) {
				ret.push( elems[ i ] );
			}
		}

		return ret;
	},

	// arg is for internal usage only
	map: function( elems, callback, arg ) {
		var ret = [], value;

		// Go through the array, translating each of the items to their
		// new value (or values).
		for ( var i = 0, length = elems.length; i < length; i++ ) {
			value = callback( elems[ i ], i, arg );

			if ( value != null ) {
				ret[ ret.length ] = value;
			}
		}

		return ret.concat.apply( [], ret );
	},

	// A global GUID counter for objects
	guid: 1,

	proxy: function( fn, proxy, thisObject ) {
		if ( arguments.length === 2 ) {
			if ( typeof proxy === "string" ) {
				thisObject = fn;
				fn = thisObject[ proxy ];
				proxy = undefined;

			} else if ( proxy && !jQuery.isFunction( proxy ) ) {
				thisObject = proxy;
				proxy = undefined;
			}
		}

		if ( !proxy && fn ) {
			proxy = function() {
				return fn.apply( thisObject || this, arguments );
			};
		}

		// Set the guid of unique handler to the same of original handler, so it can be removed
		if ( fn ) {
			proxy.guid = fn.guid = fn.guid || proxy.guid || jQuery.guid++;
		}

		// So proxy can be declared as an argument
		return proxy;
	},

	// Use of jQuery.browser is frowned upon.
	// More details: http://docs.jquery.com/Utilities/jQuery.browser
	uaMatch: function( ua ) {
		ua = ua.toLowerCase();

		var match = /(webkit)[ \/]([\w.]+)/.exec( ua ) ||
			/(opera)(?:.*version)?[ \/]([\w.]+)/.exec( ua ) ||
			/(msie) ([\w.]+)/.exec( ua ) ||
			!/compatible/.test( ua ) && /(mozilla)(?:.*? rv:([\w.]+))?/.exec( ua ) ||
		  	[];

		return { browser: match[1] || "", version: match[2] || "0" };
	},

	browser: {}
});

browserMatch = jQuery.uaMatch( userAgent );
if ( browserMatch.browser ) {
	jQuery.browser[ browserMatch.browser ] = true;
	jQuery.browser.version = browserMatch.version;
}

// Deprecated, use jQuery.browser.webkit instead
if ( jQuery.browser.webkit ) {
	jQuery.browser.safari = true;
}

if ( indexOf ) {
	jQuery.inArray = function( elem, array ) {
		return indexOf.call( array, elem );
	};
}

// All jQuery objects should point back to these
rootjQuery = jQuery(document);

// Cleanup functions for the document ready method
if ( document.addEventListener ) {
	DOMContentLoaded = function() {
		document.removeEventListener( "DOMContentLoaded", DOMContentLoaded, false );
		jQuery.ready();
	};

} else if ( document.attachEvent ) {
	DOMContentLoaded = function() {
		// Make sure body exists, at least, in case IE gets a little overzealous (ticket #5443).
		if ( document.readyState === "complete" ) {
			document.detachEvent( "onreadystatechange", DOMContentLoaded );
			jQuery.ready();
		}
	};
}

// The DOM ready check for Internet Explorer
function doScrollCheck() {
	if ( jQuery.isReady ) {
		return;
	}

	try {
		// If IE is used, use the trick by Diego Perini
		// http://javascript.nwbox.com/IEContentLoaded/
		document.documentElement.doScroll("left");
	} catch( error ) {
		setTimeout( doScrollCheck, 1 );
		return;
	}

	// and execute any waiting functions
	jQuery.ready();
}

function evalScript( i, elem ) {
	if ( elem.src ) {
		jQuery.ajax({
			url: elem.src,
			async: false,
			dataType: "script"
		});
	} else {
		jQuery.globalEval( elem.text || elem.textContent || elem.innerHTML || "" );
	}

	if ( elem.parentNode ) {
		elem.parentNode.removeChild( elem );
	}
}

// Mutifunctional method to get and set values to a collection
// The value/s can be optionally by executed if its a function
function access( elems, key, value, exec, fn, pass ) {
	var length = elems.length;

	// Setting many attributes
	if ( typeof key === "object" ) {
		for ( var k in key ) {
			access( elems, k, key[k], exec, fn, value );
		}
		return elems;
	}

	// Setting one attribute
	if ( value !== undefined ) {
		// Optionally, function values get executed if exec is true
		exec = !pass && exec && jQuery.isFunction(value);

		for ( var i = 0; i < length; i++ ) {
			fn( elems[i], key, exec ? value.call( elems[i], i, fn( elems[i], key ) ) : value, pass );
		}

		return elems;
	}

	// Getting an attribute
	return length ? fn( elems[0], key ) : undefined;
}

function now() {
	return (new Date).getTime();
}
(function() {

	jQuery.support = {};

	var root = document.documentElement,
		script = document.createElement("script"),
		div = document.createElement("div"),
		id = "script" + now();

	div.style.display = "none";
	div.innerHTML = "   <link/><table></table><a href='/a' style='color:red;float:left;opacity:.55;'>a</a><input type='checkbox'/>";

	var all = div.getElementsByTagName("*"),
		a = div.getElementsByTagName("a")[0];

	// Can't get basic test support
	if ( !all || !all.length || !a ) {
		return;
	}

	jQuery.support = {
		// IE strips leading whitespace when .innerHTML is used
		leadingWhitespace: div.firstChild.nodeType === 3,

		// Make sure that tbody elements aren't automatically inserted
		// IE will insert them into empty tables
		tbody: !div.getElementsByTagName("tbody").length,

		// Make sure that link elements get serialized correctly by innerHTML
		// This requires a wrapper element in IE
		htmlSerialize: !!div.getElementsByTagName("link").length,

		// Get the style information from getAttribute
		// (IE uses .cssText insted)
		style: /red/.test( a.getAttribute("style") ),

		// Make sure that URLs aren't manipulated
		// (IE normalizes it by default)
		hrefNormalized: a.getAttribute("href") === "/a",

		// Make sure that element opacity exists
		// (IE uses filter instead)
		// Use a regex to work around a WebKit issue. See #5145
		opacity: /^0.55$/.test( a.style.opacity ),

		// Verify style float existence
		// (IE uses styleFloat instead of cssFloat)
		cssFloat: !!a.style.cssFloat,

		// Make sure that if no value is specified for a checkbox
		// that it defaults to "on".
		// (WebKit defaults to "" instead)
		checkOn: div.getElementsByTagName("input")[0].value === "on",

		// Make sure that a selected-by-default option has a working selected property.
		// (WebKit defaults to false instead of true, IE too, if it's in an optgroup)
		optSelected: document.createElement("select").appendChild( document.createElement("option") ).selected,

		parentNode: div.removeChild( div.appendChild( document.createElement("div") ) ).parentNode === null,

		// Will be defined later
		deleteExpando: true,
		checkClone: false,
		scriptEval: false,
		noCloneEvent: true,
		boxModel: null
	};

	script.type = "text/javascript";
	try {
		script.appendChild( document.createTextNode( "window." + id + "=1;" ) );
	} catch(e) {}

	root.insertBefore( script, root.firstChild );

	// Make sure that the execution of code works by injecting a script
	// tag with appendChild/createTextNode
	// (IE doesn't support this, fails, and uses .text instead)
	if ( window[ id ] ) {
		jQuery.support.scriptEval = true;
		delete window[ id ];
	}

	// Test to see if it's possible to delete an expando from an element
	// Fails in Internet Explorer
	try {
		delete script.test;

	} catch(e) {
		jQuery.support.deleteExpando = false;
	}

	root.removeChild( script );

	if ( div.attachEvent && div.fireEvent ) {
		div.attachEvent("onclick", function click() {
			// Cloning a node shouldn't copy over any
			// bound event handlers (IE does this)
			jQuery.support.noCloneEvent = false;
			div.detachEvent("onclick", click);
		});
		div.cloneNode(true).fireEvent("onclick");
	}

	div = document.createElement("div");
	div.innerHTML = "<input type='radio' name='radiotest' checked='checked'/>";

	var fragment = document.createDocumentFragment();
	fragment.appendChild( div.firstChild );

	// WebKit doesn't clone checked state correctly in fragments
	jQuery.support.checkClone = fragment.cloneNode(true).cloneNode(true).lastChild.checked;

	// Figure out if the W3C box model works as expected
	// document.body must exist before we can do this
	jQuery(function() {
		var div = document.createElement("div");
		div.style.width = div.style.paddingLeft = "1px";

		document.body.appendChild( div );
		jQuery.boxModel = jQuery.support.boxModel = div.offsetWidth === 2;
		document.body.removeChild( div ).style.display = 'none';

		div = null;
	});

	// Technique from Juriy Zaytsev
	// http://thinkweb2.com/projects/prototype/detecting-event-support-without-browser-sniffing/
	var eventSupported = function( eventName ) {
		var el = document.createElement("div");
		eventName = "on" + eventName;

		var isSupported = (eventName in el);
		if ( !isSupported ) {
			el.setAttribute(eventName, "return;");
			isSupported = typeof el[eventName] === "function";
		}
		el = null;

		return isSupported;
	};

	jQuery.support.submitBubbles = eventSupported("submit");
	jQuery.support.changeBubbles = eventSupported("change");

	// release memory in IE
	root = script = div = all = a = null;
})();

jQuery.props = {
	"for": "htmlFor",
	"class": "className",
	readonly: "readOnly",
	maxlength: "maxLength",
	cellspacing: "cellSpacing",
	rowspan: "rowSpan",
	colspan: "colSpan",
	tabindex: "tabIndex",
	usemap: "useMap",
	frameborder: "frameBorder"
};
var expando = "jQuery" + now(), uuid = 0, windowData = {};

jQuery.extend({
	cache: {},

	expando:expando,

	// The following elements throw uncatchable exceptions if you
	// attempt to add expando properties to them.
	noData: {
		"embed": true,
		"object": true,
		"applet": true
	},

	data: function( elem, name, data ) {
		if ( elem.nodeName && jQuery.noData[elem.nodeName.toLowerCase()] ) {
			return;
		}

		elem = elem == window ?
			windowData :
			elem;

		var id = elem[ expando ], cache = jQuery.cache, thisCache;

		if ( !id && typeof name === "string" && data === undefined ) {
			return null;
		}

		// Compute a unique ID for the element
		if ( !id ) {
			id = ++uuid;
		}

		// Avoid generating a new cache unless none exists and we
		// want to manipulate it.
		if ( typeof name === "object" ) {
			elem[ expando ] = id;
			thisCache = cache[ id ] = jQuery.extend(true, {}, name);

		} else if ( !cache[ id ] ) {
			elem[ expando ] = id;
			cache[ id ] = {};
		}

		thisCache = cache[ id ];

		// Prevent overriding the named cache with undefined values
		if ( data !== undefined ) {
			thisCache[ name ] = data;
		}

		return typeof name === "string" ? thisCache[ name ] : thisCache;
	},

	removeData: function( elem, name ) {
		if ( elem.nodeName && jQuery.noData[elem.nodeName.toLowerCase()] ) {
			return;
		}

		elem = elem == window ?
			windowData :
			elem;

		var id = elem[ expando ], cache = jQuery.cache, thisCache = cache[ id ];

		// If we want to remove a specific section of the element's data
		if ( name ) {
			if ( thisCache ) {
				// Remove the section of cache data
				delete thisCache[ name ];

				// If we've removed all the data, remove the element's cache
				if ( jQuery.isEmptyObject(thisCache) ) {
					jQuery.removeData( elem );
				}
			}

		// Otherwise, we want to remove all of the element's data
		} else {
			if ( jQuery.support.deleteExpando ) {
				delete elem[ jQuery.expando ];

			} else if ( elem.removeAttribute ) {
				elem.removeAttribute( jQuery.expando );
			}

			// Completely remove the data cache
			delete cache[ id ];
		}
	}
});

jQuery.fn.extend({
	data: function( key, value ) {
		if ( typeof key === "undefined" && this.length ) {
			return jQuery.data( this[0] );

		} else if ( typeof key === "object" ) {
			return this.each(function() {
				jQuery.data( this, key );
			});
		}

		var parts = key.split(".");
		parts[1] = parts[1] ? "." + parts[1] : "";

		if ( value === undefined ) {
			var data = this.triggerHandler("getData" + parts[1] + "!", [parts[0]]);

			if ( data === undefined && this.length ) {
				data = jQuery.data( this[0], key );
			}
			return data === undefined && parts[1] ?
				this.data( parts[0] ) :
				data;
		} else {
			return this.trigger("setData" + parts[1] + "!", [parts[0], value]).each(function() {
				jQuery.data( this, key, value );
			});
		}
	},

	removeData: function( key ) {
		return this.each(function() {
			jQuery.removeData( this, key );
		});
	}
});
jQuery.extend({
	queue: function( elem, type, data ) {
		if ( !elem ) {
			return;
		}

		type = (type || "fx") + "queue";
		var q = jQuery.data( elem, type );

		// Speed up dequeue by getting out quickly if this is just a lookup
		if ( !data ) {
			return q || [];
		}

		if ( !q || jQuery.isArray(data) ) {
			q = jQuery.data( elem, type, jQuery.makeArray(data) );

		} else {
			q.push( data );
		}

		return q;
	},

	dequeue: function( elem, type ) {
		type = type || "fx";

		var queue = jQuery.queue( elem, type ), fn = queue.shift();

		// If the fx queue is dequeued, always remove the progress sentinel
		if ( fn === "inprogress" ) {
			fn = queue.shift();
		}

		if ( fn ) {
			// Add a progress sentinel to prevent the fx queue from being
			// automatically dequeued
			if ( type === "fx" ) {
				queue.unshift("inprogress");
			}

			fn.call(elem, function() {
				jQuery.dequeue(elem, type);
			});
		}
	}
});

jQuery.fn.extend({
	queue: function( type, data ) {
		if ( typeof type !== "string" ) {
			data = type;
			type = "fx";
		}

		if ( data === undefined ) {
			return jQuery.queue( this[0], type );
		}
		return this.each(function( i, elem ) {
			var queue = jQuery.queue( this, type, data );

			if ( type === "fx" && queue[0] !== "inprogress" ) {
				jQuery.dequeue( this, type );
			}
		});
	},
	dequeue: function( type ) {
		return this.each(function() {
			jQuery.dequeue( this, type );
		});
	},

	// Based off of the plugin by Clint Helfers, with permission.
	// http://blindsignals.com/index.php/2009/07/jquery-delay/
	delay: function( time, type ) {
		time = jQuery.fx ? jQuery.fx.speeds[time] || time : time;
		type = type || "fx";

		return this.queue( type, function() {
			var elem = this;
			setTimeout(function() {
				jQuery.dequeue( elem, type );
			}, time );
		});
	},

	clearQueue: function( type ) {
		return this.queue( type || "fx", [] );
	}
});
var rclass = /[\n\t]/g,
	rspace = /\s+/,
	rreturn = /\r/g,
	rspecialurl = /href|src|style/,
	rtype = /(button|input)/i,
	rfocusable = /(button|input|object|select|textarea)/i,
	rclickable = /^(a|area)$/i,
	rradiocheck = /radio|checkbox/;

jQuery.fn.extend({
	attr: function( name, value ) {
		return access( this, name, value, true, jQuery.attr );
	},

	removeAttr: function( name, fn ) {
		return this.each(function(){
			jQuery.attr( this, name, "" );
			if ( this.nodeType === 1 ) {
				this.removeAttribute( name );
			}
		});
	},

	addClass: function( value ) {
		if ( jQuery.isFunction(value) ) {
			return this.each(function(i) {
				var self = jQuery(this);
				self.addClass( value.call(this, i, self.attr("class")) );
			});
		}

		if ( value && typeof value === "string" ) {
			var classNames = (value || "").split( rspace );

			for ( var i = 0, l = this.length; i < l; i++ ) {
				var elem = this[i];

				if ( elem.nodeType === 1 ) {
					if ( !elem.className ) {
						elem.className = value;

					} else {
						var className = " " + elem.className + " ", setClass = elem.className;
						for ( var c = 0, cl = classNames.length; c < cl; c++ ) {
							if ( className.indexOf( " " + classNames[c] + " " ) < 0 ) {
								setClass += " " + classNames[c];
							}
						}
						elem.className = jQuery.trim( setClass );
					}
				}
			}
		}

		return this;
	},

	removeClass: function( value ) {
		if ( jQuery.isFunction(value) ) {
			return this.each(function(i) {
				var self = jQuery(this);
				self.removeClass( value.call(this, i, self.attr("class")) );
			});
		}

		if ( (value && typeof value === "string") || value === undefined ) {
			var classNames = (value || "").split(rspace);

			for ( var i = 0, l = this.length; i < l; i++ ) {
				var elem = this[i];

				if ( elem.nodeType === 1 && elem.className ) {
					if ( value ) {
						var className = (" " + elem.className + " ").replace(rclass, " ");
						for ( var c = 0, cl = classNames.length; c < cl; c++ ) {
							className = className.replace(" " + classNames[c] + " ", " ");
						}
						elem.className = jQuery.trim( className );

					} else {
						elem.className = "";
					}
				}
			}
		}

		return this;
	},

	toggleClass: function( value, stateVal ) {
		var type = typeof value, isBool = typeof stateVal === "boolean";

		if ( jQuery.isFunction( value ) ) {
			return this.each(function(i) {
				var self = jQuery(this);
				self.toggleClass( value.call(this, i, self.attr("class"), stateVal), stateVal );
			});
		}

		return this.each(function() {
			if ( type === "string" ) {
				// toggle individual class names
				var className, i = 0, self = jQuery(this),
					state = stateVal,
					classNames = value.split( rspace );

				while ( (className = classNames[ i++ ]) ) {
					// check each className given, space seperated list
					state = isBool ? state : !self.hasClass( className );
					self[ state ? "addClass" : "removeClass" ]( className );
				}

			} else if ( type === "undefined" || type === "boolean" ) {
				if ( this.className ) {
					// store className if set
					jQuery.data( this, "__className__", this.className );
				}

				// toggle whole className
				this.className = this.className || value === false ? "" : jQuery.data( this, "__className__" ) || "";
			}
		});
	},

	hasClass: function( selector ) {
		var className = " " + selector + " ";
		for ( var i = 0, l = this.length; i < l; i++ ) {
			if ( (" " + this[i].className + " ").replace(rclass, " ").indexOf( className ) > -1 ) {
				return true;
			}
		}

		return false;
	},

	val: function( value ) {
		if ( value === undefined ) {
			var elem = this[0];

			if ( elem ) {
				if ( jQuery.nodeName( elem, "option" ) ) {
					return (elem.attributes.value || {}).specified ? elem.value : elem.text;
				}

				// We need to handle select boxes special
				if ( jQuery.nodeName( elem, "select" ) ) {
					var index = elem.selectedIndex,
						values = [],
						options = elem.options,
						one = elem.type === "select-one";

					// Nothing was selected
					if ( index < 0 ) {
						return null;
					}

					// Loop through all the selected options
					for ( var i = one ? index : 0, max = one ? index + 1 : options.length; i < max; i++ ) {
						var option = options[ i ];

						if ( option.selected ) {
							// Get the specifc value for the option
							value = jQuery(option).val();

							// We don't need an array for one selects
							if ( one ) {
								return value;
							}

							// Multi-Selects return an array
							values.push( value );
						}
					}

					return values;
				}

				// Handle the case where in Webkit "" is returned instead of "on" if a value isn't specified
				if ( rradiocheck.test( elem.type ) && !jQuery.support.checkOn ) {
					return elem.getAttribute("value") === null ? "on" : elem.value;
				}


				// Everything else, we just grab the value
				return (elem.value || "").replace(rreturn, "");

			}

			return undefined;
		}

		var isFunction = jQuery.isFunction(value);

		return this.each(function(i) {
			var self = jQuery(this), val = value;

			if ( this.nodeType !== 1 ) {
				return;
			}

			if ( isFunction ) {
				val = value.call(this, i, self.val());
			}

			// Typecast each time if the value is a Function and the appended
			// value is therefore different each time.
			if ( typeof val === "number" ) {
				val += "";
			}

			if ( jQuery.isArray(val) && rradiocheck.test( this.type ) ) {
				this.checked = jQuery.inArray( self.val(), val ) >= 0;

			} else if ( jQuery.nodeName( this, "select" ) ) {
				var values = jQuery.makeArray(val);

				jQuery( "option", this ).each(function() {
					this.selected = jQuery.inArray( jQuery(this).val(), values ) >= 0;
				});

				if ( !values.length ) {
					this.selectedIndex = -1;
				}

			} else {
				this.value = val;
			}
		});
	}
});

jQuery.extend({
	attrFn: {
		val: true,
		css: true,
		html: true,
		text: true,
		data: true,
		width: true,
		height: true,
		offset: true
	},

	attr: function( elem, name, value, pass ) {
		// don't set attributes on text and comment nodes
		if ( !elem || elem.nodeType === 3 || elem.nodeType === 8 ) {
			return undefined;
		}

		if ( pass && name in jQuery.attrFn ) {
			return jQuery(elem)[name](value);
		}

		var notxml = elem.nodeType !== 1 || !jQuery.isXMLDoc( elem ),
			// Whether we are setting (or getting)
			set = value !== undefined;

		// Try to normalize/fix the name
		name = notxml && jQuery.props[ name ] || name;

		// Only do all the following if this is a node (faster for style)
		if ( elem.nodeType === 1 ) {
			// These attributes require special treatment
			var special = rspecialurl.test( name );

			// Safari mis-reports the default selected property of an option
			// Accessing the parent's selectedIndex property fixes it
			if ( name === "selected" && !jQuery.support.optSelected ) {
				var parent = elem.parentNode;
				if ( parent ) {
					parent.selectedIndex;

					// Make sure that it also works with optgroups, see #5701
					if ( parent.parentNode ) {
						parent.parentNode.selectedIndex;
					}
				}
			}

			// If applicable, access the attribute via the DOM 0 way
			if ( name in elem && notxml && !special ) {
				if ( set ) {
					// We can't allow the type property to be changed (since it causes problems in IE)
					if ( name === "type" && rtype.test( elem.nodeName ) && elem.parentNode ) {
						jQuery.error( "type property can't be changed" );
					}

					elem[ name ] = value;
				}

				// browsers index elements by id/name on forms, give priority to attributes.
				if ( jQuery.nodeName( elem, "form" ) && elem.getAttributeNode(name) ) {
					return elem.getAttributeNode( name ).nodeValue;
				}

				// elem.tabIndex doesn't always return the correct value when it hasn't been explicitly set
				// http://fluidproject.org/blog/2008/01/09/getting-setting-and-removing-tabindex-values-with-javascript/
				if ( name === "tabIndex" ) {
					var attributeNode = elem.getAttributeNode( "tabIndex" );

					return attributeNode && attributeNode.specified ?
						attributeNode.value :
						rfocusable.test( elem.nodeName ) || rclickable.test( elem.nodeName ) && elem.href ?
							0 :
							undefined;
				}

				return elem[ name ];
			}

			if ( !jQuery.support.style && notxml && name === "style" ) {
				if ( set ) {
					elem.style.cssText = "" + value;
				}

				return elem.style.cssText;
			}

			if ( set ) {
				// convert the value to a string (all browsers do this but IE) see #1070
				elem.setAttribute( name, "" + value );
			}

			var attr = !jQuery.support.hrefNormalized && notxml && special ?
					// Some attributes require a special call on IE
					elem.getAttribute( name, 2 ) :
					elem.getAttribute( name );

			// Non-existent attributes return null, we normalize to undefined
			return attr === null ? undefined : attr;
		}

		// elem is actually elem.style ... set the style
		// Using attr for specific style information is now deprecated. Use style instead.
		return jQuery.style( elem, name, value );
	}
});
var rnamespaces = /\.(.*)$/,
	fcleanup = function( nm ) {
		return nm.replace(/[^\w\s\.\|`]/g, function( ch ) {
			return "\\" + ch;
		});
	};

/*
 * A number of helper functions used for managing events.
 * Many of the ideas behind this code originated from
 * Dean Edwards' addEvent library.
 */
jQuery.event = {

	// Bind an event to an element
	// Original by Dean Edwards
	add: function( elem, types, handler, data ) {
		if ( elem.nodeType === 3 || elem.nodeType === 8 ) {
			return;
		}

		// For whatever reason, IE has trouble passing the window object
		// around, causing it to be cloned in the process
		if ( elem.setInterval && ( elem !== window && !elem.frameElement ) ) {
			elem = window;
		}

		var handleObjIn, handleObj;

		if ( handler.handler ) {
			handleObjIn = handler;
			handler = handleObjIn.handler;
		}

		// Make sure that the function being executed has a unique ID
		if ( !handler.guid ) {
			handler.guid = jQuery.guid++;
		}

		// Init the element's event structure
		var elemData = jQuery.data( elem );

		// If no elemData is found then we must be trying to bind to one of the
		// banned noData elements
		if ( !elemData ) {
			return;
		}

		var events = elemData.events = elemData.events || {},
			eventHandle = elemData.handle, eventHandle;

		if ( !eventHandle ) {
			elemData.handle = eventHandle = function() {
				// Handle the second event of a trigger and when
				// an event is called after a page has unloaded
				return typeof jQuery !== "undefined" && !jQuery.event.triggered ?
					jQuery.event.handle.apply( eventHandle.elem, arguments ) :
					undefined;
			};
		}

		// Add elem as a property of the handle function
		// This is to prevent a memory leak with non-native events in IE.
		eventHandle.elem = elem;

		// Handle multiple events separated by a space
		// jQuery(...).bind("mouseover mouseout", fn);
		types = types.split(" ");

		var type, i = 0, namespaces;

		while ( (type = types[ i++ ]) ) {
			handleObj = handleObjIn ?
				jQuery.extend({}, handleObjIn) :
				{ handler: handler, data: data };

			// Namespaced event handlers
			if ( type.indexOf(".") > -1 ) {
				namespaces = type.split(".");
				type = namespaces.shift();
				handleObj.namespace = namespaces.slice(0).sort().join(".");

			} else {
				namespaces = [];
				handleObj.namespace = "";
			}

			handleObj.type = type;
			handleObj.guid = handler.guid;

			// Get the current list of functions bound to this event
			var handlers = events[ type ],
				special = jQuery.event.special[ type ] || {};

			// Init the event handler queue
			if ( !handlers ) {
				handlers = events[ type ] = [];

				// Check for a special event handler
				// Only use addEventListener/attachEvent if the special
				// events handler returns false
				if ( !special.setup || special.setup.call( elem, data, namespaces, eventHandle ) === false ) {
					// Bind the global event handler to the element
					if ( elem.addEventListener ) {
						elem.addEventListener( type, eventHandle, false );

					} else if ( elem.attachEvent ) {
						elem.attachEvent( "on" + type, eventHandle );
					}
				}
			}

			if ( special.add ) {
				special.add.call( elem, handleObj );

				if ( !handleObj.handler.guid ) {
					handleObj.handler.guid = handler.guid;
				}
			}

			// Add the function to the element's handler list
			handlers.push( handleObj );

			// Keep track of which events have been used, for global triggering
			jQuery.event.global[ type ] = true;
		}

		// Nullify elem to prevent memory leaks in IE
		elem = null;
	},

	global: {},

	// Detach an event or set of events from an element
	remove: function( elem, types, handler, pos ) {
		// don't do events on text and comment nodes
		if ( elem.nodeType === 3 || elem.nodeType === 8 ) {
			return;
		}

		var ret, type, fn, i = 0, all, namespaces, namespace, special, eventType, handleObj, origType,
			elemData = jQuery.data( elem ),
			events = elemData && elemData.events;

		if ( !elemData || !events ) {
			return;
		}

		// types is actually an event object here
		if ( types && types.type ) {
			handler = types.handler;
			types = types.type;
		}

		// Unbind all events for the element
		if ( !types || typeof types === "string" && types.charAt(0) === "." ) {
			types = types || "";

			for ( type in events ) {
				jQuery.event.remove( elem, type + types );
			}

			return;
		}

		// Handle multiple events separated by a space
		// jQuery(...).unbind("mouseover mouseout", fn);
		types = types.split(" ");

		while ( (type = types[ i++ ]) ) {
			origType = type;
			handleObj = null;
			all = type.indexOf(".") < 0;
			namespaces = [];

			if ( !all ) {
				// Namespaced event handlers
				namespaces = type.split(".");
				type = namespaces.shift();

				namespace = new RegExp("(^|\\.)" +
					jQuery.map( namespaces.slice(0).sort(), fcleanup ).join("\\.(?:.*\\.)?") + "(\\.|$)")
			}

			eventType = events[ type ];

			if ( !eventType ) {
				continue;
			}

			if ( !handler ) {
				for ( var j = 0; j < eventType.length; j++ ) {
					handleObj = eventType[ j ];

					if ( all || namespace.test( handleObj.namespace ) ) {
						jQuery.event.remove( elem, origType, handleObj.handler, j );
						eventType.splice( j--, 1 );
					}
				}

				continue;
			}

			special = jQuery.event.special[ type ] || {};

			for ( var j = pos || 0; j < eventType.length; j++ ) {
				handleObj = eventType[ j ];

				if ( handler.guid === handleObj.guid ) {
					// remove the given handler for the given type
					if ( all || namespace.test( handleObj.namespace ) ) {
						if ( pos == null ) {
							eventType.splice( j--, 1 );
						}

						if ( special.remove ) {
							special.remove.call( elem, handleObj );
						}
					}

					if ( pos != null ) {
						break;
					}
				}
			}

			// remove generic event handler if no more handlers exist
			if ( eventType.length === 0 || pos != null && eventType.length === 1 ) {
				if ( !special.teardown || special.teardown.call( elem, namespaces ) === false ) {
					removeEvent( elem, type, elemData.handle );
				}

				ret = null;
				delete events[ type ];
			}
		}

		// Remove the expando if it's no longer used
		if ( jQuery.isEmptyObject( events ) ) {
			var handle = elemData.handle;
			if ( handle ) {
				handle.elem = null;
			}

			delete elemData.events;
			delete elemData.handle;

			if ( jQuery.isEmptyObject( elemData ) ) {
				jQuery.removeData( elem );
			}
		}
	},

	// bubbling is internal
	trigger: function( event, data, elem /*, bubbling */ ) {
		// Event object or event type
		var type = event.type || event,
			bubbling = arguments[3];

		if ( !bubbling ) {
			event = typeof event === "object" ?
				// jQuery.Event object
				event[expando] ? event :
				// Object literal
				jQuery.extend( jQuery.Event(type), event ) :
				// Just the event type (string)
				jQuery.Event(type);

			if ( type.indexOf("!") >= 0 ) {
				event.type = type = type.slice(0, -1);
				event.exclusive = true;
			}

			// Handle a global trigger
			if ( !elem ) {
				// Don't bubble custom events when global (to avoid too much overhead)
				event.stopPropagation();

				// Only trigger if we've ever bound an event for it
				if ( jQuery.event.global[ type ] ) {
					jQuery.each( jQuery.cache, function() {
						if ( this.events && this.events[type] ) {
							jQuery.event.trigger( event, data, this.handle.elem );
						}
					});
				}
			}

			// Handle triggering a single element

			// don't do events on text and comment nodes
			if ( !elem || elem.nodeType === 3 || elem.nodeType === 8 ) {
				return undefined;
			}

			// Clean up in case it is reused
			event.result = undefined;
			event.target = elem;

			// Clone the incoming data, if any
			data = jQuery.makeArray( data );
			data.unshift( event );
		}

		event.currentTarget = elem;

		// Trigger the event, it is assumed that "handle" is a function
		var handle = jQuery.data( elem, "handle" );
		if ( handle ) {
			handle.apply( elem, data );
		}

		var parent = elem.parentNode || elem.ownerDocument;

		// Trigger an inline bound script
		try {
			if ( !(elem && elem.nodeName && jQuery.noData[elem.nodeName.toLowerCase()]) ) {
				if ( elem[ "on" + type ] && elem[ "on" + type ].apply( elem, data ) === false ) {
					event.result = false;
				}
			}

		// prevent IE from throwing an error for some elements with some event types, see #3533
		} catch (e) {}

		if ( !event.isPropagationStopped() && parent ) {
			jQuery.event.trigger( event, data, parent, true );

		} else if ( !event.isDefaultPrevented() ) {
			var target = event.target, old,
				isClick = jQuery.nodeName(target, "a") && type === "click",
				special = jQuery.event.special[ type ] || {};

			if ( (!special._default || special._default.call( elem, event ) === false) &&
				!isClick && !(target && target.nodeName && jQuery.noData[target.nodeName.toLowerCase()]) ) {

				try {
					if ( target[ type ] ) {
						// Make sure that we don't accidentally re-trigger the onFOO events
						old = target[ "on" + type ];

						if ( old ) {
							target[ "on" + type ] = null;
						}

						jQuery.event.triggered = true;
						target[ type ]();
					}

				// prevent IE from throwing an error for some elements with some event types, see #3533
				} catch (e) {}

				if ( old ) {
					target[ "on" + type ] = old;
				}

				jQuery.event.triggered = false;
			}
		}
	},

	handle: function( event ) {
		var all, handlers, namespaces, namespace, events;

		event = arguments[0] = jQuery.event.fix( event || window.event );
		event.currentTarget = this;

		// Namespaced event handlers
		all = event.type.indexOf(".") < 0 && !event.exclusive;

		if ( !all ) {
			namespaces = event.type.split(".");
			event.type = namespaces.shift();
			namespace = new RegExp("(^|\\.)" + namespaces.slice(0).sort().join("\\.(?:.*\\.)?") + "(\\.|$)");
		}

		var events = jQuery.data(this, "events"), handlers = events[ event.type ];

		if ( events && handlers ) {
			// Clone the handlers to prevent manipulation
			handlers = handlers.slice(0);

			for ( var j = 0, l = handlers.length; j < l; j++ ) {
				var handleObj = handlers[ j ];

				// Filter the functions by class
				if ( all || namespace.test( handleObj.namespace ) ) {
					// Pass in a reference to the handler function itself
					// So that we can later remove it
					event.handler = handleObj.handler;
					event.data = handleObj.data;
					event.handleObj = handleObj;

					var ret = handleObj.handler.apply( this, arguments );

					if ( ret !== undefined ) {
						event.result = ret;
						if ( ret === false ) {
							event.preventDefault();
							event.stopPropagation();
						}
					}

					if ( event.isImmediatePropagationStopped() ) {
						break;
					}
				}
			}
		}

		return event.result;
	},

	props: "altKey attrChange attrName bubbles button cancelable charCode clientX clientY ctrlKey currentTarget data detail eventPhase fromElement handler keyCode layerX layerY metaKey newValue offsetX offsetY originalTarget pageX pageY prevValue relatedNode relatedTarget screenX screenY shiftKey srcElement target toElement view wheelDelta which".split(" "),

	fix: function( event ) {
		if ( event[ expando ] ) {
			return event;
		}

		// store a copy of the original event object
		// and "clone" to set read-only properties
		var originalEvent = event;
		event = jQuery.Event( originalEvent );

		for ( var i = this.props.length, prop; i; ) {
			prop = this.props[ --i ];
			event[ prop ] = originalEvent[ prop ];
		}

		// Fix target property, if necessary
		if ( !event.target ) {
			event.target = event.srcElement || document; // Fixes #1925 where srcElement might not be defined either
		}

		// check if target is a textnode (safari)
		if ( event.target.nodeType === 3 ) {
			event.target = event.target.parentNode;
		}

		// Add relatedTarget, if necessary
		if ( !event.relatedTarget && event.fromElement ) {
			event.relatedTarget = event.fromElement === event.target ? event.toElement : event.fromElement;
		}

		// Calculate pageX/Y if missing and clientX/Y available
		if ( event.pageX == null && event.clientX != null ) {
			var doc = document.documentElement, body = document.body;
			event.pageX = event.clientX + (doc && doc.scrollLeft || body && body.scrollLeft || 0) - (doc && doc.clientLeft || body && body.clientLeft || 0);
			event.pageY = event.clientY + (doc && doc.scrollTop  || body && body.scrollTop  || 0) - (doc && doc.clientTop  || body && body.clientTop  || 0);
		}

		// Add which for key events
		if ( !event.which && ((event.charCode || event.charCode === 0) ? event.charCode : event.keyCode) ) {
			event.which = event.charCode || event.keyCode;
		}

		// Add metaKey to non-Mac browsers (use ctrl for PC's and Meta for Macs)
		if ( !event.metaKey && event.ctrlKey ) {
			event.metaKey = event.ctrlKey;
		}

		// Add which for click: 1 === left; 2 === middle; 3 === right
		// Note: button is not normalized, so don't use it
		if ( !event.which && event.button !== undefined ) {
			event.which = (event.button & 1 ? 1 : ( event.button & 2 ? 3 : ( event.button & 4 ? 2 : 0 ) ));
		}

		return event;
	},

	// Deprecated, use jQuery.guid instead
	guid: 1E8,

	// Deprecated, use jQuery.proxy instead
	proxy: jQuery.proxy,

	special: {
		ready: {
			// Make sure the ready event is setup
			setup: jQuery.bindReady,
			teardown: jQuery.noop
		},

		live: {
			add: function( handleObj ) {
				jQuery.event.add( this, handleObj.origType, jQuery.extend({}, handleObj, {handler: liveHandler}) );
			},

			remove: function( handleObj ) {
				var remove = true,
					type = handleObj.origType.replace(rnamespaces, "");

				jQuery.each( jQuery.data(this, "events").live || [], function() {
					if ( type === this.origType.replace(rnamespaces, "") ) {
						remove = false;
						return false;
					}
				});

				if ( remove ) {
					jQuery.event.remove( this, handleObj.origType, liveHandler );
				}
			}

		},

		beforeunload: {
			setup: function( data, namespaces, eventHandle ) {
				// We only want to do this special case on windows
				if ( this.setInterval ) {
					this.onbeforeunload = eventHandle;
				}

				return false;
			},
			teardown: function( namespaces, eventHandle ) {
				if ( this.onbeforeunload === eventHandle ) {
					this.onbeforeunload = null;
				}
			}
		}
	}
};

var removeEvent = document.removeEventListener ?
	function( elem, type, handle ) {
		elem.removeEventListener( type, handle, false );
	} :
	function( elem, type, handle ) {
		elem.detachEvent( "on" + type, handle );
	};

jQuery.Event = function( src ) {
	// Allow instantiation without the 'new' keyword
	if ( !this.preventDefault ) {
		return new jQuery.Event( src );
	}

	// Event object
	if ( src && src.type ) {
		this.originalEvent = src;
		this.type = src.type;
	// Event type
	} else {
		this.type = src;
	}

	// timeStamp is buggy for some events on Firefox(#3843)
	// So we won't rely on the native value
	this.timeStamp = now();

	// Mark it as fixed
	this[ expando ] = true;
};

function returnFalse() {
	return false;
}
function returnTrue() {
	return true;
}

// jQuery.Event is based on DOM3 Events as specified by the ECMAScript Language Binding
// http://www.w3.org/TR/2003/WD-DOM-Level-3-Events-20030331/ecma-script-binding.html
jQuery.Event.prototype = {
	preventDefault: function() {
		this.isDefaultPrevented = returnTrue;

		var e = this.originalEvent;
		if ( !e ) {
			return;
		}

		// if preventDefault exists run it on the original event
		if ( e.preventDefault ) {
			e.preventDefault();
		}
		// otherwise set the returnValue property of the original event to false (IE)
		e.returnValue = false;
	},
	stopPropagation: function() {
		this.isPropagationStopped = returnTrue;

		var e = this.originalEvent;
		if ( !e ) {
			return;
		}
		// if stopPropagation exists run it on the original event
		if ( e.stopPropagation ) {
			e.stopPropagation();
		}
		// otherwise set the cancelBubble property of the original event to true (IE)
		e.cancelBubble = true;
	},
	stopImmediatePropagation: function() {
		this.isImmediatePropagationStopped = returnTrue;
		this.stopPropagation();
	},
	isDefaultPrevented: returnFalse,
	isPropagationStopped: returnFalse,
	isImmediatePropagationStopped: returnFalse
};

// Checks if an event happened on an element within another element
// Used in jQuery.event.special.mouseenter and mouseleave handlers
var withinElement = function( event ) {
	// Check if mouse(over|out) are still within the same parent element
	var parent = event.relatedTarget;

	// Firefox sometimes assigns relatedTarget a XUL element
	// which we cannot access the parentNode property of
	try {
		// Traverse up the tree
		while ( parent && parent !== this ) {
			parent = parent.parentNode;
		}

		if ( parent !== this ) {
			// set the correct event type
			event.type = event.data;

			// handle event if we actually just moused on to a non sub-element
			jQuery.event.handle.apply( this, arguments );
		}

	// assuming we've left the element since we most likely mousedover a xul element
	} catch(e) { }
},

// In case of event delegation, we only need to rename the event.type,
// liveHandler will take care of the rest.
delegate = function( event ) {
	event.type = event.data;
	jQuery.event.handle.apply( this, arguments );
};

// Create mouseenter and mouseleave events
jQuery.each({
	mouseenter: "mouseover",
	mouseleave: "mouseout"
}, function( orig, fix ) {
	jQuery.event.special[ orig ] = {
		setup: function( data ) {
			jQuery.event.add( this, fix, data && data.selector ? delegate : withinElement, orig );
		},
		teardown: function( data ) {
			jQuery.event.remove( this, fix, data && data.selector ? delegate : withinElement );
		}
	};
});

// submit delegation
if ( !jQuery.support.submitBubbles ) {

	jQuery.event.special.submit = {
		setup: function( data, namespaces ) {
			if ( this.nodeName.toLowerCase() !== "form" ) {
				jQuery.event.add(this, "click.specialSubmit", function( e ) {
					var elem = e.target, type = elem.type;

					if ( (type === "submit" || type === "image") && jQuery( elem ).closest("form").length ) {
						return trigger( "submit", this, arguments );
					}
				});

				jQuery.event.add(this, "keypress.specialSubmit", function( e ) {
					var elem = e.target, type = elem.type;

					if ( (type === "text" || type === "password") && jQuery( elem ).closest("form").length && e.keyCode === 13 ) {
						return trigger( "submit", this, arguments );
					}
				});

			} else {
				return false;
			}
		},

		teardown: function( namespaces ) {
			jQuery.event.remove( this, ".specialSubmit" );
		}
	};

}

// change delegation, happens here so we have bind.
if ( !jQuery.support.changeBubbles ) {

	var formElems = /textarea|input|select/i,

	changeFilters,

	getVal = function( elem ) {
		var type = elem.type, val = elem.value;

		if ( type === "radio" || type === "checkbox" ) {
			val = elem.checked;

		} else if ( type === "select-multiple" ) {
			val = elem.selectedIndex > -1 ?
				jQuery.map( elem.options, function( elem ) {
					return elem.selected;
				}).join("-") :
				"";

		} else if ( elem.nodeName.toLowerCase() === "select" ) {
			val = elem.selectedIndex;
		}

		return val;
	},

	testChange = function testChange( e ) {
		var elem = e.target, data, val;

		if ( !formElems.test( elem.nodeName ) || elem.readOnly ) {
			return;
		}

		data = jQuery.data( elem, "_change_data" );
		val = getVal(elem);

		// the current data will be also retrieved by beforeactivate
		if ( e.type !== "focusout" || elem.type !== "radio" ) {
			jQuery.data( elem, "_change_data", val );
		}

		if ( data === undefined || val === data ) {
			return;
		}

		if ( data != null || val ) {
			e.type = "change";
			return jQuery.event.trigger( e, arguments[1], elem );
		}
	};

	jQuery.event.special.change = {
		filters: {
			focusout: testChange,

			click: function( e ) {
				var elem = e.target, type = elem.type;

				if ( type === "radio" || type === "checkbox" || elem.nodeName.toLowerCase() === "select" ) {
					return testChange.call( this, e );
				}
			},

			// Change has to be called before submit
			// Keydown will be called before keypress, which is used in submit-event delegation
			keydown: function( e ) {
				var elem = e.target, type = elem.type;

				if ( (e.keyCode === 13 && elem.nodeName.toLowerCase() !== "textarea") ||
					(e.keyCode === 32 && (type === "checkbox" || type === "radio")) ||
					type === "select-multiple" ) {
					return testChange.call( this, e );
				}
			},

			// Beforeactivate happens also before the previous element is blurred
			// with this event you can't trigger a change event, but you can store
			// information/focus[in] is not needed anymore
			beforeactivate: function( e ) {
				var elem = e.target;
				jQuery.data( elem, "_change_data", getVal(elem) );
			}
		},

		setup: function( data, namespaces ) {
			if ( this.type === "file" ) {
				return false;
			}

			for ( var type in changeFilters ) {
				jQuery.event.add( this, type + ".specialChange", changeFilters[type] );
			}

			return formElems.test( this.nodeName );
		},

		teardown: function( namespaces ) {
			jQuery.event.remove( this, ".specialChange" );

			return formElems.test( this.nodeName );
		}
	};

	changeFilters = jQuery.event.special.change.filters;
}

function trigger( type, elem, args ) {
	args[0].type = type;
	return jQuery.event.handle.apply( elem, args );
}

// Create "bubbling" focus and blur events
if ( document.addEventListener ) {
	jQuery.each({ focus: "focusin", blur: "focusout" }, function( orig, fix ) {
		jQuery.event.special[ fix ] = {
			setup: function() {
				this.addEventListener( orig, handler, true );
			},
			teardown: function() {
				this.removeEventListener( orig, handler, true );
			}
		};

		function handler( e ) {
			e = jQuery.event.fix( e );
			e.type = fix;
			return jQuery.event.handle.call( this, e );
		}
	});
}

jQuery.each(["bind", "one"], function( i, name ) {
	jQuery.fn[ name ] = function( type, data, fn ) {
		// Handle object literals
		if ( typeof type === "object" ) {
			for ( var key in type ) {
				this[ name ](key, data, type[key], fn);
			}
			return this;
		}

		if ( jQuery.isFunction( data ) ) {
			fn = data;
			data = undefined;
		}

		var handler = name === "one" ? jQuery.proxy( fn, function( event ) {
			jQuery( this ).unbind( event, handler );
			return fn.apply( this, arguments );
		}) : fn;

		if ( type === "unload" && name !== "one" ) {
			this.one( type, data, fn );

		} else {
			for ( var i = 0, l = this.length; i < l; i++ ) {
				jQuery.event.add( this[i], type, handler, data );
			}
		}

		return this;
	};
});

jQuery.fn.extend({
	unbind: function( type, fn ) {
		// Handle object literals
		if ( typeof type === "object" && !type.preventDefault ) {
			for ( var key in type ) {
				this.unbind(key, type[key]);
			}

		} else {
			for ( var i = 0, l = this.length; i < l; i++ ) {
				jQuery.event.remove( this[i], type, fn );
			}
		}

		return this;
	},

	delegate: function( selector, types, data, fn ) {
		return this.live( types, data, fn, selector );
	},

	undelegate: function( selector, types, fn ) {
		if ( arguments.length === 0 ) {
				return this.unbind( "live" );

		} else {
			return this.die( types, null, fn, selector );
		}
	},

	trigger: function( type, data ) {
		return this.each(function() {
			jQuery.event.trigger( type, data, this );
		});
	},

	triggerHandler: function( type, data ) {
		if ( this[0] ) {
			var event = jQuery.Event( type );
			event.preventDefault();
			event.stopPropagation();
			jQuery.event.trigger( event, data, this[0] );
			return event.result;
		}
	},

	toggle: function( fn ) {
		// Save reference to arguments for access in closure
		var args = arguments, i = 1;

		// link all the functions, so any of them can unbind this click handler
		while ( i < args.length ) {
			jQuery.proxy( fn, args[ i++ ] );
		}

		return this.click( jQuery.proxy( fn, function( event ) {
			// Figure out which function to execute
			var lastToggle = ( jQuery.data( this, "lastToggle" + fn.guid ) || 0 ) % i;
			jQuery.data( this, "lastToggle" + fn.guid, lastToggle + 1 );

			// Make sure that clicks stop
			event.preventDefault();

			// and execute the function
			return args[ lastToggle ].apply( this, arguments ) || false;
		}));
	},

	hover: function( fnOver, fnOut ) {
		return this.mouseenter( fnOver ).mouseleave( fnOut || fnOver );
	}
});

var liveMap = {
	focus: "focusin",
	blur: "focusout",
	mouseenter: "mouseover",
	mouseleave: "mouseout"
};

jQuery.each(["live", "die"], function( i, name ) {
	jQuery.fn[ name ] = function( types, data, fn, origSelector /* Internal Use Only */ ) {
		var type, i = 0, match, namespaces, preType,
			selector = origSelector || this.selector,
			context = origSelector ? this : jQuery( this.context );

		if ( jQuery.isFunction( data ) ) {
			fn = data;
			data = undefined;
		}

		types = (types || "").split(" ");

		while ( (type = types[ i++ ]) != null ) {
			match = rnamespaces.exec( type );
			namespaces = "";

			if ( match )  {
				namespaces = match[0];
				type = type.replace( rnamespaces, "" );
			}

			if ( type === "hover" ) {
				types.push( "mouseenter" + namespaces, "mouseleave" + namespaces );
				continue;
			}

			preType = type;

			if ( type === "focus" || type === "blur" ) {
				types.push( liveMap[ type ] + namespaces );
				type = type + namespaces;

			} else {
				type = (liveMap[ type ] || type) + namespaces;
			}

			if ( name === "live" ) {
				// bind live handler
				context.each(function(){
					jQuery.event.add( this, liveConvert( type, selector ),
						{ data: data, selector: selector, handler: fn, origType: type, origHandler: fn, preType: preType } );
				});

			} else {
				// unbind live handler
				context.unbind( liveConvert( type, selector ), fn );
			}
		}

		return this;
	}
});

function liveHandler( event ) {
	var stop, elems = [], selectors = [], args = arguments,
		related, match, handleObj, elem, j, i, l, data,
		events = jQuery.data( this, "events" );

	// Make sure we avoid non-left-click bubbling in Firefox (#3861)
	if ( event.liveFired === this || !events || !events.live || event.button && event.type === "click" ) {
		return;
	}

	event.liveFired = this;

	var live = events.live.slice(0);

	for ( j = 0; j < live.length; j++ ) {
		handleObj = live[j];

		if ( handleObj.origType.replace( rnamespaces, "" ) === event.type ) {
			selectors.push( handleObj.selector );

		} else {
			live.splice( j--, 1 );
		}
	}

	match = jQuery( event.target ).closest( selectors, event.currentTarget );

	for ( i = 0, l = match.length; i < l; i++ ) {
		for ( j = 0; j < live.length; j++ ) {
			handleObj = live[j];

			if ( match[i].selector === handleObj.selector ) {
				elem = match[i].elem;
				related = null;

				// Those two events require additional checking
				if ( handleObj.preType === "mouseenter" || handleObj.preType === "mouseleave" ) {
					related = jQuery( event.relatedTarget ).closest( handleObj.selector )[0];
				}

				if ( !related || related !== elem ) {
					elems.push({ elem: elem, handleObj: handleObj });
				}
			}
		}
	}

	for ( i = 0, l = elems.length; i < l; i++ ) {
		match = elems[i];
		event.currentTarget = match.elem;
		event.data = match.handleObj.data;
		event.handleObj = match.handleObj;

		if ( match.handleObj.origHandler.apply( match.elem, args ) === false ) {
			stop = false;
			break;
		}
	}

	return stop;
}

function liveConvert( type, selector ) {
	return "live." + (type && type !== "*" ? type + "." : "") + selector.replace(/\./g, "`").replace(/ /g, "&");
}

jQuery.each( ("blur focus focusin focusout load resize scroll unload click dblclick " +
	"mousedown mouseup mousemove mouseover mouseout mouseenter mouseleave " +
	"change select submit keydown keypress keyup error").split(" "), function( i, name ) {

	// Handle event binding
	jQuery.fn[ name ] = function( fn ) {
		return fn ? this.bind( name, fn ) : this.trigger( name );
	};

	if ( jQuery.attrFn ) {
		jQuery.attrFn[ name ] = true;
	}
});

// Prevent memory leaks in IE
// Window isn't included so as not to unbind existing unload events
// More info:
//  - http://isaacschlueter.com/2006/10/msie-memory-leaks/
if ( window.attachEvent && !window.addEventListener ) {
	window.attachEvent("onunload", function() {
		for ( var id in jQuery.cache ) {
			if ( jQuery.cache[ id ].handle ) {
				// Try/Catch is to handle iframes being unloaded, see #4280
				try {
					jQuery.event.remove( jQuery.cache[ id ].handle.elem );
				} catch(e) {}
			}
		}
	});
}
/*!
 * Sizzle CSS Selector Engine - v1.0
 *  Copyright 2009, The Dojo Foundation
 *  Released under the MIT, BSD, and GPL Licenses.
 *  More information: http://sizzlejs.com/
 */
(function(){

var chunker = /((?:\((?:\([^()]+\)|[^()]+)+\)|\[(?:\[[^[\]]*\]|['"][^'"]*['"]|[^[\]'"]+)+\]|\\.|[^ >+~,(\[\\]+)+|[>+~])(\s*,\s*)?((?:.|\r|\n)*)/g,
	done = 0,
	toString = Object.prototype.toString,
	hasDuplicate = false,
	baseHasDuplicate = true;

// Here we check if the JavaScript engine is using some sort of
// optimization where it does not always call our comparision
// function. If that is the case, discard the hasDuplicate value.
//   Thus far that includes Google Chrome.
[0, 0].sort(function(){
	baseHasDuplicate = false;
	return 0;
});

var Sizzle = function(selector, context, results, seed) {
	results = results || [];
	var origContext = context = context || document;

	if ( context.nodeType !== 1 && context.nodeType !== 9 ) {
		return [];
	}

	if ( !selector || typeof selector !== "string" ) {
		return results;
	}

	var parts = [], m, set, checkSet, extra, prune = true, contextXML = isXML(context),
		soFar = selector;

	// Reset the position of the chunker regexp (start from head)
	while ( (chunker.exec(""), m = chunker.exec(soFar)) !== null ) {
		soFar = m[3];

		parts.push( m[1] );

		if ( m[2] ) {
			extra = m[3];
			break;
		}
	}

	if ( parts.length > 1 && origPOS.exec( selector ) ) {
		if ( parts.length === 2 && Expr.relative[ parts[0] ] ) {
			set = posProcess( parts[0] + parts[1], context );
		} else {
			set = Expr.relative[ parts[0] ] ?
				[ context ] :
				Sizzle( parts.shift(), context );

			while ( parts.length ) {
				selector = parts.shift();

				if ( Expr.relative[ selector ] ) {
					selector += parts.shift();
				}

				set = posProcess( selector, set );
			}
		}
	} else {
		// Take a shortcut and set the context if the root selector is an ID
		// (but not if it'll be faster if the inner selector is an ID)
		if ( !seed && parts.length > 1 && context.nodeType === 9 && !contextXML &&
				Expr.match.ID.test(parts[0]) && !Expr.match.ID.test(parts[parts.length - 1]) ) {
			var ret = Sizzle.find( parts.shift(), context, contextXML );
			context = ret.expr ? Sizzle.filter( ret.expr, ret.set )[0] : ret.set[0];
		}

		if ( context ) {
			var ret = seed ?
				{ expr: parts.pop(), set: makeArray(seed) } :
				Sizzle.find( parts.pop(), parts.length === 1 && (parts[0] === "~" || parts[0] === "+") && context.parentNode ? context.parentNode : context, contextXML );
			set = ret.expr ? Sizzle.filter( ret.expr, ret.set ) : ret.set;

			if ( parts.length > 0 ) {
				checkSet = makeArray(set);
			} else {
				prune = false;
			}

			while ( parts.length ) {
				var cur = parts.pop(), pop = cur;

				if ( !Expr.relative[ cur ] ) {
					cur = "";
				} else {
					pop = parts.pop();
				}

				if ( pop == null ) {
					pop = context;
				}

				Expr.relative[ cur ]( checkSet, pop, contextXML );
			}
		} else {
			checkSet = parts = [];
		}
	}

	if ( !checkSet ) {
		checkSet = set;
	}

	if ( !checkSet ) {
		Sizzle.error( cur || selector );
	}

	if ( toString.call(checkSet) === "[object Array]" ) {
		if ( !prune ) {
			results.push.apply( results, checkSet );
		} else if ( context && context.nodeType === 1 ) {
			for ( var i = 0; checkSet[i] != null; i++ ) {
				if ( checkSet[i] && (checkSet[i] === true || checkSet[i].nodeType === 1 && contains(context, checkSet[i])) ) {
					results.push( set[i] );
				}
			}
		} else {
			for ( var i = 0; checkSet[i] != null; i++ ) {
				if ( checkSet[i] && checkSet[i].nodeType === 1 ) {
					results.push( set[i] );
				}
			}
		}
	} else {
		makeArray( checkSet, results );
	}

	if ( extra ) {
		Sizzle( extra, origContext, results, seed );
		Sizzle.uniqueSort( results );
	}

	return results;
};

Sizzle.uniqueSort = function(results){
	if ( sortOrder ) {
		hasDuplicate = baseHasDuplicate;
		results.sort(sortOrder);

		if ( hasDuplicate ) {
			for ( var i = 1; i < results.length; i++ ) {
				if ( results[i] === results[i-1] ) {
					results.splice(i--, 1);
				}
			}
		}
	}

	return results;
};

Sizzle.matches = function(expr, set){
	return Sizzle(expr, null, null, set);
};

Sizzle.find = function(expr, context, isXML){
	var set, match;

	if ( !expr ) {
		return [];
	}

	for ( var i = 0, l = Expr.order.length; i < l; i++ ) {
		var type = Expr.order[i], match;

		if ( (match = Expr.leftMatch[ type ].exec( expr )) ) {
			var left = match[1];
			match.splice(1,1);

			if ( left.substr( left.length - 1 ) !== "\\" ) {
				match[1] = (match[1] || "").replace(/\\/g, "");
				set = Expr.find[ type ]( match, context, isXML );
				if ( set != null ) {
					expr = expr.replace( Expr.match[ type ], "" );
					break;
				}
			}
		}
	}

	if ( !set ) {
		set = context.getElementsByTagName("*");
	}

	return {set: set, expr: expr};
};

Sizzle.filter = function(expr, set, inplace, not){
	var old = expr, result = [], curLoop = set, match, anyFound,
		isXMLFilter = set && set[0] && isXML(set[0]);

	while ( expr && set.length ) {
		for ( var type in Expr.filter ) {
			if ( (match = Expr.leftMatch[ type ].exec( expr )) != null && match[2] ) {
				var filter = Expr.filter[ type ], found, item, left = match[1];
				anyFound = false;

				match.splice(1,1);

				if ( left.substr( left.length - 1 ) === "\\" ) {
					continue;
				}

				if ( curLoop === result ) {
					result = [];
				}

				if ( Expr.preFilter[ type ] ) {
					match = Expr.preFilter[ type ]( match, curLoop, inplace, result, not, isXMLFilter );

					if ( !match ) {
						anyFound = found = true;
					} else if ( match === true ) {
						continue;
					}
				}

				if ( match ) {
					for ( var i = 0; (item = curLoop[i]) != null; i++ ) {
						if ( item ) {
							found = filter( item, match, i, curLoop );
							var pass = not ^ !!found;

							if ( inplace && found != null ) {
								if ( pass ) {
									anyFound = true;
								} else {
									curLoop[i] = false;
								}
							} else if ( pass ) {
								result.push( item );
								anyFound = true;
							}
						}
					}
				}

				if ( found !== undefined ) {
					if ( !inplace ) {
						curLoop = result;
					}

					expr = expr.replace( Expr.match[ type ], "" );

					if ( !anyFound ) {
						return [];
					}

					break;
				}
			}
		}

		// Improper expression
		if ( expr === old ) {
			if ( anyFound == null ) {
				Sizzle.error( expr );
			} else {
				break;
			}
		}

		old = expr;
	}

	return curLoop;
};

Sizzle.error = function( msg ) {
	throw "Syntax error, unrecognized expression: " + msg;
};

var Expr = Sizzle.selectors = {
	order: [ "ID", "NAME", "TAG" ],
	match: {
		ID: /#((?:[\w\u00c0-\uFFFF-]|\\.)+)/,
		CLASS: /\.((?:[\w\u00c0-\uFFFF-]|\\.)+)/,
		NAME: /\[name=['"]*((?:[\w\u00c0-\uFFFF-]|\\.)+)['"]*\]/,
		ATTR: /\[\s*((?:[\w\u00c0-\uFFFF-]|\\.)+)\s*(?:(\S?=)\s*(['"]*)(.*?)\3|)\s*\]/,
		TAG: /^((?:[\w\u00c0-\uFFFF\*-]|\\.)+)/,
		CHILD: /:(only|nth|last|first)-child(?:\((even|odd|[\dn+-]*)\))?/,
		POS: /:(nth|eq|gt|lt|first|last|even|odd)(?:\((\d*)\))?(?=[^-]|$)/,
		PSEUDO: /:((?:[\w\u00c0-\uFFFF-]|\\.)+)(?:\((['"]?)((?:\([^\)]+\)|[^\(\)]*)+)\2\))?/
	},
	leftMatch: {},
	attrMap: {
		"class": "className",
		"for": "htmlFor"
	},
	attrHandle: {
		href: function(elem){
			return elem.getAttribute("href");
		}
	},
	relative: {
		"+": function(checkSet, part){
			var isPartStr = typeof part === "string",
				isTag = isPartStr && !/\W/.test(part),
				isPartStrNotTag = isPartStr && !isTag;

			if ( isTag ) {
				part = part.toLowerCase();
			}

			for ( var i = 0, l = checkSet.length, elem; i < l; i++ ) {
				if ( (elem = checkSet[i]) ) {
					while ( (elem = elem.previousSibling) && elem.nodeType !== 1 ) {}

					checkSet[i] = isPartStrNotTag || elem && elem.nodeName.toLowerCase() === part ?
						elem || false :
						elem === part;
				}
			}

			if ( isPartStrNotTag ) {
				Sizzle.filter( part, checkSet, true );
			}
		},
		">": function(checkSet, part){
			var isPartStr = typeof part === "string";

			if ( isPartStr && !/\W/.test(part) ) {
				part = part.toLowerCase();

				for ( var i = 0, l = checkSet.length; i < l; i++ ) {
					var elem = checkSet[i];
					if ( elem ) {
						var parent = elem.parentNode;
						checkSet[i] = parent.nodeName.toLowerCase() === part ? parent : false;
					}
				}
			} else {
				for ( var i = 0, l = checkSet.length; i < l; i++ ) {
					var elem = checkSet[i];
					if ( elem ) {
						checkSet[i] = isPartStr ?
							elem.parentNode :
							elem.parentNode === part;
					}
				}

				if ( isPartStr ) {
					Sizzle.filter( part, checkSet, true );
				}
			}
		},
		"": function(checkSet, part, isXML){
			var doneName = done++, checkFn = dirCheck;

			if ( typeof part === "string" && !/\W/.test(part) ) {
				var nodeCheck = part = part.toLowerCase();
				checkFn = dirNodeCheck;
			}

			checkFn("parentNode", part, doneName, checkSet, nodeCheck, isXML);
		},
		"~": function(checkSet, part, isXML){
			var doneName = done++, checkFn = dirCheck;

			if ( typeof part === "string" && !/\W/.test(part) ) {
				var nodeCheck = part = part.toLowerCase();
				checkFn = dirNodeCheck;
			}

			checkFn("previousSibling", part, doneName, checkSet, nodeCheck, isXML);
		}
	},
	find: {
		ID: function(match, context, isXML){
			if ( typeof context.getElementById !== "undefined" && !isXML ) {
				var m = context.getElementById(match[1]);
				return m ? [m] : [];
			}
		},
		NAME: function(match, context){
			if ( typeof context.getElementsByName !== "undefined" ) {
				var ret = [], results = context.getElementsByName(match[1]);

				for ( var i = 0, l = results.length; i < l; i++ ) {
					if ( results[i].getAttribute("name") === match[1] ) {
						ret.push( results[i] );
					}
				}

				return ret.length === 0 ? null : ret;
			}
		},
		TAG: function(match, context){
			return context.getElementsByTagName(match[1]);
		}
	},
	preFilter: {
		CLASS: function(match, curLoop, inplace, result, not, isXML){
			match = " " + match[1].replace(/\\/g, "") + " ";

			if ( isXML ) {
				return match;
			}

			for ( var i = 0, elem; (elem = curLoop[i]) != null; i++ ) {
				if ( elem ) {
					if ( not ^ (elem.className && (" " + elem.className + " ").replace(/[\t\n]/g, " ").indexOf(match) >= 0) ) {
						if ( !inplace ) {
							result.push( elem );
						}
					} else if ( inplace ) {
						curLoop[i] = false;
					}
				}
			}

			return false;
		},
		ID: function(match){
			return match[1].replace(/\\/g, "");
		},
		TAG: function(match, curLoop){
			return match[1].toLowerCase();
		},
		CHILD: function(match){
			if ( match[1] === "nth" ) {
				// parse equations like 'even', 'odd', '5', '2n', '3n+2', '4n-1', '-n+6'
				var test = /(-?)(\d*)n((?:\+|-)?\d*)/.exec(
					match[2] === "even" && "2n" || match[2] === "odd" && "2n+1" ||
					!/\D/.test( match[2] ) && "0n+" + match[2] || match[2]);

				// calculate the numbers (first)n+(last) including if they are negative
				match[2] = (test[1] + (test[2] || 1)) - 0;
				match[3] = test[3] - 0;
			}

			// TODO: Move to normal caching system
			match[0] = done++;

			return match;
		},
		ATTR: function(match, curLoop, inplace, result, not, isXML){
			var name = match[1].replace(/\\/g, "");

			if ( !isXML && Expr.attrMap[name] ) {
				match[1] = Expr.attrMap[name];
			}

			if ( match[2] === "~=" ) {
				match[4] = " " + match[4] + " ";
			}

			return match;
		},
		PSEUDO: function(match, curLoop, inplace, result, not){
			if ( match[1] === "not" ) {
				// If we're dealing with a complex expression, or a simple one
				if ( ( chunker.exec(match[3]) || "" ).length > 1 || /^\w/.test(match[3]) ) {
					match[3] = Sizzle(match[3], null, null, curLoop);
				} else {
					var ret = Sizzle.filter(match[3], curLoop, inplace, true ^ not);
					if ( !inplace ) {
						result.push.apply( result, ret );
					}
					return false;
				}
			} else if ( Expr.match.POS.test( match[0] ) || Expr.match.CHILD.test( match[0] ) ) {
				return true;
			}

			return match;
		},
		POS: function(match){
			match.unshift( true );
			return match;
		}
	},
	filters: {
		enabled: function(elem){
			return elem.disabled === false && elem.type !== "hidden";
		},
		disabled: function(elem){
			return elem.disabled === true;
		},
		checked: function(elem){
			return elem.checked === true;
		},
		selected: function(elem){
			// Accessing this property makes selected-by-default
			// options in Safari work properly
			elem.parentNode.selectedIndex;
			return elem.selected === true;
		},
		parent: function(elem){
			return !!elem.firstChild;
		},
		empty: function(elem){
			return !elem.firstChild;
		},
		has: function(elem, i, match){
			return !!Sizzle( match[3], elem ).length;
		},
		header: function(elem){
			return /h\d/i.test( elem.nodeName );
		},
		text: function(elem){
			return "text" === elem.type;
		},
		radio: function(elem){
			return "radio" === elem.type;
		},
		checkbox: function(elem){
			return "checkbox" === elem.type;
		},
		file: function(elem){
			return "file" === elem.type;
		},
		password: function(elem){
			return "password" === elem.type;
		},
		submit: function(elem){
			return "submit" === elem.type;
		},
		image: function(elem){
			return "image" === elem.type;
		},
		reset: function(elem){
			return "reset" === elem.type;
		},
		button: function(elem){
			return "button" === elem.type || elem.nodeName.toLowerCase() === "button";
		},
		input: function(elem){
			return /input|select|textarea|button/i.test(elem.nodeName);
		}
	},
	setFilters: {
		first: function(elem, i){
			return i === 0;
		},
		last: function(elem, i, match, array){
			return i === array.length - 1;
		},
		even: function(elem, i){
			return i % 2 === 0;
		},
		odd: function(elem, i){
			return i % 2 === 1;
		},
		lt: function(elem, i, match){
			return i < match[3] - 0;
		},
		gt: function(elem, i, match){
			return i > match[3] - 0;
		},
		nth: function(elem, i, match){
			return match[3] - 0 === i;
		},
		eq: function(elem, i, match){
			return match[3] - 0 === i;
		}
	},
	filter: {
		PSEUDO: function(elem, match, i, array){
			var name = match[1], filter = Expr.filters[ name ];

			if ( filter ) {
				return filter( elem, i, match, array );
			} else if ( name === "contains" ) {
				return (elem.textContent || elem.innerText || getText([ elem ]) || "").indexOf(match[3]) >= 0;
			} else if ( name === "not" ) {
				var not = match[3];

				for ( var i = 0, l = not.length; i < l; i++ ) {
					if ( not[i] === elem ) {
						return false;
					}
				}

				return true;
			} else {
				Sizzle.error( "Syntax error, unrecognized expression: " + name );
			}
		},
		CHILD: function(elem, match){
			var type = match[1], node = elem;
			switch (type) {
				case 'only':
				case 'first':
					while ( (node = node.previousSibling) )	 {
						if ( node.nodeType === 1 ) {
							return false;
						}
					}
					if ( type === "first" ) {
						return true;
					}
					node = elem;
				case 'last':
					while ( (node = node.nextSibling) )	 {
						if ( node.nodeType === 1 ) {
							return false;
						}
					}
					return true;
				case 'nth':
					var first = match[2], last = match[3];

					if ( first === 1 && last === 0 ) {
						return true;
					}

					var doneName = match[0],
						parent = elem.parentNode;

					if ( parent && (parent.sizcache !== doneName || !elem.nodeIndex) ) {
						var count = 0;
						for ( node = parent.firstChild; node; node = node.nextSibling ) {
							if ( node.nodeType === 1 ) {
								node.nodeIndex = ++count;
							}
						}
						parent.sizcache = doneName;
					}

					var diff = elem.nodeIndex - last;
					if ( first === 0 ) {
						return diff === 0;
					} else {
						return ( diff % first === 0 && diff / first >= 0 );
					}
			}
		},
		ID: function(elem, match){
			return elem.nodeType === 1 && elem.getAttribute("id") === match;
		},
		TAG: function(elem, match){
			return (match === "*" && elem.nodeType === 1) || elem.nodeName.toLowerCase() === match;
		},
		CLASS: function(elem, match){
			return (" " + (elem.className || elem.getAttribute("class")) + " ")
				.indexOf( match ) > -1;
		},
		ATTR: function(elem, match){
			var name = match[1],
				result = Expr.attrHandle[ name ] ?
					Expr.attrHandle[ name ]( elem ) :
					elem[ name ] != null ?
						elem[ name ] :
						elem.getAttribute( name ),
				value = result + "",
				type = match[2],
				check = match[4];

			return result == null ?
				type === "!=" :
				type === "=" ?
				value === check :
				type === "*=" ?
				value.indexOf(check) >= 0 :
				type === "~=" ?
				(" " + value + " ").indexOf(check) >= 0 :
				!check ?
				value && result !== false :
				type === "!=" ?
				value !== check :
				type === "^=" ?
				value.indexOf(check) === 0 :
				type === "$=" ?
				value.substr(value.length - check.length) === check :
				type === "|=" ?
				value === check || value.substr(0, check.length + 1) === check + "-" :
				false;
		},
		POS: function(elem, match, i, array){
			var name = match[2], filter = Expr.setFilters[ name ];

			if ( filter ) {
				return filter( elem, i, match, array );
			}
		}
	}
};

var origPOS = Expr.match.POS;

for ( var type in Expr.match ) {
	Expr.match[ type ] = new RegExp( Expr.match[ type ].source + /(?![^\[]*\])(?![^\(]*\))/.source );
	Expr.leftMatch[ type ] = new RegExp( /(^(?:.|\r|\n)*?)/.source + Expr.match[ type ].source.replace(/\\(\d+)/g, function(all, num){
		return "\\" + (num - 0 + 1);
	}));
}

var makeArray = function(array, results) {
	array = Array.prototype.slice.call( array, 0 );

	if ( results ) {
		results.push.apply( results, array );
		return results;
	}

	return array;
};

// Perform a simple check to determine if the browser is capable of
// converting a NodeList to an array using builtin methods.
// Also verifies that the returned array holds DOM nodes
// (which is not the case in the Blackberry browser)
try {
	Array.prototype.slice.call( document.documentElement.childNodes, 0 )[0].nodeType;

// Provide a fallback method if it does not work
} catch(e){
	makeArray = function(array, results) {
		var ret = results || [];

		if ( toString.call(array) === "[object Array]" ) {
			Array.prototype.push.apply( ret, array );
		} else {
			if ( typeof array.length === "number" ) {
				for ( var i = 0, l = array.length; i < l; i++ ) {
					ret.push( array[i] );
				}
			} else {
				for ( var i = 0; array[i]; i++ ) {
					ret.push( array[i] );
				}
			}
		}

		return ret;
	};
}

var sortOrder;

if ( document.documentElement.compareDocumentPosition ) {
	sortOrder = function( a, b ) {
		if ( !a.compareDocumentPosition || !b.compareDocumentPosition ) {
			if ( a == b ) {
				hasDuplicate = true;
			}
			return a.compareDocumentPosition ? -1 : 1;
		}

		var ret = a.compareDocumentPosition(b) & 4 ? -1 : a === b ? 0 : 1;
		if ( ret === 0 ) {
			hasDuplicate = true;
		}
		return ret;
	};
} else if ( "sourceIndex" in document.documentElement ) {
	sortOrder = function( a, b ) {
		if ( !a.sourceIndex || !b.sourceIndex ) {
			if ( a == b ) {
				hasDuplicate = true;
			}
			return a.sourceIndex ? -1 : 1;
		}

		var ret = a.sourceIndex - b.sourceIndex;
		if ( ret === 0 ) {
			hasDuplicate = true;
		}
		return ret;
	};
} else if ( document.createRange ) {
	sortOrder = function( a, b ) {
		if ( !a.ownerDocument || !b.ownerDocument ) {
			if ( a == b ) {
				hasDuplicate = true;
			}
			return a.ownerDocument ? -1 : 1;
		}

		var aRange = a.ownerDocument.createRange(), bRange = b.ownerDocument.createRange();
		aRange.setStart(a, 0);
		aRange.setEnd(a, 0);
		bRange.setStart(b, 0);
		bRange.setEnd(b, 0);
		var ret = aRange.compareBoundaryPoints(Range.START_TO_END, bRange);
		if ( ret === 0 ) {
			hasDuplicate = true;
		}
		return ret;
	};
}

// Utility function for retreiving the text value of an array of DOM nodes
function getText( elems ) {
	var ret = "", elem;

	for ( var i = 0; elems[i]; i++ ) {
		elem = elems[i];

		// Get the text from text nodes and CDATA nodes
		if ( elem.nodeType === 3 || elem.nodeType === 4 ) {
			ret += elem.nodeValue;

		// Traverse everything else, except comment nodes
		} else if ( elem.nodeType !== 8 ) {
			ret += getText( elem.childNodes );
		}
	}

	return ret;
}

// Check to see if the browser returns elements by name when
// querying by getElementById (and provide a workaround)
(function(){
	// We're going to inject a fake input element with a specified name
	var form = document.createElement("div"),
		id = "script" + (new Date).getTime();
	form.innerHTML = "<a name='" + id + "'/>";

	// Inject it into the root element, check its status, and remove it quickly
	var root = document.documentElement;
	root.insertBefore( form, root.firstChild );

	// The workaround has to do additional checks after a getElementById
	// Which slows things down for other browsers (hence the branching)
	if ( document.getElementById( id ) ) {
		Expr.find.ID = function(match, context, isXML){
			if ( typeof context.getElementById !== "undefined" && !isXML ) {
				var m = context.getElementById(match[1]);
				return m ? m.id === match[1] || typeof m.getAttributeNode !== "undefined" && m.getAttributeNode("id").nodeValue === match[1] ? [m] : undefined : [];
			}
		};

		Expr.filter.ID = function(elem, match){
			var node = typeof elem.getAttributeNode !== "undefined" && elem.getAttributeNode("id");
			return elem.nodeType === 1 && node && node.nodeValue === match;
		};
	}

	root.removeChild( form );
	root = form = null; // release memory in IE
})();

(function(){
	// Check to see if the browser returns only elements
	// when doing getElementsByTagName("*")

	// Create a fake element
	var div = document.createElement("div");
	div.appendChild( document.createComment("") );

	// Make sure no comments are found
	if ( div.getElementsByTagName("*").length > 0 ) {
		Expr.find.TAG = function(match, context){
			var results = context.getElementsByTagName(match[1]);

			// Filter out possible comments
			if ( match[1] === "*" ) {
				var tmp = [];

				for ( var i = 0; results[i]; i++ ) {
					if ( results[i].nodeType === 1 ) {
						tmp.push( results[i] );
					}
				}

				results = tmp;
			}

			return results;
		};
	}

	// Check to see if an attribute returns normalized href attributes
	div.innerHTML = "<a href='#'></a>";
	if ( div.firstChild && typeof div.firstChild.getAttribute !== "undefined" &&
			div.firstChild.getAttribute("href") !== "#" ) {
		Expr.attrHandle.href = function(elem){
			return elem.getAttribute("href", 2);
		};
	}

	div = null; // release memory in IE
})();

if ( document.querySelectorAll ) {
	(function(){
		var oldSizzle = Sizzle, div = document.createElement("div");
		div.innerHTML = "<p class='TEST'></p>";

		// Safari can't handle uppercase or unicode characters when
		// in quirks mode.
		if ( div.querySelectorAll && div.querySelectorAll(".TEST").length === 0 ) {
			return;
		}

		Sizzle = function(query, context, extra, seed){
			context = context || document;

			// Only use querySelectorAll on non-XML documents
			// (ID selectors don't work in non-HTML documents)
			if ( !seed && context.nodeType === 9 && !isXML(context) ) {
				try {
					return makeArray( context.querySelectorAll(query), extra );
				} catch(e){}
			}

			return oldSizzle(query, context, extra, seed);
		};

		for ( var prop in oldSizzle ) {
			Sizzle[ prop ] = oldSizzle[ prop ];
		}

		div = null; // release memory in IE
	})();
}

(function(){
	var div = document.createElement("div");

	div.innerHTML = "<div class='test e'></div><div class='test'></div>";

	// Opera can't find a second classname (in 9.6)
	// Also, make sure that getElementsByClassName actually exists
	if ( !div.getElementsByClassName || div.getElementsByClassName("e").length === 0 ) {
		return;
	}

	// Safari caches class attributes, doesn't catch changes (in 3.2)
	div.lastChild.className = "e";

	if ( div.getElementsByClassName("e").length === 1 ) {
		return;
	}

	Expr.order.splice(1, 0, "CLASS");
	Expr.find.CLASS = function(match, context, isXML) {
		if ( typeof context.getElementsByClassName !== "undefined" && !isXML ) {
			return context.getElementsByClassName(match[1]);
		}
	};

	div = null; // release memory in IE
})();

function dirNodeCheck( dir, cur, doneName, checkSet, nodeCheck, isXML ) {
	for ( var i = 0, l = checkSet.length; i < l; i++ ) {
		var elem = checkSet[i];
		if ( elem ) {
			elem = elem[dir];
			var match = false;

			while ( elem ) {
				if ( elem.sizcache === doneName ) {
					match = checkSet[elem.sizset];
					break;
				}

				if ( elem.nodeType === 1 && !isXML ){
					elem.sizcache = doneName;
					elem.sizset = i;
				}

				if ( elem.nodeName.toLowerCase() === cur ) {
					match = elem;
					break;
				}

				elem = elem[dir];
			}

			checkSet[i] = match;
		}
	}
}

function dirCheck( dir, cur, doneName, checkSet, nodeCheck, isXML ) {
	for ( var i = 0, l = checkSet.length; i < l; i++ ) {
		var elem = checkSet[i];
		if ( elem ) {
			elem = elem[dir];
			var match = false;

			while ( elem ) {
				if ( elem.sizcache === doneName ) {
					match = checkSet[elem.sizset];
					break;
				}

				if ( elem.nodeType === 1 ) {
					if ( !isXML ) {
						elem.sizcache = doneName;
						elem.sizset = i;
					}
					if ( typeof cur !== "string" ) {
						if ( elem === cur ) {
							match = true;
							break;
						}

					} else if ( Sizzle.filter( cur, [elem] ).length > 0 ) {
						match = elem;
						break;
					}
				}

				elem = elem[dir];
			}

			checkSet[i] = match;
		}
	}
}

var contains = document.compareDocumentPosition ? function(a, b){
	return !!(a.compareDocumentPosition(b) & 16);
} : function(a, b){
	return a !== b && (a.contains ? a.contains(b) : true);
};

var isXML = function(elem){
	// documentElement is verified for cases where it doesn't yet exist
	// (such as loading iframes in IE - #4833)
	var documentElement = (elem ? elem.ownerDocument || elem : 0).documentElement;
	return documentElement ? documentElement.nodeName !== "HTML" : false;
};

var posProcess = function(selector, context){
	var tmpSet = [], later = "", match,
		root = context.nodeType ? [context] : context;

	// Position selectors must be done after the filter
	// And so must :not(positional) so we move all PSEUDOs to the end
	while ( (match = Expr.match.PSEUDO.exec( selector )) ) {
		later += match[0];
		selector = selector.replace( Expr.match.PSEUDO, "" );
	}

	selector = Expr.relative[selector] ? selector + "*" : selector;

	for ( var i = 0, l = root.length; i < l; i++ ) {
		Sizzle( selector, root[i], tmpSet );
	}

	return Sizzle.filter( later, tmpSet );
};

// EXPOSE
jQuery.find = Sizzle;
jQuery.expr = Sizzle.selectors;
jQuery.expr[":"] = jQuery.expr.filters;
jQuery.unique = Sizzle.uniqueSort;
jQuery.text = getText;
jQuery.isXMLDoc = isXML;
jQuery.contains = contains;

return;

window.Sizzle = Sizzle;

})();
var runtil = /Until$/,
	rparentsprev = /^(?:parents|prevUntil|prevAll)/,
	// Note: This RegExp should be improved, or likely pulled from Sizzle
	rmultiselector = /,/,
	slice = Array.prototype.slice;

// Implement the identical functionality for filter and not
var winnow = function( elements, qualifier, keep ) {
	if ( jQuery.isFunction( qualifier ) ) {
		return jQuery.grep(elements, function( elem, i ) {
			return !!qualifier.call( elem, i, elem ) === keep;
		});

	} else if ( qualifier.nodeType ) {
		return jQuery.grep(elements, function( elem, i ) {
			return (elem === qualifier) === keep;
		});

	} else if ( typeof qualifier === "string" ) {
		var filtered = jQuery.grep(elements, function( elem ) {
			return elem.nodeType === 1;
		});

		if ( isSimple.test( qualifier ) ) {
			return jQuery.filter(qualifier, filtered, !keep);
		} else {
			qualifier = jQuery.filter( qualifier, filtered );
		}
	}

	return jQuery.grep(elements, function( elem, i ) {
		return (jQuery.inArray( elem, qualifier ) >= 0) === keep;
	});
};

jQuery.fn.extend({
	find: function( selector ) {
		var ret = this.pushStack( "", "find", selector ), length = 0;

		for ( var i = 0, l = this.length; i < l; i++ ) {
			length = ret.length;
			jQuery.find( selector, this[i], ret );

			if ( i > 0 ) {
				// Make sure that the results are unique
				for ( var n = length; n < ret.length; n++ ) {
					for ( var r = 0; r < length; r++ ) {
						if ( ret[r] === ret[n] ) {
							ret.splice(n--, 1);
							break;
						}
					}
				}
			}
		}

		return ret;
	},

	has: function( target ) {
		var targets = jQuery( target );
		return this.filter(function() {
			for ( var i = 0, l = targets.length; i < l; i++ ) {
				if ( jQuery.contains( this, targets[i] ) ) {
					return true;
				}
			}
		});
	},

	not: function( selector ) {
		return this.pushStack( winnow(this, selector, false), "not", selector);
	},

	filter: function( selector ) {
		return this.pushStack( winnow(this, selector, true), "filter", selector );
	},

	is: function( selector ) {
		return !!selector && jQuery.filter( selector, this ).length > 0;
	},

	closest: function( selectors, context ) {
		if ( jQuery.isArray( selectors ) ) {
			var ret = [], cur = this[0], match, matches = {}, selector;

			if ( cur && selectors.length ) {
				for ( var i = 0, l = selectors.length; i < l; i++ ) {
					selector = selectors[i];

					if ( !matches[selector] ) {
						matches[selector] = jQuery.expr.match.POS.test( selector ) ?
							jQuery( selector, context || this.context ) :
							selector;
					}
				}

				while ( cur && cur.ownerDocument && cur !== context ) {
					for ( selector in matches ) {
						match = matches[selector];

						if ( match.jquery ? match.index(cur) > -1 : jQuery(cur).is(match) ) {
							ret.push({ selector: selector, elem: cur });
							delete matches[selector];
						}
					}
					cur = cur.parentNode;
				}
			}

			return ret;
		}

		var pos = jQuery.expr.match.POS.test( selectors ) ?
			jQuery( selectors, context || this.context ) : null;

		return this.map(function( i, cur ) {
			while ( cur && cur.ownerDocument && cur !== context ) {
				if ( pos ? pos.index(cur) > -1 : jQuery(cur).is(selectors) ) {
					return cur;
				}
				cur = cur.parentNode;
			}
			return null;
		});
	},

	// Determine the position of an element within
	// the matched set of elements
	index: function( elem ) {
		if ( !elem || typeof elem === "string" ) {
			return jQuery.inArray( this[0],
				// If it receives a string, the selector is used
				// If it receives nothing, the siblings are used
				elem ? jQuery( elem ) : this.parent().children() );
		}
		// Locate the position of the desired element
		return jQuery.inArray(
			// If it receives a jQuery object, the first element is used
			elem.jquery ? elem[0] : elem, this );
	},

	add: function( selector, context ) {
		var set = typeof selector === "string" ?
				jQuery( selector, context || this.context ) :
				jQuery.makeArray( selector ),
			all = jQuery.merge( this.get(), set );

		return this.pushStack( isDisconnected( set[0] ) || isDisconnected( all[0] ) ?
			all :
			jQuery.unique( all ) );
	},

	andSelf: function() {
		return this.add( this.prevObject );
	}
});

// A painfully simple check to see if an element is disconnected
// from a document (should be improved, where feasible).
function isDisconnected( node ) {
	return !node || !node.parentNode || node.parentNode.nodeType === 11;
}

jQuery.each({
	parent: function( elem ) {
		var parent = elem.parentNode;
		return parent && parent.nodeType !== 11 ? parent : null;
	},
	parents: function( elem ) {
		return jQuery.dir( elem, "parentNode" );
	},
	parentsUntil: function( elem, i, until ) {
		return jQuery.dir( elem, "parentNode", until );
	},
	next: function( elem ) {
		return jQuery.nth( elem, 2, "nextSibling" );
	},
	prev: function( elem ) {
		return jQuery.nth( elem, 2, "previousSibling" );
	},
	nextAll: function( elem ) {
		return jQuery.dir( elem, "nextSibling" );
	},
	prevAll: function( elem ) {
		return jQuery.dir( elem, "previousSibling" );
	},
	nextUntil: function( elem, i, until ) {
		return jQuery.dir( elem, "nextSibling", until );
	},
	prevUntil: function( elem, i, until ) {
		return jQuery.dir( elem, "previousSibling", until );
	},
	siblings: function( elem ) {
		return jQuery.sibling( elem.parentNode.firstChild, elem );
	},
	children: function( elem ) {
		return jQuery.sibling( elem.firstChild );
	},
	contents: function( elem ) {
		return jQuery.nodeName( elem, "iframe" ) ?
			elem.contentDocument || elem.contentWindow.document :
			jQuery.makeArray( elem.childNodes );
	}
}, function( name, fn ) {
	jQuery.fn[ name ] = function( until, selector ) {
		var ret = jQuery.map( this, fn, until );

		if ( !runtil.test( name ) ) {
			selector = until;
		}

		if ( selector && typeof selector === "string" ) {
			ret = jQuery.filter( selector, ret );
		}

		ret = this.length > 1 ? jQuery.unique( ret ) : ret;

		if ( (this.length > 1 || rmultiselector.test( selector )) && rparentsprev.test( name ) ) {
			ret = ret.reverse();
		}

		return this.pushStack( ret, name, slice.call(arguments).join(",") );
	};
});

jQuery.extend({
	filter: function( expr, elems, not ) {
		if ( not ) {
			expr = ":not(" + expr + ")";
		}

		return jQuery.find.matches(expr, elems);
	},

	dir: function( elem, dir, until ) {
		var matched = [], cur = elem[dir];
		while ( cur && cur.nodeType !== 9 && (until === undefined || cur.nodeType !== 1 || !jQuery( cur ).is( until )) ) {
			if ( cur.nodeType === 1 ) {
				matched.push( cur );
			}
			cur = cur[dir];
		}
		return matched;
	},

	nth: function( cur, result, dir, elem ) {
		result = result || 1;
		var num = 0;

		for ( ; cur; cur = cur[dir] ) {
			if ( cur.nodeType === 1 && ++num === result ) {
				break;
			}
		}

		return cur;
	},

	sibling: function( n, elem ) {
		var r = [];

		for ( ; n; n = n.nextSibling ) {
			if ( n.nodeType === 1 && n !== elem ) {
				r.push( n );
			}
		}

		return r;
	}
});
var rinlinejQuery = / jQuery\d+="(?:\d+|null)"/g,
	rleadingWhitespace = /^\s+/,
	rxhtmlTag = /(<([\w:]+)[^>]*?)\/>/g,
	rselfClosing = /^(?:area|br|col|embed|hr|img|input|link|meta|param)$/i,
	rtagName = /<([\w:]+)/,
	rtbody = /<tbody/i,
	rhtml = /<|&#?\w+;/,
	rnocache = /<script|<object|<embed|<option|<style/i,
	rchecked = /checked\s*(?:[^=]|=\s*.checked.)/i,  // checked="checked" or checked (html5)
	fcloseTag = function( all, front, tag ) {
		return rselfClosing.test( tag ) ?
			all :
			front + "></" + tag + ">";
	},
	wrapMap = {
		option: [ 1, "<select multiple='multiple'>", "</select>" ],
		legend: [ 1, "<fieldset>", "</fieldset>" ],
		thead: [ 1, "<table>", "</table>" ],
		tr: [ 2, "<table><tbody>", "</tbody></table>" ],
		td: [ 3, "<table><tbody><tr>", "</tr></tbody></table>" ],
		col: [ 2, "<table><tbody></tbody><colgroup>", "</colgroup></table>" ],
		area: [ 1, "<map>", "</map>" ],
		_default: [ 0, "", "" ]
	};

wrapMap.optgroup = wrapMap.option;
wrapMap.tbody = wrapMap.tfoot = wrapMap.colgroup = wrapMap.caption = wrapMap.thead;
wrapMap.th = wrapMap.td;

// IE can't serialize <link> and <script> tags normally
if ( !jQuery.support.htmlSerialize ) {
	wrapMap._default = [ 1, "div<div>", "</div>" ];
}

jQuery.fn.extend({
	text: function( text ) {
		if ( jQuery.isFunction(text) ) {
			return this.each(function(i) {
				var self = jQuery(this);
				self.text( text.call(this, i, self.text()) );
			});
		}

		if ( typeof text !== "object" && text !== undefined ) {
			return this.empty().append( (this[0] && this[0].ownerDocument || document).createTextNode( text ) );
		}

		return jQuery.text( this );
	},

	wrapAll: function( html ) {
		if ( jQuery.isFunction( html ) ) {
			return this.each(function(i) {
				jQuery(this).wrapAll( html.call(this, i) );
			});
		}

		if ( this[0] ) {
			// The elements to wrap the target around
			var wrap = jQuery( html, this[0].ownerDocument ).eq(0).clone(true);

			if ( this[0].parentNode ) {
				wrap.insertBefore( this[0] );
			}

			wrap.map(function() {
				var elem = this;

				while ( elem.firstChild && elem.firstChild.nodeType === 1 ) {
					elem = elem.firstChild;
				}

				return elem;
			}).append(this);
		}

		return this;
	},

	wrapInner: function( html ) {
		if ( jQuery.isFunction( html ) ) {
			return this.each(function(i) {
				jQuery(this).wrapInner( html.call(this, i) );
			});
		}

		return this.each(function() {
			var self = jQuery( this ), contents = self.contents();

			if ( contents.length ) {
				contents.wrapAll( html );

			} else {
				self.append( html );
			}
		});
	},

	wrap: function( html ) {
		return this.each(function() {
			jQuery( this ).wrapAll( html );
		});
	},

	unwrap: function() {
		return this.parent().each(function() {
			if ( !jQuery.nodeName( this, "body" ) ) {
				jQuery( this ).replaceWith( this.childNodes );
			}
		}).end();
	},

	append: function() {
		return this.domManip(arguments, true, function( elem ) {
			if ( this.nodeType === 1 ) {
				this.appendChild( elem );
			}
		});
	},

	prepend: function() {
		return this.domManip(arguments, true, function( elem ) {
			if ( this.nodeType === 1 ) {
				this.insertBefore( elem, this.firstChild );
			}
		});
	},

	before: function() {
		if ( this[0] && this[0].parentNode ) {
			return this.domManip(arguments, false, function( elem ) {
				this.parentNode.insertBefore( elem, this );
			});
		} else if ( arguments.length ) {
			var set = jQuery(arguments[0]);
			set.push.apply( set, this.toArray() );
			return this.pushStack( set, "before", arguments );
		}
	},

	after: function() {
		if ( this[0] && this[0].parentNode ) {
			return this.domManip(arguments, false, function( elem ) {
				this.parentNode.insertBefore( elem, this.nextSibling );
			});
		} else if ( arguments.length ) {
			var set = this.pushStack( this, "after", arguments );
			set.push.apply( set, jQuery(arguments[0]).toArray() );
			return set;
		}
	},

	// keepData is for internal use only--do not document
	remove: function( selector, keepData ) {
		for ( var i = 0, elem; (elem = this[i]) != null; i++ ) {
			if ( !selector || jQuery.filter( selector, [ elem ] ).length ) {
				if ( !keepData && elem.nodeType === 1 ) {
					jQuery.cleanData( elem.getElementsByTagName("*") );
					jQuery.cleanData( [ elem ] );
				}

				if ( elem.parentNode ) {
					 elem.parentNode.removeChild( elem );
				}
			}
		}

		return this;
	},

	empty: function() {
		for ( var i = 0, elem; (elem = this[i]) != null; i++ ) {
			// Remove element nodes and prevent memory leaks
			if ( elem.nodeType === 1 ) {
				jQuery.cleanData( elem.getElementsByTagName("*") );
			}

			// Remove any remaining nodes
			while ( elem.firstChild ) {
				elem.removeChild( elem.firstChild );
			}
		}

		return this;
	},

	clone: function( events ) {
		// Do the clone
		var ret = this.map(function() {
			if ( !jQuery.support.noCloneEvent && !jQuery.isXMLDoc(this) ) {
				// IE copies events bound via attachEvent when
				// using cloneNode. Calling detachEvent on the
				// clone will also remove the events from the orignal
				// In order to get around this, we use innerHTML.
				// Unfortunately, this means some modifications to
				// attributes in IE that are actually only stored
				// as properties will not be copied (such as the
				// the name attribute on an input).
				var html = this.outerHTML, ownerDocument = this.ownerDocument;
				if ( !html ) {
					var div = ownerDocument.createElement("div");
					div.appendChild( this.cloneNode(true) );
					html = div.innerHTML;
				}

				return jQuery.clean([html.replace(rinlinejQuery, "")
					// Handle the case in IE 8 where action=/test/> self-closes a tag
					.replace(/=([^="'>\s]+\/)>/g, '="$1">')
					.replace(rleadingWhitespace, "")], ownerDocument)[0];
			} else {
				return this.cloneNode(true);
			}
		});

		// Copy the events from the original to the clone
		if ( events === true ) {
			cloneCopyEvent( this, ret );
			cloneCopyEvent( this.find("*"), ret.find("*") );
		}

		// Return the cloned set
		return ret;
	},

	html: function( value ) {
		if ( value === undefined ) {
			return this[0] && this[0].nodeType === 1 ?
				this[0].innerHTML.replace(rinlinejQuery, "") :
				null;

		// See if we can take a shortcut and just use innerHTML
		} else if ( typeof value === "string" && !rnocache.test( value ) &&
			(jQuery.support.leadingWhitespace || !rleadingWhitespace.test( value )) &&
			!wrapMap[ (rtagName.exec( value ) || ["", ""])[1].toLowerCase() ] ) {

			value = value.replace(rxhtmlTag, fcloseTag);

			try {
				for ( var i = 0, l = this.length; i < l; i++ ) {
					// Remove element nodes and prevent memory leaks
					if ( this[i].nodeType === 1 ) {
						jQuery.cleanData( this[i].getElementsByTagName("*") );
						this[i].innerHTML = value;
					}
				}

			// If using innerHTML throws an exception, use the fallback method
			} catch(e) {
				this.empty().append( value );
			}

		} else if ( jQuery.isFunction( value ) ) {
			this.each(function(i){
				var self = jQuery(this), old = self.html();
				self.empty().append(function(){
					return value.call( this, i, old );
				});
			});

		} else {
			this.empty().append( value );
		}

		return this;
	},

	replaceWith: function( value ) {
		if ( this[0] && this[0].parentNode ) {
			// Make sure that the elements are removed from the DOM before they are inserted
			// this can help fix replacing a parent with child elements
			if ( jQuery.isFunction( value ) ) {
				return this.each(function(i) {
					var self = jQuery(this), old = self.html();
					self.replaceWith( value.call( this, i, old ) );
				});
			}

			if ( typeof value !== "string" ) {
				value = jQuery(value).detach();
			}

			return this.each(function() {
				var next = this.nextSibling, parent = this.parentNode;

				jQuery(this).remove();

				if ( next ) {
					jQuery(next).before( value );
				} else {
					jQuery(parent).append( value );
				}
			});
		} else {
			return this.pushStack( jQuery(jQuery.isFunction(value) ? value() : value), "replaceWith", value );
		}
	},

	detach: function( selector ) {
		return this.remove( selector, true );
	},

	domManip: function( args, table, callback ) {
		var results, first, value = args[0], scripts = [], fragment, parent;

		// We can't cloneNode fragments that contain checked, in WebKit
		if ( !jQuery.support.checkClone && arguments.length === 3 && typeof value === "string" && rchecked.test( value ) ) {
			return this.each(function() {
				jQuery(this).domManip( args, table, callback, true );
			});
		}

		if ( jQuery.isFunction(value) ) {
			return this.each(function(i) {
				var self = jQuery(this);
				args[0] = value.call(this, i, table ? self.html() : undefined);
				self.domManip( args, table, callback );
			});
		}

		if ( this[0] ) {
			parent = value && value.parentNode;

			// If we're in a fragment, just use that instead of building a new one
			if ( jQuery.support.parentNode && parent && parent.nodeType === 11 && parent.childNodes.length === this.length ) {
				results = { fragment: parent };

			} else {
				results = buildFragment( args, this, scripts );
			}

			fragment = results.fragment;

			if ( fragment.childNodes.length === 1 ) {
				first = fragment = fragment.firstChild;
			} else {
				first = fragment.firstChild;
			}

			if ( first ) {
				table = table && jQuery.nodeName( first, "tr" );

				for ( var i = 0, l = this.length; i < l; i++ ) {
					callback.call(
						table ?
							root(this[i], first) :
							this[i],
						i > 0 || results.cacheable || this.length > 1  ?
							fragment.cloneNode(true) :
							fragment
					);
				}
			}

			if ( scripts.length ) {
				jQuery.each( scripts, evalScript );
			}
		}

		return this;

		function root( elem, cur ) {
			return jQuery.nodeName(elem, "table") ?
				(elem.getElementsByTagName("tbody")[0] ||
				elem.appendChild(elem.ownerDocument.createElement("tbody"))) :
				elem;
		}
	}
});

function cloneCopyEvent(orig, ret) {
	var i = 0;

	ret.each(function() {
		if ( this.nodeName !== (orig[i] && orig[i].nodeName) ) {
			return;
		}

		var oldData = jQuery.data( orig[i++] ), curData = jQuery.data( this, oldData ), events = oldData && oldData.events;

		if ( events ) {
			delete curData.handle;
			curData.events = {};

			for ( var type in events ) {
				for ( var handler in events[ type ] ) {
					jQuery.event.add( this, type, events[ type ][ handler ], events[ type ][ handler ].data );
				}
			}
		}
	});
}

function buildFragment( args, nodes, scripts ) {
	var fragment, cacheable, cacheresults,
		doc = (nodes && nodes[0] ? nodes[0].ownerDocument || nodes[0] : document);

	// Only cache "small" (1/2 KB) strings that are associated with the main document
	// Cloning options loses the selected state, so don't cache them
	// IE 6 doesn't like it when you put <object> or <embed> elements in a fragment
	// Also, WebKit does not clone 'checked' attributes on cloneNode, so don't cache
	if ( args.length === 1 && typeof args[0] === "string" && args[0].length < 512 && doc === document &&
		!rnocache.test( args[0] ) && (jQuery.support.checkClone || !rchecked.test( args[0] )) ) {

		cacheable = true;
		cacheresults = jQuery.fragments[ args[0] ];
		if ( cacheresults ) {
			if ( cacheresults !== 1 ) {
				fragment = cacheresults;
			}
		}
	}

	if ( !fragment ) {
		fragment = doc.createDocumentFragment();
		jQuery.clean( args, doc, fragment, scripts );
	}

	if ( cacheable ) {
		jQuery.fragments[ args[0] ] = cacheresults ? fragment : 1;
	}

	return { fragment: fragment, cacheable: cacheable };
}

jQuery.fragments = {};

jQuery.each({
	appendTo: "append",
	prependTo: "prepend",
	insertBefore: "before",
	insertAfter: "after",
	replaceAll: "replaceWith"
}, function( name, original ) {
	jQuery.fn[ name ] = function( selector ) {
		var ret = [], insert = jQuery( selector ),
			parent = this.length === 1 && this[0].parentNode;

		if ( parent && parent.nodeType === 11 && parent.childNodes.length === 1 && insert.length === 1 ) {
			insert[ original ]( this[0] );
			return this;

		} else {
			for ( var i = 0, l = insert.length; i < l; i++ ) {
				var elems = (i > 0 ? this.clone(true) : this).get();
				jQuery.fn[ original ].apply( jQuery(insert[i]), elems );
				ret = ret.concat( elems );
			}

			return this.pushStack( ret, name, insert.selector );
		}
	};
});

jQuery.extend({
	clean: function( elems, context, fragment, scripts ) {
		context = context || document;

		// !context.createElement fails in IE with an error but returns typeof 'object'
		if ( typeof context.createElement === "undefined" ) {
			context = context.ownerDocument || context[0] && context[0].ownerDocument || document;
		}

		var ret = [];

		for ( var i = 0, elem; (elem = elems[i]) != null; i++ ) {
			if ( typeof elem === "number" ) {
				elem += "";
			}

			if ( !elem ) {
				continue;
			}

			// Convert html string into DOM nodes
			if ( typeof elem === "string" && !rhtml.test( elem ) ) {
				elem = context.createTextNode( elem );

			} else if ( typeof elem === "string" ) {
				// Fix "XHTML"-style tags in all browsers
				elem = elem.replace(rxhtmlTag, fcloseTag);

				// Trim whitespace, otherwise indexOf won't work as expected
				var tag = (rtagName.exec( elem ) || ["", ""])[1].toLowerCase(),
					wrap = wrapMap[ tag ] || wrapMap._default,
					depth = wrap[0],
					div = context.createElement("div");

				// Go to html and back, then peel off extra wrappers
				div.innerHTML = wrap[1] + elem + wrap[2];

				// Move to the right depth
				while ( depth-- ) {
					div = div.lastChild;
				}

				// Remove IE's autoinserted <tbody> from table fragments
				if ( !jQuery.support.tbody ) {

					// String was a <table>, *may* have spurious <tbody>
					var hasBody = rtbody.test(elem),
						tbody = tag === "table" && !hasBody ?
							div.firstChild && div.firstChild.childNodes :

							// String was a bare <thead> or <tfoot>
							wrap[1] === "<table>" && !hasBody ?
								div.childNodes :
								[];

					for ( var j = tbody.length - 1; j >= 0 ; --j ) {
						if ( jQuery.nodeName( tbody[ j ], "tbody" ) && !tbody[ j ].childNodes.length ) {
							tbody[ j ].parentNode.removeChild( tbody[ j ] );
						}
					}

				}

				// IE completely kills leading whitespace when innerHTML is used
				if ( !jQuery.support.leadingWhitespace && rleadingWhitespace.test( elem ) ) {
					div.insertBefore( context.createTextNode( rleadingWhitespace.exec(elem)[0] ), div.firstChild );
				}

				elem = div.childNodes;
			}

			if ( elem.nodeType ) {
				ret.push( elem );
			} else {
				ret = jQuery.merge( ret, elem );
			}
		}

		if ( fragment ) {
			for ( var i = 0; ret[i]; i++ ) {
				if ( scripts && jQuery.nodeName( ret[i], "script" ) && (!ret[i].type || ret[i].type.toLowerCase() === "text/javascript") ) {
					scripts.push( ret[i].parentNode ? ret[i].parentNode.removeChild( ret[i] ) : ret[i] );

				} else {
					if ( ret[i].nodeType === 1 ) {
						ret.splice.apply( ret, [i + 1, 0].concat(jQuery.makeArray(ret[i].getElementsByTagName("script"))) );
					}
					fragment.appendChild( ret[i] );
				}
			}
		}

		return ret;
	},

	cleanData: function( elems ) {
		var data, id, cache = jQuery.cache,
			special = jQuery.event.special,
			deleteExpando = jQuery.support.deleteExpando;

		for ( var i = 0, elem; (elem = elems[i]) != null; i++ ) {
			id = elem[ jQuery.expando ];

			if ( id ) {
				data = cache[ id ];

				if ( data.events ) {
					for ( var type in data.events ) {
						if ( special[ type ] ) {
							jQuery.event.remove( elem, type );

						} else {
							removeEvent( elem, type, data.handle );
						}
					}
				}

				if ( deleteExpando ) {
					delete elem[ jQuery.expando ];

				} else if ( elem.removeAttribute ) {
					elem.removeAttribute( jQuery.expando );
				}

				delete cache[ id ];
			}
		}
	}
});
// exclude the following css properties to add px
var rexclude = /z-?index|font-?weight|opacity|zoom|line-?height/i,
	ralpha = /alpha\([^)]*\)/,
	ropacity = /opacity=([^)]*)/,
	rfloat = /float/i,
	rdashAlpha = /-([a-z])/ig,
	rupper = /([A-Z])/g,
	rnumpx = /^-?\d+(?:px)?$/i,
	rnum = /^-?\d/,

	cssShow = { position: "absolute", visibility: "hidden", display:"block" },
	cssWidth = [ "Left", "Right" ],
	cssHeight = [ "Top", "Bottom" ],

	// cache check for defaultView.getComputedStyle
	getComputedStyle = document.defaultView && document.defaultView.getComputedStyle,
	// normalize float css property
	styleFloat = jQuery.support.cssFloat ? "cssFloat" : "styleFloat",
	fcamelCase = function( all, letter ) {
		return letter.toUpperCase();
	};

jQuery.fn.css = function( name, value ) {
	return access( this, name, value, true, function( elem, name, value ) {
		if ( value === undefined ) {
			return jQuery.curCSS( elem, name );
		}

		if ( typeof value === "number" && !rexclude.test(name) ) {
			value += "px";
		}

		jQuery.style( elem, name, value );
	});
};

jQuery.extend({
	style: function( elem, name, value ) {
		// don't set styles on text and comment nodes
		if ( !elem || elem.nodeType === 3 || elem.nodeType === 8 ) {
			return undefined;
		}

		// ignore negative width and height values #1599
		if ( (name === "width" || name === "height") && parseFloat(value) < 0 ) {
			value = undefined;
		}

		var style = elem.style || elem, set = value !== undefined;

		// IE uses filters for opacity
		if ( !jQuery.support.opacity && name === "opacity" ) {
			if ( set ) {
				// IE has trouble with opacity if it does not have layout
				// Force it by setting the zoom level
				style.zoom = 1;

				// Set the alpha filter to set the opacity
				var opacity = parseInt( value, 10 ) + "" === "NaN" ? "" : "alpha(opacity=" + value * 100 + ")";
				var filter = style.filter || jQuery.curCSS( elem, "filter" ) || "";
				style.filter = ralpha.test(filter) ? filter.replace(ralpha, opacity) : opacity;
			}

			return style.filter && style.filter.indexOf("opacity=") >= 0 ?
				(parseFloat( ropacity.exec(style.filter)[1] ) / 100) + "":
				"";
		}

		// Make sure we're using the right name for getting the float value
		if ( rfloat.test( name ) ) {
			name = styleFloat;
		}

		name = name.replace(rdashAlpha, fcamelCase);

		if ( set ) {
			style[ name ] = value;
		}

		return style[ name ];
	},

	css: function( elem, name, force, extra ) {
		if ( name === "width" || name === "height" ) {
			var val, props = cssShow, which = name === "width" ? cssWidth : cssHeight;

			function getWH() {
				val = name === "width" ? elem.offsetWidth : elem.offsetHeight;

				if ( extra === "border" ) {
					return;
				}

				jQuery.each( which, function() {
					if ( !extra ) {
						val -= parseFloat(jQuery.curCSS( elem, "padding" + this, true)) || 0;
					}

					if ( extra === "margin" ) {
						val += parseFloat(jQuery.curCSS( elem, "margin" + this, true)) || 0;
					} else {
						val -= parseFloat(jQuery.curCSS( elem, "border" + this + "Width", true)) || 0;
					}
				});
			}

			if ( elem.offsetWidth !== 0 ) {
				getWH();
			} else {
				jQuery.swap( elem, props, getWH );
			}

			return Math.max(0, Math.round(val));
		}

		return jQuery.curCSS( elem, name, force );
	},

	curCSS: function( elem, name, force ) {
		var ret, style = elem.style, filter;

		// IE uses filters for opacity
		if ( !jQuery.support.opacity && name === "opacity" && elem.currentStyle ) {
			ret = ropacity.test(elem.currentStyle.filter || "") ?
				(parseFloat(RegExp.$1) / 100) + "" :
				"";

			return ret === "" ?
				"1" :
				ret;
		}

		// Make sure we're using the right name for getting the float value
		if ( rfloat.test( name ) ) {
			name = styleFloat;
		}

		if ( !force && style && style[ name ] ) {
			ret = style[ name ];

		} else if ( getComputedStyle ) {

			// Only "float" is needed here
			if ( rfloat.test( name ) ) {
				name = "float";
			}

			name = name.replace( rupper, "-$1" ).toLowerCase();

			var defaultView = elem.ownerDocument.defaultView;

			if ( !defaultView ) {
				return null;
			}

			var computedStyle = defaultView.getComputedStyle( elem, null );

			if ( computedStyle ) {
				ret = computedStyle.getPropertyValue( name );
			}

			// We should always get a number back from opacity
			if ( name === "opacity" && ret === "" ) {
				ret = "1";
			}

		} else if ( elem.currentStyle ) {
			var camelCase = name.replace(rdashAlpha, fcamelCase);

			ret = elem.currentStyle[ name ] || elem.currentStyle[ camelCase ];

			// From the awesome hack by Dean Edwards
			// http://erik.eae.net/archives/2007/07/27/18.54.15/#comment-102291

			// If we're not dealing with a regular pixel number
			// but a number that has a weird ending, we need to convert it to pixels
			if ( !rnumpx.test( ret ) && rnum.test( ret ) ) {
				// Remember the original values
				var left = style.left, rsLeft = elem.runtimeStyle.left;

				// Put in the new values to get a computed value out
				elem.runtimeStyle.left = elem.currentStyle.left;
				style.left = camelCase === "fontSize" ? "1em" : (ret || 0);
				ret = style.pixelLeft + "px";

				// Revert the changed values
				style.left = left;
				elem.runtimeStyle.left = rsLeft;
			}
		}

		return ret;
	},

	// A method for quickly swapping in/out CSS properties to get correct calculations
	swap: function( elem, options, callback ) {
		var old = {};

		// Remember the old values, and insert the new ones
		for ( var name in options ) {
			old[ name ] = elem.style[ name ];
			elem.style[ name ] = options[ name ];
		}

		callback.call( elem );

		// Revert the old values
		for ( var name in options ) {
			elem.style[ name ] = old[ name ];
		}
	}
});

if ( jQuery.expr && jQuery.expr.filters ) {
	jQuery.expr.filters.hidden = function( elem ) {
		var width = elem.offsetWidth, height = elem.offsetHeight,
			skip = elem.nodeName.toLowerCase() === "tr";

		return width === 0 && height === 0 && !skip ?
			true :
			width > 0 && height > 0 && !skip ?
				false :
				jQuery.curCSS(elem, "display") === "none";
	};

	jQuery.expr.filters.visible = function( elem ) {
		return !jQuery.expr.filters.hidden( elem );
	};
}
var jsc = now(),
	rscript = /<script(.|\s)*?\/script>/gi,
	rselectTextarea = /select|textarea/i,
	rinput = /color|date|datetime|email|hidden|month|number|password|range|search|tel|text|time|url|week/i,
	jsre = /=\?(&|$)/,
	rquery = /\?/,
	rts = /(\?|&)_=.*?(&|$)/,
	rurl = /^(\w+:)?\/\/([^\/?#]+)/,
	r20 = /%20/g,

	// Keep a copy of the old load method
	_load = jQuery.fn.load;

jQuery.fn.extend({
	load: function( url, params, callback ) {
		if ( typeof url !== "string" ) {
			return _load.call( this, url );

		// Don't do a request if no elements are being requested
		} else if ( !this.length ) {
			return this;
		}

		var off = url.indexOf(" ");
		if ( off >= 0 ) {
			var selector = url.slice(off, url.length);
			url = url.slice(0, off);
		}

		// Default to a GET request
		var type = "GET";

		// If the second parameter was provided
		if ( params ) {
			// If it's a function
			if ( jQuery.isFunction( params ) ) {
				// We assume that it's the callback
				callback = params;
				params = null;

			// Otherwise, build a param string
			} else if ( typeof params === "object" ) {
				params = jQuery.param( params, jQuery.ajaxSettings.traditional );
				type = "POST";
			}
		}

		var self = this;

		// Request the remote document
		jQuery.ajax({
			url: url,
			type: type,
			dataType: "html",
			data: params,
			complete: function( res, status ) {
				// If successful, inject the HTML into all the matched elements
				if ( status === "success" || status === "notmodified" ) {
					// See if a selector was specified
					self.html( selector ?
						// Create a dummy div to hold the results
						jQuery("<div />")
							// inject the contents of the document in, removing the scripts
							// to avoid any 'Permission Denied' errors in IE
							.append(res.responseText.replace(rscript, ""))

							// Locate the specified elements
							.find(selector) :

						// If not, just inject the full result
						res.responseText );
				}

				if ( callback ) {
					self.each( callback, [res.responseText, status, res] );
				}
			}
		});

		return this;
	},

	serialize: function() {
		return jQuery.param(this.serializeArray());
	},
	serializeArray: function() {
		return this.map(function() {
			return this.elements ? jQuery.makeArray(this.elements) : this;
		})
		.filter(function() {
			return this.name && !this.disabled &&
				(this.checked || rselectTextarea.test(this.nodeName) ||
					rinput.test(this.type));
		})
		.map(function( i, elem ) {
			var val = jQuery(this).val();

			return val == null ?
				null :
				jQuery.isArray(val) ?
					jQuery.map( val, function( val, i ) {
						return { name: elem.name, value: val };
					}) :
					{ name: elem.name, value: val };
		}).get();
	}
});

// Attach a bunch of functions for handling common AJAX events
jQuery.each( "ajaxStart ajaxStop ajaxComplete ajaxError ajaxSuccess ajaxSend".split(" "), function( i, o ) {
	jQuery.fn[o] = function( f ) {
		return this.bind(o, f);
	};
});

jQuery.extend({

	get: function( url, data, callback, type ) {
		// shift arguments if data argument was omited
		if ( jQuery.isFunction( data ) ) {
			type = type || callback;
			callback = data;
			data = null;
		}

		return jQuery.ajax({
			type: "GET",
			url: url,
			data: data,
			success: callback,
			dataType: type
		});
	},

	getScript: function( url, callback ) {
		return jQuery.get(url, null, callback, "script");
	},

	getJSON: function( url, data, callback ) {
		return jQuery.get(url, data, callback, "json");
	},

	post: function( url, data, callback, type ) {
		// shift arguments if data argument was omited
		if ( jQuery.isFunction( data ) ) {
			type = type || callback;
			callback = data;
			data = {};
		}

		return jQuery.ajax({
			type: "POST",
			url: url,
			data: data,
			success: callback,
			dataType: type
		});
	},

	ajaxSetup: function( settings ) {
		jQuery.extend( jQuery.ajaxSettings, settings );
	},

	ajaxSettings: {
		url: location.href,
		global: true,
		type: "GET",
		contentType: "application/x-www-form-urlencoded",
		processData: true,
		async: true,
		/*
		timeout: 0,
		data: null,
		username: null,
		password: null,
		traditional: false,
		*/
		// Create the request object; Microsoft failed to properly
		// implement the XMLHttpRequest in IE7 (can't request local files),
		// so we use the ActiveXObject when it is available
		// This function can be overriden by calling jQuery.ajaxSetup
		xhr: window.XMLHttpRequest && (window.location.protocol !== "file:" || !window.ActiveXObject) ?
			function() {
				return new window.XMLHttpRequest();
			} :
			function() {
				try {
					return new window.ActiveXObject("Microsoft.XMLHTTP");
				} catch(e) {}
			},
		accepts: {
			xml: "application/xml, text/xml",
			html: "text/html",
			script: "text/javascript, application/javascript",
			json: "application/json, text/javascript",
			text: "text/plain",
			_default: "*/*"
		}
	},

	// Last-Modified header cache for next request
	lastModified: {},
	etag: {},

	ajax: function( origSettings ) {
		var s = jQuery.extend(true, {}, jQuery.ajaxSettings, origSettings);

		var jsonp, status, data,
			callbackContext = origSettings && origSettings.context || s,
			type = s.type.toUpperCase();

		// convert data if not already a string
		if ( s.data && s.processData && typeof s.data !== "string" ) {
			s.data = jQuery.param( s.data, s.traditional );
		}

		// Handle JSONP Parameter Callbacks
		if ( s.dataType === "jsonp" ) {
			if ( type === "GET" ) {
				if ( !jsre.test( s.url ) ) {
					s.url += (rquery.test( s.url ) ? "&" : "?") + (s.jsonp || "callback") + "=?";
				}
			} else if ( !s.data || !jsre.test(s.data) ) {
				s.data = (s.data ? s.data + "&" : "") + (s.jsonp || "callback") + "=?";
			}
			s.dataType = "json";
		}

		// Build temporary JSONP function
		if ( s.dataType === "json" && (s.data && jsre.test(s.data) || jsre.test(s.url)) ) {
			jsonp = s.jsonpCallback || ("jsonp" + jsc++);

			// Replace the =? sequence both in the query string and the data
			if ( s.data ) {
				s.data = (s.data + "").replace(jsre, "=" + jsonp + "$1");
			}

			s.url = s.url.replace(jsre, "=" + jsonp + "$1");

			// We need to make sure
			// that a JSONP style response is executed properly
			s.dataType = "script";

			// Handle JSONP-style loading
			window[ jsonp ] = window[ jsonp ] || function( tmp ) {
				data = tmp;
				success();
				complete();
				// Garbage collect
				window[ jsonp ] = undefined;

				try {
					delete window[ jsonp ];
				} catch(e) {}

				if ( head ) {
					head.removeChild( script );
				}
			};
		}

		if ( s.dataType === "script" && s.cache === null ) {
			s.cache = false;
		}

		if ( s.cache === false && type === "GET" ) {
			var ts = now();

			// try replacing _= if it is there
			var ret = s.url.replace(rts, "$1_=" + ts + "$2");

			// if nothing was replaced, add timestamp to the end
			s.url = ret + ((ret === s.url) ? (rquery.test(s.url) ? "&" : "?") + "_=" + ts : "");
		}

		// If data is available, append data to url for get requests
		if ( s.data && type === "GET" ) {
			s.url += (rquery.test(s.url) ? "&" : "?") + s.data;
		}

		// Watch for a new set of requests
		if ( s.global && ! jQuery.active++ ) {
			jQuery.event.trigger( "ajaxStart" );
		}

		// Matches an absolute URL, and saves the domain
		var parts = rurl.exec( s.url ),
			remote = parts && (parts[1] && parts[1] !== location.protocol || parts[2] !== location.host);

		// If we're requesting a remote document
		// and trying to load JSON or Script with a GET
		if ( s.dataType === "script" && type === "GET" && remote ) {
			var head = document.getElementsByTagName("head")[0] || document.documentElement;
			var script = document.createElement("script");
			script.src = s.url;
			if ( s.scriptCharset ) {
				script.charset = s.scriptCharset;
			}

			// Handle Script loading
			if ( !jsonp ) {
				var done = false;

				// Attach handlers for all browsers
				script.onload = script.onreadystatechange = function() {
					if ( !done && (!this.readyState ||
							this.readyState === "loaded" || this.readyState === "complete") ) {
						done = true;
						success();
						complete();

						// Handle memory leak in IE
						script.onload = script.onreadystatechange = null;
						if ( head && script.parentNode ) {
							head.removeChild( script );
						}
					}
				};
			}

			// Use insertBefore instead of appendChild  to circumvent an IE6 bug.
			// This arises when a base node is used (#2709 and #4378).
			head.insertBefore( script, head.firstChild );

			// We handle everything using the script element injection
			return undefined;
		}

		var requestDone = false;

		// Create the request object
		var xhr = s.xhr();

		if ( !xhr ) {
			return;
		}

		// Open the socket
		// Passing null username, generates a login popup on Opera (#2865)
		if ( s.username ) {
			xhr.open(type, s.url, s.async, s.username, s.password);
		} else {
			xhr.open(type, s.url, s.async);
		}

		// Need an extra try/catch for cross domain requests in Firefox 3
		try {
			// Set the correct header, if data is being sent
			if ( s.data || origSettings && origSettings.contentType ) {
				xhr.setRequestHeader("Content-Type", s.contentType);
			}

			// Set the If-Modified-Since and/or If-None-Match header, if in ifModified mode.
			if ( s.ifModified ) {
				if ( jQuery.lastModified[s.url] ) {
					xhr.setRequestHeader("If-Modified-Since", jQuery.lastModified[s.url]);
				}

				if ( jQuery.etag[s.url] ) {
					xhr.setRequestHeader("If-None-Match", jQuery.etag[s.url]);
				}
			}

			// Set header so the called script knows that it's an XMLHttpRequest
			// Only send the header if it's not a remote XHR
			if ( !remote ) {
				xhr.setRequestHeader("X-Requested-With", "XMLHttpRequest");
			}

			// Set the Accepts header for the server, depending on the dataType
			xhr.setRequestHeader("Accept", s.dataType && s.accepts[ s.dataType ] ?
				s.accepts[ s.dataType ] + ", */*" :
				s.accepts._default );
		} catch(e) {}

		// Allow custom headers/mimetypes and early abort
		if ( s.beforeSend && s.beforeSend.call(callbackContext, xhr, s) === false ) {
			// Handle the global AJAX counter
			if ( s.global && ! --jQuery.active ) {
				jQuery.event.trigger( "ajaxStop" );
			}

			// close opended socket
			xhr.abort();
			return false;
		}

		if ( s.global ) {
			trigger("ajaxSend", [xhr, s]);
		}

		// Wait for a response to come back
		var onreadystatechange = xhr.onreadystatechange = function( isTimeout ) {
			// The request was aborted
			if ( !xhr || xhr.readyState === 0 || isTimeout === "abort" ) {
				// Opera doesn't call onreadystatechange before this point
				// so we simulate the call
				if ( !requestDone ) {
					complete();
				}

				requestDone = true;
				if ( xhr ) {
					xhr.onreadystatechange = jQuery.noop;
				}

			// The transfer is complete and the data is available, or the request timed out
			} else if ( !requestDone && xhr && (xhr.readyState === 4 || isTimeout === "timeout") ) {
				requestDone = true;
				xhr.onreadystatechange = jQuery.noop;

				status = isTimeout === "timeout" ?
					"timeout" :
					!jQuery.httpSuccess( xhr ) ?
						"error" :
						s.ifModified && jQuery.httpNotModified( xhr, s.url ) ?
							"notmodified" :
							"success";

				var errMsg;

				if ( status === "success" ) {
					// Watch for, and catch, XML document parse errors
					try {
						// process the data (runs the xml through httpData regardless of callback)
						data = jQuery.httpData( xhr, s.dataType, s );
					} catch(err) {
						status = "parsererror";
						errMsg = err;
					}
				}

				// Make sure that the request was successful or notmodified
				if ( status === "success" || status === "notmodified" ) {
					// JSONP handles its own success callback
					if ( !jsonp ) {
						success();
					}
				} else {
					jQuery.handleError(s, xhr, status, errMsg);
				}

				// Fire the complete handlers
				complete();

				if ( isTimeout === "timeout" ) {
					xhr.abort();
				}

				// Stop memory leaks
				if ( s.async ) {
					xhr = null;
				}
			}
		};

		// Override the abort handler, if we can (IE doesn't allow it, but that's OK)
		// Opera doesn't fire onreadystatechange at all on abort
		try {
			var oldAbort = xhr.abort;
			xhr.abort = function() {
				if ( xhr ) {
					oldAbort.call( xhr );
				}

				onreadystatechange( "abort" );
			};
		} catch(e) { }

		// Timeout checker
		if ( s.async && s.timeout > 0 ) {
			setTimeout(function() {
				// Check to see if the request is still happening
				if ( xhr && !requestDone ) {
					onreadystatechange( "timeout" );
				}
			}, s.timeout);
		}

		// Send the data
		try {
			xhr.send( type === "POST" || type === "PUT" || type === "DELETE" ? s.data : null );
		} catch(e) {
			jQuery.handleError(s, xhr, null, e);
			// Fire the complete handlers
			complete();
		}

		// firefox 1.5 doesn't fire statechange for sync requests
		if ( !s.async ) {
			onreadystatechange();
		}

		function success() {
			// If a local callback was specified, fire it and pass it the data
			if ( s.success ) {
				s.success.call( callbackContext, data, status, xhr );
			}

			// Fire the global callback
			if ( s.global ) {
				trigger( "ajaxSuccess", [xhr, s] );
			}
		}

		function complete() {
			// Process result
			if ( s.complete ) {
				s.complete.call( callbackContext, xhr, status);
			}

			// The request was completed
			if ( s.global ) {
				trigger( "ajaxComplete", [xhr, s] );
			}

			// Handle the global AJAX counter
			if ( s.global && ! --jQuery.active ) {
				jQuery.event.trigger( "ajaxStop" );
			}
		}

		function trigger(type, args) {
			(s.context ? jQuery(s.context) : jQuery.event).trigger(type, args);
		}

		// return XMLHttpRequest to allow aborting the request etc.
		return xhr;
	},

	handleError: function( s, xhr, status, e ) {
		// If a local callback was specified, fire it
		if ( s.error ) {
			s.error.call( s.context || s, xhr, status, e );
		}

		// Fire the global callback
		if ( s.global ) {
			(s.context ? jQuery(s.context) : jQuery.event).trigger( "ajaxError", [xhr, s, e] );
		}
	},

	// Counter for holding the number of active queries
	active: 0,

	// Determines if an XMLHttpRequest was successful or not
	httpSuccess: function( xhr ) {
		try {
			// IE error sometimes returns 1223 when it should be 204 so treat it as success, see #1450
			return !xhr.status && location.protocol === "file:" ||
				// Opera returns 0 when status is 304
				( xhr.status >= 200 && xhr.status < 300 ) ||
				xhr.status === 304 || xhr.status === 1223 || xhr.status === 0;
		} catch(e) {}

		return false;
	},

	// Determines if an XMLHttpRequest returns NotModified
	httpNotModified: function( xhr, url ) {
		var lastModified = xhr.getResponseHeader("Last-Modified"),
			etag = xhr.getResponseHeader("Etag");

		if ( lastModified ) {
			jQuery.lastModified[url] = lastModified;
		}

		if ( etag ) {
			jQuery.etag[url] = etag;
		}

		// Opera returns 0 when status is 304
		return xhr.status === 304 || xhr.status === 0;
	},

	httpData: function( xhr, type, s ) {
		var ct = xhr.getResponseHeader("content-type") || "",
			xml = type === "xml" || !type && ct.indexOf("xml") >= 0,
			data = xml ? xhr.responseXML : xhr.responseText;

		if ( xml && data.documentElement.nodeName === "parsererror" ) {
			jQuery.error( "parsererror" );
		}

		// Allow a pre-filtering function to sanitize the response
		// s is checked to keep backwards compatibility
		if ( s && s.dataFilter ) {
			data = s.dataFilter( data, type );
		}

		// The filter can actually parse the response
		if ( typeof data === "string" ) {
			// Get the JavaScript object, if JSON is used.
			if ( type === "json" || !type && ct.indexOf("json") >= 0 ) {
				data = jQuery.parseJSON( data );

			// If the type is "script", eval it in global context
			} else if ( type === "script" || !type && ct.indexOf("javascript") >= 0 ) {
				jQuery.globalEval( data );
			}
		}

		return data;
	},

	// Serialize an array of form elements or a set of
	// key/values into a query string
	param: function( a, traditional ) {
		var s = [];

		// Set traditional to true for jQuery <= 1.3.2 behavior.
		if ( traditional === undefined ) {
			traditional = jQuery.ajaxSettings.traditional;
		}

		// If an array was passed in, assume that it is an array of form elements.
		if ( jQuery.isArray(a) || a.jquery ) {
			// Serialize the form elements
			jQuery.each( a, function() {
				add( this.name, this.value );
			});

		} else {
			// If traditional, encode the "old" way (the way 1.3.2 or older
			// did it), otherwise encode params recursively.
			for ( var prefix in a ) {
				buildParams( prefix, a[prefix] );
			}
		}

		// Return the resulting serialization
		return s.join("&").replace(r20, "+");

		function buildParams( prefix, obj ) {
			if ( jQuery.isArray(obj) ) {
				// Serialize array item.
				jQuery.each( obj, function( i, v ) {
					if ( traditional || /\[\]$/.test( prefix ) ) {
						// Treat each array item as a scalar.
						add( prefix, v );
					} else {
						// If array item is non-scalar (array or object), encode its
						// numeric index to resolve deserialization ambiguity issues.
						// Note that rack (as of 1.0.0) can't currently deserialize
						// nested arrays properly, and attempting to do so may cause
						// a server error. Possible fixes are to modify rack's
						// deserialization algorithm or to provide an option or flag
						// to force array serialization to be shallow.
						buildParams( prefix + "[" + ( typeof v === "object" || jQuery.isArray(v) ? i : "" ) + "]", v );
					}
				});

			} else if ( !traditional && obj != null && typeof obj === "object" ) {
				// Serialize object item.
				jQuery.each( obj, function( k, v ) {
					buildParams( prefix + "[" + k + "]", v );
				});

			} else {
				// Serialize scalar item.
				add( prefix, obj );
			}
		}

		function add( key, value ) {
			// If value is a function, invoke it and return its value
			value = jQuery.isFunction(value) ? value() : value;
			s[ s.length ] = encodeURIComponent(key) + "=" + encodeURIComponent(value);
		}
	}
});
var elemdisplay = {},
	rfxtypes = /toggle|show|hide/,
	rfxnum = /^([+-]=)?([\d+-.]+)(.*)$/,
	timerId,
	fxAttrs = [
		// height animations
		[ "height", "marginTop", "marginBottom", "paddingTop", "paddingBottom" ],
		// width animations
		[ "width", "marginLeft", "marginRight", "paddingLeft", "paddingRight" ],
		// opacity animations
		[ "opacity" ]
	];

jQuery.fn.extend({
	show: function( speed, callback ) {
		if ( speed || speed === 0) {
			return this.animate( genFx("show", 3), speed, callback);

		} else {
			for ( var i = 0, l = this.length; i < l; i++ ) {
				var old = jQuery.data(this[i], "olddisplay");

				this[i].style.display = old || "";

				if ( jQuery.css(this[i], "display") === "none" ) {
					var nodeName = this[i].nodeName, display;

					if ( elemdisplay[ nodeName ] ) {
						display = elemdisplay[ nodeName ];

					} else {
						var elem = jQuery("<" + nodeName + " />").appendTo("body");

						display = elem.css("display");

						if ( display === "none" ) {
							display = "block";
						}

						elem.remove();

						elemdisplay[ nodeName ] = display;
					}

					jQuery.data(this[i], "olddisplay", display);
				}
			}

			// Set the display of the elements in a second loop
			// to avoid the constant reflow
			for ( var j = 0, k = this.length; j < k; j++ ) {
				this[j].style.display = jQuery.data(this[j], "olddisplay") || "";
			}

			return this;
		}
	},

	hide: function( speed, callback ) {
		if ( speed || speed === 0 ) {
			return this.animate( genFx("hide", 3), speed, callback);

		} else {
			for ( var i = 0, l = this.length; i < l; i++ ) {
				var old = jQuery.data(this[i], "olddisplay");
				if ( !old && old !== "none" ) {
					jQuery.data(this[i], "olddisplay", jQuery.css(this[i], "display"));
				}
			}

			// Set the display of the elements in a second loop
			// to avoid the constant reflow
			for ( var j = 0, k = this.length; j < k; j++ ) {
				this[j].style.display = "none";
			}

			return this;
		}
	},

	// Save the old toggle function
	_toggle: jQuery.fn.toggle,

	toggle: function( fn, fn2 ) {
		var bool = typeof fn === "boolean";

		if ( jQuery.isFunction(fn) && jQuery.isFunction(fn2) ) {
			this._toggle.apply( this, arguments );

		} else if ( fn == null || bool ) {
			this.each(function() {
				var state = bool ? fn : jQuery(this).is(":hidden");
				jQuery(this)[ state ? "show" : "hide" ]();
			});

		} else {
			this.animate(genFx("toggle", 3), fn, fn2);
		}

		return this;
	},

	fadeTo: function( speed, to, callback ) {
		return this.filter(":hidden").css("opacity", 0).show().end()
					.animate({opacity: to}, speed, callback);
	},

	animate: function( prop, speed, easing, callback ) {
		var optall = jQuery.speed(speed, easing, callback);

		if ( jQuery.isEmptyObject( prop ) ) {
			return this.each( optall.complete );
		}

		return this[ optall.queue === false ? "each" : "queue" ](function() {
			var opt = jQuery.extend({}, optall), p,
				hidden = this.nodeType === 1 && jQuery(this).is(":hidden"),
				self = this;

			for ( p in prop ) {
				var name = p.replace(rdashAlpha, fcamelCase);

				if ( p !== name ) {
					prop[ name ] = prop[ p ];
					delete prop[ p ];
					p = name;
				}

				if ( prop[p] === "hide" && hidden || prop[p] === "show" && !hidden ) {
					return opt.complete.call(this);
				}

				if ( ( p === "height" || p === "width" ) && this.style ) {
					// Store display property
					opt.display = jQuery.css(this, "display");

					// Make sure that nothing sneaks out
					opt.overflow = this.style.overflow;
				}

				if ( jQuery.isArray( prop[p] ) ) {
					// Create (if needed) and add to specialEasing
					(opt.specialEasing = opt.specialEasing || {})[p] = prop[p][1];
					prop[p] = prop[p][0];
				}
			}

			if ( opt.overflow != null ) {
				this.style.overflow = "hidden";
			}

			opt.curAnim = jQuery.extend({}, prop);

			jQuery.each( prop, function( name, val ) {
				var e = new jQuery.fx( self, opt, name );

				if ( rfxtypes.test(val) ) {
					e[ val === "toggle" ? hidden ? "show" : "hide" : val ]( prop );

				} else {
					var parts = rfxnum.exec(val),
						start = e.cur(true) || 0;

					if ( parts ) {
						var end = parseFloat( parts[2] ),
							unit = parts[3] || "px";

						// We need to compute starting value
						if ( unit !== "px" ) {
							self.style[ name ] = (end || 1) + unit;
							start = ((end || 1) / e.cur(true)) * start;
							self.style[ name ] = start + unit;
						}

						// If a +=/-= token was provided, we're doing a relative animation
						if ( parts[1] ) {
							end = ((parts[1] === "-=" ? -1 : 1) * end) + start;
						}

						e.custom( start, end, unit );

					} else {
						e.custom( start, val, "" );
					}
				}
			});

			// For JS strict compliance
			return true;
		});
	},

	stop: function( clearQueue, gotoEnd ) {
		var timers = jQuery.timers;

		if ( clearQueue ) {
			this.queue([]);
		}

		this.each(function() {
			// go in reverse order so anything added to the queue during the loop is ignored
			for ( var i = timers.length - 1; i >= 0; i-- ) {
				if ( timers[i].elem === this ) {
					if (gotoEnd) {
						// force the next step to be the last
						timers[i](true);
					}

					timers.splice(i, 1);
				}
			}
		});

		// start the next in the queue if the last step wasn't forced
		if ( !gotoEnd ) {
			this.dequeue();
		}

		return this;
	}

});

// Generate shortcuts for custom animations
jQuery.each({
	slideDown: genFx("show", 1),
	slideUp: genFx("hide", 1),
	slideToggle: genFx("toggle", 1),
	fadeIn: { opacity: "show" },
	fadeOut: { opacity: "hide" }
}, function( name, props ) {
	jQuery.fn[ name ] = function( speed, callback ) {
		return this.animate( props, speed, callback );
	};
});

jQuery.extend({
	speed: function( speed, easing, fn ) {
		var opt = speed && typeof speed === "object" ? speed : {
			complete: fn || !fn && easing ||
				jQuery.isFunction( speed ) && speed,
			duration: speed,
			easing: fn && easing || easing && !jQuery.isFunction(easing) && easing
		};

		opt.duration = jQuery.fx.off ? 0 : typeof opt.duration === "number" ? opt.duration :
			jQuery.fx.speeds[opt.duration] || jQuery.fx.speeds._default;

		// Queueing
		opt.old = opt.complete;
		opt.complete = function() {
			if ( opt.queue !== false ) {
				jQuery(this).dequeue();
			}
			if ( jQuery.isFunction( opt.old ) ) {
				opt.old.call( this );
			}
		};

		return opt;
	},

	easing: {
		linear: function( p, n, firstNum, diff ) {
			return firstNum + diff * p;
		},
		swing: function( p, n, firstNum, diff ) {
			return ((-Math.cos(p*Math.PI)/2) + 0.5) * diff + firstNum;
		}
	},

	timers: [],

	fx: function( elem, options, prop ) {
		this.options = options;
		this.elem = elem;
		this.prop = prop;

		if ( !options.orig ) {
			options.orig = {};
		}
	}

});

jQuery.fx.prototype = {
	// Simple function for setting a style value
	update: function() {
		if ( this.options.step ) {
			this.options.step.call( this.elem, this.now, this );
		}

		(jQuery.fx.step[this.prop] || jQuery.fx.step._default)( this );

		// Set display property to block for height/width animations
		if ( ( this.prop === "height" || this.prop === "width" ) && this.elem.style ) {
			this.elem.style.display = "block";
		}
	},

	// Get the current size
	cur: function( force ) {
		if ( this.elem[this.prop] != null && (!this.elem.style || this.elem.style[this.prop] == null) ) {
			return this.elem[ this.prop ];
		}

		var r = parseFloat(jQuery.css(this.elem, this.prop, force));
		return r && r > -10000 ? r : parseFloat(jQuery.curCSS(this.elem, this.prop)) || 0;
	},

	// Start an animation from one number to another
	custom: function( from, to, unit ) {
		this.startTime = now();
		this.start = from;
		this.end = to;
		this.unit = unit || this.unit || "px";
		this.now = this.start;
		this.pos = this.state = 0;

		var self = this;
		function t( gotoEnd ) {
			return self.step(gotoEnd);
		}

		t.elem = this.elem;

		if ( t() && jQuery.timers.push(t) && !timerId ) {
			timerId = setInterval(jQuery.fx.tick, 13);
		}
	},

	// Simple 'show' function
	show: function() {
		// Remember where we started, so that we can go back to it later
		this.options.orig[this.prop] = jQuery.style( this.elem, this.prop );
		this.options.show = true;

		// Begin the animation
		// Make sure that we start at a small width/height to avoid any
		// flash of content
		this.custom(this.prop === "width" || this.prop === "height" ? 1 : 0, this.cur());

		// Start by showing the element
		jQuery( this.elem ).show();
	},

	// Simple 'hide' function
	hide: function() {
		// Remember where we started, so that we can go back to it later
		this.options.orig[this.prop] = jQuery.style( this.elem, this.prop );
		this.options.hide = true;

		// Begin the animation
		this.custom(this.cur(), 0);
	},

	// Each step of an animation
	step: function( gotoEnd ) {
		var t = now(), done = true;

		if ( gotoEnd || t >= this.options.duration + this.startTime ) {
			this.now = this.end;
			this.pos = this.state = 1;
			this.update();

			this.options.curAnim[ this.prop ] = true;

			for ( var i in this.options.curAnim ) {
				if ( this.options.curAnim[i] !== true ) {
					done = false;
				}
			}

			if ( done ) {
				if ( this.options.display != null ) {
					// Reset the overflow
					this.elem.style.overflow = this.options.overflow;

					// Reset the display
					var old = jQuery.data(this.elem, "olddisplay");
					this.elem.style.display = old ? old : this.options.display;

					if ( jQuery.css(this.elem, "display") === "none" ) {
						this.elem.style.display = "block";
					}
				}

				// Hide the element if the "hide" operation was done
				if ( this.options.hide ) {
					jQuery(this.elem).hide();
				}

				// Reset the properties, if the item has been hidden or shown
				if ( this.options.hide || this.options.show ) {
					for ( var p in this.options.curAnim ) {
						jQuery.style(this.elem, p, this.options.orig[p]);
					}
				}

				// Execute the complete function
				this.options.complete.call( this.elem );
			}

			return false;

		} else {
			var n = t - this.startTime;
			this.state = n / this.options.duration;

			// Perform the easing function, defaults to swing
			var specialEasing = this.options.specialEasing && this.options.specialEasing[this.prop];
			var defaultEasing = this.options.easing || (jQuery.easing.swing ? "swing" : "linear");
			this.pos = jQuery.easing[specialEasing || defaultEasing](this.state, n, 0, 1, this.options.duration);
			this.now = this.start + ((this.end - this.start) * this.pos);

			// Perform the next step of the animation
			this.update();
		}

		return true;
	}
};

jQuery.extend( jQuery.fx, {
	tick: function() {
		var timers = jQuery.timers;

		for ( var i = 0; i < timers.length; i++ ) {
			if ( !timers[i]() ) {
				timers.splice(i--, 1);
			}
		}

		if ( !timers.length ) {
			jQuery.fx.stop();
		}
	},

	stop: function() {
		clearInterval( timerId );
		timerId = null;
	},

	speeds: {
		slow: 600,
 		fast: 200,
 		// Default speed
 		_default: 400
	},

	step: {
		opacity: function( fx ) {
			jQuery.style(fx.elem, "opacity", fx.now);
		},

		_default: function( fx ) {
			if ( fx.elem.style && fx.elem.style[ fx.prop ] != null ) {
				fx.elem.style[ fx.prop ] = (fx.prop === "width" || fx.prop === "height" ? Math.max(0, fx.now) : fx.now) + fx.unit;
			} else {
				fx.elem[ fx.prop ] = fx.now;
			}
		}
	}
});

if ( jQuery.expr && jQuery.expr.filters ) {
	jQuery.expr.filters.animated = function( elem ) {
		return jQuery.grep(jQuery.timers, function( fn ) {
			return elem === fn.elem;
		}).length;
	};
}

function genFx( type, num ) {
	var obj = {};

	jQuery.each( fxAttrs.concat.apply([], fxAttrs.slice(0,num)), function() {
		obj[ this ] = type;
	});

	return obj;
}
if ( "getBoundingClientRect" in document.documentElement ) {
	jQuery.fn.offset = function( options ) {
		var elem = this[0];

		if ( options ) {
			return this.each(function( i ) {
				jQuery.offset.setOffset( this, options, i );
			});
		}

		if ( !elem || !elem.ownerDocument ) {
			return null;
		}

		if ( elem === elem.ownerDocument.body ) {
			return jQuery.offset.bodyOffset( elem );
		}

		var box = elem.getBoundingClientRect(), doc = elem.ownerDocument, body = doc.body, docElem = doc.documentElement,
			clientTop = docElem.clientTop || body.clientTop || 0, clientLeft = docElem.clientLeft || body.clientLeft || 0,
			top  = box.top  + (self.pageYOffset || jQuery.support.boxModel && docElem.scrollTop  || body.scrollTop ) - clientTop,
			left = box.left + (self.pageXOffset || jQuery.support.boxModel && docElem.scrollLeft || body.scrollLeft) - clientLeft;

		return { top: top, left: left };
	};

} else {
	jQuery.fn.offset = function( options ) {
		var elem = this[0];

		if ( options ) {
			return this.each(function( i ) {
				jQuery.offset.setOffset( this, options, i );
			});
		}

		if ( !elem || !elem.ownerDocument ) {
			return null;
		}

		if ( elem === elem.ownerDocument.body ) {
			return jQuery.offset.bodyOffset( elem );
		}

		jQuery.offset.initialize();

		var offsetParent = elem.offsetParent, prevOffsetParent = elem,
			doc = elem.ownerDocument, computedStyle, docElem = doc.documentElement,
			body = doc.body, defaultView = doc.defaultView,
			prevComputedStyle = defaultView ? defaultView.getComputedStyle( elem, null ) : elem.currentStyle,
			top = elem.offsetTop, left = elem.offsetLeft;

		while ( (elem = elem.parentNode) && elem !== body && elem !== docElem ) {
			if ( jQuery.offset.supportsFixedPosition && prevComputedStyle.position === "fixed" ) {
				break;
			}

			computedStyle = defaultView ? defaultView.getComputedStyle(elem, null) : elem.currentStyle;
			top  -= elem.scrollTop;
			left -= elem.scrollLeft;

			if ( elem === offsetParent ) {
				top  += elem.offsetTop;
				left += elem.offsetLeft;

				if ( jQuery.offset.doesNotAddBorder && !(jQuery.offset.doesAddBorderForTableAndCells && /^t(able|d|h)$/i.test(elem.nodeName)) ) {
					top  += parseFloat( computedStyle.borderTopWidth  ) || 0;
					left += parseFloat( computedStyle.borderLeftWidth ) || 0;
				}

				prevOffsetParent = offsetParent, offsetParent = elem.offsetParent;
			}

			if ( jQuery.offset.subtractsBorderForOverflowNotVisible && computedStyle.overflow !== "visible" ) {
				top  += parseFloat( computedStyle.borderTopWidth  ) || 0;
				left += parseFloat( computedStyle.borderLeftWidth ) || 0;
			}

			prevComputedStyle = computedStyle;
		}

		if ( prevComputedStyle.position === "relative" || prevComputedStyle.position === "static" ) {
			top  += body.offsetTop;
			left += body.offsetLeft;
		}

		if ( jQuery.offset.supportsFixedPosition && prevComputedStyle.position === "fixed" ) {
			top  += Math.max( docElem.scrollTop, body.scrollTop );
			left += Math.max( docElem.scrollLeft, body.scrollLeft );
		}

		return { top: top, left: left };
	};
}

jQuery.offset = {
	initialize: function() {
		var body = document.body, container = document.createElement("div"), innerDiv, checkDiv, table, td, bodyMarginTop = parseFloat( jQuery.curCSS(body, "marginTop", true) ) || 0,
			html = "<div style='position:absolute;top:0;left:0;margin:0;border:5px solid #000;padding:0;width:1px;height:1px;'><div></div></div><table style='position:absolute;top:0;left:0;margin:0;border:5px solid #000;padding:0;width:1px;height:1px;' cellpadding='0' cellspacing='0'><tr><td></td></tr></table>";

		jQuery.extend( container.style, { position: "absolute", top: 0, left: 0, margin: 0, border: 0, width: "1px", height: "1px", visibility: "hidden" } );

		container.innerHTML = html;
		body.insertBefore( container, body.firstChild );
		innerDiv = container.firstChild;
		checkDiv = innerDiv.firstChild;
		td = innerDiv.nextSibling.firstChild.firstChild;

		this.doesNotAddBorder = (checkDiv.offsetTop !== 5);
		this.doesAddBorderForTableAndCells = (td.offsetTop === 5);

		checkDiv.style.position = "fixed", checkDiv.style.top = "20px";
		// safari subtracts parent border width here which is 5px
		this.supportsFixedPosition = (checkDiv.offsetTop === 20 || checkDiv.offsetTop === 15);
		checkDiv.style.position = checkDiv.style.top = "";

		innerDiv.style.overflow = "hidden", innerDiv.style.position = "relative";
		this.subtractsBorderForOverflowNotVisible = (checkDiv.offsetTop === -5);

		this.doesNotIncludeMarginInBodyOffset = (body.offsetTop !== bodyMarginTop);

		body.removeChild( container );
		body = container = innerDiv = checkDiv = table = td = null;
		jQuery.offset.initialize = jQuery.noop;
	},

	bodyOffset: function( body ) {
		var top = body.offsetTop, left = body.offsetLeft;

		jQuery.offset.initialize();

		if ( jQuery.offset.doesNotIncludeMarginInBodyOffset ) {
			top  += parseFloat( jQuery.curCSS(body, "marginTop",  true) ) || 0;
			left += parseFloat( jQuery.curCSS(body, "marginLeft", true) ) || 0;
		}

		return { top: top, left: left };
	},

	setOffset: function( elem, options, i ) {
		// set position first, in-case top/left are set even on static elem
		if ( /static/.test( jQuery.curCSS( elem, "position" ) ) ) {
			elem.style.position = "relative";
		}
		var curElem   = jQuery( elem ),
			curOffset = curElem.offset(),
			curTop    = parseInt( jQuery.curCSS( elem, "top",  true ), 10 ) || 0,
			curLeft   = parseInt( jQuery.curCSS( elem, "left", true ), 10 ) || 0;

		if ( jQuery.isFunction( options ) ) {
			options = options.call( elem, i, curOffset );
		}

		var props = {
			top:  (options.top  - curOffset.top)  + curTop,
			left: (options.left - curOffset.left) + curLeft
		};

		if ( "using" in options ) {
			options.using.call( elem, props );
		} else {
			curElem.css( props );
		}
	}
};


jQuery.fn.extend({
	position: function() {
		if ( !this[0] ) {
			return null;
		}

		var elem = this[0],

		// Get *real* offsetParent
		offsetParent = this.offsetParent(),

		// Get correct offsets
		offset       = this.offset(),
		parentOffset = /^body|html$/i.test(offsetParent[0].nodeName) ? { top: 0, left: 0 } : offsetParent.offset();

		// Subtract element margins
		// note: when an element has margin: auto the offsetLeft and marginLeft
		// are the same in Safari causing offset.left to incorrectly be 0
		offset.top  -= parseFloat( jQuery.curCSS(elem, "marginTop",  true) ) || 0;
		offset.left -= parseFloat( jQuery.curCSS(elem, "marginLeft", true) ) || 0;

		// Add offsetParent borders
		parentOffset.top  += parseFloat( jQuery.curCSS(offsetParent[0], "borderTopWidth",  true) ) || 0;
		parentOffset.left += parseFloat( jQuery.curCSS(offsetParent[0], "borderLeftWidth", true) ) || 0;

		// Subtract the two offsets
		return {
			top:  offset.top  - parentOffset.top,
			left: offset.left - parentOffset.left
		};
	},

	offsetParent: function() {
		return this.map(function() {
			var offsetParent = this.offsetParent || document.body;
			while ( offsetParent && (!/^body|html$/i.test(offsetParent.nodeName) && jQuery.css(offsetParent, "position") === "static") ) {
				offsetParent = offsetParent.offsetParent;
			}
			return offsetParent;
		});
	}
});


// Create scrollLeft and scrollTop methods
jQuery.each( ["Left", "Top"], function( i, name ) {
	var method = "scroll" + name;

	jQuery.fn[ method ] = function(val) {
		var elem = this[0], win;

		if ( !elem ) {
			return null;
		}

		if ( val !== undefined ) {
			// Set the scroll offset
			return this.each(function() {
				win = getWindow( this );

				if ( win ) {
					win.scrollTo(
						!i ? val : jQuery(win).scrollLeft(),
						 i ? val : jQuery(win).scrollTop()
					);

				} else {
					this[ method ] = val;
				}
			});
		} else {
			win = getWindow( elem );

			// Return the scroll offset
			return win ? ("pageXOffset" in win) ? win[ i ? "pageYOffset" : "pageXOffset" ] :
				jQuery.support.boxModel && win.document.documentElement[ method ] ||
					win.document.body[ method ] :
				elem[ method ];
		}
	};
});

function getWindow( elem ) {
	return ("scrollTo" in elem && elem.document) ?
		elem :
		elem.nodeType === 9 ?
			elem.defaultView || elem.parentWindow :
			false;
}
// Create innerHeight, innerWidth, outerHeight and outerWidth methods
jQuery.each([ "Height", "Width" ], function( i, name ) {

	var type = name.toLowerCase();

	// innerHeight and innerWidth
	jQuery.fn["inner" + name] = function() {
		return this[0] ?
			jQuery.css( this[0], type, false, "padding" ) :
			null;
	};

	// outerHeight and outerWidth
	jQuery.fn["outer" + name] = function( margin ) {
		return this[0] ?
			jQuery.css( this[0], type, false, margin ? "margin" : "border" ) :
			null;
	};

	jQuery.fn[ type ] = function( size ) {
		// Get window width or height
		var elem = this[0];
		if ( !elem ) {
			return size == null ? null : this;
		}

		if ( jQuery.isFunction( size ) ) {
			return this.each(function( i ) {
				var self = jQuery( this );
				self[ type ]( size.call( this, i, self[ type ]() ) );
			});
		}

		return ("scrollTo" in elem && elem.document) ? // does it walk and quack like a window?
			// Everyone else use document.documentElement or document.body depending on Quirks vs Standards mode
			elem.document.compatMode === "CSS1Compat" && elem.document.documentElement[ "client" + name ] ||
			elem.document.body[ "client" + name ] :

			// Get document width or height
			(elem.nodeType === 9) ? // is it a document
				// Either scroll[Width/Height] or offset[Width/Height], whichever is greater
				Math.max(
					elem.documentElement["client" + name],
					elem.body["scroll" + name], elem.documentElement["scroll" + name],
					elem.body["offset" + name], elem.documentElement["offset" + name]
				) :

				// Get or set width or height on the element
				size === undefined ?
					// Get width or height on the element
					jQuery.css( elem, type ) :

					// Set the width or height on the element (default to pixels if value is unitless)
					this.css( type, typeof size === "string" ? size : size + "px" );
	};

});
// Expose jQuery to the global object
window.jQuery = window.$ = jQuery;

})(window);$$KOBJ = jQuery.noConflict();
/*  This will be set if there was a $ variable set before we started  */
if(typeof($$PREKOBJ) != 'undefined')
{
    $ = $$PREKOBJ;
}
/**
 * sprintf and vsprintf for jQuery
 * somewhat based on http://jan.moesen.nu/code/javascript/sprintf-and-printf-in-javascript/
 *
 * Copyright (c) 2008 Sabin Iacob (m0n5t3r) <iacobs@m0n5t3r.info>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @license http://www.gnu.org/licenses/gpl.html
 * @project jquery.sprintf
 */
(function($){
	var formats = {
		'b': function(val) {return parseInt(val, 10).toString(2);},
		'c': function(val) {return String.fromCharCode(parseInt(val, 10));},
		'd': function(val) {return parseInt(val, 10);},
		'u': function(val) {return Math.abs(val);},
		'f': function(val, p) {
			p = parseInt(p, 10);
			val = parseFloat(val);
			if(isNaN(p && val)) {
				return NaN;
			}
			return p && val.toFixed(p) || val;
		},
		'o': function(val) {return parseInt(val, 10).toString(8);},
		's': function(val) {return val;},
		'x': function(val) {return ('' + parseInt(val, 10).toString(16)).toLowerCase();},
		'X': function(val) {return ('' + parseInt(val, 10).toString(16)).toUpperCase();}
	};

	var re = /%(?:(\d+)?(?:\.(\d+))?|\(([^)]+)\))([%bcdufosxX])/g;

	var dispatch = function(data){
		if(data.length == 1 && typeof data[0] == 'object') { //python-style printf
			data = data[0];
			return function(match, w, p, lbl, fmt, off, str) {
				return formats[fmt](data[lbl]);
			};
		} else { // regular, somewhat incomplete, printf
			var idx = 0;
			return function(match, w, p, lbl, fmt, off, str) {
				if(fmt == '%') {
					return '%';
				}
				return formats[fmt](data[idx++], p);
			};
		}
	};

	$.extend({
		sprintf: function(format) {
			var argv = Array.apply(null, arguments).slice(1);
			return format.replace(re, dispatch(argv));
		},
		vsprintf: function(format, data) {
			return format.replace(re, dispatch(data));
		}
	});
})(jQuery);/*
 * jQuery JSON Plugin
 * version: 1.0 (2008-04-17)
 *
 * This document is licensed as free software under the terms of the
 * MIT License: http://www.opensource.org/licenses/mit-license.php
 *
 * Brantley Harris technically wrote this plugin, but it is based somewhat
 * on the JSON.org website's http://www.json.org/json2.js, which proclaims:
 * "NO WARRANTY EXPRESSED OR IMPLIED. USE AT YOUR OWN RISK.", a sentiment that
 * I uphold.  I really just cleaned it up.
 *
 * It is also based heavily on MochiKit's serializeJSON, which is
 * copywrited 2005 by Bob Ippolito.
 */

(function($) {
    function toIntegersAtLease(n)
    // Format integers to have at least two digits.
    {
        return n < 10 ? '0' + n : n;
    }

    Date.prototype.toJSON = function(date)
    // Yes, it polutes the Date namespace, but we'll allow it here, as
    // it's damned usefull.
    {
        return this.getUTCFullYear()   + '-' +
             toIntegersAtLease(this.getUTCMonth()) + '-' +
             toIntegersAtLease(this.getUTCDate());
    };

    var escapeable = /["\\\x00-\x1f\x7f-\x9f]/g;
    var meta = {    // table of character substitutions
            '\b': '\\b',
            '\t': '\\t',
            '\n': '\\n',
            '\f': '\\f',
            '\r': '\\r',
            '"' : '\\"',
            '\\': '\\\\'
        };

    $.quoteString = function(string)
    // Places quotes around a string, inteligently.
    // If the string contains no control characters, no quote characters, and no
    // backslash characters, then we can safely slap some quotes around it.
    // Otherwise we must also replace the offending characters with safe escape
    // sequences.
    {
        if (escapeable.test(string))
        {
            return '"' + string.replace(escapeable, function (a)
            {
                var c = meta[a];
                if (typeof c === 'string') {
                    return c;
                }
                c = a.charCodeAt();
                return '\\u00' + Math.floor(c / 16).toString(16) + (c % 16).toString(16);
            }) + '"'
        }
        return '"' + string + '"';
    };

    $.toJSON = function(o, compact)
    {
        var type = typeof(o);

        if (type == "undefined")
            return "undefined";
        else if (type == "number" || type == "boolean")
            return o + "";
        else if (o === null)
            return "null";

        // Is it a string?
        if (type == "string")
        {
            return $.quoteString(o);
        }

        // Does it have a .toJSON function?
        if (type == "object" && typeof o.toJSON == "function")
            return o.toJSON(compact);

        // Is it an array?
        if (type != "function" && typeof(o.length) == "number")
        {
            var ret = [];
            for (var i = 0; i < o.length; i++) {
                ret.push( $.toJSON(o[i], compact) );
            }
            if (compact)
                return "[" + ret.join(",") + "]";
            else
                return "[" + ret.join(", ") + "]";
        }

        // If it's a function, we have to warn somebody!
        if (type == "function") {
            throw new TypeError("Unable to convert object of type 'function' to json.");
        }

        // It's probably an object, then.
        ret = [];
        for (var k in o) {
            var name;
            var type = typeof(k);

            if (type == "number")
                name = '"' + k + '"';
            else if (type == "string")
                name = $.quoteString(k);
            else
                continue;  //skip non-string or number keys

            var val = $.toJSON(o[k], compact);
            if (typeof(val) != "string") {
                // skip non-serializable values
                continue;
            }

            if (compact)
                ret.push(name + ":" + val);
            else
                ret.push(name + ": " + val);
        }
        return "{" + ret.join(", ") + "}";
    };

    $.compactJSON = function(o)
    {
        return $.toJSON(o, true);
    };

    $.evalJSON = function(src)
    // Evals JSON that we know to be safe.
    {
        return eval("(" + src + ")");
    };

    $.secureEvalJSON = function(src)
    // Evals JSON in a way that is *more* secure.
    {
        var filtered = src;
        filtered = filtered.replace(/\\["\\\/bfnrtu]/g, '@');
        filtered = filtered.replace(/"[^"\\\n\r]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g, ']');
        filtered = filtered.replace(/(?:^|:|,)(?:\s*\[)+/g, '');

        if (/^[\],:{}\s]*$/.test(filtered))
            return eval("(" + src + ")");
        else
            throw new SyntaxError("Error parsing JSON, source is not valid.");
    };
})(jQuery);
/* Copyright (c) 2006 Brandon Aaron (http://brandonaaron.net)
 * Dual licensed under the MIT (http://www.opensource.org/licenses/mit-license.php)
 * and GPL (http://www.opensource.org/licenses/gpl-license.php) licenses.
 *
 * $LastChangedDate: 2007-07-21 18:44:59 -0500 (Sat, 21 Jul 2007) $
 * $Rev: 2446 $
 *
 * Version 2.1.1
 */

(function($){

/**
 * The bgiframe is chainable and applies the iframe hack to get
 * around zIndex issues in IE6. It will only apply itself in IE6
 * and adds a class to the iframe called 'bgiframe'. The iframe
 * is appeneded as the first child of the matched element(s)
 * with a tabIndex and zIndex of -1.
 *
 * By default the plugin will take borders, sized with pixel units,
 * into account. If a different unit is used for the border's width,
 * then you will need to use the top and left settings as explained below.
 *
 * NOTICE: This plugin has been reported to cause perfromance problems
 * when used on elements that change properties (like width, height and
 * opacity) a lot in IE6. Most of these problems have been caused by
 * the expressions used to calculate the elements width, height and
 * borders. Some have reported it is due to the opacity filter. All
 * these settings can be changed if needed as explained below.
 *
 * @example $('div').bgiframe();
 * @before <div><p>Paragraph</p></div>
 * @result <div><iframe class="bgiframe".../><p>Paragraph</p></div>
 *
 * @param Map settings Optional settings to configure the iframe.
 * @option String|Number top The iframe must be offset to the top
 * 		by the width of the top border. This should be a negative
 *      number representing the border-top-width. If a number is
 * 		is used here, pixels will be assumed. Otherwise, be sure
 *		to specify a unit. An expression could also be used.
 * 		By default the value is "auto" which will use an expression
 * 		to get the border-top-width if it is in pixels.
 * @option String|Number left The iframe must be offset to the left
 * 		by the width of the left border. This should be a negative
 *      number representing the border-left-width. If a number is
 * 		is used here, pixels will be assumed. Otherwise, be sure
 *		to specify a unit. An expression could also be used.
 * 		By default the value is "auto" which will use an expression
 * 		to get the border-left-width if it is in pixels.
 * @option String|Number width This is the width of the iframe. If
 *		a number is used here, pixels will be assume. Otherwise, be sure
 * 		to specify a unit. An experssion could also be used.
 *		By default the value is "auto" which will use an experssion
 * 		to get the offsetWidth.
 * @option String|Number height This is the height of the iframe. If
 *		a number is used here, pixels will be assume. Otherwise, be sure
 * 		to specify a unit. An experssion could also be used.
 *		By default the value is "auto" which will use an experssion
 * 		to get the offsetHeight.
 * @option Boolean opacity This is a boolean representing whether or not
 * 		to use opacity. If set to true, the opacity of 0 is applied. If
 *		set to false, the opacity filter is not applied. Default: true.
 * @option String src This setting is provided so that one could change
 *		the src of the iframe to whatever they need.
 *		Default: "javascript:false;"
 *
 * @name bgiframe
 * @type jQuery
 * @cat Plugins/bgiframe
 * @author Brandon Aaron (brandon.aaron@gmail.com || http://brandonaaron.net)
 */
$.fn.bgIframe = $.fn.bgiframe = function(s) {
	// This is only for IE6
	if ( $.browser.msie && /8.0/.test(navigator.userAgent) || $.browser.msie && /7.0/.test(navigator.userAgent || $.browser.msie && /6.0/.test(navigator.userAgent)) ) {
		s = $.extend({
			top     : 'auto', // auto == .currentStyle.borderTopWidth
			left    : 'auto', // auto == .currentStyle.borderLeftWidth
			width   : 'auto', // auto == offsetWidth
			height  : 'auto', // auto == offsetHeight
			opacity : true,
			src     : 'javascript:false;'
		}, s || {});
		var prop = function(n){return n&&n.constructor==Number?n+'px':n;},
		    html = '<iframe class="bgiframe"frameborder="0"tabindex="-1"src="'+s.src+'"'+
		               'style="display:block;position:absolute;z-index:-1;'+
			               (s.opacity !== false?'filter:Alpha(Opacity=\'0\');':'')+
					       'top:'+(s.top=='auto'?'expression(((parseInt(this.parentNode.currentStyle.borderTopWidth)||0)*-1)+\'px\')':prop(s.top))+';'+
					       'left:'+(s.left=='auto'?'expression(((parseInt(this.parentNode.currentStyle.borderLeftWidth)||0)*-1)+\'px\')':prop(s.left))+';'+
					       'width:'+(s.width=='auto'?'expression(this.parentNode.offsetWidth+\'px\')':prop(s.width))+';'+
					       'height:'+(s.height=='auto'?'expression(this.parentNode.offsetHeight+\'px\')':prop(s.height))+';'+
					'"/>';
		return this.each(function() {
			if ( $('> iframe.bgiframe', this).length === 0 )
				this.insertBefore( document.createElement(html), this.firstChild );
		});
	}
	return this;
};

})(jQuery);/* modified from jGrowl 1.1.2 to fit KOBJ needs */
 (function($) {

    $.kGrowl = function(m, in_config) {
        var config = {};
		$.extend(config,$.kGrowl.defaults, in_config);
        // To maintain compatibility with older version that only supported one instance we'll create the base container.
        var styling = {
            "padding": "10px",
            "z-index": 9999,
            "position": "fixed"
        };

        var pos = config.position.split("-");

        styling[pos[0]] = "0px";
        //vert
        styling[pos[1]] = "0px";
        //horz
        if ($.browser.msie) {
            // degrade for IE
            styling["position"] = "absolute";
        }

        config["kid"] = "kGrowl"  + config.position;

        if ($("#" + config["kid"]).size() === 0)
        {
            $('<div id="'+ config["kid"]  +'"></div>').css(styling).appendTo('body');
        }
        // Create a notification on the container.
        $("#" + config["kid"]).kGrowl(m, config);
    };


    /** Raise kGrowl Notification on a kGrowl Container **/
    $.fn.kGrowl =
    function(m, config) {
        if ($.isFunction(this.each)) {
            var args = arguments;

            return this.each(function() {
                var self = this;

                /** Create a kGrowl Instance on the Container if it does not exist **/
                if ($(this).data('kGrowl.instance') == undefined) {
                    $(this).data('kGrowl.instance', new $.fn.kGrowl());
                    $(this).data('kGrowl.instance').startup(this);
                }

                /** Optionally call kGrowl instance methods, or just raise a normal notification **/
                if ($.isFunction($(this).data('kGrowl.instance')[m])) {
                    $(this).data('kGrowl.instance')[m].apply($(this).data('kGrowl.instance'), $.makeArray(args).slice(1));
                } else {
                    $(this).data('kGrowl.instance').notification(m, config);
                }
            });
        }
    };

    $.extend($.fn.kGrowl.prototype, {

        /** Default JGrowl Settings **/
        defaults: {
            background_color: "#222",
            color: "#fff",
            font_size: "12px",
            header_font_size: "13px",
            width: "235px",
            header: '',
            sticky: false,
            position: 'top-right',
            glue: 'after',
            theme: 'default',
            corners: '10px',
            check: 500,
            life: 3000,
            opacity: 0.85,
            speed: 'normal',
            easing: 'swing',
            closer: true,
            closeTemplate: '&times;',
            closerTemplate: '<div>[ close all ]</div>',
            log: function(e, m, o) {},
            beforeOpen: function(e, m, o) {},
            open: function(e, m, o) {},
            beforeClose: function(e, m, o) {},
            close: function(e, m, o) {},
            animateOpen: {
                opacity: 'show'
            },
            animateClose: {
                opacity: 'hide'
            }
        },

        /** kGrowl Container Node **/
        element: null,

        /** Interval Function **/
        interval: null,

        /** Create a Notification **/
        notification: function(message, config) {
            var self = this;

            config.log.apply(this.element, [this.element, message, config]);

            var header = $('<div>').addClass("KOBJ_header").css(
            {
                "font-weight": "bold",
                "font-size": config.header_font_size
            }).html(config.header);

            message = $('<div>').addClass("KOBJ_message").html(message);

            var close = $('<div>').addClass("close").css(
            {
                "float": "right",
                "font-weight": "bold",
                "font-size": config.font_size,
                "cursor": "pointer"
            }
            ).html(config.closeTemplate);

            var notification_style = {
                "-moz-border-radius": "5px",
                "-webkit-border-radius": "5px",
                "background-color": config.background_color,
                "color": config.color,
                "display": "none",
                "filter": "alpha(opacity = " + config.opacity * 100 + ")",
                "font-family": "Tahoma, Arial, Helvetica, sans-serif",
                "font-size": config.font_size,
                "margin-bottom": "5px",
                "margin-top": "5px",
                "min-height": "40px",
                "opacity": config.opacity,
                "padding": "10px",
                "text-align": "left",
                "width": config.width,
                "zoom": "1"
            };

            var closer_style = {
                "cursor": "pointer",
                "font-weight": "bold",
                "height": "15px",
                "padding-bottom": "4px",
                "padding-top": "4px",
                "text-align": "center"
            };
            jQuery.each(notification_style,
            function(i, v) {
                if (!closer_style[i]) closer_style[i] = v;
            });
            closer_style["min-height"] = undefined;

            var notification = $('<div>').addClass("kGrowl-notification").css(notification_style).append(close).append(header).append(message).data("kGrowl", config).addClass(config.theme).children('div.close').bind("click.kGrowl",
            function() {
                $(this).unbind('click.kGrowl').parent().trigger('kGrowl.beforeClose').animate(config.animateClose, config.speed, config.easing,
                function() {
                    $(this).trigger('kGrowl.close').remove();
                });
            }).parent();

            (config.glue == 'after') ? $('div.kGrowl-notification:last', this.element).after(notification) : $('div.kGrowl-notification:first', this.element).before(notification);

            /** Notification Actions **/
            $(notification).bind("mouseover.kGrowl",
            function() {
                $(this).data("kGrowl").pause = true;
            }).bind("mouseout.kGrowl",
            function() {
                $(this).data("kGrowl").pause = false;
            }).bind('kGrowl.beforeOpen',
            function() {
                config.beforeOpen.apply(self.element, [self.element, message, config]);
            }).bind('kGrowl.open',
            function() {
                config.open.apply(self.element, [self.element, message, config]);
            }).bind('kGrowl.beforeClose',
            function() {
                config.beforeClose.apply(self.element, [self.element, message, config]);
            }).bind('kGrowl.close',
            function() {
                config.close.apply(self.element, [self.element, message, config]);
            }).trigger('kGrowl.beforeOpen').animate(config.animateOpen, config.speed, config.easing,
            function() {
                $(this).data("kGrowl").created = new Date();
            }).trigger('kGrowl.open');

            /** Optional Corners Plugin **/
            if ($.fn.corner != undefined) $(notification).corner(config.corners);

            /* For IE put iframe behide it to cover flash */
            $(".kGrowl-notification").parent().bgiframe({
                "opacity": true,
                "left": 10,
                "top": -15
            });

            /** Add a Global Closer if more than one notification exists **/
            if ($('div.kGrowl-notification:parent', this.element).size() > 1 && $('div.kGrowl-closer', this.element).size() === 0 && config.closer !== false) {
                $(config.closerTemplate).addClass('kGrowl-closer').css(closer_style).addClass(config.theme).appendTo(this.element).animate(config.animateOpen, config.speed, config.easing).bind("click.kGrowl",
                function() {
                    $(this).siblings().children('div.close').trigger("click.kGrowl");

                    if ($.isFunction(config.closer)) config.closer.apply($(this).parent()[0], [$(this).parent()[0]]);
                });
            }
        },

        /** Update the kGrowl Container, removing old kGrowl notifications **/
        update: function() {
            $(this.element).find('div.kGrowl-notification:parent').each(function() {
                if ($(this).data("kGrowl") != undefined && $(this).data("kGrowl").created != undefined && ($(this).data("kGrowl").created.getTime() + $(this).data("kGrowl").life) < (new Date()).getTime() && $(this).data("kGrowl").sticky !== true &&
                ($(this).data("kGrowl").pause == undefined || $(this).data("kGrowl").pause !== true)) {
                    $(this).children('div.close').trigger('click.kGrowl');
                }
            });

            if ($(this.element).find('div.kGrowl-notification:parent').size() < 2) {
                $(this.element).find('div.kGrowl-closer').animate($.kGrowl.defaults.animateClose, $.kGrowl.defaults.speed, $.kGrowl.defaults.easing,
                function() {
                    $(this).remove();
                });
            }
        },

        /** Setup the kGrowl Notification Container **/
        startup: function(e) {
            this.element = $(e).addClass('kGrowl').append('<div class="kGrowl-notification"></div>');
            this.interval = setInterval(function() {
                jQuery(e).data('kGrowl.instance').update();
            },
            $.kGrowl.defaults.check);

        },

        /** Shutdown kGrowl, removing it and clearing the interval **/
        shutdown: function() {
            $(this.element).removeClass('kGrowl').find('div.kGrowl-notification').remove();
            clearInterval(this.interval);
        }
    });

    /** Reference the Defaults Object for compatibility with older versions of kGrowl **/
    $.kGrowl.defaults = $.fn.kGrowl.prototype.defaults;

})(jQuery);/*  Snowfall jquery plugin

	version 1.2, Dec 20 2009

	Developed by Jason Brown for any bugs or questions email me at loktar69@hotmail

	info on the plugin is located on Somethinghitme.com



	values for snow options are



	flakeCount,

	flakeColor,

	flakeIndex,

	minSize,

	maxSize,

	minSpeed,

	maxSpeed



	Example Usage :

	$(document).snowfall({flakeCount : 100, maxSpeed : 10});



	-or-



	$('#element').snowfall({flakeCount : 800, maxSpeed : 5, maxSize : 5});



	-or with defaults-



	$(document).snowfall();

*/
(function($){
	$.fn.snowfall = function(options){
		var element = this;
		// random fuction for generating random vals

		var random = function random(min, max){
			return Math.round(min + Math.random()*(max-min));
		};

		// snow flake class
		function Flake(_x, _y, _size, _speed)
		{
			// Flake properties
			this.id = flakeId;
			this.x  = _x;
			this.y  = _y;
			this.size = _size;
			this.speed = _speed;
			this.step = 0;
			this.stepSize = random(1,10) / 100;

			var flakeMarkup = "<div id='flake-" + this.id + "' style='width: " + this.size + "px; height: " + this.size + "px; background: " + options.flakeColor + "; position: absolute; top: " + this.y + "px; left:" + this.x + "px; font-size: 0px; z-index: " + options.flakeIndex + ";'></div>";

			if($(element).get(0).tagName === $(KOBJ.document).get(0).tagName){
				$('body').append(flakeMarkup);
			}else{
				$(element).append(flakeMarkup);
			}

			this.element = KOBJ.document.getElementById('flake-' + this.id);

			// Update function, used to update the snow flakes, and checks current snowflake against bounds
			this.update = function(){
				this.y += this.speed;

				if(this.y > (elHeight) - 6){
					this.reset();
				}
				this.element.style.top = this.y + 'px';
				this.element.style.left = this.x + 'px';
				this.step += this.stepSize;
				this.x += Math.cos(this.step);
				if(this.x > (elWidth) - 6 || this.x < 6){
					this.reset();
				}
			};

			// Resets the snowflake once it reaches one of the bounds set
			this.reset = function(){
				this.y = 0;
				this.x = random(0, elWidth);
				this.stepSize = random(1,10) / 100;
				this.size = random((options.minSize * 100), (options.maxSize * 100)) / 100;
				this.speed = random(options.minSpeed, options.maxSpeed);
			};
		}

		// plugin vars
		var flakes = [],
			flakeId = 0,
			i = 0,
			elHeight = $(element).height(),
			elWidth = $(element).width(),
			defaults = {
				flakeCount : 25,
				flakeColor : '#ffffff',
				flakeIndex: 999999,
				minSize : 2,
				maxSize : 5,
				minSpeed : 2,
				maxSpeed : 3
				},

			options = $.extend(defaults, options);

		// Bind the window resize event so we can get the innerHeight again

		$(window).bind("resize", function(){
			elHeight = $(element).height();
			elWidth = $(element).width();
		});

		// initialize the flakes
		for(i = 0; i < options.flakeCount; i+=1){
			flakeId = i;
			flakes[i] = new Flake(random(0,elWidth), random(0, elHeight), random((options.minSize * 100), (options.maxSize * 100)) / 100, random(options.minSpeed, options.maxSpeed));
		}

		// this controls flow of the updating snow
		function snow(){
			for( i = 0; i < options.flakeCount; i += 1){
				flakes[i].update();
			}

			setTimeout(function(){snow();}, 90);
		}

		snow();
	};

})(jQuery);
window['$KOBJ'] = $$KOBJ;

if (typeof($K) == 'undefined') {
    window['$K'] = $$KOBJ;
}

window['KOBJ'] = { name: "KRL Runtime Library",
    version: '0.9',
    copyright: "Copyright 2007-2009, Kynetx Inc.  All Rights reserved."
};

KOBJ['extra_page_vars'] = {};
KOBJ['applications'] = {};
KOBJ['data'] = KOBJ['data'] || {};
KOBJ['external_resources'] = {};

KOBJ.in_bx_extention = false;
KOBJ.can_ajax_post = false;
KOBJ.default_error_stack_key = "50d2aebf1044603c39a4e36e8d90e91e";

//used for overriding the document for UI actions
KOBJ.window = window;
KOBJ.navigator = navigator;
KOBJ.document = document;

KOBJ.locationHref = null;
KOBJ.locationHost = null;
KOBJ.locationProtocol = null;
KOBJ.delay_execution = false;
// Production servers
//KOBJ.init_host = 'init.kobj.net';
//KOBJ.eval_host = 'cs.kobj.net';
//KOBJ.callback_host = 'log.kobj.net';
//KOBJ.kns_port = '';

KOBJ.init_host = 'init.kobj.net';
KOBJ.eval_host = 'cs.kobj.net';
KOBJ.callback_host = 'log.kobj.net';

KOBJ.kns_port = '';

KOBJ.raise_event_action = function (uniq, event_name, config) {
    var app = KOBJ.get_application(config.rid);
    app.raise_event(event_name, config["parameters"], config["app_id"]);
};

KOBJ.page_content_event = function (uniq, label, selectors, config) {
    var app = KOBJ.get_application(config.rid);

    var found_data = [];

    $KOBJ.each(selectors, function(name, selector) {
        var result = $KOBJ(selector["selector"]);
        if (selector["type"] == "text")
            result = result.text();
        else if (selector["type"] == "form")
            result = result.val();
        else
            result = "invalid select type";


        found_data.push({name: name,value:result });
    });
    found_data.push({name: "label",value:label });


    var all_data = {"param_data":found_data};

    KOBJEventManager.add_out_of_bound_event(app, "page_content", true, all_data);

};


/*
 * This is a shortcut way to register interest for an event for a given application
 * id.
 */
KOBJ.watch_event = function(event, selector, config) {
    // Page views are special in that they do not have selectors
    var application = KOBJ.get_application(config["rid"]);
    if (event != "pageview") {
        KOBJEventManager.register_interest(event, selector, application, config);
    }
    else {
        KOBJEventManager.add_out_of_bound_event(application, "pageview");
    }
};


KOBJ.annotate_action = function(uniq, callback, config, name) {
    var ann = new KOBJAnnotateSearchResults(KOBJ.get_application(config.rid), name, config, callback);
    ann.annotate();
};

KOBJ.local_annotate_action = function(uniq, callback, config,name) {
    var ann = new KOBJAnnotateLocalSearchResults(KOBJ.get_application(config.rid), name, config, callback);
    ann.annotate();
};
/* Injects a javascript fragment into the page */
// TODO: Remove only used by the widget weather.pl
KOBJ.fragment = function(base_url) {
    var e = KOBJ.document.createElement("script");
    e.src = base_url;
    var body = KOBJ.document.getElementsByTagName("body")[0];
    body.appendChild(e);
};

/* Replaces the html contents of an element */
// TODO: Remove only used by the widget weather.pl
KOBJ.update_elements = function (params) {
    for (var mykey in params) {
        $KOBJ("#kobj_" + mykey).html(params[mykey]);
    }
};

// wrap some effects for use in embedded HTML
KOBJ.Fade = function (id) {
    $KOBJ(id).fadeOut();
};

KOBJ.BlindDown = function (id) {
    $KOBJ(id).slideDown();
};

KOBJ.BlindUp = function (id) {
    $KOBJ(id).slideUp();
};

KOBJ.BlindUp = function (id, speed) {
    $KOBJ(id).slideUp(speed);
};

KOBJ.hide = function (id) {
    $KOBJ(id).hide();
};

// TODO: Remove as I hate this
KOBJ.letitsnow = function(config) {
    $KOBJ(KOBJ.document).snowfall();
};

// TODO: Remove not used use side tab now
KOBJ.createPopIn = function(config, content) {

    var defaults = {
        "position": "left-center",
        "imageLocation": "http://k-misc.s3.amazonaws.com/actions/pop_in_feedback.jpg",
        "bg_color": "#FFFFFF",
        "link_color": "#FF0000",
        "overlay_color": "#000000"
    };
    if (typeof config === 'object') {
        jQuery.extend(defaults, config);
    }

    var side1;
    var side2;
    var distance;

    switch (defaults["position"]) {
        case "top-left":
            side1 = "top";
            side2 = "left";
            distance = "10%";
            break;
        case "top-center":
            side1 = "top";
            side2 = "left";
            distance = "45%";
            break;
        case "top-right":
            side1 = "top";
            side2 = "right";
            distance = "10%";
            break;
        case "bottom-left":
            side1 = "bottom";
            side2 = "left";
            distance = "10%";
            break;
        case "bottom-center":
            side1 = "bottom";
            side2 = "left";
            distance = "45%";
            break;
        case "bottom-right":
            side1 = "bottom";
            side2 = "right";
            distance = "10%";
            break;
        case "left-top":
            side1 = "left";
            side2 = "top";
            distance = "10%";
            break;
        case "left-center":
            side1 = "left";
            side2 = "top";
            distance = "45%";
            break;
        case "left-bottom":
            side1 = "left";
            side2 = "bottom";
            distance = "10%";
            break;
        case "right-top":
            side1 = "right";
            side2 = "top";
            distance = "10%";
            break;
        case "right-center":
            side1 = "right";
            side2 = "top";
            distance = "45%";
            break;
        case "right-bottom":
            side1 = "right";
            side2 = "bottom";
            distance = "10%";
            break;
        default:
            side1 = "left";
            side2 = "top";
            distance = "45%";
            break;
    }

    $KOBJ('body').append('<div id="KOBJ_PopIn_Link" style="' + side1 + ': 0; ' + side2 + ':' + distance + '; -moz-border-radius-bottomright: 12px; -moz-border-radius-topright: 12px; background-color:' + defaults["link_color"] + '; display:block; margin-top:-45px; position: fixed;  z-index:100001;"><a href="javascript:KOBJ_create_pop_in()"><img src="' + defaults["imageLocation"] + '" alt="KOBJ_pop_in" border="none" /></a>');
    KOBJ_create_pop_in = function() {
        var OverlayPresent = $KOBJ('#KOBJ_PopIn_Overlay').length;
        var ContentPresent = $KOBJ('#KOBJ_PopIn_Dialog').length;

        if (OverlayPresent) {
            $KOBJ('#KOBJ_PopIn_Overlay').fadeIn('slow');
        }
        if (ContentPresent) {
            $KOBJ('#KOBJ_PopIn_Dialog').fadeIn('slow');
        }
        if (!OverlayPresent) {
            $KOBJ('body').append('<div id="KOBJ_PopIn_Overlay" style="display: block; position: fixed; background-color: ' + defaults["overlay_color"] + '; height: 100%; width: 100%; left: 0; filter:alpha(opacity=70); opacity: 0.7; top: 0; z-index: 100002; display: none;" />');
            $KOBJ('#KOBJ_PopIn_Overlay').fadeIn('slow');
        }
        if (!ContentPresent) {

            // TODO: Display is overridden remove which one?
            $KOBJ('body').append('<div id="KOBJ_PopIn_Dialog" style="top: 45%; right: 40%; -moz-border-radius: 5px; display: block; height: auto; width: 20%; position: fixed; margin: 0 auto; text-align: center; z-index: 100003; display: none; background: ' + defaults["bg_color"] + '; filter:alpha(opacity=85); opacity: .85; "><div class="close" id="KOBJ_Close" style="cursor: pointer; float: right; font-weight: bold; margin-right: 8px; margin-top: 5px;">x</div><div id="KOBJ_PopIn_Content" style="padding: 10px; ">' + content + '</div></div>');
            $KOBJ("#KOBJ_Close").click(function() {
                KOBJ_close_pop_in();
            });
            $KOBJ('#KOBJ_PopIn_Dialog').fadeIn('slow');
        }

    };

    KOBJ_close_pop_in = function() {

        $KOBJ('#KOBJ_PopIn_Overlay').fadeOut('slow');
        $KOBJ('#KOBJ_PopIn_Dialog').fadeOut('slow');

    };

};

// TODO: Broken as it resets defaults based on config.  It should copy the config
// and use the copied hash
KOBJ.statusbar = function(config, content) {

    var defaults = {


        "sticky": false,
        "width": "98.5%",
        "height": "30px",
        "id": "KOBJ_status_bar",
        "bg_color": "#222222",
        "delay": 3000,
        "position": "bottom",
        "opacity": ".8",
        "color": "#ffffff"

    };
    if (typeof config === 'object') {
        if (config["sticky"] === true) {
            config["delay"] = false;
        }
        jQuery.extend(defaults, config);

    }
    var side = "";
    var corners = "";
    var direction = "";

    switch (defaults["position"]) {
        case "top":
            side = "top";
            corners = "bottom";
            direction = "down";
            break;
        case "bottom":
            side = "bottom";
            corners = "top";
            direction = "up";
            break;
        default:
            side = "bottom";
            corners = "top";
            direction = "up";
            break;
    }


    $KOBJ('body').append('<div id="' + defaults["id"] + '_wrapper" style="display: none; position: fixed; ' + side + ': 0; width: 100%; height: ' + defaults["height"] + ';"><div id="' + defaults["id"] + '" style="color: ' + defaults["color"] + '; height: ' + defaults["height"] + '; background: ' + defaults["bg_color"] + '; opacity: ' + defaults["opacity"] + '; -moz-border-radius-' + corners + 'right: 5px; -moz-border-radius-' + corners + 'left: 5px; margin-left: 12px; margin-right: 30px;"><div class="close" style="float: right; font-weight: bold; font-size: 20px; cursor: pointer; margin-right: 10px; margin-top: 5px;">x</div><div class="KOBJ_statusbar_content" style="color: ' + defaults["color"] + ';">' + content + '</div></div>');
    $KOBJ('#' + defaults["id"] + '>.close').click(function() {
        KOBJ.statusbar_close(defaults["id"]);
    });
    $KOBJ('#' + defaults["id"] + '_wrapper').slideDown('slow');
    if (defaults["sticky"] === false) {
        setTimeout(function() {
            KOBJ.statusbar_close(defaults["id"]);
        }, defaults["delay"]);
    }


};


//TODO: Broken Assumes only one status base. Maybe that is ok.
KOBJ.statusbar_close = function(id) {
    $KOBJ('#' + id).fadeOut('slow');
};

//end new jessie actions

KOBJ.page_collection_content_event = function (uniq, label, top_selector, parent_selector, selectors, config) {
    var app = KOBJ.get_application(config.rid);

    var found_data = [];

    // First find the top_selector elements.
    $KOBJ(top_selector).each(function() {

        // Now using that top selector as a context find each row
        $KOBJ(parent_selector, this).each(function() {
            var parent = this;
            var the_data = { "parent" : parent};
            var data = {};
            the_data["data"] = data;

            $KOBJ.each(selectors, function(name, selector) {
                var result = $KOBJ(selector["selector"], parent);
                if (selector["type"] == "text")
                    result = result.text();
                else if (selector["type"] == "form")
                    result = result.val();
                else
                    result = "invalid select type";

                data[name] = result;
            });


            found_data.push(the_data);

        });
    });

    if (config.callback != null) {
        config.callback(label, found_data);
    }
};


// helper functions used by float
KOBJ.buildDiv = function (uniq, pos, top, side, config) {
    var vert = top.split(/\s*:\s*/);
    var horz = side.split(/\s*:\s*/);
    var div_style = {
        position: pos,
        zIndex: '9999',

        display: 'none'
    };
    var class_name = "";
    if (typeof(config) != "undefined" && typeof(config.class_name) != "undefined") {
        class_name = config.class_name;
    }
    div_style[vert[0]] = vert[1];
    div_style[horz[0]] = horz[1];
    var id_str = 'kobj_' + uniq;
    var div = KOBJ.document.createElement('div');
    return $KOBJ(div).attr({'id': id_str}).css(div_style).addClass(class_name);
};


// randomly pick a member of a list
KOBJ.pick = function(o) {
    if (o) {
        return o[Math.floor(Math.random() * o.length)];
    } else {
        return o;
    }
};

// attach a close event to an element inside a notification
KOBJ.close_notification = function(s) {
    $KOBJ(s).bind("click.kGrowl",
                 function(e) {
                     $KOBJ(this).unbind('click.kGrowl');
                     $KOBJ(s).parents(".kGrowl-notification").trigger('kGrowl.beforeClose').animate({opacity: 'hide'}, "normal", "swing", function() {
                         $KOBJ(this).trigger('kGrowl.close').remove();
                     });
                 });
};


/* Inject requested CSS via a style tag */
KOBJ.css = function(css) {
    var head = KOBJ.document.getElementsByTagName('head')[0];
    var style = KOBJ.document.createElement('style');
    var rules = KOBJ.document.createTextNode(css);

    style.type = 'text/css';
    style.id = 'KOBJ_stylesheet';

    var KOBJstyle = KOBJ.document.getElementById('KOBJ_stylesheet');
    if (KOBJstyle == null) {
        if (style.styleSheet) {
            style.styleSheet.cssText = rules.nodeValue;
        } else {
            style.appendChild(rules);
        }
        head.appendChild(style);
    } else {
        if (KOBJstyle.styleSheet) {
            KOBJstyle.styleSheet.cssText += rules.nodeValue;
        } else {
            KOBJstyle.appendChild(rules);
        }
    }
};


KOBJ.parseURL = function(url) {
    var a = KOBJ.document.createElement('a');
    a.href = url;
    return {
        source: url,
        protocol: a.protocol.replace(':', ''),
        host: a.hostname,
        port: a.port,
        query: a.search,
        params: (function() {
            var ret = {},
                    seg = a.search.replace(/^\?/, '').split('&'),
                    len = seg.length, i = 0, s;
            for (; i < len; i++) {
                if (!seg[i]) {
                    continue;
                }
                s = seg[i].split('=');
                ret[s[0]] = s[1];
            }
            return ret;
        })(),
        file: (a.pathname.match(/\/([^\/?#]+)$/i) || [,''])[1],
        hash: a.hash.replace('#', ''),
        path: a.pathname.replace(/^([^\/])/, '/$1'),
        relative: (a.href.match(/tps?:\/\/[^\/]+(.+)/) || [,''])[1],
        segments: a.pathname.replace(/^\//, '').split('/')
    };
};

/*
 Takes a hash and converts it into a url parameter string starting with &.
 Also takes and extra_spacing parameter that will allow for reserving some about
 of characters to be used if prefixing the url with other data.
 */
KOBJ.url_from_hash = function(params, extra_spacing) {
    var urls = [];
    var url = "";

    $KOBJ.each(params, function(name, value) {
        var f_value = "" + ((value != null && typeof(value) != "undefined") ? value : "");

        if ((url.length + f_value.length + name.length + extra_spacing) < KOBJ.max_url_length()) {
            url += "&" + name + "=" + f_value;
        }
        else {
            urls.push(url);
            url = "";
        }
    });
    if (url.length != 0) {
        urls.push(url);
    }

    return urls;
};


KOBJ.parseURLParams = function(param_string) {
    var ret = {};
    var seg = param_string.replace(/^\?/, '').split('&');
    var len = seg.length;
    var i = 0;
    var s = null;
    for (; i < len; i++) {
        if (!seg[i]) {
            continue;
        }
        s = seg[i].split('=');
        ret[s[0]] = s[1];
    }
    return ret;
};


KOBJ.urlDecode = function (psEncodeString) {
    // Create a regular expression to search all +s in the string
    var lsRegExp = /\+/g;
    // Return the decoded string
    return unescape(String(psEncodeString).replace(lsRegExp, " "));
};

/*
Microsoft Internet Explorer (Browser)

Microsoft states that the maximum length of a URL in Internet Explorer is 2,083 characters, with no more than 2,048
characters in the path portion of the URL. In my tests, attempts to use URLs longer than this produced a clear error
message in Internet Explorer.

Firefox (Browser)

After 65,536 characters, the location bar no longer displays the URL in Windows Firefox 1.5.x. However, longer URLs
will work. I stopped testing after 100,000 characters.

Safari (Browser)

At least 80,000 characters will work. I stopped testing after 80,000 characters.

Opera (Browser)

At least 190,000 characters will work. I stopped testing after 190,000 characters. Opera 9 for Windows continued to
display a fully editable, copyable and pasteable URL in the location bar even at 190,000 characters.

Apache (Server)

My early attempts to measure the maximum URL length in web browsers bumped into a server URL length limit of approximately
4,000 characters, after which Apache produces a "413 Entity Too Large" error. I used the current up to date Apache build
found in Red Hat Enterprise Linux 4. The official Apache documentation only mentions an 8,192-byte limit on an individual
field in a request.

Microsoft Internet Information Server

The default limit is 16,384 characters (yes, Microsoft's web server accepts longer URLs than Microsoft's web browser).
This is configurable.

Perl HTTP::Daemon (Server)

Up to 8,000 bytes will work. Those constructing web application servers with Perl's HTTP::Daemon module will encounter a
16,384 byte limit on the combined size of all HTTP request headers. This does not include POST-method form data, file
uploads, etc., but it does include the URL. In practice this resulted in a 413 error when a URL was significantly longer
than 8,000 characters. This limitation can be easily removed. Look for all occurrences of16x1024 in Daemon.
 */
KOBJ.max_url_length =  function()
{
    if($KOBJ.browser.msie)
        return 1500;
    else
        return 3500;
};


/**
*
*  Base64 encode / decode
*  http://www.webtoolkit.info/
*
**/

window.Base64 = {

	// private property
	_keyStr : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",

	// public method for encoding
	encode : function (input) {
		var output = "";
		var chr1, chr2, chr3, enc1, enc2, enc3, enc4;
		var i = 0;

		input = Base64._utf8_encode(input);

		while (i < input.length) {

			chr1 = input.charCodeAt(i++);
			chr2 = input.charCodeAt(i++);
			chr3 = input.charCodeAt(i++);

			enc1 = chr1 >> 2;
			enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
			enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
			enc4 = chr3 & 63;

			if (isNaN(chr2)) {
				enc3 = enc4 = 64;
			} else if (isNaN(chr3)) {
				enc4 = 64;
			}

			output = output +
			this._keyStr.charAt(enc1) + this._keyStr.charAt(enc2) +
			this._keyStr.charAt(enc3) + this._keyStr.charAt(enc4);

		}

		return output;
	},

	// public method for decoding
	decode : function (input) {
		var output = "";
		var chr1, chr2, chr3;
		var enc1, enc2, enc3, enc4;
		var i = 0;

		input = input.replace(/[^A-Za-z0-9\+\/\=]/g, "");

		while (i < input.length) {

			enc1 = this._keyStr.indexOf(input.charAt(i++));
			enc2 = this._keyStr.indexOf(input.charAt(i++));
			enc3 = this._keyStr.indexOf(input.charAt(i++));
			enc4 = this._keyStr.indexOf(input.charAt(i++));

			chr1 = (enc1 << 2) | (enc2 >> 4);
			chr2 = ((enc2 & 15) << 4) | (enc3 >> 2);
			chr3 = ((enc3 & 3) << 6) | enc4;

			output = output + String.fromCharCode(chr1);

			if (enc3 != 64) {
				output = output + String.fromCharCode(chr2);
			}
			if (enc4 != 64) {
				output = output + String.fromCharCode(chr3);
			}

		}

		output = Base64._utf8_decode(output);

		return output;

	},

	// private method for UTF-8 encoding
	_utf8_encode : function (string) {
		string = string.replace(/\r\n/g,"\n");
		var utftext = "";

		for (var n = 0; n < string.length; n++) {

			var c = string.charCodeAt(n);

			if (c < 128) {
				utftext += String.fromCharCode(c);
			}
			else if((c > 127) && (c < 2048)) {
				utftext += String.fromCharCode((c >> 6) | 192);
				utftext += String.fromCharCode((c & 63) | 128);
			}
			else {
				utftext += String.fromCharCode((c >> 12) | 224);
				utftext += String.fromCharCode(((c >> 6) & 63) | 128);
				utftext += String.fromCharCode((c & 63) | 128);
			}

		}

		return utftext;
	},

	// private method for UTF-8 decoding
	_utf8_decode : function (utftext) {
		var string = "";
		var i = 0;
		var c = c1 = c2 = 0;

		while ( i < utftext.length ) {

			c = utftext.charCodeAt(i);

			if (c < 128) {
				string += String.fromCharCode(c);
				i++;
			}
			else if((c > 191) && (c < 224)) {
				c2 = utftext.charCodeAt(i+1);
				string += String.fromCharCode(((c & 31) << 6) | (c2 & 63));
				i += 2;
			}
			else {
				c2 = utftext.charCodeAt(i+1);
				c3 = utftext.charCodeAt(i+2);
				string += String.fromCharCode(((c & 15) << 12) | ((c2 & 63) << 6) | (c3 & 63));
				i += 3;
			}

		}

		return string;
	}

};KOBJ.watchDOM = function(selector, callBackFunc, time, context) {

    if (typeof(context) == "undefined") {
        context = KOBJ.document;
    }

    if (!KOBJ.watcherRunning) {
        KOBJ.itrace("Starting the DOM Watcher");

        var KOBJ_setInterval = 0;
        if (typeof(setInterval_native) != "undefined") {
            KOBJ_setInterval = setInterval_native;
        } else {
            KOBJ_setInterval = setInterval;
        }
        if (KOBJ.watcherRunning) {
            clearInterval(KOBJ.watcherRunning);
        }

        KOBJ.watcherData = KOBJ.watcherData || [];

        KOBJ.itrace("DOM Watcher Callback for new selector " + selector + " added");
        if($KOBJ(selector + " :first", context).length === 0)
        {
            KOBJ.itrace("DOM Watcher selector not found NOT enabling " + selector );
            setTimeout(function() {KOBJ.watchDOM(selector,callBackFunc,time,context);},1000);
            return;
        }
        $KOBJ(selector + " :first", context).addClass("KOBJ_AjaxWatcher");
        var there = false;
        if ($KOBJ(selector + " :first", context).is(".KOBJ_AjaxWatcher")) {
            there = true;
        }

        KOBJ.watcherData.push({"selector": selector,"callBacks": [callBackFunc], "there": there, "context" : context});


        KOBJ.watcher = function() {
            $KOBJ(KOBJ.watcherData).each(function() {
                var data = this;
                var selectorExists = $KOBJ(data.selector, data.context).length;
                if (!selectorExists) {
                    return;
                }

                var hasNotChanged = $KOBJ(data.selector + " :first", data.context).is(".KOBJ_AjaxWatcher");

                if (!data.there) {
                    $KOBJ(data.selector + " :first", data.context).addClass("KOBJ_AjaxWatcher");
                    if ($KOBJ(data.selector + " :first", data.context).is(".KOBJ_AjaxWatcher")) {
                        data.there = true;
                    } else {
                        data.there = false;
                    }

                    hasNotChanged = false;

                }


                if (!hasNotChanged && data.there) {
                    $KOBJ(data.callBacks).each(function() {
                        // TODO: Should this be var?
                        callBack = this;
                        KOBJ.itrace("Running call back on selector " + data.selector);
                        callBack();
                    });
                    $KOBJ(data.selector + " :first", data.context).addClass("KOBJ_AjaxWatcher");
                }
            });
        };


        KOBJ.watcherRunning = KOBJ_setInterval(KOBJ.watcher, time || 500);


    } else {
        $KOBJ(KOBJ.watcherData).each(function() {
            var data = this;
            if (data.selector == selector && data.context == context) {
                data.callBacks.push(callBackFunc);
                $KOBJ(data.selector + " :first", data.context).addClass("KOBJ_AjaxWatcher");

                if ($KOBJ(data.selector + " :first", data.context).is(".KOBJ_AjaxWatcher")) {
                    data.there = true;
                } else {
                    data.there = false;
                }

                KOBJ.itrace("DOM Watcher Callback for previous selector " + selector + " added");
                return false;//breaks out of the loop.

            } else {
                var there = false;

                if ($KOBJ(selector + " :first", context).is(".KOBJ_AjaxWatcher")) {
                    there = true;
                }

                KOBJ.watcherData.push({"selector": selector,"callBacks": [callBackFunc], "there": there, "context" : context});
                $KOBJ(selector + " :first", context).addClass("KOBJ_AjaxWatcher");
                KOBJ.itrace("DOM Watcher Call for new selector " + selector + " added");
            }
        });//end each
    }//end if/else
};
KOBJDomWatch = {};

KOBJDomWatch.scopes = {};

KOBJDomWatch.get_dom_watch = function(name,condition_callback,change_delay) {
    if (typeof(name) == "undefined") {
        name = "general";
    }

    if(typeof(condition_callback) == "undefined" || condition_callback == null)
    {
        condition_callback = function() { return true; };
    }

    var watcher = KOBJDomWatch.scopes[name];
    if (watcher != null) {
         KOBJ.loggers.domwatch.trace("Dom watch already exist for ",name);
        return watcher;
    }
    watcher = new KOBJDomWatchWatcher(name,condition_callback,change_delay);
    KOBJDomWatch.scopes[name] = watcher;
    // Start it up
    KOBJ.loggers.domwatch.trace("Timeout set to  " +  watcher.change_deplay);
    setTimeout(function() { watcher.timeout_watcher(); }, watcher.change_deplay);

    return watcher;
};


function KOBJDomWatchWatcher(name, condition_callback, change_delay) {
    this.name = name;
    this.condition_callback = condition_callback;
    if(typeof(change_delay) != "undefined")
    {
        this.change_deplay =  change_delay;
    }
    else
    {
        this.change_deplay =  500;
    }
    /*
     This hash will look like
     { ".class" : { pre_hash: 94949494, lastchecktime: 23343333}
     */
    this.selector_data = {};
}

KOBJDomWatchWatcher.prototype.watch = function(selector, callback, app) {
    KOBJ.loggers.domwatch.trace("Adding to Watcher ", this.name, selector);
    if (this.selector_data[selector] == null) {
        this.selector_data[selector] = {
            pre_hash :  KOBJEventManager.content_change_hashcode(selector),
            last_check: new Date().valueOf(),
            apps: {}
        };
    }

    if (this.selector_data[selector]["apps"][app.app_id] == null) {
        this.selector_data[selector]["apps"][app.app_id] = {
            app:app,
            callbacks: [callback]
        };
    }
    else {
        this.selector_data[selector]["apps"][app.app_id]["callbacks"].push(callback);
    }
    var myself = this;
};

KOBJDomWatchWatcher.prototype.reset_selector_hash = function() {
    var myself = this;
    $KOBJ.each(this.selector_data, function(selector, selector_info) {
        KOBJ.loggers.domwatch.trace("Selector hash is B " + selector + " - " + selector_info.pre_hash);
        selector_info.pre_hash = KOBJEventManager.content_change_hashcode(selector);
        KOBJ.loggers.domwatch.trace("Selector hash is A " + selector + " - " + selector_info.pre_hash);
    });
};


KOBJDomWatchWatcher.prototype.timeout_watcher = function() {
    var myself = this;
    KOBJ.loggers.domwatch.trace("Running new domwatch");
    $KOBJ.each(this.selector_data, function(selector, selector_info) {
        current_hash = KOBJEventManager.content_change_hashcode(selector);
        KOBJ.loggers.domwatch.trace("Old hash: " + selector_info.pre_hash + " new Hash : " + current_hash);
        if (current_hash != selector_info.pre_hash) {
            // If there is a conditional call back then we need to have it say true in order
            // to say something changed.
            if (myself.condition_callback && myself.condition_callback()) {
                $KOBJ.each(selector_info["apps"], function(app_id, app_data) {
                    var cnt = 1;
                    $KOBJ.each(app_data["callbacks"], function(index) {
                        KOBJ.loggers.domwatch.trace("Fire call back for " + app_id + " " + cnt);
                        this();
                        KOBJ.loggers.domwatch.trace("Call Back Completed " + app_id + " " + cnt);
                    });
                });
            }
        }
    });
    $KOBJ(KOBJ.document).ready(function() {
        // If the condition did not say something changed then we need to not reset so we can
        // try again next time.
        if (myself.condition_callback && myself.condition_callback()) {
            myself.reset_selector_hash();
        }
        KOBJ.loggers.domwatch.trace("Timeout set to  " +  myself.change_deplay);
        setTimeout(function() { myself.timeout_watcher(); }, myself.change_deplay);

    });
};

KOBJ.maxURLLength = 1800;

KOBJ.splitJSONRequest = function(json, maxLength, url) {

    var jsonString = $KOBJ.compactJSON(json);
    var numOfRequests = Math.ceil((jsonString.length + url.length) / maxLength);
    KOBJ.log("The number of requests to be made is: " + numOfRequests);
    if (numOfRequests > 1) {
        KOBJ.log("The length of the annotation request would be too large. Splitting into " + numOfRequests + " requests.");
        var toReturn = [];
        var count = 1;
        $KOBJ.each(json, function(index) {
            var object = this;
            var number = count++ % (numOfRequests);
            toReturn[number] = toReturn[number] || {};
            toReturn[number][index] = object;
        });
        return toReturn;
    } else {
        return [json];
    }
};

KOBJ.getJSONP = function(url, data, cb) {
    KOBJ.log("getJSON with JSONP");
    $KOBJ.getJSON(url, data, cb);
};

// Start of annotate local changes, v1.2


// KOBJ.annotate_local_search_extractdata pulls the data out automatically, such as phone and domain.

KOBJ.annotate_local_search_extractdata = function(toAnnotate, config) {

    var annotateData = {};
    var phoneSelector = config.domains[window.location.host].phoneSel;
    var urlSelector = config.domains[window.location.host].phoneSel;
    var phoneTemp = $KOBJ(toAnnotate).find(phoneSelector).text().replace(/[\u00B7() -]/g, "");
    var urlTemp = $KOBJ(toAnnotate).find(urlSelector).attr("href");

    if (!urlTemp) {
        urlTemp = $KOBJ(toAnnotate).find(".url, cite").text();
        if (!urlTemp) {
            urlTemp = $KOBJ(toAnnotate).find("li:eq(1) a").attr("href");
        }
        // Failsafe
    }
    if (urlTemp) {
        annotateData["url"] = urlTemp;
        annotateData["domain"] = KOBJ.get_host(urlTemp);
    } else {
        annotateData["url"] = "";
        annotateData["domain"] = "";
    }
    if (phoneTemp === "") {
        phoneTemp = $KOBJ(toAnnotate);
        phoneTemp = phoneTemp.text().match(/\(\d{3}\)\s\d{3}-\d{4}/, "$1");
        if (phoneTemp !== null) {
            phoneTemp = phoneTemp[0];
            phoneTemp = phoneTemp.replace(/[() -]/g, "");
        }
    }


    var heightTemp = $KOBJ(toAnnotate).height();

    if (phoneTemp !== null) {
        annotateData["phone"] = phoneTemp;
    } else {
        annotateData["phone"] = "";
    }
    annotateData["height"] = heightTemp;
    return annotateData;
};

// Defaults for both with and without remote.
// The "domains" element provides selector on a site by site basis

KOBJ.annotate_local_search_defaults = {
    "name": "KOBJL",
    "domains":{
        "www.google.com":{"selector":".localbox .ts .g table+div,.g>.ts>tbody>tr>td:has(cite):not(:has(table)):not(:has(div)),#results td:last-child:has(h4):not(:has(table)):has(cite),.g table.ts tr td:last:not(:has(img)):has(cite),.g>table tbody tr td:has(h3):has(cite),.g>table tbody tr td table tr:has(.fl):has(cite)","watcher":"#rso","phoneSel":".nobr","urlSel":".l"},
        "search.yahoo.com":{"selector":".res.sc-ng.sc-lc-bz-m div.content>ol>li,#yls-rs-res tbody tr .yls-rs-bizinfo,.vcard","watcher": "","phoneSel":"[id *= lblPhone]","urlSel":".yschttl"},
        "www.bing.com":{"selector":".sc_ol1li, #srs_orderedList>.llsResultItem","watcher": "","phoneSel":".sc_hl1 li>:not(a)","urlSel":".nc_tc a, .sb_tlst a"},
        "maps.google.com":{"selector":"#resultspanel .res div.one:visible","watcher":"#spsizer .opanel:visible","phoneSel":".tel","urlSel":".fn.org"},
        "local.yahoo.com":{"selector":"#yls-rs-res tr.yls-rs-listinfo","watcher":"","phoneSel":".tel","urlSel":".yls-rs-listing-title"}

    }
};

// New Annotate Local function v 2.0
// Includes DOM watching, seperating selector based on site, and some speed improvements

KOBJ.annotate_local_search_results = function(annotate, config, cb) {
    var defaults = $KOBJ.extend(true, {}, KOBJ.annotate_local_search_defaults);

    if (typeof config === 'object') {
        $KOBJ.extend(true, defaults, config);
    }
    //get domain's lister
    if (defaults["domains"][window.location.hostname]) {
        // Gets selector for both the DOM watcher and to get element
        var lister = defaults["domains"][window.location.hostname]["selector"];
        var watcher = defaults["domains"][window.location.hostname]["watcher"];
    } else {
        return;
    }
    var runAnnotateLocal = null;
    if (defaults["remote"]) {

        var remote_url = defaults["remote"];
        KOBJ.annotate_local_counter = KOBJ.annotate_local_counter || 0;
        var maxLengthURL = KOBJ.maxURLLength;

        runAnnotateLocal = function() {
            var count = 0;

            var annotateFuncLocal = function() {
            };

            if (annotate) {
                annotateFuncLocal = annotate;
            } else {
                annotateFuncLocal = function(data) {
                    return data;
                };
            }

            function annotateCBLocal(data) {
                $KOBJ.each(data, function(key, data) {
                    var contents = annotateFuncLocal(data);
                    if (contents) {
                        $KOBJ("." + key + " :last").after(contents);
                        count++;
                    }
                });
                cb();
            }

            var annotateInfo = {};

            $KOBJ(lister).each(function() {
                var toAnnotate = this;
                var itemCounter = defaults["name"] + (KOBJ.annotate_local_counter += 1);

                annotateInfo[itemCounter] = KOBJ.annotate_local_search_extractdata(toAnnotate, defaults);
                $KOBJ(toAnnotate).addClass(itemCounter);
            });


            var annotateArray = KOBJ.splitJSONRequest(annotateInfo, maxLengthURL, remote_url);
            $KOBJ.each(annotateArray, function(key, data) {
                var annotateString = $KOBJ.compactJSON(data);
                KOBJ.getJSONP(remote_url, {'annotatedata':annotateString}, annotateCBLocal);
            });


            KOBJ.logger('annotated_local_search_results', config['txn_id'], count, '', 'success', config['rule_name'], config['rid']);
        };

    } else {
        runAnnotateLocal = function() {
            var resultslist = $KOBJ(lister);
            if (resultslist.length === 0) {
                return;
            }
            var count = 0;
            $KOBJ(resultslist).each(function() {

                var toAnnotate = this;

                var extractedData = KOBJ.annotate_local_search_extractdata(toAnnotate, defaults);
                // Inserts the data into the object.
                $KOBJ.each(extractedData, function(name, value) {
                    $KOBJ(toAnnotate).data(name, value);
                });

                var contents = annotate(toAnnotate);
                if (contents) {
                    count++;
                    $KOBJ(":last", this).after(contents);
                }
            });

            KOBJ.logger('annotated_search_results', config['txn_id'], count, '', 'success', config['rule_name']);
            cb();
        };

    }

    runAnnotateLocal();


    // Watcher is the element which is being watched, runAnnotateLocal is the function to be run
    if (typeof(watcher) != "undefined") {
        KOBJ.watchDOM(watcher, runAnnotateLocal);
    }

};

// End annotate local

// New annotate code v1.3
// Includes DOM watching, seperating selectors based on site, and some speed improvements

KOBJ.annotate_search_defaults = {
    "name": "KOBJ",
    "sep": "<div style='padding-top: 13px'>|</div>",
    "text_color": "#CCC",
    "height": "40px",
    "left_margin": "15px",
    "right_padding": "15px",
    "font_size": "12px",
    "font_family": "Verdana, Geneva, sans-serif",
    "placement" : 'prepend',
    "outer_div_css" : 0,
    "inner_div_css" : 0,
    "li_css" : 0,
    "ul_css" : 0,
    "results_lister" : "",
    "element_to_modify" : "div.s,div.abstr,p",
    "domains": {
        "www.google.com": { "selector": "li.g:not(.localbox), div.g", "modify": "div.s", "watcher": "#rso", "urlSel":".l" },
        "www.bing.com": { "selector": "#results>ul>li", "modify": "p", "watcher": "","urlSel":".nc_tc a, .sb_tlst a" },
        "search.yahoo.com": { "selector": "li div.res", "modify": "div.abstr", "watcher": "","urlSel":".yschttl" }
    }

};


// Extracts the data from the element
KOBJ.annotate_search_extractdata = function(toAnnotate, config) {

    var annotateData = {};
    var urlSelector = config.domains[window.location.host].urlSel;
    var urlTemp = $KOBJ(toAnnotate).find(urlSelector).attr("href");
    // ".l" is for Google, ".nc_tc, .sb_tlst" are for Bing, .yschttl is for Yahoo

    if (!urlTemp) {
        urlTemp = $KOBJ(toAnnotate).find(".url, cite").attr("href");
        // Failsafe
    }

    if(window.location.host == "search.yahoo.com" && urlTemp.indexOf("**http") != -1){
		urlTemp = urlTemp.replace(/.*\*\*/,"");
		urlTemp = urlTemp.replace(/%3a/,":");
	}

    if (urlTemp) {
        annotateData["url"] = urlTemp;
        annotateData["domain"] = KOBJ.get_host(urlTemp);
    } else {
        annotateData["url"] = "";
        annotateData["domain"] = "";
    }
    return annotateData;
};

KOBJ.annotate_search_results = function(annotate, config, cb) {

    var defaults = $KOBJ.extend(true, {}, KOBJ.annotate_search_defaults);
    if (typeof config === 'object') {
        $KOBJ.extend(true, defaults, config);
    }

    defaults.outer_div_css = {
        "float": "right",
        "width": "auto",
        "height": defaults.height,
        "font-size": defaults.font_size,
        "line-height": "normal",
        "font-family": defaults.font_family
    };

    defaults.li_css = {
        "float": "left",
        "margin": "0",
        "vertical-align": "middle",
        "padding-left": "4px",
        "color": defaults.text_color,
        "white-space": "nowrap",
        "text-align": "center"
    };

    defaults.ul_css = {
        "margin": "0",
        "padding": "0",
        "list-style": "none"
    };

    defaults.inner_div_css = {
        "float": "left",
        "display": "inline",
        "height": defaults.height,
        "margin-left": defaults.left_margin,
        "padding-right": defaults.right_padding
    };

    if (typeof config === 'object') {
        $KOBJ.extend(true, defaults, config);
    }


    var lister = "";
    var modify = "";
    var watcher = "";

    if (defaults["results_lister"]) {
        lister = defaults["results_lister"];
        watcher = "";
        modify = defaults["element_to_modify"];
    } else if (defaults["domains"][window.location.hostname]) {
        // Gets selectors for both DOM watcher and the element
        lister = defaults["domains"][window.location.hostname]["selector"];
        watcher = defaults["domains"][window.location.hostname]["watcher"];
        modify = defaults["domains"][window.location.hostname]["modify"];
    } else {
        return;
    }

    function mk_list_item(i) {
        return $KOBJ("<li class='" + defaults.name + "_item'>").css(defaults.li_css).append(i);
    }

    function mk_outer_div(anchor) {
        var name = defaults.name;
        var logo_item = mk_list_item(anchor);
        var logo_list = $KOBJ('<ul>').css(defaults.ul_css).attr("id", name + "_anno_list").append(logo_item);
        var inner_div = $KOBJ('<div>').css(defaults.inner_div_css).append(logo_list);
        if (typeof defaults != 'undefined' && defaults['tail_image']) {
            inner_div.css({
                "background-image": "url(" + defaults['tail_image'] + ")",
                "background-repeat": "no-repeat",
                "background-position": "right top"
            });
        }
        var outer_div = $KOBJ('<div>').css(defaults.outer_div_css).append(inner_div);
        if (typeof defaults != 'undefined' && defaults['head_image']) {
            outer_div.css({
                "background-image": "url(" + defaults['head_image'] + ")",
                "background-repeat": "no-repeat",
                "background-position": "left top"
            });
        }
        return outer_div;
    }

    var runAnnotate = null;
    if (defaults["remote"]) {

        var remote_url = defaults["remote"];
        var maxLengthURL = KOBJ.maxURLLength;

        KOBJ.annotate_search_counter = KOBJ.annotate_search_counter || 0;
        runAnnotate = function() {

            var resultslist = $KOBJ(lister);
            if (resultslist.length === 0) {
                return;
            }
            var count = 0;
            var annotateInfo = {};
            resultslist.each(function() {
                var toAnnotate = this;
                var itemCounter = defaults['name'] + (KOBJ.annotate_search_counter += 1);

                annotateInfo[itemCounter] = KOBJ.annotate_search_extractdata(toAnnotate, defaults);
                $KOBJ(toAnnotate).addClass(itemCounter);
            });

            var annotateFunc = function() {
            };

            if (annotate) {
                annotateFunc = annotate;
            } else {
                annotateFunc = function(data) {
                    return data;
                };
            }

            function annotateCB(data) {
                $KOBJ.each(data, function(key, data) {
                    var contents = annotateFunc(data);
                    if (contents) {
                        if ($KOBJ("." + key).find('#' + defaults.name + '_anno_list li').is('.' + defaults.name + '_item')) {
                            $KOBJ("." + key).find('#' + defaults.name + '_anno_list').append(mk_list_item(defaults.sep)).append(mk_list_item(contents));
                        } else {
                            $KOBJ("." + key).find(modify)[defaults.placement](mk_outer_div(contents));
                        }
                    }
                    count++;
                });
            }

            var annotateArray = KOBJ.splitJSONRequest(annotateInfo, maxLengthURL, remote_url);
            $KOBJ.each(annotateArray, function(key, data) {
                var annotateString = $KOBJ.compactJSON(data);
                KOBJ.getJSONP(remote_url, {'annotatedata':annotateString}, annotateCB);
            });

            KOBJ.logger('annotated_search_results', config['txn_id'], count, '', 'success', config['rule_name'], config['rid']);
            cb();

        };

    } else {
        runAnnotate = function() {
            var count = 0;

            var resultslist = $KOBJ(lister);
            if (resultslist.length === 0) {
                return;
            }

            resultslist.each(function() {

                var toAnnotate = this;
                var extractedData = KOBJ.annotate_search_extractdata(toAnnotate, defaults);
                $KOBJ.each(extractedData, function(name, value) {
                    $KOBJ(toAnnotate).data(name, value);
                });
                var contents = annotate(toAnnotate);
                if (contents) {
                    count++;
                    if ($KOBJ(toAnnotate).find('#' + defaults.name + '_anno_list li').is('.' + defaults.name + '_item')) {
                        $KOBJ(toAnnotate).find('#' + defaults.name + '_anno_list').append(mk_list_item(defaults.sep)).append(mk_list_item(contents));
                    } else {

                        $KOBJ(toAnnotate).find(modify)[defaults.placement](mk_outer_div(contents));
                    }
                }
            });
            KOBJ.logger('annotated_search_results', config['txn_id'], count, '', 'success', config['rule_name'], config['rid']);
            cb();
        };


    }

    runAnnotate();

    // Watcher is the element which is being watched, runAnnotateLocal is the function to be run
    if (typeof(watcher) != "undefined") {
        KOBJ.watchDOM(watcher, runAnnotate);
    }
};

// End new annotate code

KOBJ.search_percolate = {};

KOBJ.search_percolate.defaults = {};
KOBJ.search_percolate.ajax = false;

KOBJ.search_percolate.defaults = {
	"name":"KOBJ",
	"sep":"<div></div>",
	"text_color":"#CCC",
	"height":"100px",
	"font_size":"12px",
	"class":"KOBJ_item",
	"font_family": "Verdana, Geneva, sans-serif",

	"title":"Percolation Results",
	"site": {
		"www.google.com": {

			"parem": "start",
			"mainSelector": "#res  ol:first",
			"backupSelector": "#mbEnd",
			"resultNumParem": "num=90",
			"resultElement": "li.g, div.g",
			"classes":"",
			"actionMain":"before",
			"actionBackup":"after",
			"watcher":"#rso",
			"urlSel":".l",
			"seperator_css":{},
			"div_css":{
//				"padding-bottom": "3px",
//				"padding-left": "16px",
//				"padding-right": "5px",
//				"max-width": "48em",
//				"min-height": "30px"
			},

			"ol_css": {
				"display": "block",
				"padding-top":"0px",
				"list-style":"none",
				"padding-left":"0px"
			}

		},

		"www.bing.com": {
			"parem": "first",
			"mainSelector":"#result ul:first",
			"backupSelector":".sb_ph",
			"resultNumParem": "count=100",
			"resultElement":"#results>ul>li",
			"actionMain":"prepend",
			"classes":"sa_cc",
			"actionBackup":"before",
			"watcher": "",
			"urlSel":".nc_tc a, .sb_tlst a",
			"seperator_css":{},
			"div_css":{

			},

			"ol_css": {
				"display": "block",
				"padding-top":"18px",
				"list-style":"none",
				"padding-left":"0px"
			}
		},

		"search.yahoo.com": {
			"parem": "b",
			"mainSelector":"#web ol:first",
			"backupSelector":"#main",
			"resultNumParem": "n=100",
			"resultElement":"#web ol>li",
			"actionMain":"prepend",
			"actionBackup":"prepend",
			"watcher": "",
			"classes":"",
			"urlSel":".yschttl",
			"seperator_css":{},
			"div_css":{
				"padding-bottom": "0px",
				"padding-left": "0px",
				"padding-right": "5px",
				"max-width": "48em",
				"min-height": "75px"
			},

			"ol_css": {
				"display": "block",
				"padding-top":"0px",
				"list-style":"none",
				"padding-left":"0px"
			}
		}
	}
};

KOBJ.search_percolate.extractdata = function(toPercolate,config){

	var percolateData = {};
	var urlSelector = config.site[window.location.host].urlSel;
	var urlTemp = $KOBJ(toPercolate).find(urlSelector).attr("href");

	if(!urlTemp){
		urlTemp = $KOBJ(toPercolate).find(".url, cite").attr("href");
		// Failsafe
	}

	if(window.location.host == "search.yahoo.com"  && urlTemp.indexOf("**http") != -1){
		urlTemp = urlTemp.replace(/.*\*\*/,"");
		urlTemp = urlTemp.replace(/%3a/,":");
	}

	if(urlTemp){
		percolateData["url"] = urlTemp;
		percolateData["domain"] = KOBJ.get_host(urlTemp);
	} else {
		percolateData["url"] = "";
		percolateData["domain"] = "";
	}
	return percolateData;
};

KOBJ.percolate = function(selector, config) {

	try{

		var defaults = $KOBJ.extend(true, {}, KOBJ.search_percolate.defaults);

		if (typeof config === 'object') {
			$KOBJ.extend(true, defaults, config);
		}
		var site_defaults = defaults.site[window.location.host];


		function percolate_search_results(selector,config){

			var defaults = $KOBJ.extend(true, {}, KOBJ.search_percolate.defaults);

			if (typeof config === 'object') {
				$KOBJ.extend(true, defaults, config);
			}

			if(KOBJ.search_percolate.ajax){
                $KOBJ(".KOBJ_Moved").remove();
				KOBJ.search_percolate.ajax = false;
			}

			site_defaults = defaults.site[window.location.host];

			function move_item (obj) {
                var append_to = null;
                if($KOBJ(".KOBJ_Moved").length !== 0)
                {
//                    alert("appending")
                  $KOBJ(".KOBJ_Moved:last").after($KOBJ(obj));
                  // We have to set the class here.  If we set it before the $KOBJ(".KOBJ_Moved:last"). will find us not
                  // the last moved element.
                  $KOBJ(obj).addClass("KOBJ_Moved");
                }
                else
                {
  //                  alert("adding")
                    $KOBJ(obj).addClass("KOBJ_Moved");
                    $KOBJ(site_defaults.mainSelector).prepend($KOBJ(obj));
                }
			}

			function serpslurp(){
				//returns the URL for the next batch of results
				var cloc = document.location.toString();
				if(cloc.search(/#/) && KOBJ.document.location.host == "www.google.com"){
					cloc = cloc.replace(/http:\/\/www.google.com\/(.*?)#/,"http://www.google.com/search?").replace(/&aq.*?&/,"&").replace(/&aqo.*?&/,"&").replace(/&aql.*?&/,"&").replace(/fp.*?/,"&").replace(/&oq.*?&/,"&").replace(/&aqi.*?&/,"&");
				}

				var nextParem = site_defaults.parem;

				var regExp = new RegExp("("+nextParem+")=(\\d+)");

				var m;
				var start = 0;
				try { m = cloc.match(regExp);
					start = parseInt(m[2],10);
				    } catch(err) {}
				var next = (start+10).toString();
				if(m) {
				    cloc = cloc.replace(regExp, nextParem + "=" + next);
				} else {
				    cloc = cloc + "&" + nextParem + "=" + next;
				}
				try {
					m = cloc.match(regExp);
					start = parseInt(m[2],10);
				} catch(err) {

				}
				next = (start+10).toString();
				if(m) {
				    cloc = cloc.replace(regExp, nextParem + "=" +  next);
				} else {
				    cloc = cloc + "&" + nextParem + "=" + next;
				}
				cloc += "&"+site_defaults.resultNumParem;
				return cloc;                                                                                                     did_load
			}

			//percolate this page
			$KOBJ(site_defaults.resultElement).each(function() {
			    var data = this;


                // In the case of google the local result are mixed with the normal results
                // so we check if the thing we are looking at has a class localbox and ignore it
                // so that it does not move.
                if($KOBJ(data).hasClass("KOBJ_Moved") || $KOBJ(data).hasClass("localbox"))
                    return  true;

				var extractedData = KOBJ.search_percolate.extractdata(data,defaults);
				$KOBJ.each(extractedData, function(name, value){
					$KOBJ(data).data(name, value);
				});
				if (selector(data)) {
					move_item(data);
				}
			});


			//percolate deep results
            var next_search_result = KOBJ.ajax(serpslurp(),false);
//			$KOBJ.get(serpslurp(), function(res) {
				$KOBJ(site_defaults.resultElement, next_search_result).each(function() {
					var data = this;
                    if($KOBJ(data).hasClass("KOBJ_Moved") || $KOBJ(data).hasClass("localbox"))
                        return true;
					var extractedData = KOBJ.search_percolate.extractdata(data,defaults);
					$KOBJ.each(extractedData, function(name, value){
						$KOBJ(data).data(name, value);
					});
					if (selector(data)) {
						move_item(data);
					}
				});
//			});
		}

		percolate_search_results(selector,config);

		var watcher = defaults.site[window.location.host].watcher;

		if(watcher){
			KOBJ.watchDOM(watcher,function(){ KOBJ.search_percolate.ajax = true; percolate_search_results(selector,config);});
		}
	} catch(error) {
		KOBJ.log("Percolation error: ");
		KOBJ.log(error.message);
	}

};



/* Fancybox plugin, used for the lightbox.

Available at http:\/\/fancybox.net/ */

(function (b) { var a = { width: 800, height: 600, overlayOpacity: 0.85, id: "modal", src: function (c) { return jQuery(c).attr("href") }, fadeInSpeed: 0, fadeOutSpeed: 0 }; b.modal = function (c) { return _modal(this, c) }; b.modal.open = function () { _modal.open() }; b.modal.close = function () { _modal.close() }; b.fn.modal = function (c) { return _modal(this, c) }; _modal = function (c, d) { this.options = { parent: null, overlayOpacity: null, id: null, content: null, width: null, height: null, modalClassName: null, imageClassName: null, closeClassName: null, overlayClassName: null, src: null }; this.options = b.extend({}, options, _defaults); this.options = b.extend({}, options, a); this.options = b.extend({}, options, d); this.close = function () { jQuery("." + options.modalClassName + ", ." + options.overlayClassName).fadeOut(a.fadeOutSpeed, function () { jQuery(this).unbind().remove() }) }; this.open = function () { if (typeof options.src == "function") { options.src = options.src(c) } else { options.src = options.src || _defaults.src(c) } var e = /^.+\.((jpg)|(gif)|(jpeg)|(png)|(jpg))$/i; var f = ""; if (e.test(options.src)) { f = '<div class="' + options.imageClassName + '"><img src="' + options.src + '"/></div>' } else { f = '<iframe width="' + options.width + '" height="' + options.height + '" frameborder="0" scrolling="no" allowtransparency="true" src="' + options.src + '"></iframe>' } options.content = options.content || f; if (jQuery("." + options.modalClassName).length && jQuery("." + options.overlayClassName).length) { jQuery("." + options.modalClassName).html(options.content) } else { $overlay = jQuery((_isIE6()) ? '<iframe src="BLOCKED SCRIPT\'<html></html>\';" scrolling="no" frameborder="0" class="' + options.overlayClassName + '"></iframe><div class="' + options.overlayClassName + '"></div>' : '<div class="' + options.overlayClassName + '"></div>'); $overlay.hide().appendTo(options.parent); $modal = jQuery('<div id="' + options.id + '" class="' + options.modalClassName + '" style="width:' + options.width + "px; height:" + options.height + "px; margin-top:-" + (options.height / 2) + "px; margin-left:-" + (options.width / 2) + 'px;">' + options.content + "</div>"); $modal.hide().appendTo(options.parent); $close = jQuery('<a class="' + options.closeClassName + '"></a>'); $close.appendTo($modal); var g = _getOpacity($overlay.not("iframe")) || options.overlayOpacity; $overlay.fadeTo(0, 0).show().not("iframe").fadeTo(a.fadeInSpeed, g); $modal.fadeIn(a.fadeInSpeed); $close.click(function () { jQuery.modal().close() }); $overlay.click(function () { jQuery.modal().close() }) } }; return this }; _isIE6 = function () { if (document.all && document.getElementById) { if (document.compatMode && !window.XMLHttpRequest) { return true } } return false }; _getOpacity = function (c) { $sender = jQuery(c); opacity = $sender.css("opacity"); filter = $sender.css("filter"); if (filter.indexOf("opacity=") >= 0) { return parseFloat(filter.match(/opacity=([^)]*)/)[1]) / 100 } else { if (opacity != "") { return opacity } } return "" }; _defaults = { parent: "body", overlayOpacity: 85, id: "modal", content: null, width: 800, height: 600, modalClassName: "modal-window", imageClassName: "modal-image", closeClassName: "close-window", overlayClassName: "modal-overlay", src: function (c) { return jQuery(c).attr("href") } } })($KOBJ);

/* End fancybox... */


/* Start of slide out plugin. Should be minified...

Available at http:\/\/wpaoli.building58.com/2009/09/jquery-tab-slide-out-plugin/ */

(function($){
    $.fn.tabSlideOut = function(callerSettings) {
        var settings = $.extend({
            tabHandle: '.handle',
            speed: 300,
            action: 'click',
            tabLocation: 'left',
            topPos: '200px',
            leftPos: '20px',
            fixedPosition: false,
            positioning: 'absolute',
            pathToTabImage: null,
            imageHeight: null,
            imageWidth: null,
            onLoadSlideOut: false
        }, callerSettings||{});

        settings.tabHandle = $(settings.tabHandle);
//      // settings.tabHandle.bgiframe({src:settings.pathToTabImage});
        var obj = this;
        obj.bgiframe();
        if (settings.fixedPosition === true) {
            settings.positioning = 'fixed';
        } else {
            settings.positioning = 'absolute';
        }

        //ie6 doesn't do well with the fixed option
         if ($KOBJ.browser.msie && ($KOBJ.browser.version.substr(0,1)<7 || document.compatMode == "BackCompat")) {
            settings.positioning = 'absolute';
        }



        //set initial tabHandle css

        if (settings.pathToTabImage != null) {
            settings.tabHandle.css({
            'background' : 'url('+settings.pathToTabImage+') no-repeat',
            'width' : settings.imageWidth,
            'height': settings.imageHeight
            });
        }

	var tempCSS =$.extend({
		'display': 'block',
		'textIndent' : '-99999px',
		'outline' : 'none',
        'z-index' : '99999',
		'position' : 'absolute'
	},settings.linkCSS,true);

        settings.tabHandle.css(tempCSS);

        obj.css({
            'line-height' : '1',
            'position' : settings.positioning
        });


        var properties = {
                    containerWidth: parseInt(obj.outerWidth(), 10) + 'px',
                    containerHeight: parseInt(obj.outerHeight(), 10) + 'px',
                    tabWidth: parseInt(settings.tabHandle.outerWidth(), 10) + 'px',
                    tabHeight: parseInt(settings.tabHandle.outerHeight(), 10) + 'px'
                };

        //set calculated css
        if(settings.tabLocation === 'top' || settings.tabLocation === 'bottom') {
            obj.css({'left' : settings.leftPos});
            settings.tabHandle.css({'right' : 0});
        }

        if(settings.tabLocation === 'top') {
            obj.css({'top' : '-' + properties.containerHeight});
            settings.tabHandle.css({'bottom' : '-' + properties.tabHeight});
        }

        if(settings.tabLocation === 'bottom') {
            obj.css({'bottom' : '-' + properties.containerHeight, 'position' : 'fixed'});
            settings.tabHandle.css({'top' : '-' + properties.tabHeight});

        }

        if(settings.tabLocation === 'left' || settings.tabLocation === 'right') {
            obj.css({
                'height' : properties.containerHeight,
                'top' : settings.topPos
            });

            settings.tabHandle.css({'top' : 0});
        }

        if(settings.tabLocation === 'left') {
            obj.css({ 'left': '-' + properties.containerWidth});
            settings.tabHandle.css({'right' : '-' + properties.tabWidth});
        }

        if(settings.tabLocation === 'right') {
            obj.css({ 'right': '-' + properties.containerWidth});
            settings.tabHandle.css({'left' : '-' + properties.tabWidth});

            $('html').css('overflow-x', 'hidden');
        }

        //functions for animation events

        settings.tabHandle.click(function(event){
            event.preventDefault();
        });
        //settings.tabHandle.parent().bgiframe();

        var slideIn = function() {

            if (settings.tabLocation === 'top') {
                obj.animate({top:'-' + properties.containerHeight}, settings.speed).removeClass('open');
            } else if (settings.tabLocation === 'left') {
                obj.animate({left: '-' + properties.containerWidth}, settings.speed).removeClass('open');
            } else if (settings.tabLocation === 'right') {
                obj.animate({right: '-' + properties.containerWidth}, settings.speed).removeClass('open');
            } else if (settings.tabLocation === 'bottom') {
                obj.animate({bottom: '-' + properties.containerHeight}, settings.speed).removeClass('open');
            }

        };

        var slideOut = function() {

            if (settings.tabLocation == 'top') {
                obj.animate({top:'-3px'},  settings.speed).addClass('open');
            } else if (settings.tabLocation == 'left') {
                obj.animate({left:'-3px'},  settings.speed).addClass('open');
            } else if (settings.tabLocation == 'right') {
                obj.animate({right:'-3px'},  settings.speed).addClass('open');
            } else if (settings.tabLocation == 'bottom') {
                obj.animate({bottom:'-3px'},  settings.speed).addClass('open');
            }
        };

        var clickScreenToClose = function() {
            obj.click(function(event){
                event.stopPropagation();
            });

            $(document).click(function(){
                slideIn();
            });
        };

        var clickAction = function(){
            settings.tabHandle.click(function(event){
                if (obj.hasClass('open')) {
                    slideIn();
                } else {
                    slideOut();
                }
		eval(settings.callback);
            });

            clickScreenToClose();
        };

        var hoverAction = function(){
            obj.hover(
                function(){
                    slideOut();
                },

                function(){
                    slideIn();
                });

                settings.tabHandle.click(function(event){
                    if (obj.hasClass('open')) {
                        slideIn();
                    }
                });
                clickScreenToClose();

        };

        var slideOutOnLoad = function(){
            slideIn();
            setTimeout(slideOut, 500);
        };

        //choose which type of action to bind
        if (settings.action === 'click') {
            clickAction();
        }

        if (settings.action === 'hover') {
            hoverAction();
        }

        if (settings.onLoadSlideOut) {
            slideOutOnLoad();
        }

    };
})($KOBJ);


/* End of slideout */

/* Start of tab manager

ToDo:

- Add a "delete tab" function that automatically moves the tabs up.

- Add checks into addNow to see if I can place a tab above the current tabs.

- Add a notification system.

*/

KOBJ.tabManager = KOBJ.tabManager || {};

KOBJ.tabManager.tabs = KOBJ.tabManager.tabs || [];
//"backgroundColor": "white",

KOBJ.tabManager.defaults = {
	"cssPlanted": false,
	"tabColor": "black",
	"callback": "",
	"divCSS": {},
	"measurementUnit":"px",
	"tabClass": "handle",
	"pathToTabImage": "http://k-misc.s3.amazonaws.com/actions/schedule.png",
	"tabLocation": "right",
	"speed": "300",
    "run_in_iframe": false,
	"action": "click",
	"fixedPosition": true,
	"imageHeight": "122px",
	"imageWidth": "40px",
	"topPos": "100px",
	"width": "250px",
	"padding": "10px",
	"contentClass": "KOBJ_tab_content",
	"mode": "slideout",
	"url": "",
	"height": "250px",
	"linkContent": "Content",
	"notificationDefaults":{
		"notifyClass": "notification",
		"color": "red",
		"leftPadding": "10px",
		"topPadding": "2px",
		"rightPadding": "10px",
		"bottomPadding": "2px",
		"divCSS": {
			"text-indent":"0px",
			"-moz-border-radius": "20px",
			"-webkit-border-radius": "20px",
			"-khtml-border-radius": "20px",
			"border-radius": "20px",
			"text-align": "center",
			"z-index": 10000,
			"min-width": "15px",
			"padding": "2px"
		}
	},

	"linkCSS": {
		"cursor":"pointer"
	}
};


/* Nasty notifications
 * I hate making this kind of stuff.
 * It makes my brain hurt.
 *
 * KOBJ.tabManager.notification
 *
 * changeTo is what the contents of the notification should be. Can be a number, HTML, letter, etc. Width and height is automatic.
 * config is the configuration options.
 *
 *
 * In the config, a "semi" required argument is the name. If you don't specify a name, it just uses the first tab.
 * You can also set the notification settings when creating the tab.
 *
 * Returns true when everything goes well or false when it pukes.
 *
 */

KOBJ.tabManager.notification = function(config){

	var toAlter, alterNum;
	// Trying to find the right tab. I may change the KOBJ.tabManager.tabs
	// to a hash so I do not need to loop, but the speed hit from this is not major
	$KOBJ.each(KOBJ.tabManager.tabs,function(num){
		var object = this;
		if(object['name'] == config['name']){
			toAlter = object;
			alterNum = num;
			return false;
		}
	});

	// Grab the first tab if the name was wrong

	if(!toAlter){
		alterNum = 0;
		toAlter = KOBJ.tabManager.tabs[0];
	}


	// Test to see if I could find SOME tab. If not, exit.
	if(!toAlter){
		return false;
	}

	// Get the defaults stored within KOBJ.tabManager.defaults
	var defaults = $KOBJ.extend(true, {}, toAlter['notificationDefaults']);

	// Extend the defaults with the config passed in
	if(typeof config === 'object'){
		$KOBJ.extend(true, defaults, config);
		if(defaults.color){
			defaults.divCSS['background-color'] = defaults.color;
		}
	}

	if(typeof defaults.message !== 'undefined' && defaults.message !== null && defaults.message !== ''){
		var changeTo = defaults.message;
	} else {
		return false;
	}

	// Try's are good... It allows me to catch errors
	try {
		// notification is the class which the notification *should* have...
		// If it's there, I change it's contents and apply CSS. otherwise, I add the div.

		var notification = $KOBJ(toAlter.tabContentClass + " ." + defaults.notifyClass);
		if(notification.length){
			// If it's there and if I need to change it to nothing, delete the div
			if(changeTo === 0 || changeTo === ''){
				$KOBJ(notification).hide();
				return true;
			}

			// Otherwise, set the contents and CSS
			$KOBJ(notification).html(changeTo).css(defaults.divCSS).show();
			return true;
		}


		var tab = $KOBJ(toAlter.tabContentClass);
		var objCSS = $KOBJ.extend(true,{},defaults.divCSS);

		// This next block splits the "px" or what not away from the number.
		// This lets me add the numbers later on
		var splitArray = ["imageHeight","imageWidth","topPos","leftPadding","rightPadding","topPadding","bottomPadding"];
		$KOBJ.each(splitArray,function(){
			var tempToSplit = this;
			var toSplit = toAlter[tempToSplit];

			if(!toSplit){
				toSplit = defaults[tempToSplit];
				var inDefaults = true;
			}

			if(!toSplit){
				return;
			}

			if(!toSplit.number){
				var number = parseInt(toSplit.replace(/(\d+).*/,"$1"),10);
				var unit = toSplit.replace(/.*\d+(.*)/,"$1");
			}

			if(inDefaults){
				defaults[tempToSplit] = {"number": number, "unit": unit};
			} else {
				toAlter[tempToSplit] = {"number": number, "unit": unit};
			}

		});

		// Aight, where should I put the div? Calculates the height/width of the image to place it in the corner (top inner corner)

		if(toAlter.tabLocation == "left"){
			objCSS.left = (toAlter.imageWidth.number - defaults.leftPadding.number) + defaults.leftPadding.unit;
			objCSS.top = (toAlter.topPos.number - defaults.topPadding.number) + defaults.topPadding.unit;
		}
		if(toAlter.tabLocation == "right"){
			objCSS.right = (toAlter.imageWidth.number - defaults.rightPadding.number) + defaults.rightPadding.unit;
			objCSS.top = (toAlter.topPos.number - defaults.topPadding.number) + defaults.topPadding.unit;
		}
		if(toAlter.tabLocation == "top"){
			objCSS.top = (toAlter.imageHeight.number - defaults.topPadding.number) + defaults.topPadding.unit;
			objCSS.right = (toAlter.topPos.number - defaults.rightPadding.number) + defaults.rightPadding.unit;
		}
		if(toAlter.tabLocation == "bottom"){
			objCSS.bottom = (toAlter.imageHeight.number - defaults.topPadding.number) + defaults.bottomPadding.unit;
			objCSS.right = (toAlter.topPos.number - defaults.rightPadding.number) + defaults.rightPadding.unit;
		}

		// Fixed position?

//		if(toAlter.fixedPosition === true) {
//			objCSS.position = "fixed";
//		} else {
//			objCSS.position = "absolute";
//		}
//
//		//ie6 doesn't do well with the fixed option
//		 if ($KOBJ.browser.msie && ($KOBJ.browser.version.substr(0,1)<7 || document.compatMode == "BackCompat")) {
//			objCSS.position = "absolute";
//		}

		// Adds the div and sets all the CSS and classes needed
		notification = $KOBJ("<div>").html(changeTo).css(objCSS).addClass(defaults.notifyClass);

		$KOBJ(toAlter.tabHandle).append(notification);

		// Yay!! It worked!
		return true;
	} catch(error) {

		// Oh poo, it broke!

		KOBJ.log(error);
		return false;
	}
};

KOBJ.tabManager.addNew = function(config){


	var defaults = $KOBJ.extend(true, {}, KOBJ['tabManager']['defaults']);


	// Extend the defaults
	if(typeof config === 'object') {
		jQuery.extend(true, defaults, config);
		if(defaults.tabColor){
            if (!$KOBJ.browser.msie) {
                defaults.linkCSS["background-color"] = defaults.tabColor;
            }
		}
	}
    if(defaults.run_in_iframe === false && top !== self) {
          return;
     }


	// Make a random class
	var classToAdd = "KOBJ_tab_" + Math.floor(Math.random()*9999999);

	var tabs = KOBJ.tabManager.tabs;
	var posToBe = parseInt(defaults['topPos'].replace(/(\d+).*/,"$1"), 10);

	// Sets the top position of each element based upon height of the other elements.
	$KOBJ.each(tabs,function(key,object){
		if(object['tabLocation'] == defaults['tabLocation']){
			posToBe += $KOBJ(object['tabClass']).outerHeight() + parseInt(object['padding'].replace(/(\d+).*/,"$1"),10);
		}
	});

	// Adds "px" or whatnot
	defaults['topPos'] = posToBe + defaults['measurementUnit'];

	KOBJ.itrace(defaults);
	var link = "";



	// Check for content
	if(defaults.message){
		var message = defaults.message;
	} else if(!defaults.url) {
		return false;
	}

	// Do different stuff if it's a lightbox...
	if(defaults['mode'] == "lightbox"){
		if(!defaults.cssPlanted){
			KOBJ.css('.modal-overlay {position: fixed;top: 0;right: 0;bottom: 0;left: 0;height: 100%;width: 100%;margin: 0;padding: 0;background: #131313;opacity: .85;filter: alpha(opacity=85);z-index: 101;}.modal-window {position: fixed;top: 50%;left: 50%;margin: 0;padding: 0;z-index: 102;background: #fff;border: solid 8px #000;-moz-border-radius: 8px;-webkit-border-radius: 8px;}.close-window {position: absolute;width: 47px;height: 47px;right: -23px;top: -23px;background: transparent url(http:\/\/grigglee.com/random/fancybox/fancy_close.png) no-repeat scroll right top;text-indent: -99999px;overflow: hidden;cursor: pointer;}');
			KOBJ.tabManager.defaults.cssPlanted = true;
		}

		// The lightbox will display content if it's passed in or iframe if there's a URL
		if(defaults.url){
			defaults['src'] = defaults.url;
			defaults['type'] = 'iframe';
		} else {
			defaults['content'] = message;
		}

		// Function to bind later on.
		var action = function(){ $KOBJ(this).modal(defaults).open(); eval(defaults.callback); return false; };

		// Makes an anchor, adds CSS, binds the above function to it, and then adds the class

		link = $KOBJ('<a>').css(defaults['linkCSS']).bind(defaults['action'],action).addClass(classToAdd);
		var img = $KOBJ('<img>').attr('src',defaults['pathToTabImage']);
		var obj = $KOBJ(link).html(img);

		if(defaults['tabLocation'] === 'top' || defaults['tabLocation'] === 'bottom') {
	            obj.css({'right': defaults['topPos']});
	        }

	        if(defaults['tabLocation'] === 'top') {
	           obj.css({'top': 0, 'position': 'fixed'});
	        }

	        if(defaults['tabLocation'] === 'bottom') {
	            obj.css({'bottom' : '0', 'position' : 'fixed'});
	        }

	        if(defaults['tabLocation'] === 'left' || defaults['tabLocation'] === 'right') {
	            obj.css({
	                'top' : defaults['topPos'],
			'position': 'fixed'
	            });
	        }

	        if(defaults['tabLocation'] === 'left') {
	            obj.css({ 'left': 0, 'position': 'fixed'});
	        }

	        if(defaults['tabLocation'] === 'right') {
	            obj.css({ 'right': 0, 'position': 'fixed'});
	            $KOBJ('html').css('overflow-x', 'hidden');
	        }

		$KOBJ('body').append(obj);

	} else {
		if(defaults.url){
			var tempMessage = $KOBJ('<div>').addClass(defaults['contentClass']).css({ "width": defaults['width'], "background-color": defaults['backgroundColor']}).css(defaults['divCSS']);
			link = $KOBJ('<a>').addClass(defaults['tabClass']).html(defaults['linkContent']);
			message = $KOBJ('<iframe>').attr('src',defaults.url).css({"width": defaults.width, "height": defaults.height});
			message = $KOBJ(tempMessage).append(link).append(message);
			message = $KOBJ(message).addClass(classToAdd);
		} else {
            var tempMessage = $KOBJ('<div>').addClass(defaults['contentClass']).css({  "width": defaults['width'], "background-color": defaults['backgroundColor']}).css(defaults['divCSS']);
			link = $KOBJ('<a>').addClass(defaults['tabClass']).html(defaults['linkContent']);
			message = $KOBJ(tempMessage).append(link).append(message);
			message = $KOBJ(message).addClass(classToAdd);
		}
	}

	defaults['tabClass'] = '.' + defaults['tabClass'];
	defaults['tabContentClass'] = '.' + classToAdd;

	if(defaults['mode'] != "lightbox"){
		defaults['tabHandle'] = defaults['tabContentClass'] + ">" + defaults['tabClass'];
		$KOBJ("body").append(message);
		$KOBJ(defaults['tabContentClass']).tabSlideOut(defaults);
	} else {
		defaults['tabHandle'] = defaults['tabContentClass'];
	}

	defaults.message = message;

	KOBJ.tabManager.tabs.push(defaults);
};
KOBJ.a41x88 = KOBJ.a41x88 || {};

(function ($) {
    $.format = (function () {

		var parseMonth = function(value){

    		switch(value){
    		case "Jan":
    			return "01";
        		break;
    		case "Feb":
    			return "02";
        		break;
    		case "Mar":
    			return "03";
        		break;
    		case "Apr":
    			return "04";
        		break;
    		case "May":
    			return "05";
        		break;
    		case "Jun":
    			return "06";
        		break;
    		case "Jul":
    			return "07";
        		break;
    		case "Aug":
    			return "08";
        		break;
    		case "Sep":
    			return "09";
        		break;
    		case "Oct":
    			return "10";
        		break;
    		case "Nov":
    			return "11";
        		break;
    		case "Dec":
    			return "12";
        		break;
			default:
				return value;
			}
		};

		var parseTime = function(value){
			var retValue = value;
			if(retValue.indexOf(".") != -1){
				retValue =  retValue.substring(0, retValue.indexOf("."));
			}

    		var values3 = retValue.split(":");

    		if(values3.length == 3){
	    		hour		= values3[0];
	    		minute		= values3[1];
	    		second		= values3[2];

				return {
						time: retValue,
						hour: hour,
						minute: minute,
						second: second
				};
    		} else {
				return {
					time: "",
					hour: "",
					minute: "",
					second: ""
			};
    		}
		};

        return {
            date: function(value, format){
            	//value = new java.util.Date()
        		//2009-12-18 10:54:50.546
            	try{
            		var values = value.split(" ");
            		var year 		= null;
            		var month 		= null;
            		var dayOfMonth 	= null;
            		var time 		= null; //json, time, hour, minute, second

            		switch(values.length){
            		case 6://Wed Jan 13 10:43:41 CET 2010
            			year 		= values[5];
	            		month 		= parseMonth(values[1]);
	            		dayOfMonth 	= values[2];
	            		time		= parseTime(values[3]);
            			break;
            		case 2://2009-12-18 10:54:50.546
            			var values2 = values[0].split("-");
            			year 		= values2[0];
            			month 		= values2[1];
	            		dayOfMonth 	= values2[2];
	            		time 		= parseTime(values[1]);
            			break;
            		default:
            			return value;
            		}


            		var pattern 	= "";
            		var retValue 	= "";

            		for(i = 0; i < format.length; i++){
            			var currentPattern = format.charAt(i);
            			pattern += currentPattern;
            			switch(pattern){
                		case "dd":
                			retValue += dayOfMonth;
                			pattern   = "";
    	            		break;
				case "mM":
					retValue += month.replace(/0/,"");
					patern = "";
				break;
                		case "MM":
                			retValue += month;
                			pattern   = "";
    	            		break;
                		case "yyyy":
                			retValue += year;
                			pattern   = "";
    	            		break;
                		case "HH":
                			retValue += time.hour;
                			pattern   = "";
    	            		break;
                		case "hh":
                			retValue += time.hour;
                			pattern   = "";
    	            		break;
                		case "mm":
                			retValue += time.minute;
                			pattern   = "";
    	            		break;
                		case "ss":
                			retValue += time.second;
                			pattern   = "";
    	            		break;
                		case " ":
                			retValue += currentPattern;
                			pattern   = "";
    	            		break;
                		case "/":
                			retValue += currentPattern;
                			pattern   = "";
    	            		break;
                		case ":":
                			retValue += currentPattern;
                			pattern   = "";
    	            		break;
            			default:
            				if(pattern.length == 2 && pattern.indexOf("y") != 0){
            					retValue += pattern.substring(0, 1);
            					pattern = pattern.substring(1, 2);
            				} else if((pattern.length == 3 && pattern.indexOf("yyy") == -1)){
            					pattern   = "";
            				}
            			}
                    }
            		return retValue;
            	} catch(e) {
                	return value;
            	}
        	}
        };
    })();
}($KOBJ));


(function ($) {
    $.format = (function () {

		var parseMonth = function(value){

    		switch(value){
    		case "Jan":
    			return "01";
        		break;
    		case "Feb":
    			return "02";
        		break;
    		case "Mar":
    			return "03";
        		break;
    		case "Apr":
    			return "04";
        		break;
    		case "May":
    			return "05";
        		break;
    		case "Jun":
    			return "06";
        		break;
    		case "Jul":
    			return "07";
        		break;
    		case "Aug":
    			return "08";
        		break;
    		case "Sep":
    			return "09";
        		break;
    		case "Oct":
    			return "10";
        		break;
    		case "Nov":
    			return "11";
        		break;
    		case "Dec":
    			return "12";
        		break;
			default:
				return value;
			}
		};

		var parseTime = function(value){
			var retValue = value;
			if(retValue.indexOf(".") != -1){
				retValue =  retValue.substring(0, retValue.indexOf("."));
			}

    		var values3 = retValue.split(":");

    		if(values3.length == 3){
	    		hour		= values3[0];
	    		minute		= values3[1];
	    		second		= values3[2];

				return {
						time: retValue,
						hour: hour,
						minute: minute,
						second: second
				};
    		} else {
				return {
					time: "",
					hour: "",
					minute: "",
					second: ""
			};
    		}
		};

        return {
            date: function(value, format){
            	//value = new java.util.Date()
        		//2009-12-18 10:54:50.546
            	try{
            		var values = value.split(" ");
            		var year 		= null;
            		var month 		= null;
            		var dayOfMonth 	= null;
            		var time 		= null; //json, time, hour, minute, second

            		switch(values.length){
            		case 6://Wed Jan 13 10:43:41 CET 2010
            			year 		= values[5];
	            		month 		= parseMonth(values[1]);
	            		dayOfMonth 	= values[2];
	            		time		= parseTime(values[3]);
            			break;
            		case 2://2009-12-18 10:54:50.546
            			var values2 = values[0].split("-");
            			year 		= values2[0];
            			month 		= values2[1];
	            		dayOfMonth 	= values2[2];
	            		time 		= parseTime(values[1]);
            			break;
            		default:
            			return value;
            		}


            		var pattern 	= "";
            		var retValue 	= "";

            		for(i = 0; i < format.length; i++){
            			var currentPattern = format.charAt(i);
            			pattern += currentPattern;
            			switch(pattern){
                		case "dd":
                			retValue += dayOfMonth;
                			pattern   = "";
    	            		break;
				case "mM":
					retValue += month.replace(/0/,"");
					patern = "";
				break;
                		case "MM":
                			retValue += month;
                			pattern   = "";
    	            		break;
                		case "yyyy":
                			retValue += year;
                			pattern   = "";
    	            		break;
                		case "HH":
                			retValue += time.hour;
                			pattern   = "";
    	            		break;
                		case "hh":
                			retValue += time.hour;
                			pattern   = "";
    	            		break;
                		case "mm":
                			retValue += time.minute;
                			pattern   = "";
    	            		break;
                		case "ss":
                			retValue += time.second;
                			pattern   = "";
    	            		break;
                		case " ":
                			retValue += currentPattern;
                			pattern   = "";
    	            		break;
                		case "/":
                			retValue += currentPattern;
                			pattern   = "";
    	            		break;
                		case ":":
                			retValue += currentPattern;
                			pattern   = "";
    	            		break;
            			default:
            				if(pattern.length == 2 && pattern.indexOf("y") != 0){
            					retValue += pattern.substring(0, 1);
            					pattern = pattern.substring(1, 2);
            				} else if((pattern.length == 3 && pattern.indexOf("yyy") == -1)){
            					pattern   = "";
            				}
            			}
                    }
            		return retValue;
            	} catch(e) {
                	return value;
            	}
        	}
        };
    })();
}($KOBJ));


// No more date library.

KOBJ.a41x88.forms = KOBJ.a41x88.forms || [];

KOBJ.stateMap = {

"ALABAMA":"AL",

"ALASKA":"AK",

"AMERICAN SAMOA":"AS",

"ARIZONA":"AZ",

"ARKANSAS":"AR",

"CALIFORNIA":"CA",

"COLORADO":"CO",

"CONNECTICUT":"CT",

"DELAWARE":"DE",

"DISTRICT OF COLUMBIA":"DC",

"FEDERATED STATES OF MICRONESIA":"FM",

"FLORIDA":"FL",

"GEORGIA":"GA",

"GUAM":"GU",

"HAWAII":"HI",

"IDAHO":"ID",

"ILLINOIS":"IL",

"INDIANA":"IN",

"IOWA":"IA",

"KANSAS":"KS",

"KENTUCKY":"KY",

"LOUISIANA":"LA",

"MAINE":"ME",

"MARSHALL ISLANDS":"MH",

"MARYLAND":"MD",

"MASSACHUSETTS":"MA",

"MICHIGAN":"MI",

"MINNESOTA":"MN",

"MISSISSIPPI":"MS",

"MISSOURI":"MO",

"MONTANA":"MT",

"NEBRASKA":"NE",

"NEVADA":"NV",

"NEW HAMPSHIRE":"NH",

"NEW JERSEY":"NJ",

"NEW MEXICO":"NM",

"NEW YORK":"NY",

"NORTH CAROLINA":"NC",

"NORTH DAKOTA":"ND",

"NORTHERN MARIANA ISLANDS":"MP",

"OHIO":"OH",

"OKLAHOMA":"OK",

"OREGON":"OR",

"PALAU":"PW",

"PENNSYLVANIA":"PA",

"PUERTO RICO":"PR",

"RHODE ISLAND":"RI",

"SOUTH CAROLINA":"SC",

"SOUTH DAKOTA":"SD",

"TENNESSEE":"TN",

"TEXAS":"TX",

"UTAH":"UT",

"VERMONT":"VT",

"VIRGIN ISLANDS":"VI",

"VIRGINIA":"VA",

"WASHINGTON":"WA",

"WEST VIRGINIA":"WV",

"WISCONSIN":"WI",

"WYOMING":"WY"

};

KOBJ.countryCodes = {

"USA":{"Long":"United States of America", "Short":"United States", "CC":"US", "CCC":"USA","cc":"us","ccc":"usa"}

};

KOBJ.creditCards = {

"Visa": { "CT":"VI", "CCType":"Visa","CCTYPE":"VISA", "VS":"VS"},
"American Express": { "CT":"AX", "CCType":"American Express","CCTYPE":"AMERICAN EXPRESS", "VS":"AE"},
"MasterCard": { "CT":"MC", "CCType":"MasterCard","CCTYPE":"MASTERCARD", "VS":"MC"},
"Discover": { "CT":"DI", "CCType":"Discover","CCTYPE":"DISCOVER","VS":"DC"}

};

KOBJ.StateToST = function(val){
	var lookedUp = KOBJ.stateMap[val.toUpperCase()];
	if(lookedUp){
		return lookedUp;
	}
	return "";
};

KOBJ.countryCodeToCountry = function(val,format){
	var lookedUp = KOBJ.countryCodes[val][format];

	if(lookedUp){
		return lookedUp;
	}
	return "";
};

KOBJ.creditCardFormatter = function(value, format){
	var lookedUp = KOBJ.creditCards[value][format];

	if(lookedUp){
		return lookedUp;
	}
	return "";
};

KOBJ.setFormMaps = function(mapToPush){
	KOBJ.a41x88 = KOBJ.a41x88 || {};
	KOBJ.a41x88.forms = KOBJ.a41x88.forms || [];
	KOBJ.a41x88.forms.push(mapToPush);
};

KOBJ.fillFormsDefault = {
	"fillCSS": {},
	"highlight-color":"#FFFFCC",
	"cburl":"http://198.160.96.218:9070/monitor/MonitorFilter?"
};

KOBJ.formatData = function(formatpassed,valuepassed){
	var valToBe, tempVal;
	switch(formatpassed){
		case "area":
			valToBe = valuepassed.slice(0,3);
		break;


		case "first-3":
			valToBe = valuepassed.slice(3,6);
		break;


		case "last-4":
			valToBe = valuepassed.slice(6,10);
		break;


		case "last-7":
			valToBe = valuepassed.slice(3,10);
		break;


		case "all":
			valToBe = valuepassed;
		break;


		case "ST":
			valToBe = KOBJ.StateToST(valuepassed);
		break;


		case "State":
			valToBe = valuepassed;
		break;


		case "ST - State":
			valToBe = KOBJ.StateToST(valuepassed) + ' - ' + valuepassed;
		break;


		case "STATE":
			valToBe = valuepassed.toUpperCase();
		break;


		case "Long":
			valToBe = KOBJ.countryCodeToCountry(valuepassed,formatpassed);
		break;


		case "Short":
			valToBe = KOBJ.countryCodeToCountry(valuepassed,formatpassed);
		break;


		case "CC":
			valToBe = KOBJ.countryCodeToCountry(valuepassed,formatpassed);
		break;


		case "CCC":
			valToBe = KOBJ.countryCodeToCountry(valuepassed,formatpassed);
		break;

		case "cc":
			valToBe = KOBJ.countryCodeToCountry(valuepassed,formatpassed);
		break;

		case "ccc":
			valToBe = KOBJ.countryCodeToCountry(valuepassed,formatpassed);
		break;

		case "CCType":
			valToBe = KOBJ.creditCardFormatter(valuepassed,formatpassed);
		break;


		case "CCTYPE":
			valToBe = KOBJ.creditCardFormatter(valuepassed,formatpassed);
		break;

		case "CT":
			valToBe = KOBJ.creditCardFormatter(valuepassed,formatpassed);
		break;

		case "VS":
			valToBe = KOBJ.creditCardFormatter(valuepassed,formatpassed);
		break;

		case "yy":
			valToBe = $KOBJ.format.date(valuepassed,"yyyy").slice(2,4);
		break;

		case "y,yyy":
			tempVal = $KOBJ.format.date(valuepassed,"yyyy");
			valToBe = tempVal.slice(0,1) + ',' + tempVal.slice(1);
		break;

		case "mM":
			tempVal = $KOBJ.format.date(valuepassed,"MM");
			if(tempVal[0] == 0){
				valToBe = tempVal[1];
			} else {
				valToBe = tempVal;
			}
		break;

		default:
			valToBe = $KOBJ.format.date(valuepassed,formatpassed);
		break;
	}

	if(valToBe){
		return valToBe;
	}
	return false;
};

KOBJ.fillForms = function(formData, configuration){

	var defaults = $KOBJ.extend(true, {}, KOBJ.fillFormsDefault);

	if(typeof(configuration) === "object"){
		$KOBJ.extend(true, defaults, configuration);
	}

	if(defaults["highlight-color"]){
		defaults.fillCSS["background-color"] = defaults["highlight-color"];
	}

	var maxLengthURL = KOBJ.maxURLLength;
	var formMap = KOBJ.a41x88.forms[KOBJ.a41x88.forms.length - 1];
	var stateArray = [];
	var errorState, anyError = false;
	var successes = 0;
	var errors = 0;

	//KynetxFormDebug("Map: " + $KOBJ.compactJSON(formMap) + "\nForm Data: " + $KOBJ.compactJSON(formData));

	$KOBJ.each(formMap,function (index, thismap) {
		try{

			//KynetxFormDebug("Trying to fill for object: " + $KOBJ.compactJSON(thismap));

			errorState = false;
			var selector = thismap.selector;
			var iframe = thismap.iframe;
			var mapTo = thismap.map;
			var format = thismap.format;
			var mapArray = mapTo.split(".");

			var value = formData[mapArray[0]][mapArray[1]];

			var element;
			if(iframe){
				KynetxFormDebug("Looking withing iframe" + iframe + " for selector " + selector);
				element = $KOBJ(iframe).contents().find(selector);
			} else {
				element = $KOBJ(selector);
			}

			if(value){
				if(element.length){
					if(format){
						KynetxFormDebug("format: "+ format + "\nvalue: " + value);
						value = KOBJ.formatData(format,value);
					}

										if(value){
						element.val(value).css(defaults.fillCSS);
						if(defaults.nukeLables){
							$KOBJ("[for="+selector.replace(/#|\.|\[name=|\]/g,"")+"]").remove();
						}
					} else {
						throw "value formatting was bad";
					}

					if(element.val() != value || element.text() != value){
						if(element[0].tagName === "SELECT"){
							$KOBJ.each(element.children(),function(){
								var select = $KOBJ(this);
								var selectVal = select.val();
								var text = select.text();

                                                                var regex = new RegExp(value,"ig");

								if(text.search(regex) > -1 || selectVal.search(regex) > -1){
									select.attr("selected","selected");
								}
							});
						}
					}
					if(element.val() != value || element.text() != value){
					} else {
						KynetxFormDebug("Expected " + value + " got " + element.val());
						throw "form didn't fill as expected";
					}
				} else {
					throw "selector blank";
				}
			} else {
				throw "no data";
			}
		} catch(error) {
			errorState = true;
			KynetxFormDebug("Error: ",error);
			if(error == "no data"){
				KynetxFormDebug("No data for " + thismap.map);
			} else {
				anyError = true;
				errors++;
				stateArray.push({"error":error, "selector": selector, "map": mapTo});
			}
		}

		if(!errorState){
			KynetxFormDebug("Success for " + thismap.map);
			successes++;
			stateArray.push({"error":"none", "selector": selector, "map": mapTo});
		}
	});



	KynetxFillResult({'success':successes, 'failure':errors});
	var status = 'none';

	if(successes == formMap.length){
		status = 'full';
	} else if(successes > 0){
		status = 'partial';
	} else if(successes === 0 && formMap.length !== 0){
		status = 'fail';
	} else if(formMap.length === 0){
		status = 'none';
	}

	var problemData = '';

	$KOBJ.each(stateArray, function(index,data){
		if(index != 0){
			problemData += ",";
		}

		if(data.error != "none" || data.error != "no data"){
			problemData += data.map;
		}
	});

    if(anyError && defaults.logurl){
		$K.getJSON(defaults.logurl + "callback=?&map=amazon&errors="+problemData,function(){});
	}

	KOBJ.logger('form_fill', defaults['txn_id'], problemData, '', status, defaults['rule_name'], defaults['rid']);

	var annotateArray = KOBJ.splitJSONRequest(stateArray,maxLengthURL,'');

	$KOBJ.each(annotateArray,function(key,data){
		annotateString = $KOBJ.compactJSON(data);
		//Logging callback goes here!
	});
};
KOBJ.get_application = function(name) {
    return KOBJ['applications'][name];
};


KOBJ.add_extra_page_var = function(key, value) {
    /* Ignore if the key is rids, init or has a : which means there is an app id */
    if (key.match(":") == null &&
            key != 'rids' &&
            key != 'init') {
        KOBJ['extra_page_vars'][key] = value;
    }
};

KOBJ.extra_page_vars_as_url = function() {
    var param_str = "";

    $KOBJ.each(KOBJ['extra_page_vars'], function(k, v) {
        param_str += "&" + k + "=" + v;
    });

    return param_str;
};

KOBJ.add_config_and_run = function(app_config) {
    //    alert("adding config" +app_config);
    KOBJ.add_app_config(app_config);
    // Only execute apps passed in not every single one registered.
    $KOBJ.each(app_config.rids, function(index, value) {
        var app = KOBJ.get_application(value);
        app.reload();
    });
};

KOBJ.add_app_configs = function(app_configs) {

    /* if someone messed up and did not send us the right data just ignore the request */
    if (typeof(app_configs) == "unknown") {
        return;
    }

    $KOBJ.each(app_configs, function(index) {
        KOBJ.add_app_config(app_configs[index]);
    });
};

KOBJ.eval = function(app_config) {
    KOBJ.log("!!!!! KOBJ.eval will be deprecated soon please change to. KOBJ.add_app_configs({config});KOBJ.get_application('appid').reload();");
    KOBJ.add_app_config(app_config);
    // Only execute apps passed in not every single one registered.

    $KOBJ.each(app_config.rids, function(index, value) {
        var app = KOBJ.get_application(value);
        app.reload();
    });
};

KOBJ.configure_kynetx = function(config) {
    /* Override what server to talk to if ask to in config */
    $KOBJ.each(config, function(k, v) {
        KOBJ[k] = v;
    });
}
        ;

KOBJ.add_app_config = function(app_config) {

    /* if someone messed up and did not send us the right data just ignore the request */
    if (typeof(app_config) == "unknown" || !app_config.rids) {
        return;
    }

    /* Override what server to talk to if ask to in config */
    if (typeof(app_config.init) == 'object') {
        $KOBJ.each(app_config.init, function(k, v) {
            KOBJ[k] = v;
        });
    }

    /*
     Look at each application defined in the config and add or update the known application
     list.
     */
    //    var app_id_s = [];
    $KOBJ.each(app_config.rids, function(index, value) {
        var app = KOBJ.get_application(value);
        if (app != null) {
            app.update_from_config(app_config);
        }
        else {
            app = new KrlApplication(value);
            app.update_from_config(app_config);
            KOBJ.applications[value] = app;
            // TODO: This is the old way need here for backwards  compat
            KOBJ[value] = {};
        }
        //        app_id_s[index] = app.app_id;
    });

    // TODO: Not sure why we would join all the ids Ask Phil about this
    //    KOBJ.site_id = app_id_s.join(";");
    KOBJ.callback_url = KOBJ.proto() + KOBJ.callback_host + KOBJ.kns_port + "/callback/" + KOBJ.site_id();
}
        ;


// This does not call the setTimeout Directly on the KOBJ.eval as it would block
// so we add a script element to be executed at a later time.
// DEPRECATED use app.reload_later
KOBJ.reload = function(delay) {
    KOBJ.log("!!!!! KOBJ.reload will be deprecated soon please change to. KOBJ.get_application('appid').reload();");
    $KOBJ.each(KOBJ.applications, function(name, id) {
        var app = KOBJ.get_application(name);
        app.reload_later(delay);
    });
};

KOBJ.named_resources = {

    "jquery_ui_js" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/jquery-ui-1.8.4.custom.min.js",
    "jquery_ui_darkness_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_darkness/jquery-ui-1.8.4.custom.css",
    "jquery_ui_lightness_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_lightness/jquery-ui-1.8.4.custom.css",
    "jquery_ui_smoothness_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_smoothness/jquery-ui-1.8.4.custom.css",
    "jquery_ui_start_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_start/jquery-ui-1.8.4.custom.css",
    "jquery_ui_redmond_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_redmond/jquery-ui-1.8.4.custom.css",
    "jquery_ui_sunny_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_sunny/jquery-ui-1.8.4.custom.css",
    "jquery_ui_overcast_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_overcast/jquery-ui-1.8.4.custom.css",
    "jquery_ui_le_frog_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_le_frog/jquery-ui-1.8.4.custom.css",
    "jquery_ui_flicker_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_flicker/jquery-ui-1.8.4.custom.css",
    "jquery_ui_pepper_grinder_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_pepper_grinder/jquery-ui-1.8.4.custom.css",
    "jquery_ui_eggplan_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_eggplan/jquery-ui-1.8.4.custom.css",
    "jquery_ui_dark_hive_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_dark_hive/jquery-ui-1.8.4.custom.css",
    "jquery_ui_cupertino_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_cupertino/jquery-ui-1.8.4.custom.css",
    "jquery_ui_south_street_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_south_street/jquery-ui-1.8.4.custom.css",
    "jquery_ui_blitzer_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_blitzer/jquery-ui-1.8.4.custom.css",
    "jquery_ui_humanity_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_humanity/jquery-ui-1.8.4.custom.css",
    "jquery_ui_hot_sneaks_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_hot_sneaks/jquery-ui-1.8.4.custom.css",
    "jquery_ui_excite_bike_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_excite_bike/jquery-ui-1.8.4.custom.css",
    "jquery_ui_vader_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_vader/jquery-ui-1.8.4.custom.css",
    "jquery_ui_dot_lov_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_dot_lov/jquery-ui-1.8.4.custom.css",
    "jquery_ui_mint_choc_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_mint_choc/jquery-ui-1.8.4.custom.css",
    "jquery_ui_black_tie_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_black_tie/jquery-ui-1.8.4.custom.css",
    "jquery_ui_trontastic_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_trontastic/jquery-ui-1.8.4.custom.css",
    "jquery_ui_swanky_purse_css" : "https://kns-resources.s3.amazonaws.com/jquery_ui/1.8/css/ui_swanky_purse/jquery-ui-1.8.4.custom.css"
};

/*
 Add all external resources request here.  We do this so that we can
 attempt to stop double loading. Each resource may have multiple applications
 using it.
 */
KOBJ.registerExternalResources = function(rid, resources) {
    KOBJ.itrace("Registering external resources " + rid);
    var resource_array = [];
    $KOBJ.each(resources, function (url, options) {

        // We are doing a named resource not a url.
        if (url.indexOf("http") == -1) {
            url = KOBJ.named_resources[url];
        }

        url = KOBJ.proto() + url.substr(url.indexOf(":") + 3, url.length);

        if (url && KOBJ.external_resources[url] == null) {
            if (typeof(options["type"]) != "undefined") {
                var a_resource = new KrlExternalResource(url);
                a_resource.css_selector = options["selector"];
                a_resource.type = options["type"];
                KOBJ.external_resources[url] = a_resource;
                resource_array.push(a_resource);
                a_resource.load();
            }
        }
    });
    var app = KOBJ.get_application(rid);
    if (app) {
        app.add_external_resources(resource_array);
    }
    else {
        KOBJ.error("Ignoring Resource registration for app " + rid + " App was not registered with runtime");
    }
};


//start closure and data registration code
KOBJ.registerDataSet = function(rid, datasets) {
    //    KOBJ.log("registering dataset " + rid);
    var app = KOBJ.get_application(rid);
    if (app) {
        app.store_data_sets(datasets);
    }
    else {
        KOBJ.error("Ignoring Dataset for app " + rid + " App was not registered with runtime");
    }
};

KOBJ.clearExecutionDelay = function(rid) {
    var app = KOBJ.get_application(rid);
    if (app != null) {
        app.delay_execution = false;
    }
    app.run();
};

KOBJ.registerClosure = function(rid, data, guid) {
    //    KOBJ.log("Registering external resources " + rid);
    var app = KOBJ.get_application(rid);
    // If we do not have the app then ignore the reuslt
    if (app) {
        app.execute_closure(guid, data);
    }
    else {
        KOBJ.error("Ignoring Closure for app " + rid + " App was not registered with runtime")
    }

};

KOBJ.runit = function() {

    /*
     We need to look at each and find out if it has been loaded. If not then doit.
     */
    $KOBJ.each(KOBJ.applications, function(index, app) {
        app.run();
    });
};


KOBJ.logVerify = function(txn, appid, cluster) {
    KOBJ.getwithimage(KOBJ.proto() + "kverify.appspot.com/log?txn=" + txn + "&appid=" + appid + "&cluster=" + cluster);
};

KOBJ.proto = function() {
    if ("http:" != KOBJ.location('protocol') && "https:" != KOBJ.location('protocol')) {
        return "https://";
    }
    return (("https:" == KOBJ.location('protocol')) ? "https://" : "http://")
};

//this method is overridden in sandboxed environments
KOBJ.require = function(url, callback_params) {
    // This function is defined if we are in a browser plugin
    if (typeof(callback_params) == "undefined") {
        callback_params = {};
    }

    if (KOBJ.in_bx_extention) {
        var params = {};
        if (typeof(callback_params) != "undefined") {
            params = $KOBJ.extend({data_type : "js"}, callback_params, true);
        }
        async_url_request(url, "KOBJ.url_loaded_callback", params);
    }
    else if (KOBJ.in_bx_extention && callback_params.data_type == "other") {
        async_url_request(url, "KOBJ.url_loaded_callback", callback_params);
    }
    else if (!KOBJ.in_bx_extention && callback_params.data_type == "img") {
        var r = document.createElement("img");
        // This is the max url for a get in IE7  IE6 is 488 so we will break on ie6
        r.src = url.substring(0, KOBJ.max_url_length());
        //  We need to change to the protcol of the location url so that we do not
        // get security errors.
        r.src = KOBJ.proto() + r.src.substr(r.src.indexOf(":") + 3, r.src.length);
        var body = document.getElementsByTagName("body")[0] ||
                document.getElementsByTagName("frameset")[0];
        if (body == null) {
            KOBJ.error("Document body missing.  Browser is reloading page.");
            return;
        }
        body.appendChild(r);
    }
    else {
        var r = document.createElement("script");
        // This is the max url for a get in IE7  IE6 is 488 so we will break on ie6
        r.src = url.substring(0, KOBJ.max_url_length());
        //  We need to change to the protcol of the location url so that we do not
        // get security errors.
        r.src = KOBJ.proto() + r.src.substr(r.src.indexOf(":") + 3, r.src.length);
        KOBJ.itrace("Asking to load " + r.src);
        r.type = "text/javascript";
        r.onload = r.onreadystatechange = KOBJ.url_loaded_callback;
        var body = document.getElementsByTagName("body")[0] ||
                document.getElementsByTagName("frameset")[0];
        if (body == null) {
            //  This happens sometime in firefox where for some reason the body of the page goes bye bye
            //  I think this is caused by the browser still running the javascript for the prior page
            KOBJ.error("Document body missing.  Browser is reloading page.");
            return;
        }
        body.appendChild(r);
    }
};


KOBJ.getwithimage = function(url) {
    KOBJ.require(url, {data_type : "img"});
};

/* Sets up the call backs for "click" and "change" events */
KOBJ.obs = function(type, attr, txn_id, name, sense, rule, rid) {
    var elem;
    if (attr == 'class') {
        elem = '.' + name;
    } else if (attr == 'id') {
        elem = '#' + name;
    } else if (attr == 'selector') {
        elem = name;
    } else {
        elem = name;
    }
    if (type == 'click') {
//        alert("You are calling me with " + elem);
        $KOBJ(elem).live("click", function(e1) {
            var tgt = $KOBJ(this);
            var b = tgt.attr('href') || '';
            KOBJ.logger("click",txn_id,name, b,sense,rule,rid);
            if (b) {
                tgt.attr('href', '#KOBJ');
            }  // # gets replaced by redirect
            return true;
        });

    } else if (type == 'change') {
        $KOBJ(elem).live("change", function(e1) {
            KOBJ.logger("change",txn_id,name,'',sense,rule,rid);
            return true;
        });
    }

};

// Shortcut to do ajax request either sync or not.  If async then you must provide
// a call back function.  If sync the data will be returned at the end of the call.
KOBJ.ajax = function(url, async_request, callback) {
    var result_data = null;
    $KOBJ.ajax({
        url:    url ,
        success: function(result) {
            if (!async_request) {
                result_data = result;
            }
            else {
                callback(result);
            }
        },
        async:   async_request
    });

    return result_data;
};
// return the host portion of a URL
KOBJ.get_host = function(s) {
    var h = "";
    try {
        h = s.match(/^(?:\w+:\/\/)?([\w-.]+)/)[1];
    } catch(err) {
    }
    return h;
};

/*
 Called when one of our script is loaded including css links
 */
KOBJ.url_loaded_callback = function(loaded_url, response, callback_params) {


    if (typeof(loaded_url) != "undefined" && typeof(callback_params) != "undefined") {
        KOBJ.log("Call back data type was " + callback_params.data_type);

        if(callback_params.base64 != null)
        {
            response = Base64.decode(response);
        }

        switch (callback_params.data_type) {
            case  "js":
                 KOBJ.log("Because js eval it now");
                eval(response);
                break;
            case  "css":
                KOBJ.log("Because css head it now");
                $KOBJ("head").append($KOBJ("<style>").text(response));
                break;
        }

        if (KOBJ.external_resources[loaded_url] != null) {
            KOBJ.external_resources[loaded_url].did_load();
        }
    }
    else {
        var done = false;
        if (!done && (!this.readyState || this.readyState === "loaded" || this.readyState === "complete")) {
            done = true;
            var url = null;
            // This would happen if we were in a browser sandbox.
            //            if (typeof(loaded_url) == "undefined")
            //            {
            if (typeof(this.src) != "undefined") {
                url = this.src;
            }
            else {
                url = this.href;
            }
            if (url == null) {
                return;
            }

            KOBJ.itrace("Resource of " + url + "was loaded");

            if (KOBJ.external_resources[url] != null) {
                KOBJ.itrace("Updated apps of  " + url);
                //            alert("Found a resource and letting it know");
                KOBJ.external_resources[url].did_load();
            }
            //        alert("Done letting everyone know");

            this.onload = this.onreadystatechange = null;
        }
    }
};


/*
 Add a link tag to the head of the document
 url = URL to stylesheet
 */
KOBJ.load_style_sheet_link = function(url) {

    var head = KOBJ.document.getElementsByTagName('head')[0];
    var new_style_sheet = document.createElement("link");
    new_style_sheet.href = url;
    new_style_sheet.rel = "stylesheet";
    new_style_sheet.type = "text/css";
    head.appendChild(new_style_sheet);
};


KOBJ.siteIds = function() {
    return KOBJ.site_id();
};


KOBJ.site_id = function() {
    var ids = [];
    $KOBJ.each(KOBJ.applications, function(key, value) {
        ids.push(key);
    });
    return ids.join(";");
};


KOBJ.errorstack_submit = function(key, e, rule_info) {
    try {


        // No key the ignore.
        if (key == null) {
            return;
        }
        var prefix_text = "_s=" + key;

        prefix_text += "&_id=" + KOBJEventManager.eid();

        if (KOBJ.in_bx_extention)
            prefix_text += "&_r=json";
        else
            prefix_text += "&_r=img";


        var browser_info = KRLSnoop.browser_info();
        var exception_info = KRLSnoop.exception_info(e);


        var st_url = {};

        st_url.Msg = escape(exception_info.message);
        st_url.ScriptURL = escape(exception_info.script_url);
        st_url.UserAgent = escape(browser_info.nav.userAgent);
        st_url.URL = escape(KOBJ.document.location.href);
        st_url.Line = exception_info.lineNumber;
        st_url.Description = escape(exception_info.description);
        st_url.Arguments = escape(exception_info.arguments);
        st_url.Type = escape(exception_info.type);
        st_url.name = escape(exception_info.name);
        if (typeof(rule_info) != "undefined") {
            st_url.RuleName = escape(rule_info.name);
            st_url.RuleID = escape(rule_info.id);
        }
        st_url.stack = escape(exception_info.stack);
        st_url.Platform = escape("JRT-" + window['kobj_ts']);
        st_url.AgtAppCodeName = escape(browser_info.nav.appCodeName);
        st_url.AgtAppName = escape(browser_info.nav.appName);
        st_url.AgtAppVer = escape(browser_info.nav.appVersion);
        st_url.AgtLang = escape(browser_info.nav.language);
        st_url.AgtCookiesEnable = escape(browser_info.nav.cookiesEnabled);
        st_url.AgtSysLanguage = escape(browser_info.nav.systemLanguage);
        st_url.AgtUsrLanguage = escape(browser_info.nav.userLanguage);
        st_url.ScrAHeight = escape(browser_info.screen.availHeight);
        st_url.ScrColorDepth = escape(browser_info.screen.colorDepth);
        st_url.ScrHeight = escape(browser_info.screen.height);
        st_url.ScrWidth = escape(browser_info.screen.width);
        st_url.ScrAWidth = escape(browser_info.screen.availWidth);
        st_url.ScrPixDep = escape(browser_info.screen.pixelDepth);

        var datatype = null;

        if (KOBJ.in_bx_extention)
            datatype = "js";
        else
            datatype = "img";

        // If the url is to long loop over it and keep calling require with each part.
        var urls = KOBJ.url_from_hash(st_url, 70);
        $KOBJ.each(urls, function(index) {
            KOBJ.require("http://www.errorstack.com/submit?" + prefix_text  + urls[index], {data_type: datatype});
        });
    }
    catch(badex) {
        KOBJ.loggers.general.error("Could not submit to errorstack ", e, badex);
    }
};

KOBJ.location = function(part) {
    if (part == "href") return KOBJ.locationHref || KOBJ.document.location.href;
    if (part == "host") return KOBJ.locationHost || KOBJ.document.location.host;
    if (part == "protocol") return KOBJ.locationProtocol || KOBJ.document.location.protocol;
};

/* Hook to log data to the server */
KOBJ.logger = function(type, txn_id, element, url, sense, rule, rid) {
    var logger_url = KOBJ.callback_url + "?type=" +
            type + "&txn_id=" + txn_id + "&element=" +
            element + "&sense=" + sense + "&url=" + escape(url) + "&rule=" + rule;

    if (rid) {
        logger_url += "&rid=" + rid;
        var app = KOBJ.get_application(rid);
        if (app != null)
            logger_url += app.page_vars_as_url();
    }

    KOBJ.require(logger_url, {data_type: "other"});
};


/* Logs data to the browsers windows console */
//alert("type" + typeof(KOBJ.log));
KOBJ.log = function() {
    KOBJ.loggers.general.log(KOBJ.log4js.Level.INFO, arguments);
};

KOBJ.error = function() {
    KOBJ.loggers.general.log(KOBJ.log4js.Level.ERROR, arguments);
};

KOBJ.warning = function() {
    KOBJ.loggers.general.log(KOBJ.log4js.Level.WARN, arguments);
};

KOBJ.trace = function() {
    KOBJ.loggers.general.log(KOBJ.log4js.Level.TRACE, arguments);
};

KOBJ.itrace = function() {
    KOBJ.loggers.general.log(KOBJ.log4js.Level.TRACE, arguments);
};

KOBJ.run_when_ready = function() {
    //see if page is already loaded (ex: tags planted AFTER dom ready) to know if we should wait for document onReady
    //this code block is adapted from swfObject code used for the same purpose
    if (typeof KOBJSandboxEnvironment === "undefined" || KOBJSandboxEnvironment !== true) { //sandbox bootstrap prevention
        if ((typeof document.readyState != "undefined" && document.readyState == "complete") ||
                ( typeof document.readyState == "undefined" && (document.getElementsByTagName("body")[0] || document.body))) {
            KOBJ.runit(); //dom ready
        } else {
            $KOBJ(KOBJ.runit); //dom not ready
        }
    }
};
// Define a local copy of jQuery
KOBJEventManager = {};

/*
 * This generates a uniq id for event groups.
 */
KOBJEventManager.eid = function() {
    var adate = new Date();
    return adate.valueOf() + (Math.random() + "").substring(2);
};

KOBJEventManager.current_fires = {};
KOBJEventManager.events = { };
KOBJEventManager.content_changes_running = {};
KOBJEventManager.content_change_hashcodes = {};


// List of guids currently running for the content change event.
// If there are any in the list we do not start the timer until they are all done.
// We also need to reset the content hash value after they have all run so that we
// do not fire again prematurely.

// Change Current fires to  look
// {"aax":
//      {app:application,
//          events:
//              {"pageview":
//                  {data}
//              }
//      }
// }

// Second list of for direct guid access.
// This is a mapping of guid to app and event
// 'aaaddd':{app:application,"event":"pageview","selector":"#id"}
KOBJEventManager.guid_list = {

};

/*
 * This is the notification call back to let the event manager know that
 * an event was sent to the server and has come back.
 */
KOBJEventManager.event_fire_complete = function(guid,app)
{
    KOBJ.itrace("Event Fire Complete " + guid);

    var guid_info = KOBJEventManager.guid_list[guid];
    if(!guid_info)
    {
        KOBJ.error("Event transaction id unknown ignoring for: " + app.app_id);
        return;
    }

    if(guid_info.app.app_id != app.app_id) {
        KOBJ.error("Event transaction id was not registered to app: " + app.app_id + " - " + guid);
        return;
    }

    delete KOBJEventManager.current_fires[guid_info.app.app_id][guid_info.event][guid_info.selector][guid];
    delete KOBJEventManager.guid_list[guid];

    if (guid_info.event == "content_change")
    {
        delete KOBJEventManager.content_changes_running[guid];
        KOBJEventManager.update_content_change_hash();
        if ($KOBJ.isEmptyObject(KOBJEventManager.content_changes_running))
        {
            setTimeout(KOBJEventManager.content_change_checker, 500);
        }
    }
};


/*
 * Check if the event is a dup.  By that I mean no app can have to events of the same
 * type in the queue at any time.
 */
KOBJEventManager.is_dup_event = function(event, selector, app)
{
    var found_event = false;

    if (event == "content_change" && KOBJEventManager.current_fires[app.app_id] != null)
    {
        var app_fire = KOBJEventManager.current_fires[app.app_id][event];
        if (app_fire != null && app_fire[selector])
        {
            found_event = true;
        }
    }

    return found_event;
};


/*
 * Adds an event to be fired later in the queue. Events have to be queued up so that
 * they can be sorted out and not cause loops.
 */
KOBJEventManager.add_to_fire_queue = function(guid, event, data, app)
{
    if (KOBJEventManager.is_dup_event(event, data.selector, app))
    {
        KOBJ.itrace("Dup Event " + event + " : " + app.app_id);
        return;
    }
    KOBJ.itrace("Adding Event " + event + " : " + app.app_id);

    // Build up the current fires has with the elements and data we need.
    if (KOBJEventManager.current_fires[app.app_id] == null)
    {
        KOBJEventManager.current_fires[app.app_id] = {};
    }
    if (KOBJEventManager.current_fires[app.app_id][event] == null)
    {
        KOBJEventManager.current_fires[app.app_id][event] = {};
    }
    if (KOBJEventManager.current_fires[app.app_id][event][data.selector] == null)
    {
        KOBJEventManager.current_fires[app.app_id][event][data.selector] = {};
    }
    KOBJEventManager.current_fires[app.app_id][event][data.selector][guid] = {};
    KOBJEventManager.current_fires[app.app_id][event][data.selector][guid]["submit_data"] = data.submit_data;
    KOBJEventManager.current_fires[app.app_id][event][data.selector][guid]["param_data"] = data.param_data;
    KOBJEventManager.current_fires[app.app_id][event][data.selector][guid]["selector"] = data.selector;

    var app_data = KOBJEventManager.current_fires[app.app_id][event][data.selector][guid];

    // Short cut way to get to app via guid
    KOBJEventManager.guid_list[guid] = {};
    KOBJEventManager.guid_list[guid]["app"] = app;
    KOBJEventManager.guid_list[guid]["event"] = event;
    KOBJEventManager.guid_list[guid]["selector"] = data.selector;

    if (event == "content_change")
    {
        KOBJEventManager.content_changes_running[guid] = app;
    }

    app.fire_event(event, app_data, guid, "web");
};


KOBJEventManager.hashCode = function(value) {
    var hash = 0;
    if (value.length === 0) return hash;
    for (var i = 0; i < value.length; i++) {
        var cha = value.charCodeAt(i);
        hash = 31 * hash + cha;
        hash = hash & hash; // Convert to 32bit integer
    }
    return hash;
};

// Ths computes the hash value for the text of a selector
KOBJEventManager.content_change_hashcode = function(selector)
{
    return KOBJEventManager.hashCode($KOBJ(selector).text());
};

// This will look at all the content change selectors and update their hash values.
KOBJEventManager.update_content_change_hash = function()
{
//    KOBJ.itrace("Updating hashes");

    $KOBJ.each(KOBJEventManager.events["content_change"], function(selector, event_data) {
        if (!KOBJEventManager.content_change_hashcodes[selector])
        {
            KOBJEventManager.content_change_hashcodes[selector] = {};
        }

//        KOBJ.itrace("Before  hash [" + KOBJEventManager.content_change_hashcodes[selector]["prior_data_hash"] + "]");
        KOBJEventManager.content_change_hashcodes[selector]["prior_data_hash"] = KOBJEventManager.content_change_hashcode(selector);
//        KOBJ.itrace("After  hash [" + KOBJEventManager.content_change_hashcodes[selector]["prior_data_hash"] + "]");
    });
//    KOBJ.itrace("Done Updating hashes");
};

/*
 * Used to check all the content change events and fire them as needed.
 */
KOBJEventManager.content_change_checker = function()
{
//    KOBJ.itrace("In Content Change");
    // Just in any are running abort.
    if (!$KOBJ.isEmptyObject(KOBJEventManager.content_changes_running) )
    {
//        KOBJ.itrace("Content Chagne running");
        return;
    }

    var any_fired = false;
    $KOBJ.each(KOBJEventManager.events["content_change"], function(selector, event_data) {
        // We have not yet looked at the data so we need to get it so we can check it next time.
        if (!KOBJEventManager.content_change_hashcodes[selector])
        {
            KOBJEventManager.content_change_hashcodes[selector] = {};
        }
        var selector_data = KOBJEventManager.content_change_hashcodes[selector];
        if (!selector_data["prior_data_hash"]) {
            selector_data["prior_data_hash"] = KOBJEventManager.content_change_hashcode(selector);
        }
        else {
            // If The element changed then fire the event.
            if (selector_data["prior_data_hash"] != KOBJEventManager.content_change_hashcode(selector)) {

//                KOBJ.itrace("Data Change going to fire content change [" + selector_data["prior_data_hash"] + "] [" + KOBJEventManager.content_change_hashcode(selector) + "]");
                // Reset the data to the new value
                selector_data["prior_data_hash"] = KOBJEventManager.content_change_hashcode(selector);
                KOBJEventManager.event_handler({"type" : "content_change", "data" : { "selector" : selector }});
                any_fired = true;
            }
        }
    });

    if (!any_fired)
    {
//        KOBJ.itrace("Setting change look timer");
        setTimeout(KOBJEventManager.content_change_checker, 500);
    }

};

/*
 * This is how a app register intested in an event.
 */
KOBJEventManager.register_interest = function(event, selector, application, config) {
    var found_data = [];

    var start_content_timer = false;
    if($KOBJ.isEmptyObject(KOBJEventManager.events["content_change"]) && event == "content_change")
    {
        start_content_timer = true;
    }

    if (typeof(config) != "undefined")
    {
        // We need to check to see if ANYONE registing has a form_submit true in
        // the config.  Then we need to make sure for the provided selector
        // we allow the form to submit.
        if (config["form_submit"] != null && config["form_submit"])
        {
            KOBJEventManager.events[event][selector]["form_submit"] = true;
        }

        if (typeof(config.param_data) != "undefined" && config.param_data != null) {
            found_data = config.param_data;
//            $KOBJ.each(config.param_data, function(name, v) {
//                found_data.push({name: name,value:v });
//            });

        }
    }


    // With custom events we do not know the name so we just add them if they
    // are missing
    if (KOBJEventManager.events[event] == null)
    {
        KOBJEventManager.events[event] = {};
    }
    // Is there anything registered with this selector?  If so then do not register again.
    if ($KOBJ.isEmptyObject(KOBJEventManager.events[event][selector]))
    {
        KOBJEventManager.events[event][selector] = {};

        if (event != "content_change") {
            $KOBJ(selector).live(event + "." + selector, {"selector" : selector},
                    KOBJEventManager.event_handler);
        }
    }

    KOBJEventManager.events[event][selector][application.app_id] = {};
    KOBJEventManager.events[event][selector][application.app_id]["app"] = application;
    KOBJEventManager.events[event][selector][application.app_id]["data"] = { "param_data": found_data};

    if(start_content_timer)
    {
        setTimeout(KOBJEventManager.content_change_checker, 500);
    }
};


/*
 * This is how an application remove it self from the event manager.
 */
KOBJEventManager.deregister_interest = function(event, selector, application) {
    if (KOBJEventManager.events[event][selector] != null)
    {
        delete KOBJEventManager.events[event][selector][application.app_id];
        if (event != "pageview" && $KOBJ.isEmptyObject(KOBJEventManager.events[event][selector]))
        {
            $KOBJ(selector).unbind(event + "." + selector);
        }
    }
};


/*
 * Out of bound events are thing that are not really tied to an element. For example
 * page load events.   This is private do not access this from client code only for
 * internal use only
 */
KOBJEventManager.add_out_of_bound_event = function(application, event, auto_deregister, extra_data)
{
    KOBJEventManager.register_interest(event, "unknown", application, extra_data);

    // We fake out a jquery event in order to reuse the code.
    var data = {"type" : event, "data" : { "selector" : "unknown"}};

//    if (typeof(extra_data) != "undefined")
//    {
//        $KOBJ.extend(true, data["data"], extra_data);
//    }

    KOBJEventManager.event_handler(data);

    // Page View events can only happen one time so no need to keep them around.
    if (event == "pageview" || (typeof(auto_deregister) != null && auto_deregister ))
    {
        KOBJEventManager.deregister_interest(event, "unknown", application);
    }
};

/*
 * This is the call back for all events. It sorts out what kind of event and does the right thing.
 */
KOBJEventManager.event_handler = function(event) {
//    KOBJ.itrace("in event handle");
    var event_data = event.data;

    // Are we doing a submit then get the form data.
    if (event.type == "submit")
    {
        event_data["submit_data"] = $KOBJ(event_data.selector).serializeArray();
    }

    $KOBJ.each(KOBJEventManager.events["" + event.type][event_data.selector], function(app_id, app_info) {
        var current_guid = KOBJEventManager.eid();
        $KOBJ.extend(true,event_data,app_info.data);
        KOBJEventManager.add_to_fire_queue(current_guid, event.type, event_data, app_info.app);
    });

    if (event.type == "submit") {
        // We need to check if for this selector we should submit or not submit the form.
        if (KOBJEventManager.events[event.type][event_data.selector]["form_submit"] != null) {
            return true;
        }
        else {
            return false;
        }
    }
    return true;
};

//setTimeout(KOBJEventManager.content_change_checker, 500);

/**
 * Copyright 2009 Tim Down.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * log4javascript
 *
 * log4javascript is a logging framework for JavaScript based on log4j
 * for Java. This file contains all core log4javascript code and is the only
 * file required to use log4javascript, unless you require support for
 * document.domain, in which case you will also need console.html, which must be
 * stored in the same directory as the main log4javascript.js file.
 *
 * Author: Tim Down <tim@log4javascript.org>
 * Version: 1.4.1
 * Edition: log4javascript
 * Build date: 24 March 2009
 * Website: http://log4javascript.org
 */

/* -------------------------------------------------------------------------- */
// Array-related stuff

// Next three methods are solely for IE5, which is missing them
if (!Array.prototype.push) {
	Array.prototype.push = function() {
        for (var i = 0, len = arguments.length; i < len; i++){
            this[this.length] = arguments[i];
        }
        return this.length;
	};
}

if (!Array.prototype.shift) {
	Array.prototype.shift = function() {
		if (this.length > 0) {
			var firstItem = this[0];
			for (var i = 0, len = this.length - 1; i < len; i++) {
				this[i] = this[i + 1];
			}
			this.length = this.length - 1;
			return firstItem;
		}
	};
}

if (!Array.prototype.splice) {
	Array.prototype.splice = function(startIndex, deleteCount) {
		var itemsAfterDeleted = this.slice(startIndex + deleteCount);
		var itemsDeleted = this.slice(startIndex, startIndex + deleteCount);
		this.length = startIndex;
		// Copy the arguments into a proper Array object
		var argumentsArray = [];
		for (var i = 0, len = arguments.length; i < len; i++) {
			argumentsArray[i] = arguments[i];
		}
		var itemsToAppend = (argumentsArray.length > 2) ?
			itemsAfterDeleted = argumentsArray.slice(2).concat(itemsAfterDeleted) : itemsAfterDeleted;
		for (i = 0, len = itemsToAppend.length; i < len; i++) {
			this.push(itemsToAppend[i]);
		}
		return itemsDeleted;
	};
}

/* -------------------------------------------------------------------------- */

var log4javascript;

(function() {

	function isUndefined(obj) {
		return typeof obj == "undefined";
	}

	/* ---------------------------------------------------------------------- */
	// Custom event support

	function EventSupport() {}

	EventSupport.prototype = {
		eventTypes: [],
		eventListeners: {},
		setEventTypes: function(eventTypesParam) {
			if (eventTypesParam instanceof Array) {
				this.eventTypes = eventTypesParam;
				this.eventListeners = {};
				for (var i = 0, len = this.eventTypes.length; i < len; i++) {
					this.eventListeners[this.eventTypes[i]] = [];
				}
			} else {
				handleError("log4javascript.EventSupport [" + this + "]: setEventTypes: eventTypes parameter must be an Array");
			}
		},

		addEventListener: function(eventType, listener) {
			if (typeof listener == "function") {
				if (!array_contains(this.eventTypes, eventType)) {
					handleError("log4javascript.EventSupport [" + this + "]: addEventListener: no event called '" + eventType + "'");
				}
				this.eventListeners[eventType].push(listener);
			} else {
				handleError("log4javascript.EventSupport [" + this + "]: addEventListener: listener must be a function");
			}
		},

		removeEventListener: function(eventType, listener) {
			if (typeof listener == "function") {
				if (!array_contains(this.eventTypes, eventType)) {
					handleError("log4javascript.EventSupport [" + this + "]: removeEventListener: no event called '" + eventType + "'");
				}
				array_remove(this.eventListeners[eventType], listener);
			} else {
				handleError("log4javascript.EventSupport [" + this + "]: removeEventListener: listener must be a function");
			}
		},

		dispatchEvent: function(eventType, eventArgs) {
			if (array_contains(this.eventTypes, eventType)) {
				var listeners = this.eventListeners[eventType];
				for (var i = 0, len = listeners.length; i < len; i++) {
					listeners[i](this, eventType, eventArgs);
				}
			} else {
				handleError("log4javascript.EventSupport [" + this + "]: dispatchEvent: no event called '" + eventType + "'");
			}
		}
	};

	/* -------------------------------------------------------------------------- */

	var applicationStartDate = new Date();
	var uniqueId = "log4javascript_" + applicationStartDate.getTime() + "_" +
		Math.floor(Math.random() * 100000000);
	var emptyFunction = function() {};
	var newLine = "\r\n";
	var pageLoaded = false;

	// Create main log4javascript object; this will be assigned public properties
	function Log4JavaScript() {}
	Log4JavaScript.prototype = new EventSupport();

	log4javascript = new Log4JavaScript();
	log4javascript.version = "1.4.1";
	log4javascript.edition = "log4javascript";

	/* -------------------------------------------------------------------------- */
	// Utility functions

	function toStr(obj) {
		if (obj && obj.toString) {
			return obj.toString();
		} else {
			return String(obj);
		}
	}

	function getExceptionMessage(ex) {
		if (ex.message) {
			return ex.message;
		} else if (ex.description) {
			return ex.description;
		} else {
			return toStr(ex);
		}
	}

	// Gets the portion of the URL after the last slash
	function getUrlFileName(url) {
		var lastSlashIndex = Math.max(url.lastIndexOf("/"), url.lastIndexOf("\\"));
		return url.substr(lastSlashIndex + 1);
	}

	// Returns a nicely formatted representation of an error
	function getExceptionStringRep(ex) {
		if (ex) {
			var exStr = "Exception: " + getExceptionMessage(ex);
			try {
				if (ex.lineNumber) {
					exStr += " on line number " + ex.lineNumber;
				}
				if (ex.fileName) {
					exStr += " in file " + getUrlFileName(ex.fileName);
				}
			} catch (localEx) {
				logLog.warn("Unable to obtain file and line information for error");
			}
			if (showStackTraces && ex.stack) {
				exStr += newLine + "Stack trace:" + newLine + ex.stack;
			}
			return exStr;
		}
		return null;
	}

	function bool(obj) {
		return Boolean(obj);
	}

	function trim(str) {
		return str.replace(/^\s+/, "").replace(/\s+$/, "");
	}

	function splitIntoLines(text) {
		// Ensure all line breaks are \n only
		var text2 = text.replace(/\r\n/g, "\n").replace(/\r/g, "\n");
		return text2.split("\n");
	}

	function urlEncode(str) {
		return escape(str).replace(/\+/g, "%2B").replace(/"/g, "%22").replace(/'/g, "%27").replace(/\//g, "%2F").replace(/=/g, "%3D");
	}

	function urlDecode(str) {
		return unescape(str).replace(/%2B/g, "+").replace(/%22/g, "\"").replace(/%27/g, "'").replace(/%2F/g, "/").replace(/%3D/g, "=");
	}

	function array_remove(arr, val) {
		var index = -1;
		for (var i = 0, len = arr.length; i < len; i++) {
			if (arr[i] === val) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			arr.splice(index, 1);
			return true;
		} else {
			return false;
		}
	}

	function array_contains(arr, val) {
		for(var i = 0, len = arr.length; i < len; i++) {
			if (arr[i] == val) {
				return true;
			}
		}
		return false;
	}

	function extractBooleanFromParam(param, defaultValue) {
		if (isUndefined(param)) {
			return defaultValue;
		} else {
			return bool(param);
		}
	}

	function extractStringFromParam(param, defaultValue) {
		if (isUndefined(param)) {
			return defaultValue;
		} else {
			return String(param);
		}
	}

	function extractIntFromParam(param, defaultValue) {
		if (isUndefined(param)) {
			return defaultValue;
		} else {
			try {
				var value = parseInt(param, 10);
				return isNaN(value) ? defaultValue : value;
			} catch (ex) {
				logLog.warn("Invalid int param " + param, ex);
				return defaultValue;
			}
		}
	}

	function extractFunctionFromParam(param, defaultValue) {
		if (typeof param == "function") {
			return param;
		} else {
			return defaultValue;
		}
	}

	function isError(err) {
		return (err instanceof Error);
	}

	if (!Function.prototype.apply){
	    Function.prototype.apply = function(obj, args) {
	    	var methodName = "__apply__";
	    	if (typeof obj[methodName] != "undefined") {
	    		methodName += String(Math.random()).substr(2);
	    	}
	    	obj[methodName] = this;

	    	var argsStrings = [];
	    	for (var i = 0, len = args.length; i < len; i++) {
	    		argsStrings[i] = "args[" + i + "]";
	    	}
	    	var script = "obj." + methodName + "(" + argsStrings.join(",") + ")";
	    	var returnValue = eval(script);
	    	delete obj[methodName];
	    	return returnValue;
	    };
	}

	if (!Function.prototype.call){
	    Function.prototype.call = function(obj) {
	    	var args = [];
	    	for (var i = 1, len = arguments.length; i < len; i++) {
	    		args[i - 1] = arguments[i];
	    	}
	        return this.apply(obj, args);
	    };
	}

	function getListenersPropertyName(eventName) {
		return "__log4javascript_listeners__" + eventName;
	}

	function addEvent(node, eventName, listener, useCapture, win) {
		win = win ? win : window;
		if (node.addEventListener) {
			node.addEventListener(eventName, listener, useCapture);
		} else if (node.attachEvent) {
			node.attachEvent("on" + eventName, listener);
		} else {
			var propertyName = getListenersPropertyName(eventName);
			if (!node[propertyName]) {
				node[propertyName] = [];
				// Set event handler
				node["on" + eventName] = function(evt) {
					evt = getEvent(evt, win);
					var listenersPropertyName = getListenersPropertyName(eventName);

					// Clone the array of listeners to leave the original untouched
					var listeners = this[listenersPropertyName].concat([]);
					var currentListener;

					// Call each listener in turn
					while ((currentListener = listeners.shift())) {
						currentListener.call(this, evt);
					}
				};
			}
			node[propertyName].push(listener);
		}
	}

	function removeEvent(node, eventName, listener, useCapture) {
		if (node.removeEventListener) {
			node.removeEventListener(eventName, listener, useCapture);
		} else if (node.detachEvent) {
			node.detachEvent("on" + eventName, listener);
		} else {
			var propertyName = getListenersPropertyName(eventName);
			if (node[propertyName]) {
				array_remove(node[propertyName], listener);
			}
		}
	}

	function getEvent(evt, win) {
		win = win ? win : window;
		return evt ? evt : win.event;
	}

	function stopEventPropagation(evt) {
		if (evt.stopPropagation) {
			evt.stopPropagation();
		} else if (typeof evt.cancelBubble != "undefined") {
			evt.cancelBubble = true;
		}
		evt.returnValue = false;
	}

	/* ---------------------------------------------------------------------- */
	// Simple logging for log4javascript itself

	var logLog = {
		quietMode: false,

		debugMessages: [],

		setQuietMode: function(quietMode) {
			this.quietMode = bool(quietMode);
		},

		numberOfErrors: 0,

		alertAllErrors: false,

		setAlertAllErrors: function(alertAllErrors) {
			this.alertAllErrors = alertAllErrors;
		},

		debug: function(message) {
			this.debugMessages.push(message);
		},

		displayDebug: function() {
			alert(this.debugMessages.join(newLine));
		},

		warn: function(message, exception) {
		},

		error: function(message, exception) {
			if (++this.numberOfErrors == 1 || this.alertAllErrors) {
				if (!this.quietMode) {
					var alertMessage = "log4javascript error: " + message;
					if (exception) {
						alertMessage += newLine + newLine + "Original error: " + getExceptionStringRep(exception);
					}
					alert(alertMessage);
				}
			}
		}
	};
	log4javascript.logLog = logLog;

	log4javascript.setEventTypes(["load", "error"]);

	function handleError(message, exception) {
		logLog.error(message, exception);
		log4javascript.dispatchEvent("error", { "message": message, "exception": exception });
	}

	log4javascript.handleError = handleError;

	/* ---------------------------------------------------------------------- */

	var enabled = !((typeof log4javascript_disabled != "undefined") &&
                    log4javascript_disabled);

	log4javascript.setEnabled = function(enable) {
		enabled = bool(enable);
	};

	log4javascript.isEnabled = function() {
		return enabled;
	};

	var useTimeStampsInMilliseconds = true;

	log4javascript.setTimeStampsInMilliseconds = function(timeStampsInMilliseconds) {
		useTimeStampsInMilliseconds = bool(timeStampsInMilliseconds);
	};

	log4javascript.isTimeStampsInMilliseconds = function() {
		return useTimeStampsInMilliseconds;
	};


	// This evaluates the given expression in the current scope, thus allowing
	// scripts to access private variables. Particularly useful for testing
	log4javascript.evalInScope = function(expr) {
		return eval(expr);
	};

	var showStackTraces = false;

	log4javascript.setShowStackTraces = function(show) {
		showStackTraces = bool(show);
	};

	/* ---------------------------------------------------------------------- */
	// Levels

	var Level = function(level, name) {
		this.level = level;
		this.name = name;
	};

	Level.prototype = {
		toString: function() {
			return this.name;
		},
		equals: function(level) {
			return this.level == level.level;
		},
		isGreaterOrEqual: function(level) {
			return this.level >= level.level;
		}
	};

	Level.ALL = new Level(Number.MIN_VALUE, "ALL");
	Level.TRACE = new Level(10000, "TRACE");
	Level.DEBUG = new Level(20000, "DEBUG");
	Level.INFO = new Level(30000, "INFO");
	Level.WARN = new Level(40000, "WARN");
	Level.ERROR = new Level(50000, "ERROR");
	Level.FATAL = new Level(60000, "FATAL");
	Level.OFF = new Level(Number.MAX_VALUE, "OFF");

	log4javascript.Level = Level;

	/* ---------------------------------------------------------------------- */
	// Timers

	function Timer(name, level) {
		this.name = name;
		this.level = isUndefined(level) ? Level.INFO : level;
		this.start = new Date();
	}

	Timer.prototype.getElapsedTime = function() {
		return new Date().getTime() - this.start.getTime();
	};

	/* ---------------------------------------------------------------------- */
	// Loggers

	var anonymousLoggerName = "[anonymous]";
	var defaultLoggerName = "[default]";
	var nullLoggerName = "[null]";
	var rootLoggerName = "root";

	function Logger(name) {
		this.name = name;
		this.parent = null;
		this.children = [];

		var appenders = [];
		var loggerLevel = null;
		var isRoot = (this.name === rootLoggerName);
		var isNull = (this.name === nullLoggerName);

		var appenderCache = null;
		var appenderCacheInvalidated = false;

		this.addChild = function(childLogger) {
			this.children.push(childLogger);
			childLogger.parent = this;
			childLogger.invalidateAppenderCache();
		};

		// Additivity
		var additive = true;
		this.getAdditivity = function() {
			return additive;
		};

		this.setAdditivity = function(additivity) {
			var valueChanged = (additive != additivity);
			additive = additivity;
			if (valueChanged) {
				this.invalidateAppenderCache();
			}
		};

		// Create methods that use the appenders variable in this scope
		this.addAppender = function(appender) {
			if (isNull) {
				handleError("Logger.addAppender: you may not add an appender to the null logger");
			} else {
				if (appender instanceof log4javascript.Appender) {
					if (!array_contains(appenders, appender)) {
						appenders.push(appender);
						appender.setAddedToLogger(this);
						this.invalidateAppenderCache();
					}
				} else {
					handleError("Logger.addAppender: appender supplied ('" +
						toStr(appender) + "') is not a subclass of Appender");
				}
			}
		};

		this.removeAppender = function(appender) {
			array_remove(appenders, appender);
			appender.setRemovedFromLogger(this);
			this.invalidateAppenderCache();
		};

		this.removeAllAppenders = function() {
			var appenderCount = appenders.length;
			if (appenderCount > 0) {
				for (var i = 0; i < appenderCount; i++) {
					appenders[i].setRemovedFromLogger(this);
				}
				appenders.length = 0;
				this.invalidateAppenderCache();
			}
		};

		this.getEffectiveAppenders = function() {
			if (appenderCache === null || appenderCacheInvalidated) {
				// Build appender cache
				var parentEffectiveAppenders = (isRoot || !this.getAdditivity()) ?
					[] : this.parent.getEffectiveAppenders();
				appenderCache = parentEffectiveAppenders.concat(appenders);
				appenderCacheInvalidated = false;
			}
			return appenderCache;
		};

		this.invalidateAppenderCache = function() {
			appenderCacheInvalidated = true;
			for (var i = 0, len = this.children.length; i < len; i++) {
				this.children[i].invalidateAppenderCache();
			}
		};

		this.log = function(level, params) {
			if (level.isGreaterOrEqual(this.getEffectiveLevel())) {
				// Check whether last param is an exception
				var exception;
				var finalParamIndex = params.length - 1;
				var lastParam = params[params.length - 1];
				if (params.length > 1 && isError(lastParam)) {
					exception = lastParam;
					finalParamIndex--;
				}

				// Construct genuine array for the params
				var messages = [];
				for (var i = 0; i <= finalParamIndex; i++) {
					messages[i] = params[i];
				}

				var loggingEvent = new LoggingEvent(
					this, new Date(), level, messages, exception);

				this.callAppenders(loggingEvent);
			}
		};

		this.callAppenders = function(loggingEvent) {
			var effectiveAppenders = this.getEffectiveAppenders();
			for (var i = 0, len = effectiveAppenders.length; i < len; i++) {
				effectiveAppenders[i].doAppend(loggingEvent);
			}
		};

		this.setLevel = function(level) {
			// Having a level of null on the root logger would be very bad.
			if (isRoot && level === null) {
				handleError("Logger.setLevel: you cannot set the level of the root logger to null");
			} else if (level instanceof Level) {
				loggerLevel = level;
			} else {
				handleError("Logger.setLevel: level supplied to logger " +
					this.name + " is not an instance of log4javascript.Level");
			}
		};

		this.getLevel = function() {
			return loggerLevel;
		};

		this.getEffectiveLevel = function() {
			for (var logger = this; logger !== null; logger = logger.parent) {
				var level = logger.getLevel();
				if (level !== null) {
					return level;
				}
			}
		};

		this.group = function(name, initiallyExpanded) {
			var effectiveAppenders = this.getEffectiveAppenders();
			for (var i = 0, len = effectiveAppenders.length; i < len; i++) {
				effectiveAppenders[i].group(name, initiallyExpanded);
			}
		};

		this.groupEnd = function(name) {
			var effectiveAppenders = this.getEffectiveAppenders();
			for (var i = 0, len = effectiveAppenders.length; i < len; i++) {
				effectiveAppenders[i].groupEnd();
			}
		};

		var timers = {};

		this.time = function(name, level) {
			if (isUndefined(name)) {
				handleError("Logger.time: a name for the timer must be supplied");
			} else if (level && !(level instanceof Level)) {
				handleError("Logger.time: level supplied to timer " +
					name + " is not an instance of log4javascript.Level");
			} else {
				timers[name] = new Timer(name, level);
			}
		};

		this.timeEnd = function(name) {
			if (isUndefined(name)) {
				handleError("Logger.timeEnd: a name for the timer must be supplied");
			} else if (timers[name]) {
				var timer = timers[name];
				var milliseconds = timer.getElapsedTime();
				this.log(timer.level, ["Timer " + toStr(name) + " completed in " + milliseconds + "ms"]);
				delete timers[name];
			} else {
				logLog.warn("Logger.timeEnd: no timer found with name " + name);
			}
		};

		this.assert = function(expr) {
			if (!expr) {
				var args = [];
				for (var i = 1, len = arguments.length; i < len; i++) {
					args.push(arguments[i]);
				}
				args = (args.length > 0) ? args : ["Assertion Failure"];
				args.push(newLine);
				args.push(expr);
				this.log(Level.ERROR, args);
			}
		};

		this.toString = function() {
			return "Logger[" + this.name + "]";
		};
	}

	Logger.prototype = {
		trace: function() {
			this.log(Level.TRACE, arguments);
		},

		debug: function() {
			this.log(Level.DEBUG, arguments);
		},

		info: function() {
			this.log(Level.INFO, arguments);
		},

		warn: function() {
			this.log(Level.WARN, arguments);
		},

		error: function() {
			this.log(Level.ERROR, arguments);
		},

		fatal: function() {
			this.log(Level.FATAL, arguments);
		},

		isEnabledFor: function(level) {
			return level.isGreaterOrEqual(this.getEffectiveLevel());
		},

		isTraceEnabled: function() {
			return this.isEnabledFor(Level.TRACE);
		},

		isDebugEnabled: function() {
			return this.isEnabledFor(Level.DEBUG);
		},

		isInfoEnabled: function() {
			return this.isEnabledFor(Level.INFO);
		},

		isWarnEnabled: function() {
			return this.isEnabledFor(Level.WARN);
		},

		isErrorEnabled: function() {
			return this.isEnabledFor(Level.ERROR);
		},

		isFatalEnabled: function() {
			return this.isEnabledFor(Level.FATAL);
		}
	};

	Logger.prototype.trace.isEntryPoint = true;
	Logger.prototype.debug.isEntryPoint = true;
	Logger.prototype.info.isEntryPoint = true;
	Logger.prototype.warn.isEntryPoint = true;
	Logger.prototype.error.isEntryPoint = true;
	Logger.prototype.fatal.isEntryPoint = true;

	/* ---------------------------------------------------------------------- */
	// Logger access methods

	// Hashtable of loggers keyed by logger name
	var loggers = {};
	var loggerNames = [];

	var ROOT_LOGGER_DEFAULT_LEVEL = Level.DEBUG;
	var rootLogger = new Logger(rootLoggerName);
	rootLogger.setLevel(ROOT_LOGGER_DEFAULT_LEVEL);

	log4javascript.getRootLogger = function() {
		return rootLogger;
	};

	log4javascript.getLogger = function(loggerName) {
		// Use default logger if loggerName is not specified or invalid
		if (!(typeof loggerName == "string")) {
			loggerName = anonymousLoggerName;
			logLog.warn("log4javascript.getLogger: non-string logger name "	+
				toStr(loggerName) + " supplied, returning anonymous logger");
		}

		// Do not allow retrieval of the root logger by name
		if (loggerName == rootLoggerName) {
			handleError("log4javascript.getLogger: root logger may not be obtained by name");
		}

		// Create the logger for this name if it doesn't already exist
		if (!loggers[loggerName]) {
			var logger = new Logger(loggerName);
			loggers[loggerName] = logger;
			loggerNames.push(loggerName);

			// Set up parent logger, if it doesn't exist
			var lastDotIndex = loggerName.lastIndexOf(".");
			var parentLogger;
			if (lastDotIndex > -1) {
				var parentLoggerName = loggerName.substring(0, lastDotIndex);
				parentLogger = log4javascript.getLogger(parentLoggerName); // Recursively sets up grandparents etc.
			} else {
				parentLogger = rootLogger;
			}
			parentLogger.addChild(logger);
		}
		return loggers[loggerName];
	};

	var defaultLogger = null;
	log4javascript.getDefaultLogger = function() {
		if (!defaultLogger) {
			defaultLogger = log4javascript.getLogger(defaultLoggerName);
			var a = new log4javascript.PopUpAppender();
			defaultLogger.addAppender(a);
		}
		return defaultLogger;
	};

	var nullLogger = null;
	log4javascript.getNullLogger = function() {
		if (!nullLogger) {
			nullLogger = new Logger(nullLoggerName);
			nullLogger.setLevel(Level.OFF);
		}
		return nullLogger;
	};

	// Destroys all loggers
	log4javascript.resetConfiguration = function() {
		rootLogger.setLevel(ROOT_LOGGER_DEFAULT_LEVEL);
		loggers = {};
	};

	/* ---------------------------------------------------------------------- */
	// Logging events

	var LoggingEvent = function(logger, timeStamp, level, messages,
			exception) {
		this.logger = logger;
		this.timeStamp = timeStamp;
        this.timeStampInMilliseconds = timeStamp.getTime();
        this.timeStampInSeconds = Math.floor(this.timeStampInMilliseconds / 1000);
		this.milliseconds = this.timeStamp.getMilliseconds();
		this.level = level;
		this.messages = messages;
		this.exception = exception;
	};

	LoggingEvent.prototype = {
		getThrowableStrRep: function() {
			return this.exception ?
				getExceptionStringRep(this.exception) : "";
		},
		getCombinedMessages: function() {
			return (this.messages.length == 1) ? this.messages[0] :
				   this.messages.join(newLine);
		},
		toString: function() {
			return "LoggingEvent[" + this.level + "]";
		}
	};

	log4javascript.LoggingEvent = LoggingEvent;

	/* ---------------------------------------------------------------------- */
	// Layout prototype

	var Layout = function() {
	};

	Layout.prototype = {
		defaults: {
			loggerKey: "logger",
			timeStampKey: "timestamp",
			millisecondsKey: "milliseconds",
			levelKey: "level",
			messageKey: "message",
			exceptionKey: "exception",
			urlKey: "url"
		},
		loggerKey: "logger",
		timeStampKey: "timestamp",
		millisecondsKey: "milliseconds",
		levelKey: "level",
		messageKey: "message",
		exceptionKey: "exception",
		urlKey: "url",
		batchHeader: "",
		batchFooter: "",
		batchSeparator: "",
		returnsPostData: false,
		overrideTimeStampsSetting: false,
		useTimeStampsInMilliseconds: null,

		format: function(loggingEvent) {
			handleError("Layout.format: layout supplied has no format() method");
		},

		ignoresThrowable: function() {
			handleError("Layout.ignoresThrowable: layout supplied has no ignoresThrowable() method");
		},

		getContentType: function() {
			return "text/plain";
		},

		allowBatching: function() {
			return true;
		},

		setTimeStampsInMilliseconds: function(timeStampsInMilliseconds) {
			this.overrideTimeStampsSetting = true;
			this.useTimeStampsInMilliseconds = bool(timeStampsInMilliseconds);
		},

		isTimeStampsInMilliseconds: function() {
			return this.overrideTimeStampsSetting ?
				this.useTimeStampsInMilliseconds : useTimeStampsInMilliseconds;
		},

		getTimeStampValue: function(loggingEvent) {
			return this.isTimeStampsInMilliseconds() ?
				loggingEvent.timeStampInMilliseconds : loggingEvent.timeStampInSeconds;
		},

		getDataValues: function(loggingEvent, combineMessages) {
			var dataValues = [
				[this.loggerKey, loggingEvent.logger.name],
				[this.timeStampKey, this.getTimeStampValue(loggingEvent)],
				[this.levelKey, loggingEvent.level.name],
				[this.urlKey, window.location.href],
				[this.messageKey, combineMessages ? loggingEvent.getCombinedMessages() : loggingEvent.messages]
			];
			if (!this.isTimeStampsInMilliseconds()) {
				dataValues.push([this.millisecondsKey, loggingEvent.milliseconds]);
			}
			if (loggingEvent.exception) {
				dataValues.push([this.exceptionKey, getExceptionStringRep(loggingEvent.exception)]);
			}
			if (this.hasCustomFields()) {
				for (var i = 0, len = this.customFields.length; i < len; i++) {
					var val = this.customFields[i].value;

					// Check if the value is a function. If so, execute it, passing it the
					// current layout and the logging event
					if (typeof val === "function") {
						val = val(this, loggingEvent);
					}
					dataValues.push([this.customFields[i].name, val]);
				}
			}
			return dataValues;
		},

		setKeys: function(loggerKey, timeStampKey, levelKey, messageKey,
				exceptionKey, urlKey, millisecondsKey) {
			this.loggerKey = extractStringFromParam(loggerKey, this.defaults.loggerKey);
			this.timeStampKey = extractStringFromParam(timeStampKey, this.defaults.timeStampKey);
			this.levelKey = extractStringFromParam(levelKey, this.defaults.levelKey);
			this.messageKey = extractStringFromParam(messageKey, this.defaults.messageKey);
			this.exceptionKey = extractStringFromParam(exceptionKey, this.defaults.exceptionKey);
			this.urlKey = extractStringFromParam(urlKey, this.defaults.urlKey);
			this.millisecondsKey = extractStringFromParam(millisecondsKey, this.defaults.millisecondsKey);
		},

		setCustomField: function(name, value) {
			var fieldUpdated = false;
			for (var i = 0, len = this.customFields.length; i < len; i++) {
				if (this.customFields[i].name === name) {
					this.customFields[i].value = value;
					fieldUpdated = true;
				}
			}
			if (!fieldUpdated) {
				this.customFields.push({"name": name, "value": value});
			}
		},

		hasCustomFields: function() {
			return (this.customFields.length > 0);
		},

		toString: function() {
			handleError("Layout.toString: all layouts must override this method");
		}
	};

	log4javascript.Layout = Layout;

	/* ---------------------------------------------------------------------- */
	// Appender prototype

	var Appender = function() {};

	Appender.prototype = new EventSupport();

	Appender.prototype.layout = new PatternLayout();
	Appender.prototype.threshold = Level.ALL;
	Appender.prototype.loggers = [];

	// Performs threshold checks before delegating actual logging to the
	// subclass's specific append method.
	Appender.prototype.doAppend = function(loggingEvent) {
		if (enabled && loggingEvent.level.level >= this.threshold.level) {
			this.append(loggingEvent);
		}
	};

	Appender.prototype.append = function(loggingEvent) {};

	Appender.prototype.setLayout = function(layout) {
		if (layout instanceof Layout) {
			this.layout = layout;
		} else {
			handleError("Appender.setLayout: layout supplied to " +
				this.toString() + " is not a subclass of Layout");
		}
	};

	Appender.prototype.getLayout = function() {
		return this.layout;
	};

	Appender.prototype.setThreshold = function(threshold) {
		if (threshold instanceof Level) {
			this.threshold = threshold;
		} else {
			handleError("Appender.setThreshold: threshold supplied to " +
				this.toString() + " is not a subclass of Level");
		}
	};

	Appender.prototype.getThreshold = function() {
		return this.threshold;
	};

	Appender.prototype.setAddedToLogger = function(logger) {
		this.loggers.push(logger);
	};

	Appender.prototype.setRemovedFromLogger = function(logger) {
		array_remove(this.loggers, logger);
	};

	Appender.prototype.group = emptyFunction;
	Appender.prototype.groupEnd = emptyFunction;

	Appender.prototype.toString = function() {
		handleError("Appender.toString: all appenders must override this method");
	};

	log4javascript.Appender = Appender;

	/* ---------------------------------------------------------------------- */
	// SimpleLayout

	function SimpleLayout() {
		this.customFields = [];
	}

	SimpleLayout.prototype = new Layout();

	SimpleLayout.prototype.format = function(loggingEvent) {
		return loggingEvent.level.name + " - " + loggingEvent.getCombinedMessages();
	};

	SimpleLayout.prototype.ignoresThrowable = function() {
	    return true;
	};

	SimpleLayout.prototype.toString = function() {
	    return "SimpleLayout";
	};

	log4javascript.SimpleLayout = SimpleLayout;
	/* ----------------------------------------------------------------------- */
	// NullLayout

	function NullLayout() {
		this.customFields = [];
	}

	NullLayout.prototype = new Layout();

	NullLayout.prototype.format = function(loggingEvent) {
		return loggingEvent.messages;
	};

	NullLayout.prototype.ignoresThrowable = function() {
	    return true;
	};

	NullLayout.prototype.toString = function() {
	    return "NullLayout";
	};

	log4javascript.NullLayout = NullLayout;
/* ---------------------------------------------------------------------- */
	// XmlLayout

	function XmlLayout(combineMessages) {
		this.combineMessages = extractBooleanFromParam(combineMessages, true);
		this.customFields = [];
	}

	XmlLayout.prototype = new Layout();

	XmlLayout.prototype.isCombinedMessages = function() {
		return this.combineMessages;
	};

	XmlLayout.prototype.getContentType = function() {
		return "text/xml";
	};

	XmlLayout.prototype.escapeCdata = function(str) {
		return str.replace(/\]\]>/, "]]>]]&gt;<![CDATA[");
	};

	XmlLayout.prototype.format = function(loggingEvent) {
		var layout = this;
		var i, len;
		function formatMessage(message) {
			message = (typeof message === "string") ? message : toStr(message);
			return "<log4javascript:message><![CDATA[" +
				layout.escapeCdata(message) + "]]></log4javascript:message>";
		}

		var str = "<log4javascript:event logger=\"" + loggingEvent.logger.name +
			"\" timestamp=\"" + this.getTimeStampValue(loggingEvent) + "\"";
		if (!this.isTimeStampsInMilliseconds()) {
			str += " milliseconds=\"" + loggingEvent.milliseconds + "\"";
		}
		str += " level=\"" + loggingEvent.level.name + "\">" + newLine;
		if (this.combineMessages) {
			str += formatMessage(loggingEvent.getCombinedMessages());
		} else {
			str += "<log4javascript:messages>" + newLine;
			for (i = 0, len = loggingEvent.messages.length; i < len; i++) {
				str += formatMessage(loggingEvent.messages[i]) + newLine;
			}
			str += "</log4javascript:messages>" + newLine;
		}
		if (this.hasCustomFields()) {
			for (i = 0, len = this.customFields.length; i < len; i++) {
				str += "<log4javascript:customfield name=\"" +
					this.customFields[i].name + "\"><![CDATA[" +
					this.customFields[i].value.toString() +
					"]]></log4javascript:customfield>" + newLine;
			}
		}
		if (loggingEvent.exception) {
			str += "<log4javascript:exception><![CDATA[" +
				getExceptionStringRep(loggingEvent.exception) +
				"]]></log4javascript:exception>" + newLine;
		}
		str += "</log4javascript:event>" + newLine + newLine;
		return str;
	};

	XmlLayout.prototype.ignoresThrowable = function() {
	    return false;
	};

	XmlLayout.prototype.toString = function() {
	    return "XmlLayout";
	};

	log4javascript.XmlLayout = XmlLayout;
	/* ---------------------------------------------------------------------- */
	// JsonLayout related

	function escapeNewLines(str) {
		return str.replace(/\r\n|\r|\n/g, "\\r\\n");
	}

	function JsonLayout(readable, combineMessages) {
		this.readable = extractBooleanFromParam(readable, false);
		this.combineMessages = extractBooleanFromParam(combineMessages, true);
		this.batchHeader = this.readable ? "[" + newLine : "[";
		this.batchFooter = this.readable ? "]" + newLine : "]";
		this.batchSeparator = this.readable ? "," + newLine : ",";
		this.setKeys();
		this.colon = this.readable ? ": " : ":";
		this.tab = this.readable ? "\t" : "";
		this.lineBreak = this.readable ? newLine : "";
		this.customFields = [];
	}

	/* ---------------------------------------------------------------------- */
	// JsonLayout

	JsonLayout.prototype = new Layout();

	JsonLayout.prototype.isReadable = function() {
		return this.readable;
	};

	JsonLayout.prototype.isCombinedMessages = function() {
		return this.combineMessages;
	};

	JsonLayout.prototype.format = function(loggingEvent) {
		var layout = this;
		var dataValues = this.getDataValues(loggingEvent, this.combineMessages);
		var str = "{" + this.lineBreak;
		var i;

		function formatValue(val, prefix, expand) {
			// Check the type of the data value to decide whether quotation marks
			// or expansion are required
			var formattedValue;
			var valType = typeof val;
			if (val instanceof Date) {
				formattedValue = String(val.getTime());
			} else if (expand && (val instanceof Array)) {
				formattedValue = "[" + layout.lineBreak;
				for (i = 0, len = val.length; i < len; i++) {
					var childPrefix = prefix + layout.tab;
					formattedValue += childPrefix + formatValue(val[i], childPrefix, false);
					if (i < val.length - 1) {
						formattedValue += ",";
					}
					formattedValue += layout.lineBreak;
				}
				formattedValue += prefix + "]";
			} else if (valType !== "number" && valType !== "boolean") {
				formattedValue = "\"" + escapeNewLines(toStr(val).replace(/\"/g, "\\\"")) + "\"";
			} else {
				formattedValue = val;
			}
			return formattedValue;
		}

		for (i = 0, len = dataValues.length; i < len; i++) {
			str += this.tab + "\"" + dataValues[i][0] + "\"" + this.colon + formatValue(dataValues[i][1], this.tab, true);
			if (i < dataValues.length - 1) {
				str += ",";
			}
			str += this.lineBreak;
		}

		str += "}" + this.lineBreak;
		return str;
	};

	JsonLayout.prototype.ignoresThrowable = function() {
	    return false;
	};

	JsonLayout.prototype.toString = function() {
	    return "JsonLayout";
	};

	JsonLayout.prototype.getContentType = function() {
		return "application/json";
	};

	log4javascript.JsonLayout = JsonLayout;
	/* ---------------------------------------------------------------------- */
	// HttpPostDataLayout

	function HttpPostDataLayout() {
		this.setKeys();
		this.customFields = [];
		this.returnsPostData = true;
	}

	HttpPostDataLayout.prototype = new Layout();

	// Disable batching
	HttpPostDataLayout.prototype.allowBatching = function() {
		return false;
	};

	HttpPostDataLayout.prototype.format = function(loggingEvent) {
		var dataValues = this.getDataValues(loggingEvent);
		var queryBits = [];
		for (var i = 0, len = dataValues.length; i < len; i++) {
			var val = (dataValues[i][1] instanceof Date) ?
				String(dataValues[i][1].getTime()) : dataValues[i][1];
			queryBits.push(urlEncode(dataValues[i][0]) + "=" + urlEncode(val));
		}
		return queryBits.join("&");
	};

	HttpPostDataLayout.prototype.ignoresThrowable = function(loggingEvent) {
	    return false;
	};

	HttpPostDataLayout.prototype.toString = function() {
	    return "HttpPostDataLayout";
	};

	log4javascript.HttpPostDataLayout = HttpPostDataLayout;
	/* ---------------------------------------------------------------------- */
	// formatObjectExpansion

	function formatObjectExpansion(obj, depth, indentation) {
		var objectsExpanded = [];

		function doFormat(obj, depth, indentation) {
			var i, j, len, childDepth, childIndentation, childLines, expansion,
				childExpansion;

			if (!indentation) {
				indentation = "";
			}

			function formatString(text) {
				var lines = splitIntoLines(text);
				for (var j = 1, jLen = lines.length; j < jLen; j++) {
					lines[j] = indentation + lines[j];
				}
				return lines.join(newLine);
			}

			if (obj === null) {
				return "null";
			} else if (typeof obj == "undefined") {
				return "undefined";
			} else if (typeof obj == "string") {
				return formatString(obj);
			} else if (typeof obj == "object" && array_contains(objectsExpanded, obj)) {
				try {
					expansion = toStr(obj);
				} catch (ex) {
					expansion = "Error formatting property. Details: " + getExceptionStringRep(ex);
				}
				return expansion + " [already expanded]";
			} else if ((obj instanceof Array) && depth > 0) {
				objectsExpanded.push(obj);
				expansion = "[" + newLine;
				childDepth = depth - 1;
				childIndentation = indentation + "  ";
				childLines = [];
				for (i = 0, len = obj.length; i < len; i++) {
					try {
						childExpansion = doFormat(obj[i], childDepth, childIndentation);
						childLines.push(childIndentation + childExpansion);
					} catch (ex) {
						childLines.push(childIndentation + "Error formatting array member. Details: " +
							getExceptionStringRep(ex) + "");
					}
				}
				expansion += childLines.join("," + newLine) + newLine + indentation + "]";
				return expansion;
			} else if (typeof obj == "object" && depth > 0) {
				objectsExpanded.push(obj);
				expansion = "{" + newLine;
				childDepth = depth - 1;
				childIndentation = indentation + "  ";
				childLines = [];
				for (i in obj) {
					try {
						childExpansion = doFormat(obj[i], childDepth, childIndentation);
						childLines.push(childIndentation + i + ": " + childExpansion);
					} catch (ex) {
						childLines.push(childIndentation + i + ": Error formatting property. Details: " +
							getExceptionStringRep(ex));
					}
				}
				expansion += childLines.join("," + newLine) + newLine + indentation + "}";
				return expansion;
			} else {
				return formatString(toStr(obj));
			}
		}
		return doFormat(obj, depth, indentation);
	}
	/* ---------------------------------------------------------------------- */
	// Date-related stuff

	var SimpleDateFormat;

	(function() {
		var regex = /('[^']*')|(G+|y+|M+|w+|W+|D+|d+|F+|E+|a+|H+|k+|K+|h+|m+|s+|S+|Z+)|([a-zA-Z]+)|([^a-zA-Z']+)/;
		var monthNames = ["January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"];
		var dayNames = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
		var TEXT2 = 0, TEXT3 = 1, NUMBER = 2, YEAR = 3, MONTH = 4, TIMEZONE = 5;
		var types = {
			G : TEXT2,
			y : YEAR,
			M : MONTH,
			w : NUMBER,
			W : NUMBER,
			D : NUMBER,
			d : NUMBER,
			F : NUMBER,
			E : TEXT3,
			a : TEXT2,
			H : NUMBER,
			k : NUMBER,
			K : NUMBER,
			h : NUMBER,
			m : NUMBER,
			s : NUMBER,
			S : NUMBER,
			Z : TIMEZONE
		};
		var ONE_DAY = 24 * 60 * 60 * 1000;
		var ONE_WEEK = 7 * ONE_DAY;
		var DEFAULT_MINIMAL_DAYS_IN_FIRST_WEEK = 1;

		var newDateAtMidnight = function(year, month, day) {
			var d = new Date(year, month, day, 0, 0, 0);
			d.setMilliseconds(0);
			return d;
		};

		Date.prototype.getDifference = function(date) {
			return this.getTime() - date.getTime();
		};

		Date.prototype.isBefore = function(d) {
			return this.getTime() < d.getTime();
		};

		Date.prototype.getUTCTime = function() {
			return Date.UTC(this.getFullYear(), this.getMonth(), this.getDate(), this.getHours(), this.getMinutes(),
					this.getSeconds(), this.getMilliseconds());
		};

		Date.prototype.getTimeSince = function(d) {
			return this.getUTCTime() - d.getUTCTime();
		};

		Date.prototype.getPreviousSunday = function() {
			// Using midday avoids any possibility of DST messing things up
			var midday = new Date(this.getFullYear(), this.getMonth(), this.getDate(), 12, 0, 0);
			var previousSunday = new Date(midday.getTime() - this.getDay() * ONE_DAY);
			return newDateAtMidnight(previousSunday.getFullYear(), previousSunday.getMonth(),
					previousSunday.getDate());
		};

		Date.prototype.getWeekInYear = function(minimalDaysInFirstWeek) {
			if (isUndefined(this.minimalDaysInFirstWeek)) {
				minimalDaysInFirstWeek = DEFAULT_MINIMAL_DAYS_IN_FIRST_WEEK;
			}
			var previousSunday = this.getPreviousSunday();
			var startOfYear = newDateAtMidnight(this.getFullYear(), 0, 1);
			var numberOfSundays = previousSunday.isBefore(startOfYear) ?
				0 : 1 + Math.floor(previousSunday.getTimeSince(startOfYear) / ONE_WEEK);
			var numberOfDaysInFirstWeek =  7 - startOfYear.getDay();
			var weekInYear = numberOfSundays;
			if (numberOfDaysInFirstWeek < minimalDaysInFirstWeek) {
				weekInYear--;
			}
			return weekInYear;
		};

		Date.prototype.getWeekInMonth = function(minimalDaysInFirstWeek) {
			if (isUndefined(this.minimalDaysInFirstWeek)) {
				minimalDaysInFirstWeek = DEFAULT_MINIMAL_DAYS_IN_FIRST_WEEK;
			}
			var previousSunday = this.getPreviousSunday();
			var startOfMonth = newDateAtMidnight(this.getFullYear(), this.getMonth(), 1);
			var numberOfSundays = previousSunday.isBefore(startOfMonth) ?
				0 : 1 + Math.floor(previousSunday.getTimeSince(startOfMonth) / ONE_WEEK);
			var numberOfDaysInFirstWeek =  7 - startOfMonth.getDay();
			var weekInMonth = numberOfSundays;
			if (numberOfDaysInFirstWeek >= minimalDaysInFirstWeek) {
				weekInMonth++;
			}
			return weekInMonth;
		};

		Date.prototype.getDayInYear = function() {
			var startOfYear = newDateAtMidnight(this.getFullYear(), 0, 1);
			return 1 + Math.floor(this.getTimeSince(startOfYear) / ONE_DAY);
		};

		/* ------------------------------------------------------------------ */

		SimpleDateFormat = function(formatString) {
			this.formatString = formatString;
		};

		/**
		 * Sets the minimum number of days in a week in order for that week to
		 * be considered as belonging to a particular month or year
		 */
		SimpleDateFormat.prototype.setMinimalDaysInFirstWeek = function(days) {
			this.minimalDaysInFirstWeek = days;
		};

		SimpleDateFormat.prototype.getMinimalDaysInFirstWeek = function() {
			return isUndefined(this.minimalDaysInFirstWeek)	?
				DEFAULT_MINIMAL_DAYS_IN_FIRST_WEEK : this.minimalDaysInFirstWeek;
		};

		var padWithZeroes = function(str, len) {
			while (str.length < len) {
				str = "0" + str;
			}
			return str;
		};

		var formatText = function(data, numberOfLetters, minLength) {
			return (numberOfLetters >= 4) ? data : data.substr(0, Math.max(minLength, numberOfLetters));
		};

		var formatNumber = function(data, numberOfLetters) {
			var dataString = "" + data;
			// Pad with 0s as necessary
			return padWithZeroes(dataString, numberOfLetters);
		};

		SimpleDateFormat.prototype.format = function(date) {
			var formattedString = "";
			var result;
			var searchString = this.formatString;
			while ((result = regex.exec(searchString))) {
				var quotedString = result[1];
				var patternLetters = result[2];
				var otherLetters = result[3];
				var otherCharacters = result[4];

				// If the pattern matched is quoted string, output the text between the quotes
				if (quotedString) {
					if (quotedString == "''") {
						formattedString += "'";
					} else {
						formattedString += quotedString.substring(1, quotedString.length - 1);
					}
				} else if (otherLetters) {
					// Swallow non-pattern letters by doing nothing here
				} else if (otherCharacters) {
					// Simply output other characters
					formattedString += otherCharacters;
				} else if (patternLetters) {
					// Replace pattern letters
					var patternLetter = patternLetters.charAt(0);
					var numberOfLetters = patternLetters.length;
					var rawData = "";
					switch(patternLetter) {
						case "G":
							rawData = "AD";
							break;
						case "y":
							rawData = date.getFullYear();
							break;
						case "M":
							rawData = date.getMonth();
							break;
						case "w":
							rawData = date.getWeekInYear(this.getMinimalDaysInFirstWeek());
							break;
						case "W":
							rawData = date.getWeekInMonth(this.getMinimalDaysInFirstWeek());
							break;
						case "D":
							rawData = date.getDayInYear();
							break;
						case "d":
							rawData = date.getDate();
							break;
						case "F":
							rawData = 1 + Math.floor((date.getDate() - 1) / 7);
							break;
						case "E":
							rawData = dayNames[date.getDay()];
							break;
						case "a":
							rawData = (date.getHours() >= 12) ? "PM" : "AM";
							break;
						case "H":
							rawData = date.getHours();
							break;
						case "k":
							rawData = date.getHours() || 24;
							break;
						case "K":
							rawData = date.getHours() % 12;
							break;
						case "h":
							rawData = (date.getHours() % 12) || 12;
							break;
						case "m":
							rawData = date.getMinutes();
							break;
						case "s":
							rawData = date.getSeconds();
							break;
						case "S":
							rawData = date.getMilliseconds();
							break;
						case "Z":
							rawData = date.getTimezoneOffset(); // This returns the number of minutes since GMT was this time.
							break;
					}
					// Format the raw data depending on the type
					switch(types[patternLetter]) {
						case TEXT2:
							formattedString += formatText(rawData, numberOfLetters, 2);
							break;
						case TEXT3:
							formattedString += formatText(rawData, numberOfLetters, 3);
							break;
						case NUMBER:
							formattedString += formatNumber(rawData, numberOfLetters);
							break;
						case YEAR:
							if (numberOfLetters <= 3) {
								// Output a 2-digit year
								var dataString = "" + rawData;
								formattedString += dataString.substr(2, 2);
							} else {
								formattedString += formatNumber(rawData, numberOfLetters);
							}
							break;
						case MONTH:
							if (numberOfLetters >= 3) {
								formattedString += formatText(monthNames[rawData], numberOfLetters, numberOfLetters);
							} else {
								// NB. Months returned by getMonth are zero-based
								formattedString += formatNumber(rawData + 1, numberOfLetters);
							}
							break;
						case TIMEZONE:
							var isPositive = (rawData > 0);
							// The following line looks like a mistake but isn't
							// because of the way getTimezoneOffset measures.
							var prefix = isPositive ? "-" : "+";
							var absData = Math.abs(rawData);

							// Hours
							var hours = "" + Math.floor(absData / 60);
							hours = padWithZeroes(hours, 2);
							// Minutes
							var minutes = "" + (absData % 60);
							minutes = padWithZeroes(minutes, 2);

							formattedString += prefix + hours + minutes;
							break;
					}
				}
				searchString = searchString.substr(result.index + result[0].length);
			}
			return formattedString;
		};
	})();

	log4javascript.SimpleDateFormat = SimpleDateFormat;

	/* ---------------------------------------------------------------------- */
	// PatternLayout

	function PatternLayout(pattern) {
		if (pattern) {
			this.pattern = pattern;
		} else {
			this.pattern = PatternLayout.DEFAULT_CONVERSION_PATTERN;
		}
		this.customFields = [];
	}

	PatternLayout.TTCC_CONVERSION_PATTERN = "%r %p %c - %m%n";
	PatternLayout.DEFAULT_CONVERSION_PATTERN = "%m%n";
	PatternLayout.ISO8601_DATEFORMAT = "yyyy-MM-dd HH:mm:ss,SSS";
	PatternLayout.DATETIME_DATEFORMAT = "dd MMM yyyy HH:mm:ss,SSS";
	PatternLayout.ABSOLUTETIME_DATEFORMAT = "HH:mm:ss,SSS";

	PatternLayout.prototype = new Layout();

	PatternLayout.prototype.format = function(loggingEvent) {
		var regex = /%(-?[0-9]+)?(\.?[0-9]+)?([acdfmMnpr%])(\{([^\}]+)\})?|([^%]+)/;
		var formattedString = "";
		var result;
		var searchString = this.pattern;

		// Cannot use regex global flag since it doesn't work with exec in IE5
		while ((result = regex.exec(searchString))) {
			var matchedString = result[0];
			var padding = result[1];
			var truncation = result[2];
			var conversionCharacter = result[3];
			var specifier = result[5];
			var text = result[6];

			// Check if the pattern matched was just normal text
			if (text) {
				formattedString += "" + text;
			} else {
				// Create a raw replacement string based on the conversion
				// character and specifier
				var replacement = "";
				switch(conversionCharacter) {
					case "a": // Array of messages
					case "m": // Message
						var depth = 0;
						if (specifier) {
							depth = parseInt(specifier, 10);
							if (isNaN(depth)) {
								handleError("PatternLayout.format: invalid specifier '" +
									specifier + "' for conversion character '" + conversionCharacter +
									"' - should be a number");
								depth = 0;
							}
						}
						var messages = (conversionCharacter === "a") ? loggingEvent.messages[0] : loggingEvent.messages;
						for (var i = 0, len = messages.length; i < len; i++) {
							if (i > 0 && (replacement.charAt(replacement.length - 1) !== " ")) {
								replacement += " ";
							}
							if (depth === 0) {
								replacement += messages[i];
							} else {
								replacement += formatObjectExpansion(messages[i], depth);
							}
						}
						break;
					case "c": // Logger name
						var loggerName = loggingEvent.logger.name;
						if (specifier) {
							var precision = parseInt(specifier, 10);
							var loggerNameBits = loggingEvent.logger.name.split(".");
							if (precision >= loggerNameBits.length) {
								replacement = loggerName;
							} else {
								replacement = loggerNameBits.slice(loggerNameBits.length - precision).join(".");
							}
						} else {
							replacement = loggerName;
						}
						break;
					case "d": // Date
						var dateFormat = PatternLayout.ISO8601_DATEFORMAT;
						if (specifier) {
							dateFormat = specifier;
							// Pick up special cases
							if (dateFormat == "ISO8601") {
								dateFormat = PatternLayout.ISO8601_DATEFORMAT;
							} else if (dateFormat == "ABSOLUTE") {
								dateFormat = PatternLayout.ABSOLUTETIME_DATEFORMAT;
							} else if (dateFormat == "DATE") {
								dateFormat = PatternLayout.DATETIME_DATEFORMAT;
							}
						}
						// Format the date
						replacement = (new SimpleDateFormat(dateFormat)).format(loggingEvent.timeStamp);
						break;
					case "f": // Custom field
						if (this.hasCustomFields()) {
							var fieldIndex = 0;
							if (specifier) {
								fieldIndex = parseInt(specifier, 10);
								if (isNaN(fieldIndex)) {
									handleError("PatternLayout.format: invalid specifier '" +
										specifier + "' for conversion character 'f' - should be a number");
								} else if (fieldIndex === 0) {
									handleError("PatternLayout.format: invalid specifier '" +
										specifier + "' for conversion character 'f' - must be greater than zero");
								} else if (fieldIndex > this.customFields.length) {
									handleError("PatternLayout.format: invalid specifier '" +
										specifier + "' for conversion character 'f' - there aren't that many custom fields");
								} else {
									fieldIndex = fieldIndex - 1;
								}
							}
							replacement = this.customFields[fieldIndex].value;
						}
						break;
					case "n": // New line
						replacement = newLine;
						break;
					case "p": // Level
						replacement = loggingEvent.level.name;
						break;
					case "r": // Milliseconds since log4javascript startup
						replacement = "" + loggingEvent.timeStamp.getDifference(applicationStartDate);
						break;
					case "%": // Literal % sign
						replacement = "%";
						break;
					default:
						replacement = matchedString;
						break;
				}
				// Format the replacement according to any padding or
				// truncation specified
				var l;

				// First, truncation
				if (truncation) {
					l = parseInt(truncation.substr(1), 10);
					var strLen = replacement.length;
					if (l < strLen) {
						replacement = replacement.substring(strLen - l, strLen);
					}
				}
				// Next, padding
				if (padding) {
					if (padding.charAt(0) == "-") {
						l = parseInt(padding.substr(1), 10);
						// Right pad with spaces
						while (replacement.length < l) {
							replacement += " ";
						}
					} else {
						l = parseInt(padding, 10);
						// Left pad with spaces
						while (replacement.length < l) {
							replacement = " " + replacement;
						}
					}
				}
				formattedString += replacement;
			}
			searchString = searchString.substr(result.index + result[0].length);
		}
		return formattedString;
	};

	PatternLayout.prototype.ignoresThrowable = function() {
	    return true;
	};

	PatternLayout.prototype.toString = function() {
	    return "PatternLayout";
	};

	log4javascript.PatternLayout = PatternLayout;
	/* ---------------------------------------------------------------------- */
	// AlertAppender

	function AlertAppender() {}

	AlertAppender.prototype = new Appender();

	AlertAppender.prototype.layout = new SimpleLayout();

	AlertAppender.prototype.append = function(loggingEvent) {
		var formattedMessage = this.getLayout().format(loggingEvent);
		if (this.getLayout().ignoresThrowable()) {
			formattedMessage += loggingEvent.getThrowableStrRep();
		}
		alert(formattedMessage);
	};

	AlertAppender.prototype.toString = function() {
		return "AlertAppender";
	};

	log4javascript.AlertAppender = AlertAppender;
	/* ---------------------------------------------------------------------- */
	// BrowserConsoleAppender (only works in Opera and Safari and Firefox with
	// Firebug extension)

	function BrowserConsoleAppender() {}

	BrowserConsoleAppender.prototype = new log4javascript.Appender();
	BrowserConsoleAppender.prototype.layout = new NullLayout();
	BrowserConsoleAppender.prototype.threshold = Level.DEBUG;

	BrowserConsoleAppender.prototype.append = function(loggingEvent) {
		var appender = this;

		var getFormattedMessage = function() {
			var layout = appender.getLayout();
			var formattedMessage = layout.format(loggingEvent);
			if (layout.ignoresThrowable() && loggingEvent.exception) {
				formattedMessage += loggingEvent.getThrowableStrRep();
			}
			return formattedMessage;
		};

		if ((typeof opera != "undefined") && opera.postError) { // Opera
			opera.postError(getFormattedMessage());
		} else if (window.console && window.console.log) { // Safari and Firebug
			var formattedMesage = getFormattedMessage();
			// Log to Firebug using its logging methods or revert to the console.log
			// method in Safari
			if (window.console.debug && Level.DEBUG.isGreaterOrEqual(loggingEvent.level)) {
				window.console.debug(formattedMesage);
			} else if (window.console.info && Level.INFO.equals(loggingEvent.level)) {
				window.console.info(formattedMesage);
			} else if (window.console.warn && Level.WARN.equals(loggingEvent.level)) {
				window.console.warn(formattedMesage);
			} else if (window.console.error && loggingEvent.level.isGreaterOrEqual(Level.ERROR)) {
				window.console.error(formattedMesage);
			} else {
				window.console.log(formattedMesage);
			}
		}
	};

	BrowserConsoleAppender.prototype.group = function(name) {
		if (window.console && window.console.group) {
			window.console.group(name);
		}
	};

	BrowserConsoleAppender.prototype.groupEnd = function() {
		if (window.console && window.console.groupEnd) {
			window.console.groupEnd();
		}
	};

	BrowserConsoleAppender.prototype.toString = function() {
		return "BrowserConsoleAppender";
	};

	log4javascript.BrowserConsoleAppender = BrowserConsoleAppender;
	/* ---------------------------------------------------------------------- */
	// AjaxAppender related

	function getXmlHttp(errorHandler) {
		var xmlHttp = null;
		if (typeof XMLHttpRequest == "object" || typeof XMLHttpRequest == "function") {
			xmlHttp = new XMLHttpRequest();
		} else {
			try {
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e1){
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e2) {
					if (errorHandler) {
						errorHandler();
					} else {
						handleError("getXmlHttp: unable to obtain XMLHttpRequest object");
					}
				}
			}
		}
		return xmlHttp;
	}

	function isHttpRequestSuccessful(xmlHttp) {
		return (isUndefined(xmlHttp.status) || xmlHttp.status === 0 ||
			(xmlHttp.status >= 200 && xmlHttp.status < 300));
	}

	/* ---------------------------------------------------------------------- */
	// AjaxAppender

	function AjaxAppender(url) {
		var appender = this;
		var isSupported = true;
		if (!url) {
			handleError("AjaxAppender: URL must be specified in constructor");
			isSupported = false;
		}

		var timed = this.defaults.timed;
		var waitForResponse = this.defaults.waitForResponse;
		var batchSize = this.defaults.batchSize;
		var timerInterval = this.defaults.timerInterval;
		var requestSuccessCallback = this.defaults.requestSuccessCallback;
		var failCallback = this.defaults.failCallback;
		var postVarName = this.defaults.postVarName;
		var sendAllOnUnload = this.defaults.sendAllOnUnload;
		var sessionId = null;

		var queuedLoggingEvents = [];
		var queuedRequests = [];
		var sending = false;
		var initialized = false;

		// Configuration methods. The function scope is used to prevent
		// direct alteration to the appender configuration properties.
		function checkCanConfigure(configOptionName) {
			if (initialized) {
				handleError("AjaxAppender: configuration option '" +
					configOptionName +
					"' may not be set after the appender has been initialized");
				return false;
			}
			return true;
		}

		this.getSessionId = function() { return sessionId; };
		this.setSessionId = function(sessionIdParam) {
			sessionId = extractStringFromParam(sessionIdParam, null);
			this.layout.setCustomField("sessionid", sessionId);
		};

		this.setLayout = function(layoutParam) {
			if (checkCanConfigure("layout")) {
				this.layout = layoutParam;
				// Set the session id as a custom field on the layout, if not already present
				if (sessionId !== null) {
					this.setSessionId(sessionId);
				}
			}
		};

		this.isTimed = function() { return timed; };
		this.setTimed = function(timedParam) {
			if (checkCanConfigure("timed")) {
				timed = bool(timedParam);
			}
		};

		this.getTimerInterval = function() { return timerInterval; };
		this.setTimerInterval = function(timerIntervalParam) {
			if (checkCanConfigure("timerInterval")) {
				timerInterval = extractIntFromParam(timerIntervalParam, timerInterval);
			}
		};

		this.isWaitForResponse = function() { return waitForResponse; };
		this.setWaitForResponse = function(waitForResponseParam) {
			if (checkCanConfigure("waitForResponse")) {
				waitForResponse = bool(waitForResponseParam);
			}
		};

		this.getBatchSize = function() { return batchSize; };
		this.setBatchSize = function(batchSizeParam) {
			if (checkCanConfigure("batchSize")) {
				batchSize = extractIntFromParam(batchSizeParam, batchSize);
			}
		};

		this.isSendAllOnUnload = function() { return sendAllOnUnload; };
		this.setSendAllOnUnload = function(sendAllOnUnloadParam) {
			if (checkCanConfigure("sendAllOnUnload")) {
				sendAllOnUnload = extractIntFromParam(sendAllOnUnloadParam, sendAllOnUnload);
			}
		};

		this.setRequestSuccessCallback = function(requestSuccessCallbackParam) {
			requestSuccessCallback = extractFunctionFromParam(requestSuccessCallbackParam, requestSuccessCallback);
		};

		this.setFailCallback = function(failCallbackParam) {
			failCallback = extractFunctionFromParam(failCallbackParam, failCallback);
		};

		this.getPostVarName = function() { return postVarName; };
		this.setPostVarName = function(postVarNameParam) {
			if (checkCanConfigure("postVarName")) {
				postVarName = extractStringFromParam(postVarNameParam, postVarName);
			}
		};

		// Internal functions
		function sendAll() {
			if (isSupported && enabled) {
				sending = true;
				var currentRequestBatch;
				if (waitForResponse) {
					// Send the first request then use this function as the callback once
					// the response comes back
					if (queuedRequests.length > 0) {
						currentRequestBatch = queuedRequests.shift();
						sendRequest(preparePostData(currentRequestBatch), sendAll);
					} else {
						sending = false;
						if (timed) {
							scheduleSending();
						}
					}
				} else {
					// Rattle off all the requests without waiting to see the response
					while ((currentRequestBatch = queuedRequests.shift())) {
						sendRequest(preparePostData(currentRequestBatch));
					}
					sending = false;
					if (timed) {
						scheduleSending();
					}
				}
			}
		}

		this.sendAll = sendAll;

		// Called when the window unloads. At this point we're past caring about
		// waiting for responses or timers or incomplete batches - everything
		// must go, now
		function sendAllRemaining() {
			if (isSupported && enabled) {
				// Create requests for everything left over, batched as normal
				var actualBatchSize = appender.getLayout().allowBatching() ? batchSize : 1;
				var currentLoggingEvent;
				var postData = "";
				var batchedLoggingEvents = [];
				while ((currentLoggingEvent = queuedLoggingEvents.shift())) {
					batchedLoggingEvents.push(currentLoggingEvent);
					if (queuedLoggingEvents.length >= actualBatchSize) {
						// Queue this batch of log entries
						queuedRequests.push(batchedLoggingEvents);
						batchedLoggingEvents = [];
					}
				}
				// If there's a partially completed batch, add it
				if (batchedLoggingEvents.length > 0) {
					queuedRequests.push(batchedLoggingEvents);
				}
				waitForResponse = false;
				timed = false;
				sendAll();
			}
		}

		function preparePostData(batchedLoggingEvents) {
			// Format the logging events
			var formattedMessages = [];
			var currentLoggingEvent;
			var postData = "";
			while ((currentLoggingEvent = batchedLoggingEvents.shift())) {
				var currentFormattedMessage = appender.getLayout().format(currentLoggingEvent);
				if (appender.getLayout().ignoresThrowable()) {
					currentFormattedMessage += loggingEvent.getThrowableStrRep();
				}
				formattedMessages.push(currentFormattedMessage);
			}
			// Create the post data string
			if (batchedLoggingEvents.length == 1) {
				postData = formattedMessages.join("");
			} else {
				postData = appender.getLayout().batchHeader +
					formattedMessages.join(appender.getLayout().batchSeparator) +
					appender.getLayout().batchFooter;
			}
			postData = appender.getLayout().returnsPostData ? postData :
				urlEncode(postVarName) + "=" + urlEncode(postData);
			// Add the layout name to the post data
			if (postData.length > 0) {
				postData += "&";
			}
			return postData + "layout=" + urlEncode(appender.getLayout().toString());
		}

		function scheduleSending() {
			setTimeout(sendAll, timerInterval);
		}

		function xmlHttpErrorHandler() {
			var msg = "AjaxAppender: could not create XMLHttpRequest object. AjaxAppender disabled";
			handleError(msg);
			isSupported = false;
			if (failCallback) {
				failCallback(msg);
			}
		}

		function sendRequest(postData, successCallback) {
			try {
				var xmlHttp = getXmlHttp(xmlHttpErrorHandler);
				if (isSupported) {
					if (xmlHttp.overrideMimeType) {
						xmlHttp.overrideMimeType(appender.getLayout().getContentType());
					}
					xmlHttp.onreadystatechange = function() {
						if (xmlHttp.readyState == 4) {
							if (isHttpRequestSuccessful(xmlHttp)) {
								if (requestSuccessCallback) {
									requestSuccessCallback(xmlHttp);
								}
								if (successCallback) {
									successCallback(xmlHttp);
								}
							} else {
								var msg = "AjaxAppender.append: XMLHttpRequest request to URL " +
									url + " returned status code " + xmlHttp.status;
								handleError(msg);
								if (failCallback) {
									failCallback(msg);
								}
							}
							xmlHttp.onreadystatechange = emptyFunction;
							xmlHttp = null;
						}
					};
					xmlHttp.open("POST", url, true);
					try {
						xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
					} catch (headerEx) {
						var msg = "AjaxAppender.append: your browser's XMLHttpRequest implementation" +
							" does not support setRequestHeader, therefore cannot post data. AjaxAppender disabled";
						handleError(msg);
						isSupported = false;
						if (failCallback) {
							failCallback(msg);
						}
						return;
					}
					xmlHttp.send(postData);
				}
			} catch (ex) {
				var errMsg = "AjaxAppender.append: error sending log message to " + url;
				handleError(errMsg, ex);
				isSupported = false;
				if (failCallback) {
					failCallback(errMsg + ". Details: " + getExceptionStringRep(ex));
				}
			}
		}

		this.append = function(loggingEvent) {
			if (isSupported) {
				if (!initialized) {
					init();
				}
				queuedLoggingEvents.push(loggingEvent);
				var actualBatchSize = this.getLayout().allowBatching() ? batchSize : 1;

				if (queuedLoggingEvents.length >= actualBatchSize) {
					var currentLoggingEvent;
					var postData = "";
					var batchedLoggingEvents = [];
					while ((currentLoggingEvent = queuedLoggingEvents.shift())) {
						batchedLoggingEvents.push(currentLoggingEvent);
					}
					// Queue this batch of log entries
					queuedRequests.push(batchedLoggingEvents);

					// If using a timer, the queue of requests will be processed by the
					// timer function, so nothing needs to be done here.
					if (!timed) {
						if (!waitForResponse || (waitForResponse && !sending)) {
							sendAll();
						}
					}
				}
			}
		};

		function init() {
			initialized = true;
			// Add unload event to send outstanding messages
			if (sendAllOnUnload) {
				addEvent(window, "unload", sendAllRemaining);
			}
			// Start timer
			if (timed) {
				scheduleSending();
			}
		}
	}

	AjaxAppender.prototype = new Appender();

	AjaxAppender.prototype.defaults = {
		waitForResponse: false,
		timed: false,
		timerInterval: 1000,
		batchSize: 1,
		sendAllOnUnload: true,
		requestSuccessCallback: null,
		failCallback: null,
		postVarName: "data"
	};

	AjaxAppender.prototype.layout = new HttpPostDataLayout();

	AjaxAppender.prototype.toString = function() {
		return "AjaxAppender";
	};

	log4javascript.AjaxAppender = AjaxAppender;
	/* ---------------------------------------------------------------------- */
	// PopUpAppender and InPageAppender related

	function setCookie(name, value, days, path) {
	    var expires;
	    path = path ? "; path=" + path : "";
		if (days) {
			var date = new Date();
			date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
			expires = "; expires=" + date.toGMTString();
		} else {
		    expires = "";
	    }
		document.cookie = escape(name) + "=" + escape(value) + expires + path;
	}

	function getCookie(name) {
		var nameEquals = escape(name) + "=";
		var ca = document.cookie.split(";");
		for (var i = 0, len = ca.length; i < len; i++) {
			var c = ca[i];
			while (c.charAt(0) === " ") {
			    c = c.substring(1, c.length);
			}
			if (c.indexOf(nameEquals) === 0) {
			    return unescape(c.substring(nameEquals.length, c.length));
	        }
		}
		return null;
	}

	// Gets the base URL of the location of the log4javascript script.
	// This is far from infallible.
	function getBaseUrl() {
		var scripts = document.getElementsByTagName("script");
		for (var i = 0, len = scripts.length; i < len; ++i) {
			if (scripts[i].src.indexOf("log4javascript") != -1) {
				var lastSlash = scripts[i].src.lastIndexOf("/");
				return (lastSlash == -1) ? "" : scripts[i].src.substr(0, lastSlash + 1);
			}
		}
        return null;
    }

	function isLoaded(win) {
		try {
			return bool(win.loaded);
		} catch (ex) {
			return false;
		}
	}

	/* ---------------------------------------------------------------------- */
	// ConsoleAppender (prototype for PopUpAppender and InPageAppender)

	var ConsoleAppender;

	// Create an anonymous function to protect base console methods
	(function() {
		var getConsoleHtmlLines = function() {
			return [
'<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">',
'<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">',
'	<head>',
'		<title>log4javascript</title>',
'		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />',
'		<!-- Make IE8 behave like IE7, having gone to all the trouble of making IE work -->',
'		<meta http-equiv="X-UA-Compatible" content="IE=7" />',
'		<script type="text/javascript">var isIe = false, isIePre7 = false;</script>',
'		<!--[if IE]><script type="text/javascript">isIe = true</script><![endif]-->',
'		<!--[if lt IE 7]><script type="text/javascript">isIePre7 = true</script><![endif]-->',
'		<script type="text/javascript">',
'			//<![CDATA[',
'			var loggingEnabled = true;',
'			var logQueuedEventsTimer = null;',
'			var logEntries = [];',
'			var logEntriesAndSeparators = [];',
'			var logItems = [];',
'			var renderDelay = 100;',
'			var unrenderedLogItemsExist = false;',
'			var rootGroup, currentGroup = null;',
'			var loaded = false;',
'			var currentLogItem = null;',
'			var logMainContainer;',
'',
'			function copyProperties(obj, props) {',
'				for (var i in props) {',
'					obj[i] = props[i];',
'				}',
'			}',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogItem() {',
'			}',
'',
'			LogItem.prototype = {',
'				mainContainer: null,',
'				wrappedContainer: null,',
'				unwrappedContainer: null,',
'				group: null,',
'',
'				appendToLog: function() {',
'					for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'						this.elementContainers[i].appendToLog();',
'					}',
'					this.group.update();',
'				},',
'',
'				doRemove: function(doUpdate, removeFromGroup) {',
'					if (this.rendered) {',
'						for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'							this.elementContainers[i].remove();',
'						}',
'						this.unwrappedElementContainer = null;',
'						this.wrappedElementContainer = null;',
'						this.mainElementContainer = null;',
'					}',
'					if (this.group && removeFromGroup) {',
'						this.group.removeChild(this, doUpdate);',
'					}',
'					if (this === currentLogItem) {',
'						currentLogItem = null;',
'					}',
'				},',
'',
'				remove: function(doUpdate, removeFromGroup) {',
'					this.doRemove(doUpdate, removeFromGroup);',
'				},',
'',
'				render: function() {},',
'',
'				accept: function(visitor) {',
'					visitor.visit(this);',
'				},',
'',
'				getUnwrappedDomContainer: function() {',
'					return this.group.unwrappedElementContainer.contentDiv;',
'				},',
'',
'				getWrappedDomContainer: function() {',
'					return this.group.wrappedElementContainer.contentDiv;',
'				},',
'',
'				getMainDomContainer: function() {',
'					return this.group.mainElementContainer.contentDiv;',
'				}',
'			};',
'',
'			LogItem.serializedItemKeys = {LOG_ENTRY: 0, GROUP_START: 1, GROUP_END: 2};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogItemContainerElement() {',
'			}',
'',
'			LogItemContainerElement.prototype = {',
'				appendToLog: function() {',
'					var insertBeforeFirst = (newestAtTop && this.containerDomNode.hasChildNodes());',
'					if (insertBeforeFirst) {',
'						this.containerDomNode.insertBefore(this.mainDiv, this.containerDomNode.firstChild);',
'					} else {',
'						this.containerDomNode.appendChild(this.mainDiv);',
'					}',
'				}',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function SeparatorElementContainer(containerDomNode) {',
'				this.containerDomNode = containerDomNode;',
'				this.mainDiv = document.createElement("div");',
'				this.mainDiv.className = "separator";',
'				this.mainDiv.innerHTML = "&nbsp;";',
'			}',
'',
'			SeparatorElementContainer.prototype = new LogItemContainerElement();',
'',
'			SeparatorElementContainer.prototype.remove = function() {',
'				this.mainDiv.parentNode.removeChild(this.mainDiv);',
'				this.mainDiv = null;',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function Separator() {',
'				this.rendered = false;',
'			}',
'',
'			Separator.prototype = new LogItem();',
'',
'			copyProperties(Separator.prototype, {',
'				render: function() {',
'					var containerDomNode = this.group.contentDiv;',
'					if (isIe) {',
'						this.unwrappedElementContainer = new SeparatorElementContainer(this.getUnwrappedDomContainer());',
'						this.wrappedElementContainer = new SeparatorElementContainer(this.getWrappedDomContainer());',
'						this.elementContainers = [this.unwrappedElementContainer, this.wrappedElementContainer];',
'					} else {',
'						this.mainElementContainer = new SeparatorElementContainer(this.getMainDomContainer());',
'						this.elementContainers = [this.mainElementContainer];',
'					}',
'					this.content = this.formattedMessage;',
'					this.rendered = true;',
'				}',
'			});',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function GroupElementContainer(group, containerDomNode, isRoot, isWrapped) {',
'				this.group = group;',
'				this.containerDomNode = containerDomNode;',
'				this.isRoot = isRoot;',
'				this.isWrapped = isWrapped;',
'				this.expandable = false;',
'',
'				if (this.isRoot) {',
'					if (isIe) {',
'						this.contentDiv = logMainContainer.appendChild(document.createElement("div"));',
'						this.contentDiv.id = this.isWrapped ? "log_wrapped" : "log_unwrapped";',
'					} else {',
'						this.contentDiv = logMainContainer;',
'					}',
'				} else {',
'					var groupElementContainer = this;',
'					',
'					this.mainDiv = document.createElement("div");',
'					this.mainDiv.className = "group";',
'',
'					this.headingDiv = this.mainDiv.appendChild(document.createElement("div"));',
'					this.headingDiv.className = "groupheading";',
'',
'					this.expander = this.headingDiv.appendChild(document.createElement("span"));',
'					this.expander.className = "expander unselectable greyedout";',
'					this.expander.unselectable = true;',
'					var expanderText = this.group.expanded ? "-" : "+";',
'					this.expanderTextNode = this.expander.appendChild(document.createTextNode(expanderText));',
'					',
'					this.headingDiv.appendChild(document.createTextNode(" " + this.group.name));',
'',
'					this.contentDiv = this.mainDiv.appendChild(document.createElement("div"));',
'					var contentCssClass = this.group.expanded ? "expanded" : "collapsed";',
'					this.contentDiv.className = "groupcontent " + contentCssClass;',
'',
'					this.expander.onclick = function() {',
'						if (groupElementContainer.group.expandable) {',
'							groupElementContainer.group.toggleExpanded();',
'						}',
'					};',
'				}',
'			}',
'',
'			GroupElementContainer.prototype = new LogItemContainerElement();',
'',
'			copyProperties(GroupElementContainer.prototype, {',
'				toggleExpanded: function() {',
'					if (!this.isRoot) {',
'						var oldCssClass, newCssClass, expanderText;',
'						if (this.group.expanded) {',
'							newCssClass = "expanded";',
'							oldCssClass = "collapsed";',
'							expanderText = "-";',
'						} else {',
'							newCssClass = "collapsed";',
'							oldCssClass = "expanded";',
'							expanderText = "+";',
'						}',
'						replaceClass(this.contentDiv, newCssClass, oldCssClass);',
'						this.expanderTextNode.nodeValue = expanderText;',
'					}',
'				},',
'',
'				remove: function() {',
'					if (!this.isRoot) {',
'						this.headingDiv = null;',
'						this.expander.onclick = null;',
'						this.expander = null;',
'						this.expanderTextNode = null;',
'						this.contentDiv = null;',
'						this.containerDomNode = null;',
'						this.mainDiv.parentNode.removeChild(this.mainDiv);',
'						this.mainDiv = null;',
'					}',
'				},',
'',
'				reverseChildren: function() {',
'					// Invert the order of the log entries',
'					var node = null;',
'',
'					// Remove all the log container nodes',
'					var childDomNodes = [];',
'					while ((node = this.contentDiv.firstChild)) {',
'						this.contentDiv.removeChild(node);',
'						childDomNodes.push(node);',
'					}',
'',
'					// Put them all back in reverse order',
'					while ((node = childDomNodes.pop())) {',
'						this.contentDiv.appendChild(node);',
'					}',
'				},',
'',
'				update: function() {',
'					if (!this.isRoot) {',
'						if (this.group.expandable) {',
'							removeClass(this.expander, "greyedout");',
'						} else {',
'							addClass(this.expander, "greyedout");',
'						}',
'					}',
'				},',
'',
'				clear: function() {',
'					if (this.isRoot) {',
'						this.contentDiv.innerHTML = "";',
'					}',
'				}',
'			});',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function Group(name, isRoot, initiallyExpanded) {',
'				this.name = name;',
'				this.group = null;',
'				this.isRoot = isRoot;',
'				this.initiallyExpanded = initiallyExpanded;',
'				this.elementContainers = [];',
'				this.children = [];',
'				this.expanded = initiallyExpanded;',
'				this.rendered = false;',
'				this.expandable = false;',
'			}',
'',
'			Group.prototype = new LogItem();',
'',
'			copyProperties(Group.prototype, {',
'				addChild: function(logItem) {',
'					this.children.push(logItem);',
'					logItem.group = this;',
'				},',
'',
'				render: function() {',
'					if (isIe) {',
'						var unwrappedDomContainer, wrappedDomContainer;',
'						if (this.isRoot) {',
'							unwrappedDomContainer = logMainContainer;',
'							wrappedDomContainer = logMainContainer;',
'						} else {',
'							unwrappedDomContainer = this.getUnwrappedDomContainer();',
'							wrappedDomContainer = this.getWrappedDomContainer();',
'						}',
'						this.unwrappedElementContainer = new GroupElementContainer(this, unwrappedDomContainer, this.isRoot, false);',
'						this.wrappedElementContainer = new GroupElementContainer(this, wrappedDomContainer, this.isRoot, true);',
'						this.elementContainers = [this.unwrappedElementContainer, this.wrappedElementContainer];',
'					} else {',
'						var mainDomContainer = this.isRoot ? logMainContainer : this.getMainDomContainer();',
'						this.mainElementContainer = new GroupElementContainer(this, mainDomContainer, this.isRoot, false);',
'						this.elementContainers = [this.mainElementContainer];',
'					}',
'					this.rendered = true;',
'				},',
'',
'				toggleExpanded: function() {',
'					this.expanded = !this.expanded;',
'					for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'						this.elementContainers[i].toggleExpanded();',
'					}',
'				},',
'',
'				expand: function() {',
'					if (!this.expanded) {',
'						this.toggleExpanded();',
'					}',
'				},',
'',
'				accept: function(visitor) {',
'					visitor.visitGroup(this);',
'				},',
'',
'				reverseChildren: function() {',
'					if (this.rendered) {',
'						for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'							this.elementContainers[i].reverseChildren();',
'						}',
'					}',
'				},',
'',
'				update: function() {',
'					var previouslyExpandable = this.expandable;',
'					this.expandable = (this.children.length !== 0);',
'					if (this.expandable !== previouslyExpandable) {',
'						for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'							this.elementContainers[i].update();',
'						}',
'					}',
'				},',
'',
'				flatten: function() {',
'					var visitor = new GroupFlattener();',
'					this.accept(visitor);',
'					return visitor.logEntriesAndSeparators;',
'				},',
'',
'				removeChild: function(child, doUpdate) {',
'					array_remove(this.children, child);',
'					child.group = null;',
'					if (doUpdate) {',
'						this.update();',
'					}',
'				},',
'',
'				remove: function(doUpdate, removeFromGroup) {',
'					for (var i = 0, len = this.children.length; i < len; i++) {',
'						this.children[i].remove(false, false);',
'					}',
'					this.children = [];',
'					this.update();',
'					if (this === currentGroup) {',
'						currentGroup = this.group;',
'					}',
'					this.doRemove(doUpdate, removeFromGroup);',
'				},',
'',
'				serialize: function(items) {',
'					items.push([LogItem.serializedItemKeys.GROUP_START, this.name]);',
'					for (var i = 0, len = this.children.length; i < len; i++) {',
'						this.children[i].serialize(items);',
'					}',
'					if (this !== currentGroup) {',
'						items.push([LogItem.serializedItemKeys.GROUP_END]);',
'					}',
'				},',
'',
'				clear: function() {',
'					for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'						this.elementContainers[i].clear();',
'					}',
'				}',
'			});',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogEntryElementContainer() {',
'			}',
'',
'			LogEntryElementContainer.prototype = new LogItemContainerElement();',
'',
'			copyProperties(LogEntryElementContainer.prototype, {',
'				remove: function() {',
'					this.doRemove();',
'				},',
'',
'				doRemove: function() {',
'					this.mainDiv.parentNode.removeChild(this.mainDiv);',
'					this.mainDiv = null;',
'					this.contentElement = null;',
'					this.containerDomNode = null;',
'				},',
'',
'				setContent: function(content, wrappedContent) {',
'					if (content === this.formattedMessage) {',
'						this.contentElement.innerHTML = "";',
'						this.contentElement.appendChild(document.createTextNode(this.formattedMessage));',
'					} else {',
'						this.contentElement.innerHTML = content;',
'					}',
'				},',
'',
'				setSearchMatch: function(isMatch) {',
'					var oldCssClass = isMatch ? "searchnonmatch" : "searchmatch";',
'					var newCssClass = isMatch ? "searchmatch" : "searchnonmatch";',
'					replaceClass(this.mainDiv, newCssClass, oldCssClass);',
'				},',
'',
'				clearSearch: function() {',
'					removeClass(this.mainDiv, "searchmatch");',
'					removeClass(this.mainDiv, "searchnonmatch");',
'				}',
'			});',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogEntryWrappedElementContainer(logEntry, containerDomNode) {',
'				this.logEntry = logEntry;',
'				this.containerDomNode = containerDomNode;',
'				this.mainDiv = document.createElement("div");',
'				this.mainDiv.appendChild(document.createTextNode(this.logEntry.formattedMessage));',
'				this.mainDiv.className = "logentry wrapped " + this.logEntry.level;',
'				this.contentElement = this.mainDiv;',
'			}',
'',
'			LogEntryWrappedElementContainer.prototype = new LogEntryElementContainer();',
'',
'			LogEntryWrappedElementContainer.prototype.setContent = function(content, wrappedContent) {',
'				if (content === this.formattedMessage) {',
'					this.contentElement.innerHTML = "";',
'					this.contentElement.appendChild(document.createTextNode(this.formattedMessage));',
'				} else {',
'					this.contentElement.innerHTML = wrappedContent;',
'				}',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogEntryUnwrappedElementContainer(logEntry, containerDomNode) {',
'				this.logEntry = logEntry;',
'				this.containerDomNode = containerDomNode;',
'				this.mainDiv = document.createElement("div");',
'				this.mainDiv.className = "logentry unwrapped " + this.logEntry.level;',
'				this.pre = this.mainDiv.appendChild(document.createElement("pre"));',
'				this.pre.appendChild(document.createTextNode(this.logEntry.formattedMessage));',
'				this.pre.className = "unwrapped";',
'				this.contentElement = this.pre;',
'			}',
'',
'			LogEntryUnwrappedElementContainer.prototype = new LogEntryElementContainer();',
'',
'			LogEntryUnwrappedElementContainer.prototype.remove = function() {',
'				this.doRemove();',
'				this.pre = null;',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogEntryMainElementContainer(logEntry, containerDomNode) {',
'				this.logEntry = logEntry;',
'				this.containerDomNode = containerDomNode;',
'				this.mainDiv = document.createElement("div");',
'				this.mainDiv.className = "logentry nonielogentry " + this.logEntry.level;',
'				this.contentElement = this.mainDiv.appendChild(document.createElement("span"));',
'				this.contentElement.appendChild(document.createTextNode(this.logEntry.formattedMessage));',
'			}',
'',
'			LogEntryMainElementContainer.prototype = new LogEntryElementContainer();',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogEntry(level, formattedMessage) {',
'				this.level = level;',
'				this.formattedMessage = formattedMessage;',
'				this.rendered = false;',
'			}',
'',
'			LogEntry.prototype = new LogItem();',
'',
'			copyProperties(LogEntry.prototype, {',
'				render: function() {',
'					var logEntry = this;',
'					var containerDomNode = this.group.contentDiv;',
'',
'					// Support for the CSS attribute white-space in IE for Windows is',
'					// non-existent pre version 6 and slightly odd in 6, so instead',
'					// use two different HTML elements',
'					if (isIe) {',
'						this.formattedMessage = this.formattedMessage.replace(/\\r\\n/g, "\\r"); // Workaround for IE\'s treatment of white space',
'						this.unwrappedElementContainer = new LogEntryUnwrappedElementContainer(this, this.getUnwrappedDomContainer());',
'						this.wrappedElementContainer = new LogEntryWrappedElementContainer(this, this.getWrappedDomContainer());',
'						this.elementContainers = [this.unwrappedElementContainer, this.wrappedElementContainer];',
'					} else {',
'						this.mainElementContainer = new LogEntryMainElementContainer(this, this.getMainDomContainer());',
'						this.elementContainers = [this.mainElementContainer];',
'					}',
'					this.content = this.formattedMessage;',
'					this.rendered = true;',
'				},',
'',
'				setContent: function(content, wrappedContent) {',
'					if (content != this.content) {',
'						if (isIe && (content !== this.formattedMessage)) {',
'							content = content.replace(/\\r\\n/g, "\\r"); // Workaround for IE\'s treatment of white space',
'						}',
'						for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'							this.elementContainers[i].setContent(content, wrappedContent);',
'						}',
'						this.content = content;',
'					}',
'				},',
'',
'				getSearchMatches: function() {',
'					var matches = [];',
'					var i, len;',
'					if (isIe) {',
'						var unwrappedEls = getElementsByClass(this.unwrappedElementContainer.mainDiv, "searchterm", "span");',
'						var wrappedEls = getElementsByClass(this.wrappedElementContainer.mainDiv, "searchterm", "span");',
'						for (i = 0, len = unwrappedEls.length; i < len; i++) {',
'							matches[i] = new Match(this.level, null, unwrappedEls[i], wrappedEls[i]);',
'						}',
'					} else {',
'						var els = getElementsByClass(this.mainElementContainer.mainDiv, "searchterm", "span");',
'						for (i = 0, len = els.length; i < len; i++) {',
'							matches[i] = new Match(this.level, els[i]);',
'						}',
'					}',
'					return matches;',
'				},',
'',
'				setSearchMatch: function(isMatch) {',
'					for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'						this.elementContainers[i].setSearchMatch(isMatch);',
'					}',
'				},',
'',
'				clearSearch: function() {',
'					for (var i = 0, len = this.elementContainers.length; i < len; i++) {',
'						this.elementContainers[i].clearSearch();',
'					}',
'				},',
'',
'				accept: function(visitor) {',
'					visitor.visitLogEntry(this);',
'				},',
'',
'				serialize: function(items) {',
'					items.push([LogItem.serializedItemKeys.LOG_ENTRY, this.level, this.formattedMessage]);',
'				}',
'			});',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogItemVisitor() {',
'			}',
'',
'			LogItemVisitor.prototype = {',
'				visit: function(logItem) {',
'				},',
'',
'				visitParent: function(logItem) {',
'					if (logItem.group) {',
'						logItem.group.accept(this);',
'					}',
'				},',
'',
'				visitChildren: function(logItem) {',
'					for (var i = 0, len = logItem.children.length; i < len; i++) {',
'						logItem.children[i].accept(this);',
'					}',
'				},',
'',
'				visitLogEntry: function(logEntry) {',
'					this.visit(logEntry);',
'				},',
'',
'				visitSeparator: function(separator) {',
'					this.visit(separator);',
'				},',
'',
'				visitGroup: function(group) {',
'					this.visit(group);',
'				}',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function GroupFlattener() {',
'				this.logEntriesAndSeparators = [];',
'			}',
'',
'			GroupFlattener.prototype = new LogItemVisitor();',
'',
'			GroupFlattener.prototype.visitGroup = function(group) {',
'				this.visitChildren(group);',
'			};',
'',
'			GroupFlattener.prototype.visitLogEntry = function(logEntry) {',
'				this.logEntriesAndSeparators.push(logEntry);',
'			};',
'',
'			GroupFlattener.prototype.visitSeparator = function(separator) {',
'				this.logEntriesAndSeparators.push(separator);',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			window.onload = function() {',
'				// Sort out document.domain',
'				if (location.search) {',
'					var queryBits = unescape(location.search).substr(1).split("&"), nameValueBits;',
'					for (var i = 0, len = queryBits.length; i < len; i++) {',
'						nameValueBits = queryBits[i].split("=");',
'						if (nameValueBits[0] == "log4javascript_domain") {',
'							document.domain = nameValueBits[1];',
'							break;',
'						}',
'					}',
'				}',
'',
'				// Create DOM objects',
'				logMainContainer = $("log");',
'				if (isIePre7) {',
'					addClass(logMainContainer, "oldIe");',
'				}',
'',
'				rootGroup = new Group("root", true);',
'				rootGroup.render();',
'				currentGroup = rootGroup;',
'				',
'				setCommandInputWidth();',
'				setLogContainerHeight();',
'				toggleLoggingEnabled();',
'				toggleSearchEnabled();',
'				toggleSearchFilter();',
'				toggleSearchHighlight();',
'				applyFilters();',
'				checkAllLevels();',
'				toggleWrap();',
'				toggleNewestAtTop();',
'				toggleScrollToLatest();',
'				renderQueuedLogItems();',
'				loaded = true;',
'				$("command").value = "";',
'				$("command").autocomplete = "off";',
'				$("command").onkeydown = function(evt) {',
'					evt = getEvent(evt);',
'					if (evt.keyCode == 10 || evt.keyCode == 13) { // Return/Enter',
'						evalCommandLine();',
'						stopPropagation(evt);',
'					} else if (evt.keyCode == 27) { // Escape',
'						this.value = "";',
'						this.focus();',
'					} else if (evt.keyCode == 38 && commandHistory.length > 0) { // Up',
'						currentCommandIndex = Math.max(0, currentCommandIndex - 1);',
'						this.value = commandHistory[currentCommandIndex];',
'						moveCaretToEnd(this);',
'					} else if (evt.keyCode == 40 && commandHistory.length > 0) { // Down',
'						currentCommandIndex = Math.min(commandHistory.length - 1, currentCommandIndex + 1);',
'						this.value = commandHistory[currentCommandIndex];',
'						moveCaretToEnd(this);',
'					}',
'				};',
'',
'				// Prevent the keypress moving the caret in Firefox',
'				$("command").onkeypress = function(evt) {',
'					evt = getEvent(evt);',
'					if (evt.keyCode == 38 && commandHistory.length > 0 && evt.preventDefault) { // Up',
'						evt.preventDefault();',
'					}',
'				};',
'',
'				// Prevent the keyup event blurring the input in Opera',
'				$("command").onkeyup = function(evt) {',
'					evt = getEvent(evt);',
'					if (evt.keyCode == 27 && evt.preventDefault) { // Up',
'						evt.preventDefault();',
'						this.focus();',
'					}',
'				};',
'',
'				// Add document keyboard shortcuts',
'				document.onkeydown = function keyEventHandler(evt) {',
'					evt = getEvent(evt);',
'					switch (evt.keyCode) {',
'						case 69: // Ctrl + shift + E: re-execute last command',
'							if (evt.shiftKey && (evt.ctrlKey || evt.metaKey)) {',
'								evalLastCommand();',
'								cancelKeyEvent(evt);',
'								return false;',
'							}',
'							break;',
'						case 75: // Ctrl + shift + K: focus search',
'							if (evt.shiftKey && (evt.ctrlKey || evt.metaKey)) {',
'								focusSearch();',
'								cancelKeyEvent(evt);',
'								return false;',
'							}',
'							break;',
'						case 40: // Ctrl + shift + down arrow: focus command line',
'						case 76: // Ctrl + shift + L: focus command line',
'							if (evt.shiftKey && (evt.ctrlKey || evt.metaKey)) {',
'								focusCommandLine();',
'								cancelKeyEvent(evt);',
'								return false;',
'							}',
'							break;',
'					}',
'				};',
'',
'				// Workaround to make sure log div starts at the correct size',
'				setTimeout(setLogContainerHeight, 20);',
'',
'				setShowCommandLine(showCommandLine);',
'				doSearch();',
'			};',
'',
'			window.onunload = function() {',
'				if (mainWindowExists()) {',
'					appender.unload();',
'				}',
'				appender = null;',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function toggleLoggingEnabled() {',
'				setLoggingEnabled($("enableLogging").checked);',
'			}',
'',
'			function setLoggingEnabled(enable) {',
'				loggingEnabled = enable;',
'			}',
'',
'			var appender = null;',
'',
'			function setAppender(appenderParam) {',
'				appender = appenderParam;',
'			}',
'',
'			function setShowCloseButton(showCloseButton) {',
'				$("closeButton").style.display = showCloseButton ? "inline" : "none";',
'			}',
'',
'			function setShowHideButton(showHideButton) {',
'				$("hideButton").style.display = showHideButton ? "inline" : "none";',
'			}',
'',
'			var newestAtTop = false;',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function LogItemContentReverser() {',
'			}',
'			',
'			LogItemContentReverser.prototype = new LogItemVisitor();',
'			',
'			LogItemContentReverser.prototype.visitGroup = function(group) {',
'				group.reverseChildren();',
'				this.visitChildren(group);',
'			};',
'',
'			/*----------------------------------------------------------------*/',
'',
'			function setNewestAtTop(isNewestAtTop) {',
'				var oldNewestAtTop = newestAtTop;',
'				var i, iLen, j, jLen;',
'				newestAtTop = Boolean(isNewestAtTop);',
'				if (oldNewestAtTop != newestAtTop) {',
'					var visitor = new LogItemContentReverser();',
'					rootGroup.accept(visitor);',
'',
'					// Reassemble the matches array',
'					if (currentSearch) {',
'						var currentMatch = currentSearch.matches[currentMatchIndex];',
'						var matchIndex = 0;',
'						var matches = [];',
'						var actOnLogEntry = function(logEntry) {',
'							var logEntryMatches = logEntry.getSearchMatches();',
'							for (j = 0, jLen = logEntryMatches.length; j < jLen; j++) {',
'								matches[matchIndex] = logEntryMatches[j];',
'								if (currentMatch && logEntryMatches[j].equals(currentMatch)) {',
'									currentMatchIndex = matchIndex;',
'								}',
'								matchIndex++;',
'							}',
'						};',
'						if (newestAtTop) {',
'							for (i = logEntries.length - 1; i >= 0; i--) {',
'								actOnLogEntry(logEntries[i]);',
'							}',
'						} else {',
'							for (i = 0, iLen = logEntries.length; i < iLen; i++) {',
'								actOnLogEntry(logEntries[i]);',
'							}',
'						}',
'						currentSearch.matches = matches;',
'						if (currentMatch) {',
'							currentMatch.setCurrent();',
'						}',
'					} else if (scrollToLatest) {',
'						doScrollToLatest();',
'					}',
'				}',
'				$("newestAtTop").checked = isNewestAtTop;',
'			}',
'',
'			function toggleNewestAtTop() {',
'				var isNewestAtTop = $("newestAtTop").checked;',
'				setNewestAtTop(isNewestAtTop);',
'			}',
'',
'			var scrollToLatest = true;',
'',
'			function setScrollToLatest(isScrollToLatest) {',
'				scrollToLatest = isScrollToLatest;',
'				if (scrollToLatest) {',
'					doScrollToLatest();',
'				}',
'				$("scrollToLatest").checked = isScrollToLatest;',
'			}',
'',
'			function toggleScrollToLatest() {',
'				var isScrollToLatest = $("scrollToLatest").checked;',
'				setScrollToLatest(isScrollToLatest);',
'			}',
'',
'			function doScrollToLatest() {',
'				var l = logMainContainer;',
'				if (typeof l.scrollTop != "undefined") {',
'					if (newestAtTop) {',
'						l.scrollTop = 0;',
'					} else {',
'						var latestLogEntry = l.lastChild;',
'						if (latestLogEntry) {',
'							l.scrollTop = l.scrollHeight;',
'						}',
'					}',
'				}',
'			}',
'',
'			var closeIfOpenerCloses = true;',
'',
'			function setCloseIfOpenerCloses(isCloseIfOpenerCloses) {',
'				closeIfOpenerCloses = isCloseIfOpenerCloses;',
'			}',
'',
'			var maxMessages = null;',
'',
'			function setMaxMessages(max) {',
'				maxMessages = max;',
'				pruneLogEntries();',
'			}',
'',
'			var showCommandLine = false;',
'',
'			function setShowCommandLine(isShowCommandLine) {',
'				showCommandLine = isShowCommandLine;',
'				if (loaded) {',
'					$("commandLine").style.display = showCommandLine ? "block" : "none";',
'					setCommandInputWidth();',
'					setLogContainerHeight();',
'				}',
'			}',
'',
'			function focusCommandLine() {',
'				if (loaded) {',
'					$("command").focus();',
'				}',
'			}',
'',
'			function focusSearch() {',
'				if (loaded) {',
'					$("searchBox").focus();',
'				}',
'			}',
'',
'			function getLogItems() {',
'				var items = [];',
'				for (var i = 0, len = logItems.length; i < len; i++) {',
'					logItems[i].serialize(items);',
'				}',
'				return items;',
'			}',
'',
'			function setLogItems(items) {',
'				var loggingReallyEnabled = loggingEnabled;',
'				// Temporarily turn logging on',
'				loggingEnabled = true;',
'				for (var i = 0, len = items.length; i < len; i++) {',
'					switch (items[i][0]) {',
'						case LogItem.serializedItemKeys.LOG_ENTRY:',
'							log(items[i][1], items[i][2]);',
'							break;',
'						case LogItem.serializedItemKeys.GROUP_START:',
'							group(items[i][1]);',
'							break;',
'						case LogItem.serializedItemKeys.GROUP_END:',
'							groupEnd();',
'							break;',
'					}',
'				}',
'				loggingEnabled = loggingReallyEnabled;',
'			}',
'',
'			function log(logLevel, formattedMessage) {',
'				if (loggingEnabled) {',
'					var logEntry = new LogEntry(logLevel, formattedMessage);',
'					logEntries.push(logEntry);',
'					logEntriesAndSeparators.push(logEntry);',
'					logItems.push(logEntry);',
'					currentGroup.addChild(logEntry);',
'					if (loaded) {',
'						if (logQueuedEventsTimer !== null) {',
'							clearTimeout(logQueuedEventsTimer);',
'						}',
'						logQueuedEventsTimer = setTimeout(renderQueuedLogItems, renderDelay);',
'						unrenderedLogItemsExist = true;',
'					}',
'				}',
'			}',
'',
'			function renderQueuedLogItems() {',
'				logQueuedEventsTimer = null;',
'				var pruned = pruneLogEntries();',
'',
'				// Render any unrendered log entries and apply the current search to them',
'				var initiallyHasMatches = currentSearch ? currentSearch.hasMatches() : false;',
'				for (var i = 0, len = logItems.length; i < len; i++) {',
'					if (!logItems[i].rendered) {',
'						logItems[i].render();',
'						logItems[i].appendToLog();',
'						if (currentSearch && (logItems[i] instanceof LogEntry)) {',
'							currentSearch.applyTo(logItems[i]);',
'						}',
'					}',
'				}',
'				if (currentSearch) {',
'					if (pruned) {',
'						if (currentSearch.hasVisibleMatches()) {',
'							if (currentMatchIndex === null) {',
'								setCurrentMatchIndex(0);',
'							}',
'							displayMatches();',
'						} else {',
'							displayNoMatches();',
'						}',
'					} else if (!initiallyHasMatches && currentSearch.hasVisibleMatches()) {',
'						setCurrentMatchIndex(0);',
'						displayMatches();',
'					}',
'				}',
'				if (scrollToLatest) {',
'					doScrollToLatest();',
'				}',
'				unrenderedLogItemsExist = false;',
'			}',
'',
'			function pruneLogEntries() {',
'				if ((maxMessages !== null) && (logEntriesAndSeparators.length > maxMessages)) {',
'					var numberToDelete = logEntriesAndSeparators.length - maxMessages;',
'					var prunedLogEntries = logEntriesAndSeparators.slice(0, numberToDelete);',
'					if (currentSearch) {',
'						currentSearch.removeMatches(prunedLogEntries);',
'					}',
'					var group;',
'					for (var i = 0; i < numberToDelete; i++) {',
'						group = logEntriesAndSeparators[i].group;',
'						array_remove(logItems, logEntriesAndSeparators[i]);',
'						array_remove(logEntries, logEntriesAndSeparators[i]);',
'						logEntriesAndSeparators[i].remove(true, true);',
'						if (group.children.length === 0 && group !== currentGroup && group !== rootGroup) {',
'							array_remove(logItems, group);',
'							group.remove(true, true);',
'						}',
'					}',
'					logEntriesAndSeparators = array_removeFromStart(logEntriesAndSeparators, numberToDelete);',
'					return true;',
'				}',
'				return false;',
'			}',
'',
'			function group(name, startExpanded) {',
'				if (loggingEnabled) {',
'					initiallyExpanded = (typeof startExpanded === "undefined") ? true : Boolean(startExpanded);',
'					var newGroup = new Group(name, false, initiallyExpanded);',
'					currentGroup.addChild(newGroup);',
'					currentGroup = newGroup;',
'					logItems.push(newGroup);',
'					if (loaded) {',
'						if (logQueuedEventsTimer !== null) {',
'							clearTimeout(logQueuedEventsTimer);',
'						}',
'						logQueuedEventsTimer = setTimeout(renderQueuedLogItems, renderDelay);',
'						unrenderedLogItemsExist = true;',
'					}',
'				}',
'			}',
'',
'			function groupEnd() {',
'				currentGroup = (currentGroup === rootGroup) ? rootGroup : currentGroup.group;',
'			}',
'',
'			function mainPageReloaded() {',
'				currentGroup = rootGroup;',
'				var separator = new Separator();',
'				logEntriesAndSeparators.push(separator);',
'				logItems.push(separator);',
'				currentGroup.addChild(separator);',
'			}',
'',
'			function closeWindow() {',
'				if (appender && mainWindowExists()) {',
'					appender.close(true);',
'				} else {',
'					window.close();',
'				}',
'			}',
'',
'			function hide() {',
'				if (appender && mainWindowExists()) {',
'					appender.hide();',
'				}',
'			}',
'',
'			var mainWindow = window;',
'			var windowId = "log4javascriptConsoleWindow_" + new Date().getTime() + "_" + ("" + Math.random()).substr(2);',
'',
'			function setMainWindow(win) {',
'				mainWindow = win;',
'				mainWindow[windowId] = window;',
'				// If this is a pop-up, poll the opener to see if it\'s closed',
'				if (opener && closeIfOpenerCloses) {',
'					pollOpener();',
'				}',
'			}',
'',
'			function pollOpener() {',
'				if (closeIfOpenerCloses) {',
'					if (mainWindowExists()) {',
'						setTimeout(pollOpener, 500);',
'					} else {',
'						closeWindow();',
'					}',
'				}',
'			}',
'',
'			function mainWindowExists() {',
'				try {',
'					return (mainWindow && !mainWindow.closed &&',
'						mainWindow[windowId] == window);',
'				} catch (ex) {}',
'				return false;',
'			}',
'',
'			var logLevels = ["TRACE", "DEBUG", "INFO", "WARN", "ERROR", "FATAL"];',
'',
'			function getCheckBox(logLevel) {',
'				return $("switch_" + logLevel);',
'			}',
'',
'			function getIeWrappedLogContainer() {',
'				return $("log_wrapped");',
'			}',
'',
'			function getIeUnwrappedLogContainer() {',
'				return $("log_unwrapped");',
'			}',
'',
'			function applyFilters() {',
'				for (var i = 0; i < logLevels.length; i++) {',
'					if (getCheckBox(logLevels[i]).checked) {',
'						addClass(logMainContainer, logLevels[i]);',
'					} else {',
'						removeClass(logMainContainer, logLevels[i]);',
'					}',
'				}',
'				updateSearchFromFilters();',
'			}',
'',
'			function toggleAllLevels() {',
'				var turnOn = $("switch_ALL").checked;',
'				for (var i = 0; i < logLevels.length; i++) {',
'					getCheckBox(logLevels[i]).checked = turnOn;',
'					if (turnOn) {',
'						addClass(logMainContainer, logLevels[i]);',
'					} else {',
'						removeClass(logMainContainer, logLevels[i]);',
'					}',
'				}',
'			}',
'',
'			function checkAllLevels() {',
'				for (var i = 0; i < logLevels.length; i++) {',
'					if (!getCheckBox(logLevels[i]).checked) {',
'						getCheckBox("ALL").checked = false;',
'						return;',
'					}',
'				}',
'				getCheckBox("ALL").checked = true;',
'			}',
'',
'			function clearLog() {',
'				rootGroup.clear();',
'				currentGroup = rootGroup;',
'				logEntries = [];',
'				logItems = [];',
'				logEntriesAndSeparators = [];',
' 				doSearch();',
'			}',
'',
'			function toggleWrap() {',
'				var enable = $("wrap").checked;',
'				if (enable) {',
'					addClass(logMainContainer, "wrap");',
'				} else {',
'					removeClass(logMainContainer, "wrap");',
'				}',
'				refreshCurrentMatch();',
'			}',
'',
'			/* ------------------------------------------------------------------- */',
'',
'			// Search',
'',
'			var searchTimer = null;',
'',
'			function scheduleSearch() {',
'				try {',
'					clearTimeout(searchTimer);',
'				} catch (ex) {',
'					// Do nothing',
'				}',
'				searchTimer = setTimeout(doSearch, 500);',
'			}',
'',
'			function Search(searchTerm, isRegex, searchRegex, isCaseSensitive) {',
'				this.searchTerm = searchTerm;',
'				this.isRegex = isRegex;',
'				this.searchRegex = searchRegex;',
'				this.isCaseSensitive = isCaseSensitive;',
'				this.matches = [];',
'			}',
'',
'			Search.prototype = {',
'				hasMatches: function() {',
'					return this.matches.length > 0;',
'				},',
'',
'				hasVisibleMatches: function() {',
'					if (this.hasMatches()) {',
'						for (var i = 0; i < this.matches.length; i++) {',
'							if (this.matches[i].isVisible()) {',
'								return true;',
'							}',
'						}',
'					}',
'					return false;',
'				},',
'',
'				match: function(logEntry) {',
'					var entryText = String(logEntry.formattedMessage);',
'					var matchesSearch = false;',
'					if (this.isRegex) {',
'						matchesSearch = this.searchRegex.test(entryText);',
'					} else if (this.isCaseSensitive) {',
'						matchesSearch = (entryText.indexOf(this.searchTerm) > -1);',
'					} else {',
'						matchesSearch = (entryText.toLowerCase().indexOf(this.searchTerm.toLowerCase()) > -1);',
'					}',
'					return matchesSearch;',
'				},',
'',
'				getNextVisibleMatchIndex: function() {',
'					for (var i = currentMatchIndex + 1; i < this.matches.length; i++) {',
'						if (this.matches[i].isVisible()) {',
'							return i;',
'						}',
'					}',
'					// Start again from the first match',
'					for (i = 0; i <= currentMatchIndex; i++) {',
'						if (this.matches[i].isVisible()) {',
'							return i;',
'						}',
'					}',
'					return -1;',
'				},',
'',
'				getPreviousVisibleMatchIndex: function() {',
'					for (var i = currentMatchIndex - 1; i >= 0; i--) {',
'						if (this.matches[i].isVisible()) {',
'							return i;',
'						}',
'					}',
'					// Start again from the last match',
'					for (var i = this.matches.length - 1; i >= currentMatchIndex; i--) {',
'						if (this.matches[i].isVisible()) {',
'							return i;',
'						}',
'					}',
'					return -1;',
'				},',
'',
'				applyTo: function(logEntry) {',
'					var doesMatch = this.match(logEntry);',
'					if (doesMatch) {',
'						logEntry.group.expand();',
'						logEntry.setSearchMatch(true);',
'						var logEntryContent;',
'						var wrappedLogEntryContent;',
'						var searchTermReplacementStartTag = "<span class=\\\"searchterm\\\">";',
'						var searchTermReplacementEndTag = "<" + "/span>";',
'						var preTagName = isIe ? "pre" : "span";',
'						var preStartTag = "<" + preTagName + " class=\\\"pre\\\">";',
'						var preEndTag = "<" + "/" + preTagName + ">";',
'						var startIndex = 0;',
'						var searchIndex, matchedText, textBeforeMatch;',
'						if (this.isRegex) {',
'							var flags = this.isCaseSensitive ? "g" : "gi";',
'							var capturingRegex = new RegExp("(" + this.searchRegex.source + ")", flags);',
'',
'							// Replace the search term with temporary tokens for the start and end tags',
'							var rnd = ("" + Math.random()).substr(2);',
'							var startToken = "%%s" + rnd + "%%";',
'							var endToken = "%%e" + rnd + "%%";',
'							logEntryContent = logEntry.formattedMessage.replace(capturingRegex, startToken + "$1" + endToken);',
'',
'							// Escape the HTML to get rid of angle brackets',
'							logEntryContent = escapeHtml(logEntryContent);',
'',
'							// Substitute the proper HTML back in for the search match',
'							var result;',
'							var searchString = logEntryContent;',
'							logEntryContent = "";',
'							wrappedLogEntryContent = "";',
'							while ((searchIndex = searchString.indexOf(startToken, startIndex)) > -1) {',
'								var endTokenIndex = searchString.indexOf(endToken, searchIndex);',
'								matchedText = searchString.substring(searchIndex + startToken.length, endTokenIndex);',
'								textBeforeMatch = searchString.substring(startIndex, searchIndex);',
'								logEntryContent += preStartTag + textBeforeMatch + preEndTag;',
'								logEntryContent += searchTermReplacementStartTag + preStartTag + matchedText +',
'									preEndTag + searchTermReplacementEndTag;',
'								if (isIe) {',
'									wrappedLogEntryContent += textBeforeMatch + searchTermReplacementStartTag +',
'										matchedText + searchTermReplacementEndTag;',
'								}',
'								startIndex = endTokenIndex + endToken.length;',
'							}',
'							logEntryContent += preStartTag + searchString.substr(startIndex) + preEndTag;',
'							if (isIe) {',
'								wrappedLogEntryContent += searchString.substr(startIndex);',
'							}',
'						} else {',
'							logEntryContent = "";',
'							wrappedLogEntryContent = "";',
'							var searchTermReplacementLength = searchTermReplacementStartTag.length +',
'								this.searchTerm.length + searchTermReplacementEndTag.length;',
'							var searchTermLength = this.searchTerm.length;',
'							var searchTermLowerCase = this.searchTerm.toLowerCase();',
'							var logTextLowerCase = logEntry.formattedMessage.toLowerCase();',
'							while ((searchIndex = logTextLowerCase.indexOf(searchTermLowerCase, startIndex)) > -1) {',
'								matchedText = escapeHtml(logEntry.formattedMessage.substr(searchIndex, this.searchTerm.length));',
'								textBeforeMatch = escapeHtml(logEntry.formattedMessage.substring(startIndex, searchIndex));',
'								var searchTermReplacement = searchTermReplacementStartTag +',
'									preStartTag + matchedText + preEndTag + searchTermReplacementEndTag;',
'								logEntryContent += preStartTag + textBeforeMatch + preEndTag + searchTermReplacement;',
'								if (isIe) {',
'									wrappedLogEntryContent += textBeforeMatch + searchTermReplacementStartTag +',
'										matchedText + searchTermReplacementEndTag;',
'								}',
'								startIndex = searchIndex + searchTermLength;',
'							}',
'							var textAfterLastMatch = escapeHtml(logEntry.formattedMessage.substr(startIndex));',
'							logEntryContent += preStartTag + textAfterLastMatch + preEndTag;',
'							if (isIe) {',
'								wrappedLogEntryContent += textAfterLastMatch;',
'							}',
'						}',
'						logEntry.setContent(logEntryContent, wrappedLogEntryContent);',
'						var logEntryMatches = logEntry.getSearchMatches();',
'						this.matches = this.matches.concat(logEntryMatches);',
'					} else {',
'						logEntry.setSearchMatch(false);',
'						logEntry.setContent(logEntry.formattedMessage, logEntry.formattedMessage);',
'					}',
'					return doesMatch;',
'				},',
'',
'				removeMatches: function(logEntries) {',
'					var matchesToRemoveCount = 0;',
'					var currentMatchRemoved = false;',
'					var matchesToRemove = [];',
'					var i, iLen, j, jLen;',
'',
'					// Establish the list of matches to be removed',
'					for (i = 0, iLen = this.matches.length; i < iLen; i++) {',
'						for (j = 0, jLen = logEntries.length; j < jLen; j++) {',
'							if (this.matches[i].belongsTo(logEntries[j])) {',
'								matchesToRemove.push(this.matches[i]);',
'								if (i === currentMatchIndex) {',
'									currentMatchRemoved = true;',
'								}',
'							}',
'						}',
'					}',
'',
'					// Set the new current match index if the current match has been deleted',
'					// This will be the first match that appears after the first log entry being',
'					// deleted, if one exists; otherwise, it\'s the first match overall',
'					var newMatch = currentMatchRemoved ? null : this.matches[currentMatchIndex];',
'					if (currentMatchRemoved) {',
'						for (i = currentMatchIndex, iLen = this.matches.length; i < iLen; i++) {',
'							if (this.matches[i].isVisible() && !array_contains(matchesToRemove, this.matches[i])) {',
'								newMatch = this.matches[i];',
'								break;',
'							}',
'						}',
'					}',
'',
'					// Remove the matches',
'					for (i = 0, iLen = matchesToRemove.length; i < iLen; i++) {',
'						array_remove(this.matches, matchesToRemove[i]);',
'						matchesToRemove[i].remove();',
'					}',
'',
'					// Set the new match, if one exists',
'					if (this.hasVisibleMatches()) {',
'						if (newMatch === null) {',
'							setCurrentMatchIndex(0);',
'						} else {',
'							// Get the index of the new match',
'							var newMatchIndex = 0;',
'							for (i = 0, iLen = this.matches.length; i < iLen; i++) {',
'								if (newMatch === this.matches[i]) {',
'									newMatchIndex = i;',
'									break;',
'								}',
'							}',
'							setCurrentMatchIndex(newMatchIndex);',
'						}',
'					} else {',
'						currentMatchIndex = null;',
'						displayNoMatches();',
'					}',
'				}',
'			};',
'',
'			function getPageOffsetTop(el, container) {',
'				var currentEl = el;',
'				var y = 0;',
'				while (currentEl && currentEl != container) {',
'					y += currentEl.offsetTop;',
'					currentEl = currentEl.offsetParent;',
'				}',
'				return y;',
'			}',
'',
'			function scrollIntoView(el) {',
'				var logContainer = logMainContainer;',
'				// Check if the whole width of the element is visible and centre if not',
'				if (!$("wrap").checked) {',
'					var logContainerLeft = logContainer.scrollLeft;',
'					var logContainerRight = logContainerLeft  + logContainer.offsetWidth;',
'					var elLeft = el.offsetLeft;',
'					var elRight = elLeft + el.offsetWidth;',
'					if (elLeft < logContainerLeft || elRight > logContainerRight) {',
'						logContainer.scrollLeft = elLeft - (logContainer.offsetWidth - el.offsetWidth) / 2;',
'					}',
'				}',
'				// Check if the whole height of the element is visible and centre if not',
'				var logContainerTop = logContainer.scrollTop;',
'				var logContainerBottom = logContainerTop  + logContainer.offsetHeight;',
'				var elTop = getPageOffsetTop(el) - getToolBarsHeight();',
'				var elBottom = elTop + el.offsetHeight;',
'				if (elTop < logContainerTop || elBottom > logContainerBottom) {',
'					logContainer.scrollTop = elTop - (logContainer.offsetHeight - el.offsetHeight) / 2;',
'				}',
'			}',
'',
'			function Match(logEntryLevel, spanInMainDiv, spanInUnwrappedPre, spanInWrappedDiv) {',
'				this.logEntryLevel = logEntryLevel;',
'				this.spanInMainDiv = spanInMainDiv;',
'				if (isIe) {',
'					this.spanInUnwrappedPre = spanInUnwrappedPre;',
'					this.spanInWrappedDiv = spanInWrappedDiv;',
'				}',
'				this.mainSpan = isIe ? spanInUnwrappedPre : spanInMainDiv;',
'			}',
'',
'			Match.prototype = {',
'				equals: function(match) {',
'					return this.mainSpan === match.mainSpan;',
'				},',
'',
'				setCurrent: function() {',
'					if (isIe) {',
'						addClass(this.spanInUnwrappedPre, "currentmatch");',
'						addClass(this.spanInWrappedDiv, "currentmatch");',
'						// Scroll the visible one into view',
'						var elementToScroll = $("wrap").checked ? this.spanInWrappedDiv : this.spanInUnwrappedPre;',
'						scrollIntoView(elementToScroll);',
'					} else {',
'						addClass(this.spanInMainDiv, "currentmatch");',
'						scrollIntoView(this.spanInMainDiv);',
'					}',
'				},',
'',
'				belongsTo: function(logEntry) {',
'					if (isIe) {',
'						return isDescendant(this.spanInUnwrappedPre, logEntry.unwrappedPre);',
'					} else {',
'						return isDescendant(this.spanInMainDiv, logEntry.mainDiv);',
'					}',
'				},',
'',
'				setNotCurrent: function() {',
'					if (isIe) {',
'						removeClass(this.spanInUnwrappedPre, "currentmatch");',
'						removeClass(this.spanInWrappedDiv, "currentmatch");',
'					} else {',
'						removeClass(this.spanInMainDiv, "currentmatch");',
'					}',
'				},',
'',
'				isOrphan: function() {',
'					return isOrphan(this.mainSpan);',
'				},',
'',
'				isVisible: function() {',
'					return getCheckBox(this.logEntryLevel).checked;',
'				},',
'',
'				remove: function() {',
'					if (isIe) {',
'						this.spanInUnwrappedPre = null;',
'						this.spanInWrappedDiv = null;',
'					} else {',
'						this.spanInMainDiv = null;',
'					}',
'				}',
'			};',
'',
'			var currentSearch = null;',
'			var currentMatchIndex = null;',
'',
'			function doSearch() {',
'				var searchBox = $("searchBox");',
'				var searchTerm = searchBox.value;',
'				var isRegex = $("searchRegex").checked;',
'				var isCaseSensitive = $("searchCaseSensitive").checked;',
'				var i;',
'',
'				if (searchTerm === "") {',
'					$("searchReset").disabled = true;',
'					$("searchNav").style.display = "none";',
'					removeClass(document.body, "searching");',
'					removeClass(searchBox, "hasmatches");',
'					removeClass(searchBox, "nomatches");',
'					for (i = 0; i < logEntries.length; i++) {',
'						logEntries[i].clearSearch();',
'						logEntries[i].setContent(logEntries[i].formattedMessage, logEntries[i].formattedMessage);',
'					}',
'					currentSearch = null;',
'					setLogContainerHeight();',
'				} else {',
'					$("searchReset").disabled = false;',
'					$("searchNav").style.display = "block";',
'					var searchRegex;',
'					var regexValid;',
'					if (isRegex) {',
'						try {',
'							searchRegex = isCaseSensitive ? new RegExp(searchTerm, "g") : new RegExp(searchTerm, "gi");',
'							regexValid = true;',
'							replaceClass(searchBox, "validregex", "invalidregex");',
'							searchBox.title = "Valid regex";',
'						} catch (ex) {',
'							regexValid = false;',
'							replaceClass(searchBox, "invalidregex", "validregex");',
'							searchBox.title = "Invalid regex: " + (ex.message ? ex.message : (ex.description ? ex.description : "unknown error"));',
'							return;',
'						}',
'					} else {',
'						searchBox.title = "";',
'						removeClass(searchBox, "validregex");',
'						removeClass(searchBox, "invalidregex");',
'					}',
'					addClass(document.body, "searching");',
'					currentSearch = new Search(searchTerm, isRegex, searchRegex, isCaseSensitive);',
'					for (i = 0; i < logEntries.length; i++) {',
'						currentSearch.applyTo(logEntries[i]);',
'					}',
'					setLogContainerHeight();',
'',
'					// Highlight the first search match',
'					if (currentSearch.hasVisibleMatches()) {',
'						setCurrentMatchIndex(0);',
'						displayMatches();',
'					} else {',
'						displayNoMatches();',
'					}',
'				}',
'			}',
'',
'			function updateSearchFromFilters() {',
'				if (currentSearch) {',
'					if (currentSearch.hasMatches()) {',
'						if (currentMatchIndex === null) {',
'							currentMatchIndex = 0;',
'						}',
'						var currentMatch = currentSearch.matches[currentMatchIndex];',
'						if (currentMatch.isVisible()) {',
'							displayMatches();',
'							setCurrentMatchIndex(currentMatchIndex);',
'						} else {',
'							currentMatch.setNotCurrent();',
'							// Find the next visible match, if one exists',
'							var nextVisibleMatchIndex = currentSearch.getNextVisibleMatchIndex();',
'							if (nextVisibleMatchIndex > -1) {',
'								setCurrentMatchIndex(nextVisibleMatchIndex);',
'								displayMatches();',
'							} else {',
'								displayNoMatches();',
'							}',
'						}',
'					} else {',
'						displayNoMatches();',
'					}',
'				}',
'			}',
'',
'			function refreshCurrentMatch() {',
'				if (currentSearch && currentSearch.hasVisibleMatches()) {',
'					setCurrentMatchIndex(currentMatchIndex);',
'				}',
'			}',
'',
'			function displayMatches() {',
'				replaceClass($("searchBox"), "hasmatches", "nomatches");',
'				$("searchBox").title = "" + currentSearch.matches.length + " matches found";',
'				$("searchNav").style.display = "block";',
'				setLogContainerHeight();',
'			}',
'',
'			function displayNoMatches() {',
'				replaceClass($("searchBox"), "nomatches", "hasmatches");',
'				$("searchBox").title = "No matches found";',
'				$("searchNav").style.display = "none";',
'				setLogContainerHeight();',
'			}',
'',
'			function toggleSearchEnabled(enable) {',
'				enable = (typeof enable == "undefined") ? !$("searchDisable").checked : enable;',
'				$("searchBox").disabled = !enable;',
'				$("searchReset").disabled = !enable;',
'				$("searchRegex").disabled = !enable;',
'				$("searchNext").disabled = !enable;',
'				$("searchPrevious").disabled = !enable;',
'				$("searchCaseSensitive").disabled = !enable;',
'				$("searchNav").style.display = (enable && ($("searchBox").value !== "") &&',
'						currentSearch && currentSearch.hasVisibleMatches()) ?',
'					"block" : "none";',
'				if (enable) {',
'					removeClass($("search"), "greyedout");',
'					addClass(document.body, "searching");',
'					if ($("searchHighlight").checked) {',
'						addClass(logMainContainer, "searchhighlight");',
'					} else {',
'						removeClass(logMainContainer, "searchhighlight");',
'					}',
'					if ($("searchFilter").checked) {',
'						addClass(logMainContainer, "searchfilter");',
'					} else {',
'						removeClass(logMainContainer, "searchfilter");',
'					}',
'					$("searchDisable").checked = !enable;',
'				} else {',
'					addClass($("search"), "greyedout");',
'					removeClass(document.body, "searching");',
'					removeClass(logMainContainer, "searchhighlight");',
'					removeClass(logMainContainer, "searchfilter");',
'				}',
'				setLogContainerHeight();',
'			}',
'',
'			function toggleSearchFilter() {',
'				var enable = $("searchFilter").checked;',
'				if (enable) {',
'					addClass(logMainContainer, "searchfilter");',
'				} else {',
'					removeClass(logMainContainer, "searchfilter");',
'				}',
'				refreshCurrentMatch();',
'			}',
'',
'			function toggleSearchHighlight() {',
'				var enable = $("searchHighlight").checked;',
'				if (enable) {',
'					addClass(logMainContainer, "searchhighlight");',
'				} else {',
'					removeClass(logMainContainer, "searchhighlight");',
'				}',
'			}',
'',
'			function clearSearch() {',
'				$("searchBox").value = "";',
'				doSearch();',
'			}',
'',
'			function searchNext() {',
'				if (currentSearch !== null && currentMatchIndex !== null) {',
'					currentSearch.matches[currentMatchIndex].setNotCurrent();',
'					var nextMatchIndex = currentSearch.getNextVisibleMatchIndex();',
'					if (nextMatchIndex > currentMatchIndex || confirm("Reached the end of the page. Start from the top?")) {',
'						setCurrentMatchIndex(nextMatchIndex);',
'					}',
'				}',
'			}',
'',
'			function searchPrevious() {',
'				if (currentSearch !== null && currentMatchIndex !== null) {',
'					currentSearch.matches[currentMatchIndex].setNotCurrent();',
'					var previousMatchIndex = currentSearch.getPreviousVisibleMatchIndex();',
'					if (previousMatchIndex < currentMatchIndex || confirm("Reached the start of the page. Continue from the bottom?")) {',
'						setCurrentMatchIndex(previousMatchIndex);',
'					}',
'				}',
'			}',
'',
'			function setCurrentMatchIndex(index) {',
'				currentMatchIndex = index;',
'				currentSearch.matches[currentMatchIndex].setCurrent();',
'			}',
'',
'			/* ------------------------------------------------------------------------- */',
'',
'			// CSS Utilities',
'',
'			function addClass(el, cssClass) {',
'				if (!hasClass(el, cssClass)) {',
'					if (el.className) {',
'						el.className += " " + cssClass;',
'					} else {',
'						el.className = cssClass;',
'					}',
'				}',
'			}',
'',
'			function hasClass(el, cssClass) {',
'				if (el.className) {',
'					var classNames = el.className.split(" ");',
'					return array_contains(classNames, cssClass);',
'				}',
'				return false;',
'			}',
'',
'			function removeClass(el, cssClass) {',
'				if (hasClass(el, cssClass)) {',
'					// Rebuild the className property',
'					var existingClasses = el.className.split(" ");',
'					var newClasses = [];',
'					for (var i = 0, len = existingClasses.length; i < len; i++) {',
'						if (existingClasses[i] != cssClass) {',
'							newClasses[newClasses.length] = existingClasses[i];',
'						}',
'					}',
'					el.className = newClasses.join(" ");',
'				}',
'			}',
'',
'			function replaceClass(el, newCssClass, oldCssClass) {',
'				removeClass(el, oldCssClass);',
'				addClass(el, newCssClass);',
'			}',
'',
'			/* ------------------------------------------------------------------------- */',
'',
'			// Other utility functions',
'',
'			function getElementsByClass(el, cssClass, tagName) {',
'				var elements = el.getElementsByTagName(tagName);',
'				var matches = [];',
'				for (var i = 0, len = elements.length; i < len; i++) {',
'					if (hasClass(elements[i], cssClass)) {',
'						matches.push(elements[i]);',
'					}',
'				}',
'				return matches;',
'			}',
'',
'			// Syntax borrowed from Prototype library',
'			function $(id) {',
'				return document.getElementById(id);',
'			}',
'',
'			function isDescendant(node, ancestorNode) {',
'				while (node != null) {',
'					if (node === ancestorNode) {',
'						return true;',
'					}',
'					node = node.parentNode;',
'				}',
'				return false;',
'			}',
'',
'			function isOrphan(node) {',
'				var currentNode = node;',
'				while (currentNode) {',
'					if (currentNode == document.body) {',
'						return false;',
'					}',
'					currentNode = currentNode.parentNode;',
'				}',
'				return true;',
'			}',
'',
'			function escapeHtml(str) {',
'				return str.replace(/&/g, "&amp;").replace(/[<]/g, "&lt;").replace(/>/g, "&gt;");',
'			}',
'',
'			function getWindowWidth() {',
'				if (window.innerWidth) {',
'					return window.innerWidth;',
'				} else if (document.documentElement && document.documentElement.clientWidth) {',
'					return document.documentElement.clientWidth;',
'				} else if (document.body) {',
'					return document.body.clientWidth;',
'				}',
'				return 0;',
'			}',
'',
'			function getWindowHeight() {',
'				if (window.innerHeight) {',
'					return window.innerHeight;',
'				} else if (document.documentElement && document.documentElement.clientHeight) {',
'					return document.documentElement.clientHeight;',
'				} else if (document.body) {',
'					return document.body.clientHeight;',
'				}',
'				return 0;',
'			}',
'',
'			function getToolBarsHeight() {',
'				return $("switches").offsetHeight;',
'			}',
'',
'			function getChromeHeight() {',
'				var height = getToolBarsHeight();',
'				if (showCommandLine) {',
'					height += $("commandLine").offsetHeight;',
'				}',
'				return height;',
'			}',
'',
'			function setLogContainerHeight() {',
'				if (logMainContainer) {',
'					var windowHeight = getWindowHeight();',
'					$("body").style.height = getWindowHeight() + "px";',
'					logMainContainer.style.height = "" +',
'						Math.max(0, windowHeight - getChromeHeight()) + "px";',
'				}',
'			}',
'',
'			function setCommandInputWidth() {',
'				if (showCommandLine) {',
'					$("command").style.width = "" + Math.max(0, $("commandLineContainer").offsetWidth -',
'						($("evaluateButton").offsetWidth + 13)) + "px";',
'				}',
'			}',
'',
'			window.onresize = function() {',
'				setCommandInputWidth();',
'				setLogContainerHeight();',
'			};',
'',
'			if (!Array.prototype.push) {',
'				Array.prototype.push = function() {',
'			        for (var i = 0, len = arguments.length; i < len; i++){',
'			            this[this.length] = arguments[i];',
'			        }',
'			        return this.length;',
'				};',
'			}',
'',
'			if (!Array.prototype.pop) {',
'				Array.prototype.pop = function() {',
'					if (this.length > 0) {',
'						var val = this[this.length - 1];',
'						this.length = this.length - 1;',
'						return val;',
'					}',
'				};',
'			}',
'',
'			if (!Array.prototype.shift) {',
'				Array.prototype.shift = function() {',
'					if (this.length > 0) {',
'						var firstItem = this[0];',
'						for (var i = 0, len = this.length - 1; i < len; i++) {',
'							this[i] = this[i + 1];',
'						}',
'						this.length = this.length - 1;',
'						return firstItem;',
'					}',
'				};',
'			}',
'',
'			if (!Array.prototype.splice) {',
'				Array.prototype.splice = function(startIndex, deleteCount) {',
'					var itemsAfterDeleted = this.slice(startIndex + deleteCount);',
'					var itemsDeleted = this.slice(startIndex, startIndex + deleteCount);',
'					this.length = startIndex;',
'					// Copy the arguments into a proper Array object',
'					var argumentsArray = [];',
'					for (var i = 0, len = arguments.length; i < len; i++) {',
'						argumentsArray[i] = arguments[i];',
'					}',
'					var itemsToAppend = (argumentsArray.length > 2) ?',
'						itemsAfterDeleted = argumentsArray.slice(2).concat(itemsAfterDeleted) : itemsAfterDeleted;',
'					for (i = 0, len = itemsToAppend.length; i < len; i++) {',
'						this.push(itemsToAppend[i]);',
'					}',
'					return itemsDeleted;',
'				};',
'			}',
'',
'			function array_remove(arr, val) {',
'				var index = -1;',
'				for (var i = 0, len = arr.length; i < len; i++) {',
'					if (arr[i] === val) {',
'						index = i;',
'						break;',
'					}',
'				}',
'				if (index >= 0) {',
'					arr.splice(index, 1);',
'					return index;',
'				} else {',
'					return false;',
'				}',
'			}',
'',
'			function array_removeFromStart(array, numberToRemove) {',
'				if (Array.prototype.splice) {',
'					array.splice(0, numberToRemove);',
'				} else {',
'					for (var i = numberToRemove, len = array.length; i < len; i++) {',
'						array[i - numberToRemove] = array[i];',
'					}',
'					array.length = array.length - numberToRemove;',
'				}',
'				return array;',
'			}',
'',
'			function array_contains(arr, val) {',
'				for (var i = 0, len = arr.length; i < len; i++) {',
'					if (arr[i] == val) {',
'						return true;',
'					}',
'				}',
'				return false;',
'			}',
'',
'			function getErrorMessage(ex) {',
'				if (ex.message) {',
'					return ex.message;',
'				} else if (ex.description) {',
'					return ex.description;',
'				}',
'				return "" + ex;',
'			}',
'',
'			function moveCaretToEnd(input) {',
'				if (input.setSelectionRange) {',
'					input.focus();',
'					var length = input.value.length;',
'					input.setSelectionRange(length, length);',
'				} else if (input.createTextRange) {',
'					var range = input.createTextRange();',
'					range.collapse(false);',
'					range.select();',
'				}',
'				input.focus();',
'			}',
'',
'			function stopPropagation(evt) {',
'				if (evt.stopPropagation) {',
'					evt.stopPropagation();',
'				} else if (typeof evt.cancelBubble != "undefined") {',
'					evt.cancelBubble = true;',
'				}',
'			}',
'',
'			function getEvent(evt) {',
'				return evt ? evt : event;',
'			}',
'',
'			function getTarget(evt) {',
'				return evt.target ? evt.target : evt.srcElement;',
'			}',
'',
'			function getRelatedTarget(evt) {',
'				if (evt.relatedTarget) {',
'					return evt.relatedTarget;',
'				} else if (evt.srcElement) {',
'					switch(evt.type) {',
'						case "mouseover":',
'							return evt.fromElement;',
'						case "mouseout":',
'							return evt.toElement;',
'						default:',
'							return evt.srcElement;',
'					}',
'				}',
'			}',
'',
'			function cancelKeyEvent(evt) {',
'				evt.returnValue = false;',
'				stopPropagation(evt);',
'			}',
'',
'			function evalCommandLine() {',
'				var expr = $("command").value;',
'				evalCommand(expr);',
'				$("command").value = "";',
'			}',
'',
'			function evalLastCommand() {',
'				if (lastCommand != null) {',
'					evalCommand(lastCommand);',
'				}',
'			}',
'',
'			var lastCommand = null;',
'			var commandHistory = [];',
'			var currentCommandIndex = 0;',
'',
'			function evalCommand(expr) {',
'				if (appender) {',
'					appender.evalCommandAndAppend(expr);',
'				} else {',
'					var prefix = ">>> " + expr + "\\r\\n";',
'					try {',
'						log("INFO", prefix + eval(expr));',
'					} catch (ex) {',
'						log("ERROR", prefix + "Error: " + getErrorMessage(ex));',
'					}',
'				}',
'				// Update command history',
'				if (expr != commandHistory[commandHistory.length - 1]) {',
'					commandHistory.push(expr);',
'					// Update the appender',
'					if (appender) {',
'						appender.storeCommandHistory(commandHistory);',
'					}',
'				}',
'				currentCommandIndex = (expr == commandHistory[currentCommandIndex]) ? currentCommandIndex + 1 : commandHistory.length;',
'				lastCommand = expr;',
'			}',
'			//]]>',
'		</script>',
'		<style type="text/css">',
'			body {',
'				background-color: white;',
'				color: black;',
'				padding: 0;',
'				margin: 0;',
'				font-family: tahoma, verdana, arial, helvetica, sans-serif;',
'				overflow: hidden;',
'			}',
'',
'			div#switchesContainer input {',
'				margin-bottom: 0;',
'			}',
'',
'			div.toolbar {',
'				border-top: solid #ffffff 1px;',
'				border-bottom: solid #aca899 1px;',
'				background-color: #f1efe7;',
'				padding: 3px 5px;',
'				font-size: 68.75%;',
'			}',
'',
'			div.toolbar, div#search input {',
'				font-family: tahoma, verdana, arial, helvetica, sans-serif;',
'			}',
'',
'			div.toolbar input.button {',
'				padding: 0 5px;',
'				font-size: 100%;',
'			}',
'',
'			div.toolbar input.hidden {',
'				display: none;',
'			}',
'',
'			div#switches input#clearButton {',
'				margin-left: 20px;',
'			}',
'',
'			div#levels label {',
'				font-weight: bold;',
'			}',
'',
'			div#levels label, div#options label {',
'				margin-right: 5px;',
'			}',
'',
'			div#levels label#wrapLabel {',
'				font-weight: normal;',
'			}',
'',
'			div#search label {',
'				margin-right: 10px;',
'			}',
'',
'			div#search label.searchboxlabel {',
'				margin-right: 0;',
'			}',
'',
'			div#search input {',
'				font-size: 100%;',
'			}',
'',
'			div#search input.validregex {',
'				color: green;',
'			}',
'',
'			div#search input.invalidregex {',
'				color: red;',
'			}',
'',
'			div#search input.nomatches {',
'				color: white;',
'				background-color: #ff6666;',
'			}',
'',
'			div#search input.nomatches {',
'				color: white;',
'				background-color: #ff6666;',
'			}',
'',
'			div#searchNav {',
'				display: none;',
'			}',
'',
'			div#commandLine {',
'				display: none;',
'			}',
'',
'			div#commandLine input#command {',
'				font-size: 100%;',
'				font-family: Courier New, Courier;',
'			}',
'',
'			div#commandLine input#evaluateButton {',
'			}',
'',
'			*.greyedout {',
'				color: gray !important;',
'				border-color: gray !important;',
'			}',
'',
'			*.greyedout *.alwaysenabled { color: black; }',
'',
'			*.unselectable {',
'				-khtml-user-select: none;',
'				-moz-user-select: none;',
'				user-select: none;',
'			}',
'',
'			div#log {',
'				font-family: Courier New, Courier;',
'				font-size: 75%;',
'				width: 100%;',
'				overflow: auto;',
'				clear: both;',
'				position: relative;',
'			}',
'',
'			div.group {',
'				border-color: #cccccc;',
'				border-style: solid;',
'				border-width: 1px 0 1px 1px;',
'				overflow: visible;',
'			}',
'',
'			div.oldIe div.group, div.oldIe div.group *, div.oldIe *.logentry {',
'				height: 1%;',
'			}',
'',
'			div.group div.groupheading span.expander {',
'				border: solid black 1px;',
'				font-family: Courier New, Courier;',
'				font-size: 0.833em;',
'				background-color: #eeeeee;',
'				position: relative;',
'				top: -1px;',
'				color: black;',
'				padding: 0 2px;',
'				cursor: pointer;',
'				cursor: hand;',
'				height: 1%;',
'			}',
'',
'			div.group div.groupcontent {',
'				margin-left: 10px;',
'				padding-bottom: 2px;',
'				overflow: visible;',
'			}',
'',
'			div.group div.expanded {',
'				display: block;',
'			}',
'',
'			div.group div.collapsed {',
'				display: none;',
'			}',
'',
'			*.logentry {',
'				overflow: visible;',
'				display: none;',
'				white-space: pre;',
'			}',
'',
'			span.pre {',
'				white-space: pre;',
'			}',
'			',
'			pre.unwrapped {',
'				display: inline !important;',
'			}',
'',
'			pre.unwrapped pre.pre, div.wrapped pre.pre {',
'				display: inline;',
'			}',
'',
'			div.wrapped pre.pre {',
'				white-space: normal;',
'			}',
'',
'			div.wrapped {',
'				display: none;',
'			}',
'',
'			body.searching *.logentry span.currentmatch {',
'				color: white !important;',
'				background-color: green !important;',
'			}',
'',
'			body.searching div.searchhighlight *.logentry span.searchterm {',
'				color: black;',
'				background-color: yellow;',
'			}',
'',
'			div.wrap *.logentry {',
'				white-space: normal !important;',
'				border-width: 0 0 1px 0;',
'				border-color: #dddddd;',
'				border-style: dotted;',
'			}',
'',
'			div.wrap #log_wrapped, #log_unwrapped {',
'				display: block;',
'			}',
'',
'			div.wrap #log_unwrapped, #log_wrapped {',
'				display: none;',
'			}',
'',
'			div.wrap *.logentry span.pre {',
'				overflow: visible;',
'				white-space: normal;',
'			}',
'',
'			div.wrap *.logentry pre.unwrapped {',
'				display: none;',
'			}',
'',
'			div.wrap *.logentry span.wrapped {',
'				display: inline;',
'			}',
'',
'			div.searchfilter *.searchnonmatch {',
'				display: none !important;',
'			}',
'',
'			div#log *.TRACE, label#label_TRACE {',
'				color: #666666;',
'			}',
'',
'			div#log *.DEBUG, label#label_DEBUG {',
'				color: green;',
'			}',
'',
'			div#log *.INFO, label#label_INFO {',
'				color: #000099;',
'			}',
'',
'			div#log *.WARN, label#label_WARN {',
'				color: #999900;',
'			}',
'',
'			div#log *.ERROR, label#label_ERROR {',
'				color: red;',
'			}',
'',
'			div#log *.FATAL, label#label_FATAL {',
'				color: #660066;',
'			}',
'',
'			div.TRACE#log *.TRACE,',
'			div.DEBUG#log *.DEBUG,',
'			div.INFO#log *.INFO,',
'			div.WARN#log *.WARN,',
'			div.ERROR#log *.ERROR,',
'			div.FATAL#log *.FATAL {',
'				display: block;',
'			}',
'',
'			div#log div.separator {',
'				background-color: #cccccc;',
'				margin: 5px 0;',
'				line-height: 1px;',
'			}',
'		</style>',
'	</head>',
'',
'	<body id="body">',
'		<div id="switchesContainer">',
'			<div id="switches">',
'				<div id="levels" class="toolbar">',
'					Filters:',
'					<input type="checkbox" id="switch_TRACE" onclick="applyFilters(); checkAllLevels()" checked="checked" title="Show/hide trace messages" /><label for="switch_TRACE" id="label_TRACE">trace</label>',
'					<input type="checkbox" id="switch_DEBUG" onclick="applyFilters(); checkAllLevels()" checked="checked" title="Show/hide debug messages" /><label for="switch_DEBUG" id="label_DEBUG">debug</label>',
'					<input type="checkbox" id="switch_INFO" onclick="applyFilters(); checkAllLevels()" checked="checked" title="Show/hide info messages" /><label for="switch_INFO" id="label_INFO">info</label>',
'					<input type="checkbox" id="switch_WARN" onclick="applyFilters(); checkAllLevels()" checked="checked" title="Show/hide warn messages" /><label for="switch_WARN" id="label_WARN">warn</label>',
'					<input type="checkbox" id="switch_ERROR" onclick="applyFilters(); checkAllLevels()" checked="checked" title="Show/hide error messages" /><label for="switch_ERROR" id="label_ERROR">error</label>',
'					<input type="checkbox" id="switch_FATAL" onclick="applyFilters(); checkAllLevels()" checked="checked" title="Show/hide fatal messages" /><label for="switch_FATAL" id="label_FATAL">fatal</label>',
'					<input type="checkbox" id="switch_ALL" onclick="toggleAllLevels(); applyFilters()" checked="checked" title="Show/hide all messages" /><label for="switch_ALL" id="label_ALL">all</label>',
'				</div>',
'				<div id="search" class="toolbar">',
'					<label for="searchBox" class="searchboxlabel">Search:</label> <input type="text" id="searchBox" onclick="toggleSearchEnabled(true)" onkeyup="scheduleSearch()" size="20" />',
'					<input type="button" id="searchReset" disabled="disabled" value="Reset" onclick="clearSearch()" class="button" title="Reset the search" />',
'					<input type="checkbox" id="searchRegex" onclick="doSearch()" title="If checked, search is treated as a regular expression" /><label for="searchRegex">Regex</label>',
'					<input type="checkbox" id="searchCaseSensitive" onclick="doSearch()" title="If checked, search is case sensitive" /><label for="searchCaseSensitive">Match case</label>',
'					<input type="checkbox" id="searchDisable" onclick="toggleSearchEnabled()" title="Enable/disable search" /><label for="searchDisable" class="alwaysenabled">Disable</label>',
'					<div id="searchNav">',
'						<input type="button" id="searchNext" disabled="disabled" value="Next" onclick="searchNext()" class="button" title="Go to the next matching log entry" />',
'						<input type="button" id="searchPrevious" disabled="disabled" value="Previous" onclick="searchPrevious()" class="button" title="Go to the previous matching log entry" />',
'						<input type="checkbox" id="searchFilter" onclick="toggleSearchFilter()" title="If checked, non-matching log entries are filtered out" /><label for="searchFilter">Filter</label>',
'						<input type="checkbox" id="searchHighlight" onclick="toggleSearchHighlight()" title="Highlight matched search terms" /><label for="searchHighlight" class="alwaysenabled">Highlight all</label>',
'					</div>',
'				</div>',
'				<div id="options" class="toolbar">',
'					Options:',
'					<input type="checkbox" id="enableLogging" onclick="toggleLoggingEnabled()" checked="checked" title="Enable/disable logging" /><label for="enableLogging" id="enableLoggingLabel">Log</label>',
'					<input type="checkbox" id="wrap" onclick="toggleWrap()" title="Enable / disable word wrap" /><label for="wrap" id="wrapLabel">Wrap</label>',
'					<input type="checkbox" id="newestAtTop" onclick="toggleNewestAtTop()" title="If checked, causes newest messages to appear at the top" /><label for="newestAtTop" id="newestAtTopLabel">Newest at the top</label>',
'					<input type="checkbox" id="scrollToLatest" onclick="toggleScrollToLatest()" checked="checked" title="If checked, window automatically scrolls to a new message when it is added" /><label for="scrollToLatest" id="scrollToLatestLabel">Scroll to latest</label>',
'					<input type="button" id="clearButton" value="Clear" onclick="clearLog()" class="button" title="Clear all log messages"  />',
'					<input type="button" id="hideButton" value="Hide" onclick="hide()" class="hidden button" title="Hide the console" />',
'					<input type="button" id="closeButton" value="Close" onclick="closeWindow()" class="hidden button" title="Close the window" />',
'				</div>',
'			</div>',
'		</div>',
'		<div id="log" class="TRACE DEBUG INFO WARN ERROR FATAL"></div>',
'		<div id="commandLine" class="toolbar">',
'			<div id="commandLineContainer">',
'				<input type="text" id="command" title="Enter a JavaScript command here and hit return or press \'Evaluate\'" />',
'				<input type="button" id="evaluateButton" value="Evaluate" class="button" title="Evaluate the command" onclick="evalCommandLine()" />',
'			</div>',
'		</div>',
'	</body>',
'</html>',
''
];
		};

		var defaultCommandLineFunctions = [];

		ConsoleAppender = function() {};

		var consoleAppenderIdCounter = 1;
		ConsoleAppender.prototype = new Appender();

		ConsoleAppender.prototype.create = function(inPage, container,
				lazyInit, initiallyMinimized, useDocumentWrite, width, height, focusConsoleWindow) {
			var appender = this;

			// Common properties
			var initialized = false;
			var consoleWindowCreated = false;
			var consoleWindowLoaded = false;
			var consoleClosed = false;

			var queuedLoggingEvents = [];
			var isSupported = true;
			var consoleAppenderId = consoleAppenderIdCounter++;

			// Local variables
			initiallyMinimized = extractBooleanFromParam(initiallyMinimized, this.defaults.initiallyMinimized);
			lazyInit = extractBooleanFromParam(lazyInit, this.defaults.lazyInit);
			useDocumentWrite = extractBooleanFromParam(useDocumentWrite, this.defaults.useDocumentWrite);
			var newestMessageAtTop = this.defaults.newestMessageAtTop;
			var scrollToLatestMessage = this.defaults.scrollToLatestMessage;
			width = width ? width : this.defaults.width;
			height = height ? height : this.defaults.height;
			var maxMessages = this.defaults.maxMessages;
			var showCommandLine = this.defaults.showCommandLine;
			var commandLineObjectExpansionDepth = this.defaults.commandLineObjectExpansionDepth;
			var showHideButton = this.defaults.showHideButton;
            var showCloseButton = this.defaults.showCloseButton;
            var showLogEntryDeleteButtons = this.defaults.showLogEntryDeleteButtons;

			this.setLayout(this.defaults.layout);

			// Functions whose implementations vary between subclasses
			var init, createWindow, safeToAppend, getConsoleWindow, open;

			// Configuration methods. The function scope is used to prevent
			// direct alteration to the appender configuration properties.
			var appenderName = inPage ? "InPageAppender" : "PopUpAppender";
			var checkCanConfigure = function(configOptionName) {
				if (consoleWindowCreated) {
					handleError(appenderName + ": configuration option '" + configOptionName + "' may not be set after the appender has been initialized");
					return false;
				}
				return true;
			};

			var consoleWindowExists = function() {
				return (consoleWindowLoaded && isSupported && !consoleClosed);
			};

			this.isNewestMessageAtTop = function() { return newestMessageAtTop; };
			this.setNewestMessageAtTop = function(newestMessageAtTopParam) {
				newestMessageAtTop = bool(newestMessageAtTopParam);
				if (consoleWindowExists()) {
					getConsoleWindow().setNewestAtTop(newestMessageAtTop);
				}
			};

			this.isScrollToLatestMessage = function() { return scrollToLatestMessage; };
			this.setScrollToLatestMessage = function(scrollToLatestMessageParam) {
				scrollToLatestMessage = bool(scrollToLatestMessageParam);
				if (consoleWindowExists()) {
					getConsoleWindow().setScrollToLatest(scrollToLatestMessage);
				}
			};

			this.getWidth = function() { return width; };
			this.setWidth = function(widthParam) {
				if (checkCanConfigure("width")) {
					width = extractStringFromParam(widthParam, width);
				}
			};

			this.getHeight = function() { return height; };
			this.setHeight = function(heightParam) {
				if (checkCanConfigure("height")) {
					height = extractStringFromParam(heightParam, height);
				}
			};

			this.getMaxMessages = function() { return maxMessages; };
			this.setMaxMessages = function(maxMessagesParam) {
				maxMessages = extractIntFromParam(maxMessagesParam, maxMessages);
				if (consoleWindowExists()) {
					getConsoleWindow().setMaxMessages(maxMessages);
				}
			};

			this.isShowCommandLine = function() { return showCommandLine; };
			this.setShowCommandLine = function(showCommandLineParam) {
				showCommandLine = bool(showCommandLineParam);
				if (consoleWindowExists()) {
					getConsoleWindow().setShowCommandLine(showCommandLine);
				}
			};

			this.isShowHideButton = function() { return showHideButton; };
			this.setShowHideButton = function(showHideButtonParam) {
				showHideButton = bool(showHideButtonParam);
				if (consoleWindowExists()) {
					getConsoleWindow().setShowHideButton(showHideButton);
				}
			};

			this.isShowCloseButton = function() { return showCloseButton; };
			this.setShowCloseButton = function(showCloseButtonParam) {
				showCloseButton = bool(showCloseButtonParam);
				if (consoleWindowExists()) {
					getConsoleWindow().setShowCloseButton(showCloseButton);
				}
			};

			this.getCommandLineObjectExpansionDepth = function() { return commandLineObjectExpansionDepth; };
			this.setCommandLineObjectExpansionDepth = function(commandLineObjectExpansionDepthParam) {
				commandLineObjectExpansionDepth = extractIntFromParam(commandLineObjectExpansionDepthParam, commandLineObjectExpansionDepth);
			};

			var minimized = initiallyMinimized;
			this.isInitiallyMinimized = function() { return initiallyMinimized; };
			this.setInitiallyMinimized = function(initiallyMinimizedParam) {
				if (checkCanConfigure("initiallyMinimized")) {
					initiallyMinimized = bool(initiallyMinimizedParam);
					minimized = initiallyMinimized;
				}
			};

			this.isUseDocumentWrite = function() { return useDocumentWrite; };
			this.setUseDocumentWrite = function(useDocumentWriteParam) {
				if (checkCanConfigure("useDocumentWrite")) {
					useDocumentWrite = bool(useDocumentWriteParam);
				}
			};

			// Common methods
			function QueuedLoggingEvent(loggingEvent, formattedMessage) {
				this.loggingEvent = loggingEvent;
				this.levelName = loggingEvent.level.name;
				this.formattedMessage = formattedMessage;
			}

			QueuedLoggingEvent.prototype.append = function() {
				getConsoleWindow().log(this.levelName, this.formattedMessage);
			};

			function QueuedGroup(name, initiallyExpanded) {
				this.name = name;
				this.initiallyExpanded = initiallyExpanded;
			}

			QueuedGroup.prototype.append = function() {
				getConsoleWindow().group(this.name, this.initiallyExpanded);
			};

			function QueuedGroupEnd() {}

			QueuedGroupEnd.prototype.append = function() {
				getConsoleWindow().groupEnd();
			};

			var checkAndAppend = function() {
				// Next line forces a check of whether the window has been closed
				safeToAppend();
				if (!initialized) {
					init();
				} else if (consoleClosed && reopenWhenClosed) {
					createWindow();
				}
				if (safeToAppend()) {
					appendQueuedLoggingEvents();
				}
			};

			this.append = function(loggingEvent) {
				if (isSupported) {
					// Format the message
					var formattedMessage = appender.getLayout().format(loggingEvent);
					if (this.getLayout().ignoresThrowable()) {
						formattedMessage += loggingEvent.getThrowableStrRep();
					}
					queuedLoggingEvents.push(new QueuedLoggingEvent(loggingEvent, formattedMessage));
					checkAndAppend();
				}
			};

            this.group = function(name, initiallyExpanded) {
				if (isSupported) {
					queuedLoggingEvents.push(new QueuedGroup(name, initiallyExpanded));
					checkAndAppend();
				}
			};

            this.groupEnd = function() {
				if (isSupported) {
					queuedLoggingEvents.push(new QueuedGroupEnd());
					checkAndAppend();
				}
			};

			var appendQueuedLoggingEvents = function() {
				var currentLoggingEvent;
				while (queuedLoggingEvents.length > 0) {
					queuedLoggingEvents.shift().append();
				}
				if (focusConsoleWindow) {
					getConsoleWindow().focus();
				}
			};

			this.setAddedToLogger = function(logger) {
				this.loggers.push(logger);
				if (enabled && !lazyInit) {
					init();
				}
			};

			this.clear = function() {
				if (consoleWindowExists()) {
					getConsoleWindow().clearLog();
				}
				queuedLoggingEvents.length = 0;
			};

			this.focus = function() {
				if (consoleWindowExists()) {
					getConsoleWindow().focus();
				}
			};

			this.focusCommandLine = function() {
				if (consoleWindowExists()) {
					getConsoleWindow().focusCommandLine();
				}
			};

			this.focusSearch = function() {
				if (consoleWindowExists()) {
					getConsoleWindow().focusSearch();
				}
			};

			var commandWindow = window;

			this.getCommandWindow = function() { return commandWindow; };
			this.setCommandWindow = function(commandWindowParam) {
				commandWindow = commandWindowParam;
			};

			this.executeLastCommand = function() {
				if (consoleWindowExists()) {
					getConsoleWindow().evalLastCommand();
				}
			};

			var commandLayout = new PatternLayout("%m");
			this.getCommandLayout = function() { return commandLayout; };
			this.setCommandLayout = function(commandLayoutParam) {
				commandLayout = commandLayoutParam;
			};

			this.evalCommandAndAppend = function(expr) {
				var commandReturnValue = { appendResult: true, isError: false };
				var commandOutput = "";
				// Evaluate the command
				try {
					var result, i;
					// The next three lines constitute a workaround for IE. Bizarrely, iframes seem to have no
					// eval method on the window object initially, but once execScript has been called on
					// it once then the eval method magically appears. See http://www.thismuchiknow.co.uk/?p=25
					if (!commandWindow.eval && commandWindow.execScript) {
						commandWindow.execScript("null");
					}

					var commandLineFunctionsHash = {};
					for (i = 0, len = commandLineFunctions.length; i < len; i++) {
						commandLineFunctionsHash[commandLineFunctions[i][0]] = commandLineFunctions[i][1];
					}

					// Keep an array of variables that are being changed in the command window so that they
					// can be restored to their original values afterwards
					var objectsToRestore = [];
					var addObjectToRestore = function(name) {
						objectsToRestore.push([name, commandWindow[name]]);
					};

					addObjectToRestore("appender");
					commandWindow.appender = appender;

					addObjectToRestore("commandReturnValue");
					commandWindow.commandReturnValue = commandReturnValue;

					addObjectToRestore("commandLineFunctionsHash");
					commandWindow.commandLineFunctionsHash = commandLineFunctionsHash;

					var addFunctionToWindow = function(name) {
						addObjectToRestore(name);
						commandWindow[name] = function() {
							return this.commandLineFunctionsHash[name](appender, arguments, commandReturnValue);
						};
					};

					for (i = 0, len = commandLineFunctions.length; i < len; i++) {
						addFunctionToWindow(commandLineFunctions[i][0]);
					}

					// Another bizarre workaround to get IE to eval in the global scope
					if (commandWindow === window && commandWindow.execScript) {
						addObjectToRestore("evalExpr");
						addObjectToRestore("result");
						window.evalExpr = expr;
						commandWindow.execScript("window.result=eval(window.evalExpr);");
						result = window.result;
 					} else {
 						result = commandWindow.eval(expr);
 					}
					commandOutput = isUndefined(result) ? result : formatObjectExpansion(result, commandLineObjectExpansionDepth);

					// Restore variables in the command window to their original state
					for (i = 0, len = objectsToRestore.length; i < len; i++) {
						commandWindow[objectsToRestore[i][0]] = objectsToRestore[i][1];
					}
				} catch (ex) {
					commandOutput = "Error evaluating command: " + getExceptionStringRep(ex);
					commandReturnValue.isError = true;
				}
				// Append command output
				if (commandReturnValue.appendResult) {
					var message = ">>> " + expr;
					if (!isUndefined(commandOutput)) {
						message += newLine + commandOutput;
					}
					var level = commandReturnValue.isError ? Level.ERROR : Level.INFO;
					var loggingEvent = new LoggingEvent(null, new Date(), level, [message], null);
					var mainLayout = this.getLayout();
					this.setLayout(commandLayout);
					this.append(loggingEvent);
					this.setLayout(mainLayout);
				}
			};

			var commandLineFunctions = defaultCommandLineFunctions.concat([]);

			this.addCommandLineFunction = function(functionName, commandLineFunction) {
				commandLineFunctions.push([functionName, commandLineFunction]);
			};

			var commandHistoryCookieName = "log4javascriptCommandHistory";
			this.storeCommandHistory = function(commandHistory) {
				setCookie(commandHistoryCookieName, commandHistory.join(","));
			};

			var writeHtml = function(doc) {
				var lines = getConsoleHtmlLines();
				doc.open();
				for (var i = 0, len = lines.length; i < len; i++) {
					doc.writeln(lines[i]);
				}
				doc.close();
			};

			// Set up event listeners
			this.setEventTypes(["load", "unload"]);

			var consoleWindowLoadHandler = function() {
				var win = getConsoleWindow();
				win.setAppender(appender);
				win.setNewestAtTop(newestMessageAtTop);
				win.setScrollToLatest(scrollToLatestMessage);
				win.setMaxMessages(maxMessages);
				win.setShowCommandLine(showCommandLine);
				win.setShowHideButton(showHideButton);
				win.setShowCloseButton(showCloseButton);
				win.setMainWindow(window);

				// Restore command history stored in cookie
				var storedValue = getCookie(commandHistoryCookieName);
				if (storedValue) {
					win.commandHistory = storedValue.split(",");
					win.currentCommandIndex = win.commandHistory.length;
				}

				appender.dispatchEvent("load", { "win" : win });
			};

			this.unload = function() {
				logLog.debug("unload " + this + ", caller: " + this.unload.caller);
				if (!consoleClosed) {
					logLog.debug("really doing unload " + this);
					consoleClosed = true;
					consoleWindowLoaded = false;
					consoleWindowCreated = false;
					appender.dispatchEvent("unload", {});
				}
			};

			var pollConsoleWindow = function(windowTest, interval, successCallback, errorMessage) {
				function doPoll() {
					try {
						// Test if the console has been closed while polling
						if (consoleClosed) {
							clearInterval(poll);
						}
						if (windowTest(getConsoleWindow())) {
							clearInterval(poll);
							successCallback();
						}
					} catch (ex) {
						clearInterval(poll);
						isSupported = false;
						handleError(errorMessage, ex);
					}
				}

				// Poll the pop-up since the onload event is not reliable
				var poll = setInterval(doPoll, interval);
			};

			var getConsoleUrl = function() {
				var documentDomainSet = (document.domain != location.hostname);
				return useDocumentWrite ? "" : getBaseUrl() + "console_uncompressed.html" +
											   (documentDomainSet ? "?log4javascript_domain=" + escape(document.domain) : "");
			};

			// Define methods and properties that vary between subclasses
			if (inPage) {
				// InPageAppender

				var containerElement = null;

				// Configuration methods. The function scope is used to prevent
				// direct alteration to the appender configuration properties.
				var cssProperties = [];
				this.addCssProperty = function(name, value) {
					if (checkCanConfigure("cssProperties")) {
						cssProperties.push([name, value]);
					}
				};

				// Define useful variables
				var windowCreationStarted = false;
				var iframeContainerDiv;
				var iframeId = uniqueId + "_InPageAppender_" + consoleAppenderId;

				this.hide = function() {
					if (initialized && consoleWindowCreated) {
						if (consoleWindowExists()) {
							getConsoleWindow().$("command").blur();
						}
						iframeContainerDiv.style.display = "none";
						minimized = true;
					}
				};

				this.show = function() {
					if (initialized) {
						if (consoleWindowCreated) {
							iframeContainerDiv.style.display = "block";
							this.setShowCommandLine(showCommandLine); // Force IE to update
							minimized = false;
						} else if (!windowCreationStarted) {
							createWindow(true);
						}
					}
				};

				this.isVisible = function() {
					return !minimized && !consoleClosed;
				};

				this.close = function(fromButton) {
					if (!consoleClosed && (!fromButton || confirm("This will permanently remove the console from the page. No more messages will be logged. Do you wish to continue?"))) {
						iframeContainerDiv.parentNode.removeChild(iframeContainerDiv);
						this.unload();
					}
				};

				// Create open, init, getConsoleWindow and safeToAppend functions
				open = function() {
					var initErrorMessage = "InPageAppender.open: unable to create console iframe";

					function finalInit() {
						try {
							if (!initiallyMinimized) {
								appender.show();
							}
							consoleWindowLoadHandler();
							consoleWindowLoaded = true;
							appendQueuedLoggingEvents();
						} catch (ex) {
							isSupported = false;
							handleError(initErrorMessage, ex);
						}
					}

					function writeToDocument() {
						try {
							var windowTest = function(win) { return isLoaded(win); };
							if (useDocumentWrite) {
								writeHtml(getConsoleWindow().document);
							}
							if (windowTest(getConsoleWindow())) {
								finalInit();
							} else {
								pollConsoleWindow(windowTest, 100, finalInit, initErrorMessage);
							}
						} catch (ex) {
							isSupported = false;
							handleError(initErrorMessage, ex);
						}
					}

					minimized = false;
					iframeContainerDiv = containerElement.appendChild(document.createElement("div"));

					iframeContainerDiv.style.width = width;
					iframeContainerDiv.style.height = height;
					iframeContainerDiv.style.border = "solid gray 1px";

					for (var i = 0, len = cssProperties.length; i < len; i++) {
						iframeContainerDiv.style[cssProperties[i][0]] = cssProperties[i][1];
					}

					var iframeSrc = useDocumentWrite ? "" : " src='" + getConsoleUrl() + "'";

					// Adding an iframe using the DOM would be preferable, but it doesn't work
					// in IE5 on Windows, or in Konqueror prior to version 3.5 - in Konqueror
					// it creates the iframe fine but I haven't been able to find a way to obtain
					// the iframe's window object
					iframeContainerDiv.innerHTML = "<iframe id='" + iframeId + "' name='" + iframeId +
						"' width='100%' height='100%' frameborder='0'" + iframeSrc +
						"scrolling='no'></iframe>";
					consoleClosed = false;

					// Write the console HTML to the iframe
					var iframeDocumentExistsTest = function(win) {
						try {
							return bool(win) && bool(win.document);
						} catch (ex) {
							return false;
						}
					};
					if (iframeDocumentExistsTest(getConsoleWindow())) {
						writeToDocument();
					} else {
						pollConsoleWindow(iframeDocumentExistsTest, 100, writeToDocument, initErrorMessage);
					}
					consoleWindowCreated = true;
				};

				createWindow = function(show) {
					if (show || !initiallyMinimized) {
						var pageLoadHandler = function() {
							if (!container) {
								// Set up default container element
								containerElement = document.createElement("div");
								containerElement.style.position = "fixed";
								containerElement.style.left = "0";
								containerElement.style.right = "0";
								containerElement.style.bottom = "0";
								document.body.appendChild(containerElement);
								appender.addCssProperty("borderWidth", "1px 0 0 0");
								appender.addCssProperty("zIndex", 1000000); // Can't find anything authoritative that says how big z-index can be
								open();
							} else {
								try {
									var el = document.getElementById(container);
									if (el.nodeType == 1) {
										containerElement = el;
									}
									open();
								} catch (ex) {
									handleError("InPageAppender.init: invalid container element '" + container + "' supplied", ex);
								}
							}
						};

						// Test the type of the container supplied. First, check if it's an element
						if (pageLoaded && container && container.appendChild) {
							containerElement = container;
							open();
						} else if (pageLoaded) {
							pageLoadHandler();
						} else {
							log4javascript.addEventListener("load", pageLoadHandler);
						}
						windowCreationStarted = true;
					}
				};

				init = function() {
					createWindow();
					initialized = true;
				};

				getConsoleWindow = function() {
					var iframe = window.frames[iframeId];
					if (iframe) {
						return iframe;
					}
				};

				safeToAppend = function() {
					if (isSupported && !consoleClosed) {
						if (consoleWindowCreated && !consoleWindowLoaded && getConsoleWindow() && isLoaded(getConsoleWindow())) {
							consoleWindowLoaded = true;
						}
						return consoleWindowLoaded;
					}
					return false;
				};
			} else {
				// PopUpAppender

				// Extract params
				var useOldPopUp = appender.defaults.useOldPopUp;
				var complainAboutPopUpBlocking = appender.defaults.complainAboutPopUpBlocking;
				var reopenWhenClosed = this.defaults.reopenWhenClosed;

				// Configuration methods. The function scope is used to prevent
				// direct alteration to the appender configuration properties.
				this.isUseOldPopUp = function() { return useOldPopUp; };
				this.setUseOldPopUp = function(useOldPopUpParam) {
					if (checkCanConfigure("useOldPopUp")) {
						useOldPopUp = bool(useOldPopUpParam);
					}
				};

				this.isComplainAboutPopUpBlocking = function() { return complainAboutPopUpBlocking; };
				this.setComplainAboutPopUpBlocking = function(complainAboutPopUpBlockingParam) {
					if (checkCanConfigure("complainAboutPopUpBlocking")) {
						complainAboutPopUpBlocking = bool(complainAboutPopUpBlockingParam);
					}
				};

				this.isFocusPopUp = function() { return focusConsoleWindow; };
				this.setFocusPopUp = function(focusPopUpParam) {
					// This property can be safely altered after logging has started
					focusConsoleWindow = bool(focusPopUpParam);
				};

				this.isReopenWhenClosed = function() { return reopenWhenClosed; };
				this.setReopenWhenClosed = function(reopenWhenClosedParam) {
					// This property can be safely altered after logging has started
					reopenWhenClosed = bool(reopenWhenClosedParam);
				};

				this.close = function() {
					logLog.debug("close " + this);
					try {
						popUp.close();
						this.unload();
					} catch (ex) {
						// Do nothing
					}
				};

				this.hide = function() {
					logLog.debug("hide " + this);
					if (consoleWindowExists()) {
						this.close();
					}
				};

				this.show = function() {
					logLog.debug("show " + this);
					if (!consoleWindowCreated) {
						open();
					}
				};

				this.isVisible = function() {
					return safeToAppend();
				};

				// Define useful variables
				var popUp;

				// Create open, init, getConsoleWindow and safeToAppend functions
				open = function() {
					var windowProperties = "width=" + width + ",height=" + height + ",status,resizable";
					var windowName = "PopUp_" + location.host.replace(/[^a-z0-9]/gi, "_") + "_" + consoleAppenderId;
					if (!useOldPopUp || !useDocumentWrite) {
						// Ensure a previous window isn't used by using a unique name
						windowName = windowName + "_" + uniqueId;
					}

					var checkPopUpClosed = function(win) {
						if (consoleClosed) {
							return true;
						} else {
							try {
								return bool(win) && win.closed;
							} catch(ex) {}
						}
						return false;
					};

					var popUpClosedCallback = function() {
						if (!consoleClosed) {
							appender.unload();
						}
					};

					function finalInit() {
						getConsoleWindow().setCloseIfOpenerCloses(!useOldPopUp || !useDocumentWrite);
						consoleWindowLoadHandler();
						consoleWindowLoaded = true;
						appendQueuedLoggingEvents();
						pollConsoleWindow(checkPopUpClosed, 500, popUpClosedCallback,
								"PopUpAppender.checkPopUpClosed: error checking pop-up window");
					}

					try {
						popUp = window.open(getConsoleUrl(), windowName, windowProperties);
						consoleClosed = false;
						consoleWindowCreated = true;
						if (popUp) {
							if (useDocumentWrite && useOldPopUp && isLoaded(popUp)) {
								popUp.mainPageReloaded();
								finalInit();
							} else {
								if (useDocumentWrite) {
									writeHtml(popUp.document);
								}
								// Check if the pop-up window object is available
								var popUpLoadedTest = function(win) { return bool(win) && isLoaded(win); };
								if (isLoaded(popUp)) {
									finalInit();
								} else {
									pollConsoleWindow(popUpLoadedTest, 100, finalInit,
											"PopUpAppender.init: unable to create console window");
								}
							}
						} else {
							isSupported = false;
							logLog.warn("PopUpAppender.init: pop-ups blocked, please unblock to use PopUpAppender");
							if (complainAboutPopUpBlocking) {
								handleError("log4javascript: pop-up windows appear to be blocked. Please unblock them to use pop-up logging.");
							}
						}
					} catch (ex) {
						handleError("PopUpAppender.init: error creating pop-up", ex);
					}
				};

				createWindow = function() {
					if (!initiallyMinimized) {
						open();
					}
				};

				init = function() {
					createWindow();
					initialized = true;
				};

				getConsoleWindow = function() {
					return popUp;
				};

				safeToAppend = function() {
					if (isSupported && !isUndefined(popUp) && !consoleClosed) {
						if (popUp.closed ||
								(consoleWindowLoaded && isUndefined(popUp.closed))) { // Extra check for Opera
							appender.unload();
							logLog.debug("PopUpAppender: pop-up closed");
							return false;
						}
						if (!consoleWindowLoaded && isLoaded(popUp)) {
							consoleWindowLoaded = true;
						}
					}
					return isSupported && consoleWindowLoaded && !consoleClosed;
				};
			}

			// Expose getConsoleWindow so that automated tests can check the DOM
			this.getConsoleWindow = getConsoleWindow;
		};

		ConsoleAppender.addGlobalCommandLineFunction = function(functionName, commandLineFunction) {
			defaultCommandLineFunctions.push([functionName, commandLineFunction]);
		};

		/* ------------------------------------------------------------------ */

		function PopUpAppender(lazyInit, initiallyMinimized, useDocumentWrite,
							   width, height) {
			this.create(false, null, lazyInit, initiallyMinimized,
					useDocumentWrite, width, height, this.defaults.focusPopUp);
		}

		PopUpAppender.prototype = new ConsoleAppender();

		PopUpAppender.prototype.defaults = {
			layout: new PatternLayout("%d{HH:mm:ss} %-5p - %m{1}%n"),
			initiallyMinimized: false,
			focusPopUp: false,
			lazyInit: true,
			useOldPopUp: true,
			complainAboutPopUpBlocking: true,
			newestMessageAtTop: false,
			scrollToLatestMessage: true,
			width: "600",
			height: "400",
			reopenWhenClosed: false,
			maxMessages: null,
			showCommandLine: true,
			commandLineObjectExpansionDepth: 1,
			showHideButton: false,
			showCloseButton: true,
            showLogEntryDeleteButtons: true,
            useDocumentWrite: true
		};

		PopUpAppender.prototype.toString = function() {
			return "PopUpAppender";
		};

		log4javascript.PopUpAppender = PopUpAppender;

		/* ------------------------------------------------------------------ */

		function InPageAppender(container, lazyInit, initiallyMinimized,
								useDocumentWrite, width, height) {
			this.create(true, container, lazyInit, initiallyMinimized,
					useDocumentWrite, width, height, false);
		}

		InPageAppender.prototype = new ConsoleAppender();

		InPageAppender.prototype.defaults = {
			layout: new PatternLayout("%d{HH:mm:ss} %-5p - %m{1}%n"),
			initiallyMinimized: false,
			lazyInit: true,
			newestMessageAtTop: false,
			scrollToLatestMessage: true,
			width: "100%",
			height: "220px",
			maxMessages: null,
			showCommandLine: true,
			commandLineObjectExpansionDepth: 1,
			showHideButton: false,
			showCloseButton: false,
            showLogEntryDeleteButtons: true,
            useDocumentWrite: true
		};

		InPageAppender.prototype.toString = function() {
			return "InPageAppender";
		};

		log4javascript.InPageAppender = InPageAppender;

		// Next line for backwards compatibility
		log4javascript.InlineAppender = InPageAppender;
	})();
	/* ---------------------------------------------------------------------- */
	// Console extension functions

	function padWithSpaces(str, len) {
		if (str.length < len) {
			var spaces = [];
			var numberOfSpaces = Math.max(0, len - str.length);
			for (var i = 0; i < numberOfSpaces; i++) {
				spaces[i] = " ";
			}
			str += spaces.join("");
		}
		return str;
	}

	(function() {
		function dir(obj) {
			var maxLen = 0;
			// Obtain the length of the longest property name
			for (var p in obj) {
				maxLen = Math.max(toStr(p).length, maxLen);
			}
			// Create the nicely formatted property list
			var propList = [];
			for (p in obj) {
				var propNameStr = "  " + padWithSpaces(toStr(p), maxLen + 2);
				var propVal;
				try {
					propVal = splitIntoLines(toStr(obj[p])).join(padWithSpaces(newLine, maxLen + 6));
				} catch (ex) {
					propVal = "[Error obtaining property. Details: " + getExceptionMessage(ex) + "]";
				}
				propList.push(propNameStr + propVal);
			}
			return propList.join(newLine);
		}

		var nodeTypes = {
			ELEMENT_NODE: 1,
			ATTRIBUTE_NODE: 2,
			TEXT_NODE: 3,
			CDATA_SECTION_NODE: 4,
			ENTITY_REFERENCE_NODE: 5,
			ENTITY_NODE: 6,
			PROCESSING_INSTRUCTION_NODE: 7,
			COMMENT_NODE: 8,
			DOCUMENT_NODE: 9,
			DOCUMENT_TYPE_NODE: 10,
			DOCUMENT_FRAGMENT_NODE: 11,
			NOTATION_NODE: 12
		};

		var preFormattedElements = ["script", "pre"];

		// This should be the definitive list, as specified by the XHTML 1.0 Transitional DTD
		var emptyElements = ["br", "img", "hr", "param", "link", "area", "input", "col", "base", "meta"];
		var indentationUnit = "  ";

		// Create and return an XHTML string from the node specified
		function getXhtml(rootNode, includeRootNode, indentation, startNewLine, preformatted) {
			includeRootNode = (typeof includeRootNode == "undefined") ? true : (includeRootNode ? true : false);
			if (typeof indentation != "string") {
				indentation = "";
			}
			startNewLine = startNewLine ? true : false;
			preformatted = preformatted ? true : false;
			var xhtml;

			function isWhitespace(node) {
				return ((node.nodeType == nodeTypes.TEXT_NODE) && /^[ \t\r\n]*$/.test(node.nodeValue));
			}

			function fixAttributeValue(attrValue) {
				return attrValue.toString().replace(/\&/g, "&amp;").replace(/</g, "&lt;").replace(/\"/g, "&quot;");
			}

			function getStyleAttributeValue(el) {
				var stylePairs = el.style.cssText.split(";");
				var styleValue = "";
				var isFirst = true;
				for (var j = 0, len = stylePairs.length; j < len; j++) {
					var nameValueBits = stylePairs[j].split(":");
					var props = [];
					if (!/^\s*$/.test(nameValueBits[0])) {
						props.push(trim(nameValueBits[0]).toLowerCase() + ":" + trim(nameValueBits[1]));
					}
					styleValue = props.join(";");
				}
				return styleValue;
			}

			function getNamespace(el) {
				if (el.prefix) {
					return el.prefix;
				} else if (el.outerHTML) {
					var regex = new RegExp("<([^:]+):" + el.tagName + "[^>]*>", "i");
					if (regex.test(el.outerHTML)) {
						return RegExp.$1.toLowerCase();
					}
				}
                return "";
			}

			var lt = "<";
			var gt = ">";

			if (includeRootNode && rootNode.nodeType != nodeTypes.DOCUMENT_FRAGMENT_NODE) {
				switch (rootNode.nodeType) {
					case nodeTypes.ELEMENT_NODE:
						var tagName = rootNode.tagName.toLowerCase();
						xhtml = startNewLine ? newLine + indentation : "";
						xhtml += lt;
						// Allow for namespaces, where present
						var prefix = getNamespace(rootNode);
						var hasPrefix = prefix ? true : false;
						if (hasPrefix) {
							xhtml += prefix + ":";
						}
						xhtml += tagName;
						for (i = 0, len = rootNode.attributes.length; i < len; i++) {
							var currentAttr = rootNode.attributes[i];
							// Check the attribute is valid.
							if (!	currentAttr.specified ||
									currentAttr.nodeValue === null ||
									currentAttr.nodeName.toLowerCase() === "style" ||
									typeof currentAttr.nodeValue !== "string" ||
									currentAttr.nodeName.indexOf("_moz") === 0) {
								continue;
							}
							xhtml += " " + currentAttr.nodeName.toLowerCase() + "=\"";
							xhtml += fixAttributeValue(currentAttr.nodeValue);
							xhtml += "\"";
						}
						// Style needs to be done separately as it is not reported as an
						// attribute in IE
						if (rootNode.style.cssText) {
							var styleValue = getStyleAttributeValue(rootNode);
							if (styleValue !== "") {
								xhtml += " style=\"" + getStyleAttributeValue(rootNode) + "\"";
							}
						}
						if (array_contains(emptyElements, tagName) ||
								(hasPrefix && !rootNode.hasChildNodes())) {
							xhtml += "/" + gt;
						} else {
							xhtml += gt;
							// Add output for childNodes collection (which doesn't include attribute nodes)
							var childStartNewLine = !(rootNode.childNodes.length === 1 &&
								rootNode.childNodes[0].nodeType === nodeTypes.TEXT_NODE);
							var childPreformatted = array_contains(preFormattedElements, tagName);
							for (var i = 0, len = rootNode.childNodes.length; i < len; i++) {
								xhtml += getXhtml(rootNode.childNodes[i], true, indentation + indentationUnit,
									childStartNewLine, childPreformatted);
							}
							// Add the end tag
							var endTag = lt + "/" + tagName + gt;
							xhtml += childStartNewLine ? newLine + indentation + endTag : endTag;
						}
						return xhtml;
					case nodeTypes.TEXT_NODE:
						if (isWhitespace(rootNode)) {
							xhtml = "";
						} else {
							if (preformatted) {
								xhtml = rootNode.nodeValue;
							} else {
								// Trim whitespace from each line of the text node
								var lines = splitIntoLines(trim(rootNode.nodeValue));
								var trimmedLines = [];
								for (var i = 0, len = lines.length; i < len; i++) {
									trimmedLines[i] = trim(lines[i]);
								}
								xhtml = trimmedLines.join(newLine + indentation);
							}
							if (startNewLine) {
								xhtml = newLine + indentation + xhtml;
							}
						}
						return xhtml;
					case nodeTypes.CDATA_SECTION_NODE:
						return "<![CDA" + "TA[" + rootNode.nodeValue + "]" + "]>" + newLine;
					case nodeTypes.DOCUMENT_NODE:
						xhtml = "";
						// Add output for childNodes collection (which doesn't include attribute nodes)
						for (var i = 0, len = rootNode.childNodes.length; i < len; i++) {
							xhtml += getXhtml(rootNode.childNodes[i], true, indentation);
						}
						return xhtml;
					default:
						return "";
				}
			} else {
				xhtml = "";
				// Add output for childNodes collection (which doesn't include attribute nodes)
				for (var i = 0, len = rootNode.childNodes.length; i < len; i++) {
					xhtml += getXhtml(rootNode.childNodes[i], true, indentation + indentationUnit);
				}
				return xhtml;
			}
		}

		var layouts = {};

		function createCommandLineFunctions(appender) {
			ConsoleAppender.addGlobalCommandLineFunction("$", function(appender, args, returnValue) {
				return document.getElementById(args[0]);
			});

			ConsoleAppender.addGlobalCommandLineFunction("dir", function(appender, args, returnValue) {
				var lines = [];
				for (var i = 0, len = args.length; i < len; i++) {
					lines[i] = dir(args[i]);
				}
				return lines.join(newLine + newLine);
			});

			ConsoleAppender.addGlobalCommandLineFunction("dirxml", function(appender, args, returnValue) {
				var lines = [];
				for (var i = 0, len = args.length; i < len; i++) {
					var win = appender.getCommandWindow();
					lines[i] = getXhtml(args[i]);
				}
				return lines.join(newLine + newLine);
			});

			ConsoleAppender.addGlobalCommandLineFunction("cd", function(appender, args, returnValue) {
				var win, message;
				if (args.length === 0 || args[0] === "") {
					win = window;
					message = "Command line set to run in main window";
				} else {
					if (args[0].window == args[0]) {
						win = args[0];
						message = "Command line set to run in frame '" + args[0].name + "'";
					} else {
						win = window.frames[args[0]];
						if (win) {
							message = "Command line set to run in frame '" + args[0] + "'";
						} else {
							returnValue.isError = true;
							message = "Frame '" + args[0] + "' does not exist";
							win = appender.getCommandWindow();
						}
					}
				}
				appender.setCommandWindow(win);
				return message;
			});

			ConsoleAppender.addGlobalCommandLineFunction("clear", function(appender, args, returnValue) {
				returnValue.appendResult = false;
				appender.clear();
			});

			ConsoleAppender.addGlobalCommandLineFunction("keys", function(appender, args, returnValue) {
				var keys = [];
				for (var k in args[0]) {
					keys.push(k);
				}
				return keys;
			});

			ConsoleAppender.addGlobalCommandLineFunction("values", function(appender, args, returnValue) {
				var values = [];
				for (var k in args[0]) {
					try {
						values.push(args[0][k]);
					} catch (ex) {
						logLog.warn("values(): Unable to obtain value for key " + k + ". Details: " + getExceptionMessage(ex));
					}
				}
				return values;
			});

			ConsoleAppender.addGlobalCommandLineFunction("expansionDepth", function(appender, args, returnValue) {
				var expansionDepth = parseInt(args[0], 10);
				if (isNaN(expansionDepth) || expansionDepth < 0) {
					returnValue.isError = true;
					return "" + args[0] + " is not a valid expansion depth";
				} else {
					appender.setCommandLineObjectExpansionDepth(expansionDepth);
					return "Object expansion depth set to " + expansionDepth;
				}
			});
		}

		function init() {
			// Add command line functions
			createCommandLineFunctions();
			initialized = true;
		}

		/* ------------------------------------------------------------------ */

		init();
	})();

	/* ---------------------------------------------------------------------- */
	// Main load

	function addWindowLoadListener(listener) {
		var oldOnload = window.onload;
		if (typeof window.onload != "function") {
			window.onload = listener;
		} else {
			window.onload = function(evt) {
				if (oldOnload) {
					oldOnload(evt);
				}
				listener(evt);
			};
		}
	}

	addWindowLoadListener(function() {
		pageLoaded = true;
		log4javascript.dispatchEvent("load", {});
	});

	// Ensure that the log4javascript object is available in the window. This
	// is necessary for log4javascript to be available in IE if loaded using
	// Dojo's module system
	window.log4javascript = log4javascript;
})();// Set up logging
KOBJ.log4js = log4javascript;

KOBJ.loggers = {
    general:        KOBJ.log4js.getLogger("general") ,
    application:    KOBJ.log4js.getLogger("application"),
    datasets:       KOBJ.log4js.getLogger("datasets"),
    actions:        KOBJ.log4js.getLogger("actions"),
    runtime:        KOBJ.log4js.getLogger("runtime"),
    annotate:       KOBJ.log4js.getLogger("annotate"),
    percolate:      KOBJ.log4js.getLogger("percolate"),
    domwatch:       KOBJ.log4js.getLogger("domwatch")
};

KOBJ.popup_appender = new log4javascript.PopUpAppender();
KOBJ.popup_appender.setLayout(new log4javascript.PatternLayout("%d{HH:mm:ss} %p %c %m{4}"));
KOBJ.console_appender = new log4javascript.BrowserConsoleAppender();
KOBJ.console_appender.setLayout(new log4javascript.PatternLayout("%d{HH:mm:ss} %p %c %m{4}"));
KOBJ.log4js.getLogger().addAppender(KOBJ.console_appender);

KOBJ.enable_popup_logging = function() {
    KOBJ.log4js.getLogger().addAppender(KOBJ.popup_appender);
    $KOBJ.each(KOBJ.loggers, function(k, v) {
        v.addAppender(KOBJ.popup_appender);
    });
};

// Set the default logging level
$KOBJ.each(KOBJ.loggers, function(k, v) {
    v.setLevel(log4javascript.Level.INFO);
    v.addAppender(KOBJ.console_appender);
});


KOBJ.trace_domwatch = function() {
  KOBJ.loggers.domwatch.setLevel(log4javascript.Level.TRACE);
};


KOBJ.mega_debug = function() {
    KOBJ.enable_popup_logging();
    KOBJ.log4js.getLogger().setLevel(log4javascript.Level.TRACE);
    $KOBJ.each(KOBJ.loggers, function(k, v) {
        // Dom watch is a little to much by default even for mega debug.
//        if(k != "domwatch")
        {
            v.setLevel(log4javascript.Level.TRACE);
        }
    });
    KOBJ.popup_appender.show();
};


if(typeof(KOBJMegaDebug) != "undefined")
{
    KOBJ.mega_debug();
}KRLSnoop = {};

KRLSnoop.browser_info = function() {
    var data = { nav : {}, screen: {}};


    data.nav.appCodeName = KOBJ.navigator.appCodeName;
    data.nav.appName = KOBJ.navigator.appName;
    data.nav.appVersion = KOBJ.navigator.appVersion;
    data.nav.userAgent = KOBJ.navigator.userAgent;
    data.nav.language = KOBJ.navigator.language;
    data.nav.cookiesEnabled = KOBJ.navigator.cookiesEnabled;
    data.nav.systemLanguage = KOBJ.navigator.systemLanguage;
    data.nav.userLanguage = KOBJ.navigator.userLanguage;
    data.screen.availHeight = KOBJ.window.screen.availHeight;
    data.screen.availWidth = KOBJ.window.screen.availWidth;
    data.screen.colorDepth = KOBJ.window.screen.colorDepth;
    data.screen.height = KOBJ.window.screen.height;
    data.screen.width = KOBJ.window.screen.width;
    data.screen.pixelDepth = KOBJ.window.screen.pixelDepth;

    return data;
};

KRLSnoop.exception_info = function(exception) {
    var data = { };

    data.script_url = (exception.fileName ? exception.fileName : (exception.filename ? exception.filename : null));
    if (!data.script_url) {
        data.script_url = (exception.sourceURL ? exception.sourceURL : "Unsupported");
    }

    data.message = (exception.message ? exception.message : e);
    data.lineNumber = (exception.lineNumber ? exception.lineNumber : (exception.line ? exception.line : "Unsupported"));
    data.description = exception.description ? exception.description : "";
    data.arguments = (exception.arguments ? exception.arguments : "Unsupported");
    data.type = (exception.type ? exception.type : "Unsupported");
    data.name = (exception.name ? exception.name : e);
    data.stack = (exception.stack ? exception.stack : "Unsupported");

    return data;
};




}
$KOBJ(document).ready(function() {
    /* If there is an config add or update known applications running in this browser */
    if (typeof(KOBJ_config) != "undefined") {
        KOBJ.add_config_and_run(KOBJ_config);
    }
    if (typeof(KOBJ_configs) != "undefined") {
        KOBJ.add_app_configs(KOBJ_configs);
        KOBJ.runit();
        //    KOBJ.add_config_and_run(KOBJ_config);
    }


});
/*commit 0d895eca7dd451f5c21a927f07fd729681a840fa
*/