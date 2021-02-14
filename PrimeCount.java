package practice;

public class PrimeCount {
	static boolean isPrime(int n) {
		boolean flag = true;
		if( n <=1)
			flag = false;
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				flag = false;
		}
		return flag;
	}
	static int primeCount(int start, int end) {
		int count = 0;
		for(int j= start; j <= end; j++) {
			if(isPrime(j))
				count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(primeCount(-10, 6));

	}

}
