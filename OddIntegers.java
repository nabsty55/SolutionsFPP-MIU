package practice;

import java.util.Arrays;

public class OddIntegers {
	static int[] oddIntegers(int[] a) {
		int count = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 1)
				count++;
		}
		int[] arr = new int[count];
		int k = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i]%2 == 1) {
				arr[k] = a[i];
				k ++;
			}
				
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(oddIntegers(new int[] {1,2,3,4,5,6})));
	}

}
