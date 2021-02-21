package practice;

public class IsPrimeHappy {
	static int isPrimeHappy(int n) {
		int sum = 0;
		for(int i = 2; i < n; i++) {
			if(isPrime(i) == 1)
				sum += i;
		}
		if(sum == 0)
			return 0;
		if(sum%n == 0)
			return 1;
		return 0;
	}
	
	
	
	static int isPrime(int n) {
		if(n < 1)
			return 0;
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				return 0;
			
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeHappy(2));

	}

}
