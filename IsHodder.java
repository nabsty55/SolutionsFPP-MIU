package practice;

public class IsHodder {
	static int isHodder(int n) {
		if(isPrime(n) == 1) {
			n +=1;
			while(n > 1) {
				if(n%2 != 0)
					return 0;
				n /= 2;
			}
			return 1;
			
		}
		return 0;
	}
	static int isPrime(int n) {
		
		if( n < 2)
			return 0;
		for(int i =2; i < n; i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isHodder(127));

	}

}
