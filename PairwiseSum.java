package practice;

import java.util.Arrays;

public class PairwiseSum {
	static int[] pairwiseSum(int[] a) {
		int length = a.length;
		if(length%2 != 0 || length == 0)
			return null;
		int[] result = new int[length/2];
		int index = 0;
		for(int i=0, j=i+1; i < length-1; i +=2, j +=2) {
			result[index] = a[i] + a[j];
			index ++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(pairwiseSum(new int[] {2, 1, 18})));

	}

}
