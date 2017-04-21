package binaryTreeAlgorithms;

import java.io.Serializable;

public  class BinaryTree<E> implements Serializable {

	protected static class Node<E> implements Serializable{
		
		protected E data;
		protected Node<E> left;
		protected Node<E> right;
		
		public Node(E data){
			this.data = data;
			left = null;
			right = null;
		}
		
		public String toString(){
			return data.toString();
		}
	}
	
	protected Node<E> root;
	
	//Constructor
	public BinaryTree(){
		root = null;
	}
	// This constructor is protected as client classes do not know about the Node class. 
	// It will be only used by the internal BinaryTree classes.
	protected BinaryTree(Node<E> root){
		this.root = root;
	}
	//Constructor
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		root = new Node<E>(data);
		if(leftTree!=null){
			root.left = leftTree.root;
		}else root.left=null;
		if(rightTree!=null){
			root.right = rightTree.root;
		}else root.right= null;
	}
	
	//Get left sub tree 
	public BinaryTree<E> getLeftSubTree(){
		if(root!=null && root.left!=null){
			return new BinaryTree<E>(root.left);
		}else
			return null;
	}
	
	// Get right sub tree
	public BinaryTree<E> getRightSubTree(){
		if(root!=null && root.right!=null){
			return new BinaryTree<E>(root.right);
		}else
			return	null;
	}
	
	public boolean isLeaf(){
		return (root.left!=null && root.right!=null);
	}
	
	private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb){
		for(int i = 1; i<depth;i++){
			sb.append(" ");
		}
		if(node == null){
			sb.append("null\n");
		} else{
			sb.append(node.toString());
			sb.append("\n");
			preOrderTraverse(node.left, depth+1, sb);
			preOrderTraverse(node.right, depth+1,sb);
		}
	}
	
	private void postOrderTraverse(Node<E> node,int depth, StringBuilder sb){
		for(int i = 1; i<depth;i++){
			sb.append(" ");
		}
		if(node == null){
			sb.append("null\n");
		}else{
			postOrderTraverse(node.left, depth, sb);
			postOrderTraverse(node.right, depth, sb);
		}
		sb.append(node.toString());
	}
	
	public String toStringPreOrder(){
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1, sb);
		return sb.toString();
	}
	
	public String toStringPostOrder(){
		StringBuilder sb = new StringBuilder();
		postOrderTraverse(root, 1, sb);
		return sb.toString();
	}
	
	
}
