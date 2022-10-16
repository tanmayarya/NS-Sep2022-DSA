package Arrays;

import java.util.Iterator;

public class BasicQuestions {
	
	public static int sumOfTheArray(int arr[]) {
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		return ans;
	}
	
	public static int max(int arr[]) {
		
		int currMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > currMax)
				currMax = arr[i];
		}
		return currMax;
	}
	
	
	public static int linearSearch(int arr[], int val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val)
				return i;
		}
		
		return -1;
	}
	
	public static int frequency(int arr[], int key) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				count++;
		}
		return count;
	}
	
	public static boolean isElementRepeated(int arr[], int elem) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == elem) {
				count++;
				if(count > 1) return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int a[] = {10, 8, 2, 5, 10, 6};
//		System.out.println(sumOfTheArray(a));
//		System.out.println(max(a));
		
//		int idx = linearSearch(a, 6);
//		if(idx == -1) System.out.println("not found");
//		else System.out.println(idx);
//		System.out.println(frequency(a, 7));
		System.out.println(isElementRepeated(a, 10));
	}

}
