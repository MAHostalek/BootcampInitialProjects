from bottle import default_app, redirect, route, request, auth_basic, run, template, get, post, static_file, request
import codecs, json
from random import randint
f=codecs.open("author.html")
# listMsg = {"hello", "gunnar"}

@route('/basic', method='POST')
	@auth_basic(check)
    msg = request.forms.get('msg')
	def basic(name = msg)

		return template('<b>hello {{name}} </b>!', name=name, auth = request.auth[0])

	def check(username, password):
		#check data base for existence
		return True(200)/False(403)




# Static Routes

@get('/<filename:re:.*\.html>')
def host_html_files(filename):
    return static_file(filename, root='')

@get('/js/<filename:re:.*\.js>')
def host_js_files(filename):
    return static_file(filename, root='js')

@get('/css/<filename:re:.*\.css>')
def host_css_files(filename):
    return static_file(filename, root='css')

@get('/images/<filename:re:.*\.(jpg|png|gif|ico)>')
def host_images_files(filename):
    return static_file(filename, root='images')

@post('/pass')
def check_ms():
    msg = request.forms.get('msg')
    msg = msg.lower()
    if "fuck" in msg or "shit" in msg or "fag" in msg or "bitch" in msg:
        return json.dumps({'msg': "nanana, no cursing when there's a lady in the room", 'animation' : 'no'})


run(host='localhost', port=80)