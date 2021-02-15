package practice;

public class LargestAdjacentSum2 {
	static int largestAdjacentSum2(int [] a) {
		int largestSum = 0;
		for(int i=0, j= i+1; i < a.length-1 || j <a.length; i++, j++) {
			int sum = a[i] + a[j];
			if(sum> largestSum)
				largestSum = sum;
			
		}
		return largestSum;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(largestAdjacentSum2(arr));

	}

}
