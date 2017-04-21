package binaryTreeAlgorithms;

public interface SearchTree<E> {

	boolean add(E item);
	
	boolean contains(E target);
	
	E find(E target);
	
	E delete(E targert);
	
	boolean remove(E target);
	
}
