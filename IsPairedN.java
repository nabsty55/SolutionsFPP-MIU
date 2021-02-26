package practice;

public class IsPairedN {
	static int isPairedN(int[] a, int n) {
		int length = a.length;
		int maxSum = (length-1) + (length -2);
		if(n < 0 || n > maxSum || length < 2)
			return 0;
		for(int i=0; i < length-1; i++) {
			for(int j=i+1; j < length; j++) {
				if(a[i] + a[j] == n && i + j == n)
					return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {1, 4, 1};
		System.out.println(isPairedN(arr, 5));

	}

}
