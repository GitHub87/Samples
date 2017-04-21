package graphs;

public abstract class AbstractGraph implements Graph {
 
	private int numV;
	private boolean directed;
	
	public AbstractGraph(int numV, boolean directed){
		this.numV = numV;
		this.directed = directed;
	}
	
	public int getNumV(){
		return numV;
	}
	
	public boolean getDirected(){
		return directed;
	}
	
	
	
}
