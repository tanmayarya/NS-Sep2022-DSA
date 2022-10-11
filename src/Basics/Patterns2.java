package Basics;

import java.util.Scanner;

public class Patterns2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		//upper right triangle
//		for(int row = 1; row <= n; row++) {
//			// print spaces in row
//			for(int col = 1; col <= row - 1; col++) {
//				System.out.print(" ");
//			}
//			
//			// print stars in row
//			for(int col = 1; col <= n + 1 - row; col++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		// diamond
//		//upper half of diamond
//		for(int row = 1; row <= n; row++) {
//			// print spaces
//			for(int col = 1; col <= n - row; col++) {
//				System.out.print("  ");
//			}
//			
//			// print star
//			for(int col = 1; col <= 2*row - 1; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		// lower half of diamond
//		for(int row = 1; row <= n - 1; row++) {
//			
//			// print spaces
//			for(int col = 1; col <= row; col++) {
//				System.out.print("  ");
//			}
//			
//			// print stars
//			for(int col = 1; col <= 2*(n - row) - 1; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// revierse diamond
		//upper half of diamond
		for(int row = 1; row <= n; row++) {
			// print spaces
			for(int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			
			// print star
			for(int col = 1; col <= 2*row - 1; col++) {
				System.out.print("  ");
			}
			
			for(int col = 1; col <= n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// lower half of diamond
		for(int row = 1; row <= n - 1; row++) {
			
			// print spaces
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			
			// print stars
			for(int col = 1; col <= 2*(n - row) - 1; col++) {
				System.out.print("  ");
			}
			
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
