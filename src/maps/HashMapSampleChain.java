package maps;

import java.util.LinkedList;

public class HashMapSampleChain<K,V> {

	private int numKeys;
	private static final double LOAD_FACTOR = 3.0;
	private static final int capacity = 101;
	private LinkedList<Entry<K,V>>[] table; 
	
	private static class Entry<K,V>{
		private K key;
		private V value;
		
		public Entry(K key,V value){
			this.key = key;
			this.value = value;
		}
		
		public K getKey(){
			return key; 
		}
		
		public V getValue(){
			return value;
		}
		
		public V setValue(V value){
			V oldVal = this.value;
			this.value = value;
			return oldVal;
		}
	}
	
}
