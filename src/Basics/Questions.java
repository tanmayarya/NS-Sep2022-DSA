package Basics;

import java.util.Scanner;

public class Questions {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
//		12340
//		4321		
		// reverse number
//		int num = scn.nextInt();
//		int ans = 0;
//		for(;num > 0; num /= 10) {
//			int rem = num % 10;
//			ans *= 10;
//			ans += rem;
//		}
//		System.out.println(ans);
		
		// factorial
//		int fact = 1;
//		
//		for(int i = 1; i <= num; i++) 
//			fact *= i;
//		
//		System.out.println(fact);
		
		// Power
//		int b = scn.nextInt();
//		int pow = 1;
//		for(int i = 1; i <= b; i++) {
//			pow *= num; // pow = pow * num
//		}
//		System.out.println(pow);
		
		// Log
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int count = 0;
		while(a != 1) {
			a /= b;
			count++;
		}
		System.out.println(count);
		
	}

}
