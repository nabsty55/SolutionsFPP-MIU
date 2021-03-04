package practice;

public class IsBunker {
	static int isBunker(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(isPrime(a[i])==1) {
				for(int j=0; j < a.length; j++) {
					if(a[j] ==1)
						return 1;
				}
			}
			if(a[i] == 1) {
				for(int j=0; j < a.length; j++) {
					if(isPrime(a[j]) ==1)
						return 1;
				}
			}
		}
		return 0;
	}
	
	static int isPrime(int n) {
		if( n < 2)
			return 0;
		for(int i=2; i < n; i ++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	
	public static void main(String[] args) {
		System.out.println(isBunker(new int[] {3, 7, 1, 8, 1}));

	}

}
