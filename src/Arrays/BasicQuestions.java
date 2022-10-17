package Arrays;

import java.util.Arrays;
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
	
	
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	} 
	
	public static void reverse(int arr[]) {
		int left = 0, right = arr.length - 1;
		
		while( left < right) {
			// swap elements at left and right
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			// move left and right
			left++;
			right--;
		}
	}
	
	public static int[] inverse(int arr[]) {
		int res[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) 
			res[arr[i]] = i;
		
		return res;
	}
	
	public static void targetSumPair(int arr[], int target) {
		
		// fix the first index
		for(int firstIdx = 0; firstIdx < arr.length - 1; firstIdx++) {
			
			// make
			for(int secondIdx = firstIdx + 1; secondIdx < arr.length; secondIdx++) {
				if(arr[firstIdx] + arr[secondIdx] == target)
					System.out.println(arr[firstIdx] + " " + arr[secondIdx]);
			}
		}
	}
	
	public static void targetSumPair2(int arr[], int target) {
		Arrays.sort(arr);
		
		int left = 0, right = arr.length - 1;
		while(left < right) {
			if(arr[left] + arr[right] == target) {
				System.out.println(arr[left] + " " + arr[right]);
				left++;
				right--;
			}
			else if(arr[left] + arr[right] > target) 
				right--;
			else left++;
		}
	}

	public static void main(String[] args) {

		int a[] = {10, 8, 2, 5, 10, 6, 7};
//		System.out.println(sumOfTheArray(a));
//		System.out.println(max(a));
		
//		int idx = linearSearch(a, 6);
//		if(idx == -1) System.out.println("not found");
//		else System.out.println(idx);
//		System.out.println(frequency(a, 7));
//		System.out.println(isElementRepeated(a, 10));
		
//		print(a);
//		reverse(a);
//		print(a);
		
		int arr[] = {2, 5, 1, 3, 4, 0};
		print(arr);
		print(inverse(arr));
		
		targetSumPair2(arr, 5);
		print(arr);
		
		
	}

}
