package practice;

public class LargestAdjacentSum {
	
	static int largestAdjacentSum(int []a) {
		int sum = 0;
		int largestSum = 0;
		for(int i = 0; i <a.length-1; i++) {
			
			sum = a[i] + a[i+1];
			if(sum> largestSum)
				largestSum = sum;
		}
		
		return largestSum;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(largestAdjacentSum(arr));
		
	}
	

}



