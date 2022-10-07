package Basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// print 1 to 5
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
//		for(int i = 1; i <= n; i++) {
//			System.out.println(i);
//		}
//		System.out.println(i);
		
//		for(;;) {
//			
//		}
		
//		if(true) {
//			int var = 1;
//		}
//		System.out.println(var);
//		int i = 1;
//		while(i <= n) {
//			System.out.println(i);
////			i++;
//		}
//		
//		for(;;) {
//			for(;;) {
//				
//			}
//		}
		
//		do {
//			System.out.println("in do while loop");
		
//		} while (true);
		
		
		// print odd numbers from 1 to n
//		for(int i = 1; i <= n; i++) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		for(int i = 1; i <= n; i += 2) 
			System.out.println(i);
		
		
	}

}
