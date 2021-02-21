package practice;

public class IsFactorialPrime {
	static int isFactorialPrime(int n) {
		if(isPrime(n) == 1) {
			for(int i=1; i < n; i++) {
				if(n == factorial(i)+1)
					return 1;
				
			}
			return 0;
			
		}
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
	static int factorial(int n) {
		int factorial = 1;
		for(int i=1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(isFactorialPrime(8));

	}

}
