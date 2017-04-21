package hackerEarth;

public class ToggleString {

	public static String toggleString(String input){
		if(input.length()<1 || input.length()>100){
			throw new IllegalArgumentException("Invalid Input.");
		}
		StringBuilder finalString = new StringBuilder();
		for(char a:input.toCharArray()){
			if(Character.isUpperCase(a)){
				finalString.append(Character.toLowerCase(a));
			}else{
				finalString.append(Character.toUpperCase(a));
			}
		}
		return finalString.toString();
	}
	
	public static void main(String...args){
		System.out.println(toggleString("EaCaaeeRE"));
	}
	
}
