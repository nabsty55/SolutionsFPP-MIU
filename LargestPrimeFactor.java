package practice;

public class LargestPrimeFactor {
	static int largestPrimeFactor(int n) {
		if(n <= 1)
			return 0;
		int largestPrime = 0;
		for(int i=2; i < n; i++) {
			if(n%i == 0) {
				if(isPrime(i) == 1)
					largestPrime = i;
			}
		}
		return largestPrime;
	}
	static int isPrime(int n) {
		if(n <= 1)
			return 0;
		for(int i=2; i < n; i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(10));

	}

}
