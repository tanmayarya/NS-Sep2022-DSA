package Functions;

import java.util.Scanner;

public class Intro {
	
	public static int factorial(int n) {
		int nfact = 1;
		
		for(int i = 1; i <= n; i++)
			nfact *= i;
		
		System.out.println(nfact);
		return nfact;
	}
	
	public static int ncr(int n, int r) {
		int nfact = factorial(n);
		int rfact = factorial(r);
		int nmrfact = factorial(n - r);
		int ncr = nfact / (rfact * nmrfact);
		return ncr;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		System.out.println(ncr(n, r));
	}

}
