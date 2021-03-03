package practice;

import java.util.Arrays;

public class Fill {
	static int[] fill(int[] arr, int k, int n) {
		if(k < 1 || n < 1)
			return null;
		int[] arr2 = new int[n];
		for(int i=0; i < arr2.length; ) {
			for(int j=0; j < k; j++) {
				arr2[i] = arr[j];
				i ++;
				if(i > arr2.length-1)
					break;
			}
		}
		return arr2;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fill(new int[] {2, 6, 9, 0, -3}, 0, 4)));

	}

}
