package practice;

public class IsIsolated {
	static long isIsolated(long n) {
		if((n < 0) || (n > 2_097_151L))
				return -1;
		
		long square = n*n;
		
		while(square > 0) {
			long digit = square%10;
			long cube = n*n*n;

			while(cube > 0) {
				
				long digit2 =cube%10;
				if(digit == digit2)
					return 0;
				cube /=10;
				continue;
				
			}
			square /=10;
			continue;
			
		}
		return 1;
		
	}

	public static void main(String[] args) {
		System.out.println(isIsolated(162));

	}

}
