package practice;

public class IsBunkerArray {
	static int isBunkerArray(int[] a) {
		for(int i=0; i < a.length-1; i++) {
			if(a[i]%2 == 1) {
				if(isPrime(a[i+1])==1)
					return 1;
			}
			
		}
		return 0;
	}
	
	static int isPrime(int n) {
		if(n < 2)
			return 0;
		for(int i = 2; i < n; i ++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isBunkerArray(new int[] {4, 9, 6, 15, 21}));

	}

}
