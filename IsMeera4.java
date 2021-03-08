package practice;

public class IsMeera4 {
	static int isMeera(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(a[i] == 0) {
				for(int j=0; j < a.length; j++) {
					if(isPrime(a[j]) == 1)
						return 1;
					if(j == a.length-1)
						return 0;
				}
			}
			if(isPrime(a[i]) == 1) {
				for(int j=0; j < a.length; j++) {
					if(a[j] == 0)
						return 1;
					if(j == a.length-1)
						return 0;
				}
			}
		}
		return 1;
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
		System.out.println(isMeera(new int[] {3, 7, 0, 8, 0, 5} ));

	}

}
