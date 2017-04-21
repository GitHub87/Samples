package hackerEarth;

import java.util.Scanner;

public class DigitProblem {

	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		int k = sc.nextInt();
		/*if(X<1 || X>Math.pow(10, 18)){
			throw new IllegalArgumentException();
		}*/
		if(k<0 || k>9){
			throw new IllegalArgumentException();
		}
		for(int i=0;i<X.length();i++){
			if(k==0){
				break;
			}
			if(X.charAt(i)!='9'){
				X = X.substring(0,i)+'9'+X.substring(i+1);
				k--;
			}
		}
		System.out.println(X);
	}
	
}
