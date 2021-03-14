package practice;

import java.util.Arrays;

public class EliminateDuplicates {
	static int[] eliminateDuplicates(int[] a) {
		if(a ==null || a.length == 0)
			return new int[0];
		int count = 0;
		outer: for(int i=0, k=0; i < a.length; i++, k++) {
			for(int j=0; j < k; j++) {
				if(a[i] == a[j])
					continue outer;
			}
			count ++;
		}
		int[] arr = new int[count];
		int index = 0;
		outer2: for(int i=0, k=0; i < a.length; i++, k++) {
			for(int j=0; j < k; j++) {
				if(a[i] == a[j])
					continue outer2;
			}
			arr[index] = a[i];
			index ++;
		}
		return arr;
		
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(eliminateDuplicates(new int[] {1,2,2,3,3,3,4,4,4,4})));

	}

}
