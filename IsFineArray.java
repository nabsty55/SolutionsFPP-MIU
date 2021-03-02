package practice;

public class IsFineArray {
	static int isFineArray(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(isPrime(a[i]) == 1) {
				int x = a[i]+2;
				int y = a[i]-2;
				if(isPrime(x)==1 || isPrime(y)==1) {
					for(int j=0; j < a.length; j++) {
						if(a[j] == x || a[j] == y)
							break;
						if(j == a.length-1)
							return 0;
					}
				}
			}
		}
		return 1;
		
	}
	
	static int isPrime(int n) {
		if(n < 2)
			return 0;
		for(int i=2; i < n; i ++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(isFineArray(new int[] {3, 8, 15, 5}));

	}

}
