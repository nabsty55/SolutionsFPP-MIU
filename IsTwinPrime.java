package practice;

public class IsTwinPrime {
	static int isTwinPrime(int n) {
		if(isPrime(n) == 1) {
			if(isPrime(n+2)==1 || isPrime(n-2)==1)
				return 1;
			
		}
		return 0;
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
		System.out.println(isTwinPrime(53));

	}

}
