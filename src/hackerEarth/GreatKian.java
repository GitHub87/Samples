package hackerEarth;

import java.util.Scanner;

public class GreatKian {

	public static void main(String...args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//String s = sc.next();
		int[] intArr = new int[n];
		for(int i = 0;i<n;i++){
			intArr[i]=sc.nextInt();
		}
		
		/*int sum1 = intArr[1]+intArr[4]+intArr[7];
		int sum2 = intArr[2]+intArr[5]+intArr[8];
		int sum3 = intArr[3]+intArr[6]+intArr[9];*/
		System.out.println(intArr);
		System.out.println(intArr[1]+intArr[4]+intArr[7]+" "+intArr[2]+intArr[5]+intArr[8]+" "+intArr[3]+intArr[6]+intArr[9]);
	}
	
}
