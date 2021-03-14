package practice;

import java.util.Arrays;

public class LargestAndSecondLargest {
	static int[] largestAndSecondLargest(int[] a) {
		int largest = a[0];
		int secondLargest = a[0];
		int[] arr = new int[2];
		for(int i=0; i < a.length; i++) {
			if(a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			}else if(a[i] > secondLargest)
				secondLargest = a[i];
		}
		arr[0] = largest;
		arr[1] = secondLargest;
		return arr;
		
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(largestAndSecondLargest(new int[] {5, 10, 13, 4, 7, 11})));

	}

}
