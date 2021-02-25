package practice;

import java.util.Arrays;

public class FilterArray {
	static int[] filterArray(int[] a, int n) {
		int num = n;
		int count = 0;
		int index = 0;
		while(num > 0) {
			int digit = num%2;
			if(digit == 1) {
				
				count ++;
			}
			index ++;
			num /= 2;		
		}
		if(a.length < index)
			return null;
		int[] result = new int[count];
		int num2 = n;
		int index2 = 0;
		int resultIndex = 0;
		while(num2 > 0) {
			int digit = num2%2;
			if(digit == 1) {
				result[resultIndex] = a[index2];
				resultIndex ++;
			}
			index2++;
			num2 /= 2;
			
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(filterArray(new int[] {9, -9}, 4)));

	}

}
