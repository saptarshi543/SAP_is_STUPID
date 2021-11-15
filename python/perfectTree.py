"""woring...success..."""
class Node:
	def __init__(self,k):
		self.key = k
		self.right=self.left=None

def calculateDepth(node):
	d=0
	while (node is not None):
		d+=1
		node=node.left
	return d
def isPerfect(root,d,level=0):
	if (root is None):
		return True
	if (root is None and root.right is None):
		return (d==level+1)
	if (root.left is None or root.right is None):
		return False
	return (isPerfect(root.left,d,level+1)) and (isPerfect(root.right,d,level+1))

#driver code..
root=None
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)

if(isPerfect(root,calculateDepth(root))):
	print("perfect")
else:
	print("NOT perfect")