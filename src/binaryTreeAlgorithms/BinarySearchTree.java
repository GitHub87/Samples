package binaryTreeAlgorithms;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E> {

	protected boolean addReturn;

	protected E deleteReturn;

	public E find(E target) {
		return find(root, target);
	}

	private E find(Node<E> localRoot, E target) {
		if (localRoot == null)
			return null;
		int compResult = target.compareTo(localRoot.data);
		if (compResult == 0) {
			return localRoot.data;
		} else if (compResult < 0) {
			return find(localRoot.left, target);
		} else {
			return find(localRoot.right, target);
		}

	}

	@Override
	public boolean add(E item) {
		root = add(root, item);
		return addReturn;
	}
	
	private Node<E> add(Node<E> localRoot, E item){
		if(localRoot == null){
			addReturn = true;
			return new Node<E>(item);
		}else if(item.compareTo(localRoot.data)==0){
			addReturn = false;
			return localRoot;
		}else if(item.compareTo(localRoot.data)<0){
			localRoot.left = add(localRoot.left,item);
			return localRoot;
		}else {
			localRoot.right = add(localRoot.right,item);
			return localRoot;
		}
	}

	@Override
	public boolean contains(E target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E delete(E target) {
		root = delete(root, target);
		return deleteReturn;
	}
	
	private Node<E> delete(Node<E> localRoot, E target){
		if(localRoot == null){
			deleteReturn = null;
			return localRoot;
		}
		
		int compResult = target.compareTo(localRoot.data);
		if(compResult<0){
			localRoot.left = delete(localRoot.left, target);
			return localRoot;
		}else if(compResult>0){
			localRoot.right = delete(localRoot.right,target);
			return localRoot;
		}else{
			deleteReturn = localRoot.data;
			if(localRoot.left == null){
				return localRoot.right;
			}else if(localRoot.right == null){
				return localRoot.left;
			}else{
				if(localRoot.left.right == null){
					localRoot.data = localRoot.left.data;
					localRoot.left = localRoot.left.left;
					return localRoot;
				}else{
					localRoot.data = findLargestChild(localRoot.left);
					return localRoot;
				}
			}
		}
		
	}

	@Override
	public boolean remove(E target) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private E findLargestChild(Node<E> parent){
		if(parent.right.right == null){
			E returnValue = parent.right.data;
			parent.right = parent.right.left;
			return returnValue;
		}else{
			return findLargestChild(parent.right);
		}
	}

}
