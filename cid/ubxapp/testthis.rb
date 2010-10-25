require "pp"
require "uri"

def main()
  data = datavalue();

  result = ""
  gm_script = data

  header = gm_script.split("==/UserScript==")[0];

  javascript = gm_script.split("==/UserScript==")[1];


  meta_data = [];
  header.each_line do |data|
    results = data.match(/@([a-z]+)(.*)/);
    if (results)
      meta_data.push [results[1], results[2].strip()];
    end
  end

  result << ("ruleset axxxxxx {\n")


  resources = [];
  meta_data.each do |value|

    if (value[0] == "resource")
      name_value = value[1].split();
      resources.push([name_value[0].strip(), name_value[1].strip()])
    end
  end

  result << ("\n\t" + "meta {\n")

  meta_data.each do |value|
    if (value[0] == "name")
      result << ("\t\t" + 'name "'+ value[1] + '"')
      result << "\n"

    end
    if (value[0] == "description")
      result << ("\t\t" +'description <<'+ value[1] + '>>')
      result << "\n"

    end
    if (value[0] == "contributor")
      result << ("\t\t" +'author "'+ value[1] + '"')
      result << "\n"

    end
  end

  result << ("\t" +"}\n")


  result << ("\t" + "dispatch {\n")

  ipaths = []
  epaths = []

  meta_data.each do |value|

    if (value[0] == "include")
#      puts "found include " + value[1]
      uri = split_url(value[1])
      if (uri[:host])
#        puts "found include " + uri[:host]
        ipaths.push(value[1].gsub(/\*/,".*"))
        result << "\t\t" + 'domain "' + uri[:host] + '"'
        result << "\n"
      end
    end
    if (value[0] == "exclude")
#      puts "found exclude " + value[1]
      uri = value[1]
      uri.gsub!(/\*/,".*")
#      puts "converted " + uri

      epaths.push(uri)
    end

  end

  result << ("\t" + "}\n\n")


  result << ("\t" + "global {\n")
  result << ("\t" + "}\n\n")

  result << ("\t" +"rule gmrule is active {\n")

  include = ""
  exclude = ""
  ipaths.each do |p|
    include += p + "|"
  end
  include.chomp!("|")
  epaths.each do |p|
    exclude += p + "|"
  end
  exclude.chomp!("|")


  result << ("\t\t" + 'select when pageview "' + include + '" ')
#  result << ("\n\t\t" +'and not  pageview "' + exclude + '" ') if exclude.length > 0
  result << ("\n\t\t" + 'setting()' + "\n\n")
#  puts("pre {")
#  puts("}")

  result << ("\t\tevery {\n")
  result << ("\t\t\temit <<\n")

  resources.each do |res|
    result << ("\t\t\t" +"GM_register_resource('myapp','#{res[0]}', '#{res[1]}')\n");
  end

  javascript.gsub!(/>>/, "&gt;&gt;")
  javascript.gsub!(/GM_getValue\w*\(/, "GM_getValue('appid',")
  javascript.gsub!(/GM_deleteValue\w*\(/, "GM_deleteValue ('appid',")
  javascript.gsub!(/GM_listValues\w*\(/, "GM_listValues  ('appid',")
  javascript.gsub!(/GM_setValue\w*\(/, "GM_setValue ('appid',")
  javascript.gsub!(/GM_getResourceText\w*\(/, "GM_getResourceText ('appid',")
  javascript.gsub!(/GM_getResourceURL\w*\(/, "GM_getResourceURL ('appid',")
  javascript.gsub!(/GM_addStyle\w*\(/, "GM_addStyle ('appid',")
  javascript.gsub!(/GM_xmlhttpRequest\w*\(/, "GM_xmlhttpRequest ('appid',")
  javascript.gsub!(/GM_registerMenuCommand\w*\(/, "GM_registerMenuCommand ('appid',")
  javascript.gsub!(/GM_openInTab\w*\(/, "GM_openInTab ('appid',")
  javascript.gsub!(/GM_log\w*\(/, "GM_log ('appid',")
  result << (javascript)
  result << ("\t\t\t>>;\n")
  result << ("\t\t}\n")
  result << ("\t}\n")

  result << ("}\n")

  puts result

end


def split_url(url)
#  puts ("strart split " + url)
  url = url.gsub(/htt.[s\*]*:\/\//, "")
  if (url.index("/"))
    host = url[0..url.index("/")];
#    puts "current url 2" + host
    host.gsub!(/\*/,"")
    path = url[url.index("/")..9999];
  else
    host = url;
#    puts "current url " + host
    host.gsub!(/\*/,"")
#    path = url[url.index("/")..9999];
  end


  return {:host => host, :path => path}
end

def datavalue
  return File.read("gmscript.js").encode("UTF-8");
end


main();


