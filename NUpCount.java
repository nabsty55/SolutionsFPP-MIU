package practice;

public class NUpCount {
	static int nUpCount(int[] a, int n) {
		int count = 0;
		int partialSum = 0;
		int previousSum = 0;
		for(int i = 0; i < a.length; i++) {
			previousSum = partialSum;
			partialSum += a[i];
			if(previousSum <= n && partialSum >n)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,-1,5,3,2,-3};
		System.out.println(nUpCount(arr, 20));
		
	}

}
