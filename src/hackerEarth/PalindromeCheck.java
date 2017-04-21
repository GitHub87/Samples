package hackerEarth;

public class PalindromeCheck {

	public static String checkPalindrome(String input){
		
		if(input.length()<1 || input.length()>100){
			throw new IllegalArgumentException("Invalid input.");
		}
		input = input.toLowerCase();
		final  String YES = "Yes";
		final String NO = "NO";
		StringBuilder tempString = new StringBuilder();
		tempString.append(input);
		tempString.reverse();
		if(input.equals(tempString.toString())){
			return YES;
		}
		return NO;
	}
	
	public static void main(String...args){
		System.out.println(checkPalindrome("izvnxvusaemgsgujwjaxkwdyeufbpfgbilfyxozyssuufxwfduudfwxfuussyzoxyflibgfpbfueydwkxajwjugsgmeasuvxnvzi"));
	}
}
