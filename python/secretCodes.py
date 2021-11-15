#make secret codes...
"""yeah working...need to expand it later.....
add more in the dictionay...
success..."""
my_dictionary={
	'dumb':'start',
	'hey':'end',
	'happy':'danger',
	'little':'backup',
	'know':'need',
	'need':'compromised',
	'sorry':'abort',
	'will':'alert'
}
print("enter number of entries..")
k=int(input())
final=""
for i in range(0,k):
	l=input()
	final+=((my_dictionary.get(l)))+" "
print(final)