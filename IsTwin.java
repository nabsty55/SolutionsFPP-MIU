package practice;

public class IsTwin {
	static int isTwin(int[] a) {
		for(int i= 0; i < a.length; i++) {
			if(isPrime(a[i]) == 1) {
				int n1 = a[i] + 2;
				int n2 = a[i] - 2;
				if(isPrime(n1) == 1 || isPrime(n2) == 1) {
					for(int j= 0; j < a.length; j++) {
						if((a[j] == n1 && isPrime(n1)==1) || (a[j] == n2 && isPrime(n2)==1))
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
		for(int i=2; i < n; i++) {
			if(n%i ==0)
				return 0;
		}
			
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isTwin(new int[] {11, 9, 12, 13, 23}));

	}

}
