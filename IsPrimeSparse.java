package practice;

public class IsPrimeSparse {
	static int isPrimeSparse(int[] a) {
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			if(isPrime(a[i]) == 1 && isPrime(a[j]) == 1)
				return 0;
		}
		return 1;
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
		System.out.println(isPrimeSparse(new int[] {7, 25, 7, 4, 7}));

	}

}
