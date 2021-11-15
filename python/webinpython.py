#working...........
#success......
import webbrowser
import re
k=input("enter search terms...")
substring=" "
well=""
def check_if_space_exists(k, substring):
	if(re.search(k,substring)):
		well=k.replace(" ","+")
	else:
		well=k
	return well
ne="https://google.com/search?q="+(check_if_space_exists(k,substring))
webbrowser.open(ne)#note this line...
#this line can also be written as
#webbrowser.open(ne, new=2)
#either way it opens the browser in a new tab...