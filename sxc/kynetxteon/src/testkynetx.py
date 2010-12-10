import kynetx

app = kynetx.kynetx("a41x135")

data = app.raise_event("test","events")

print data

for directive in app.directives:
	print directive['action']
