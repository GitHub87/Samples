package cryptographySamples;

public class Rot13 {

	public static String rot13(String text) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) < 'A' || text.charAt(i) > 'Z') {

				throw new IllegalArgumentException("Text must contain only uppercase english letters");

			}

			builder.append((char) ('A' + ((text.charAt(i) - 'A' + 13) % 26)));

		}

		return builder.toString();

	}
	
	public static void main(String[] args){
		System.out.println(rot13("abc"));
	}

}
