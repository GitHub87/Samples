package maps;

import java.util.Map;

public class HashMapSampleOpen<K,V> {
	
	private Entry<K,V>[] table;
	private static final int INITIAL_CAPACITY = 101;
	private double LOAD_FACTOR = 0.75;
	private final Entry<K,V> DELETE = new Entry<K,V>(null,null);
	private int numKeys;
	private int numDels;
	
	public HashMapSampleOpen(){
		table = new Entry[INITIAL_CAPACITY];
	}
	
	
	private static class Entry<K,V> implements Map.Entry<K, V>{
		private K key;
		private V value;
		
		public Entry(K key,V value){
			this.key = key;
			this.value = value;
		}
		
		public V getValue(){
			return value;
		}
		
		public K getKey(){
			return key;
		}
		
		public V setValue(V value){
			V temp = this.value;
			this.value = value;
			return temp;
		}
	}
	
	//Method to find the index of an object in the table
	private int find(Object key){
		int index = key.hashCode() % table.length;
		if(index<0){
			index += table.length; // Make the index positive 
		}
		
		while( table[index] !=null && !key.equals(table[index])){
			index++;
			//Table wrap around
			if(index>table.length){
				index = 0;
			}
		}
		return index;
	}
	
	public V get(Object key){
		int index = find(key);
		if(table[index]!=null){
			return table[index].value;
		}else{
			return null;
		}
	}

	public V put(K key, V value){
		int index = find(key);
		if(table[index]==null){
			table[index] = new Entry(key,value);
			numKeys++;
			double loadFactor = (double) (numKeys+numDels)/LOAD_FACTOR;
			if(loadFactor>LOAD_FACTOR){
				//rehash();
			}
			return null;
		}
		V temp = table[index].value;
		table[index].value = value;
		return temp;
	}
	
	public V remove(K key){
		int index = find(key);
		if(table[index] == null){
			return null;
		}
		V oldVal = table[index].value;
		table[index] = DELETE;
		numKeys--;
		numDels++;
		return oldVal;
	}
	
	private void rehash(){
		Entry<K,V>[] oldTable = table;
		table = new Entry[2*oldTable.length+1];
		numKeys = 0;
		numDels = 0;
		for(int i=0; i<oldTable.length; i++){
			if(oldTable[i]!=null && oldTable[i] != DELETE){
				put(oldTable[i].key,oldTable[i].value);
			}
		}
		
	}
	
}
