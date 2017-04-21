package graphs;

public class Edge {

	
	private int source;
	private int dest;
	private double weight;
	
	private Edge edge;
	
	public Edge(int source, int dest){
		this.source = source;
		this.dest = dest;
		this.weight = 1.0;
	}
	
	public Edge(int source, int dest, double weight){
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
	
	public boolean equals(Object o){
		if(this.equals((Edge)o)){
			return true;
		}
		return false;
	}
	
	public int getDest(){
		return dest;
	}
	
	public int getSource(){
		return source;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public int hashCode(){
		int hashCd = 1;
		hashCd = 31 * hashCd + Integer.hashCode(source) + Integer.hashCode(dest);
		return hashCd;
	}
	
	public String toString(){
		return "source"+ " " + source + "dest" + " " +dest+ "weight" + " " + weight + "\n";
	}
	
	
}
