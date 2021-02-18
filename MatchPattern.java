package practice;

public class MatchPattern {
	static int matchPattern(int[] a, int[] pattern) {
		int i=0;
		int k=0;
		int matches = 0;
		for(i=0; i < a.length; i++) {
			if(a[i] == pattern[k])
				matches++;
			else if(matches == 0 || k == pattern.length-1)
				return 0;
			else {
				k++;
				if(a[i] == pattern[k]) {
					matches++; 
					continue;
					
				}
					
				
				return 0;
			}
				
		}
		if(i == a.length && k == pattern.length-1)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		int[]  arr = {1,1,2,2,3,4,4,5,5,5,6,7};
		int[] pattern = {1,2,3,4,5,6,7};
		System.out.println(matchPattern(arr, pattern));

	}

}
