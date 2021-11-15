"""working....success.."""
class Node:
	def __init__(self,item):
		self.left=None
		self.right=None
		self.val=item
def inorder(root):
	if root:
		inorder(root.left)
		print(str(root.val)+"->",end='')
		inorder(root.right)
def postorder(root):
	if root:
		postorder(root.left)
		postorder(root.right)
		print(str(root.val)+"->",end='')
def preorder(root):
	if root:
		print(str(root.val)+"->",end='')
		preorder(root.left)
		preorder(root.right)

#driver code...
root = Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)
print("\ninorder traversal")
inorder(root)
print("\npreorder traversal")
preorder(root)
print("\npostorder traversal")
postorder(root)