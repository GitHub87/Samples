package hackerEarth;


import java.util.Scanner;

public class FindProduct {

	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //Size of the array
		if(N<1 || N>1000) throw new IllegalArgumentException("Invalid input.");
		int[] A = new int[N];
		for(int i = 0; i<N;i++){
		A[i] = sc.nextInt();
		if(A[i]<1 || A[i]>1000) {
			throw new IllegalArgumentException("Invalid input.");
		}
		}
		
		double answer = 1;
		double divisor = Math.pow(10, 9)+7;
		for(int i=0;i<N;i++){
			answer = answer*A[i]%divisor;
		}
		
		System.out.println(answer);
	}
	
	
}
