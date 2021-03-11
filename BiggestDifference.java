package practice;

public class BiggestDifference {
	static int biggestDifference(int[] a) {
		int biggestDiff = -1;
		for(int i = 0; i < a.length-1; i++) {
			for(int j=i+1; j < a.length; j ++) {
				if(a[i] > a[j]) {
					int diff = a[i] - a[j];
					if(diff > biggestDiff)
						biggestDiff = diff;
				}
				else {
					int diff = a[j] - a[i];
					if(diff > biggestDiff)
						biggestDiff = diff;
				}
			}
		}
		return biggestDiff;
	}

	public static void main(String[] args) {
		System.out.println(biggestDifference(new int[] {4, 2, 7, 16, 20, 12}));

	}

}
