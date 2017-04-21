package cryptographySamples;

public class Rot13_Sample_1 {
	
	public static String rot13Alg(String input){
		StringBuilder output = new StringBuilder();
		if(input == null){
			return output.toString();
		}
		if(input.trim().equals("")){
			throw new IllegalArgumentException("Invalid input.");
		}
		char[] charBuffer = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		for(char temp:input.toCharArray()){
			for(char temp2:charBuffer){
				if(Character.isUpperCase(temp)){
					Character.toUpperCase(temp2);
				}
				if(temp == temp2){
					Character.
				}
			}
		}
		
		return output.toString();
	}

}
