package hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String...args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int i = Integer.parseInt(line);
		if(i<1 || i>10){
			throw new IllegalArgumentException("Invalid Exception");
		}
		System.out.println(factorial(i));
	}
	
	public static int factorial(int i){
		if(i==1) return 1;
		return i*factorial(i-1);
	}
	
}
