package practice;

public class IsPrimeProduct {
	static int isPrimeProduct(int n) {
		int count = 0;
		int num = n;
		int divisor = 2;
		while(num > 1) {
			if(isPrime(divisor)==1) {
				if(num%divisor == 0) {
					num /= divisor;
					count ++;
					continue;
				}
				divisor ++;
				continue;
			}
			divisor ++;
			
		}
		if(count == 2)
			return 1;
		return 0;
	}
	
	static int isPrime(int n) {
		if( n < 2)
			return 0;
		for(int i=2; i < n; i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeProduct(323));

	}

}
