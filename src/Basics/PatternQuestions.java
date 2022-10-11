package Basics;

import java.util.Scanner;

public class PatternQuestions {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//		for(int i = 1; i <= row; i++) {
//			System.out.print("*");
//		}
		
		// print n rows
//		for(int row = 1; row <= n; row++) {
//			// print 1 row
//			for(int col = 1; col <= row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= n; row++) {
//			// print 1 row
//			for(int col = 1; col <= row; col++) {
//				System.out.print(col + " ");
//			}
//			System.out.println();
//		}
		
//		int count = 1;
//		for(int row = 1; row <= n; row++) {
//			// print 1 row
//			for(int col = 1; col <= row; col++) {
//				System.out.print(count++ + " ");
//			}
//			System.out.println();
//		}
		
//		for(int row = 1; row <= n; row++) {
//			
//			for(int col = 1; col <= n + 1 - row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int row = 1; row <= n; row++) {
			//print space
			for(int col = 1; col <= n - row; col++)
				System.out.print(" ");
			
			// print stars
			for(int col = 1; col <= row; col++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}

}
