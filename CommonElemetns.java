package practice;

import java.util.Arrays;

public class CommonElemetns {
	static int[] commonElements(int[] first, int[] second) {
		if(first == null || second == null)
			return null;
		int count = 0;
		for(int i=0; i < first.length; i++) {
			for(int j= 0; j < second.length; j++) {
				if(first[i] == second[j]) {
					count ++;
					break;
				}
			}
		}
		int[] arr = new int[count];
		if(count == 0)
			return arr;
		int index = 0;
		for(int i=0; i < first.length; i++) {
			for(int j= 0; j < second.length; j++) {
				if(first[i] == second[j]) {
					arr[index] = first[i];
					index ++;
					break;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(commonElements(new int[] {1, 2, 3}, new int[] {})));

	}

}
