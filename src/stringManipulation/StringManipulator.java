package stringManipulation;

public class StringManipulator {
	
	public String replaceSpaceWithChar(String actualString, String character){
		return actualString.replaceAll(" ", character);
	}
	
	public static void main(String...args){
		System.out.println(new StringManipulator().replaceSpaceWithChar("This is the truth ", "%20")); 
	}

	
	public String stringCompressor(String s){
		char[] sb = s.toCharArray();
		//char[] finalSb = new char[sb.length];
		for(int i = 0;i<sb.length;i++){
			if(sb[i]==sb[i+1]){
				
			}
		}
	}
}
