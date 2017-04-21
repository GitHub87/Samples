package recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSamples {
	
	public void reverseString(String input){
		if(input == null || input.equals("")){
			return;
		}else{
		//System.out.println(input.charAt(0));
		reverseString(input.substring(1));
		System.out.println(input.charAt(0));
		}
	}
	
	public int findStringLength(String input){
		if(input == null || input.equals("")){
			return 0;
		}else{
			System.out.println(input.charAt(0));
			return 1 + findStringLength(input.substring(1));
		}
	}
	
	public int power(int input,int pow){
		if(pow == 0){
			return 1;
		}else{
			return input*power(input,pow-1);
		}
	}
	
	public int factorial(int input){
		if(input == 0 || input == 1){
			return 1;
		}else{
			return input*factorial(input-1);
		}
	}
	 
	public int gcd(int m, int n){
		if(m % n == 0){
			return n;
		}else if(m<n){
			return gcd(n,m);
		}else{
			return gcd(n, m % n);
		}
		
	}
	
	public int fibonacci(int n){
		if(n <= 2){
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	public double fibonacciWrapper(int n){
		return fiboEffecient(1, 0, n);
	}
	
	private double fiboEffecient(int current, int previous, int n){
		if(n == 1){
			return current;
		}else{
			return fiboEffecient(current+previous, current, n-1);
		}
	}
	
	static int MAX = 100;
	static int[] results;
	public static void buildArray(){
		results = new int[MAX];
	}
	
	public void iterativeFibonacciSoln(int n){
		buildArray();
		int x = 0, y = 1, z = 1;
		if(results[n]==0){
		for(int i=0; i<n; i++){
			x = y;
			y = z;
			z = x + y;
			results[n] = x;
		}
		}else{
			System.out.println("Got from the array.");
			x = results[n];
		}
		System.out.println("Iterative Fibonacci soln:"+ x);
	}
	
	public static void main(String...args){
		RecursiveSamples samples = new RecursiveSamples();
		samples.reverseString("Sujoy");
		System.out.println(samples.findStringLength("Sujoy"));
		System.out.println(samples.factorial(5));
		System.out.println(samples.power(5,5));
		System.out.println("GCD - "+samples.gcd(122334525, 625));
		//System.out.println("------------------- Fibonacci ineffecient--------------------");
		//System.out.println(samples.fibonacci(100));
		System.out.println("---------------------- Fibonacci effecient---------------------");
		System.out.println(samples.fibonacciWrapper(100));
		samples.iterativeFibonacciSoln(20);
	}
	
	

}
