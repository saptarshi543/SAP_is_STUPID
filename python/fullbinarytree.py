"""working...success..."""
class Node:
	def __init__(self,item):
		self.item=item
		self.leftChild=None
		self.rightChild=None

def isFullTree(root):
	if root is None:
		return True
	if root.leftChild is None and root.rightChild is None:
		return True
	if root.leftChild is not None and root.rightChild is not None:
		return(isFullTree(root.leftChild) and isFullTree(root.rightChild))
	return False
#driver code...
root=Node(1)
root.rightChild=Node(3)
root.leftChild=Node(2)

root.leftChild.leftChild=Node(4)
root.leftChild.rightChild=Node(5)
root.leftChild.rightChild.leftChild=Node(6)
root.leftChild.rightChild.rightChild=Node(7)

if isFullTree(root):
	print("tree is a full binary tree")
else:
	print("tree is not a full binary tree")