import java.util.*;
//working...success...

public class Tree{
	Node root;
	Tree(){root=null;}
	void postorder(Node node){
		if(node==null){return;}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.item+"->");}
    void inorder(Node node){
			if(node==null){return;}
			inorder(node.left);
			System.out.print(node.item+"->");
			inorder(node.right);}
	void preorder(Node node){
		if(node==null){return;}
		System.out.print(node.item+"->");
		preorder(node.left);
		preorder(node.right);}

	//driver code..
	public static void main(String f[]){
		Tree tree=new Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6);

		System.out.println("inorder traversal");
		tree.inorder(tree.root);
		System.out.println("preorder traversal");
		tree.preorder(tree.root);
		System.out.println("postorder traversal");
		tree.postorder(tree.root);
	}
}
class Node{
	int item;
	Node left,right;
	public Node(int key){item=key;left=right=null ;}}