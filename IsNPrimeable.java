package practice;

public class IsNPrimeable {
	static int isNPrimeable(int[] a, int n) {
		for(int i=0; i < a.length; i++) {
			if(isPrime(a[i]+n) == 0)
				return 0;
		}
		return 1;
	}
	static int isPrime(int n) {
		if(n < 2)
			return 0;
		for(int i=2; i < n; i++) {
			if(n%i ==0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(isNPrimeable(arr, 2));

	}

}
