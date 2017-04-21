package hackerEarth;

import java.util.Scanner;

public class MagicalWord {

		
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Integer N = Integer.valueOf(sc.nextLine());
		String S = sc.nextLine();
		if(T<1 || T >100){
			throw new IllegalArgumentException("Invalid test case number.");
		}
		if(N<1 || N>500){
			throw new IllegalArgumentException("Invalid argument exception.");
		}
		for(char c:S.toCharArray()){
			int i = (int)c;
			if(i)
			System.out.println(i);
		}
	}
	
	int returnPrime(int i){
		if(n%2 == 0) return dPrime();
		for()
	}
}
