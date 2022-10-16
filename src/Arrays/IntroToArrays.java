package Arrays;

import java.util.Scanner;

public class IntroToArrays {

	public static void main(String args[]) {
//		System.out.println(args.length);
		
		
		int marks[];
		marks = new int[5];
		
//		System.out.println(marks.length);
		marks[2] = 60;
		marks[4] = 70;
		marks[0] = 10;
//		marks[5] = 20;
		
		for(int i = 0; i < marks.length; i++)
			System.out.println(marks[i]);
		
		
//		int arr[];
//		arr = new int[4];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 7;
//		arr[3] = 3;
		int arr[] = { 1, 2, 7, 3 };
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(i + " -> " +arr[i]);
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) 
			a[i] = scn.nextInt();
		
//		System.out.println(a);
		for(int i = 0; i < n; i++) 
			System.out.println(a[i]);

		
	}

}
