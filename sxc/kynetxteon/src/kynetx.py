import httplib, urllib, json, re

class kynetx:
	"""A library to raise Kynetx events"""

	def __init__(self,app_id):
		self.appid = app_id
		self.kynetx_connection = httplib.HTTPConnection('cs.kobj.net')
	
	def raise_event(self,domain,event_name, params = {}):
		params_encoded = urllib.urlencode(params)

		print '/blue/event/'+domain+'/'+event_name+'/'+self.appid
		try:
			self.kynetx_connection.request("GET", '/blue/event/'+domain+'/'+event_name+'/'+self.appid + '?' + params_encoded)
			directives = re.sub('^//.*','',self.kynetx_connection.getresponse().read(),re.S)
		except:
			directives = '{"directives":[]}'
			
		print directives
		self.parse_directives(directives)
		return directives

	def parse_directives(self,directives):
		try:
			data = json.loads(directives)['directives']
		except:
			data = []
		self.directives = []
		temp = {}
		for directive in data:
			temp['txn_id'] = directive['meta']['txn_id']
			temp['action'] = directive['name']
			temp['options'] = directive['options']
			self.directives.append(temp)
