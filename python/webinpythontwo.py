#
#
#
#
#DO NOT RUN THIS IS A VIRUS......
#it runs for infinity....
#
#
#
#
import webbrowser#working.......
import re#success.....
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
val=True
while(val):
	webbrowser.open(ne,new=2)