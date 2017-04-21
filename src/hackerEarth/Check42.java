package hackerEarth;

import java.io.IOException;
import java.util.Scanner;

public class Check42 {

	public static void main(String... args) throws IOException {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			int i = Integer.parseInt(s.next());
			if (i != 42) {
				System.out.println(i);
			} else {
				break;
			}
		}
	}

}
