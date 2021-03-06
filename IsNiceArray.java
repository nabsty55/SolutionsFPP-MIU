package practice;

public class IsNiceArray {
	static int isNiceArray(int[] a) {
		int sum = 0;
		for(int i=0; i < a.length; i++) {
			if(isPrime(a[i])==1)
				sum += a[i];
		}
		if(sum == a[0])
			return 1;
		return 0;
	}
	
	static int isPrime(int n) {
		if(n < 2)
			return 0;
		for(int i=2; i < n; i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isNiceArray(new int[] {8, 5, -5, 5, 3}));

	}

}
