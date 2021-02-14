package practice;

public class NextPerfectSquare {
	static int nextPerfectSquare(int n) {
		int pSquare = 0;
		int next = -1;
		int digit = 0;
		while(next < n) {
			pSquare = digit *digit;
			if(pSquare > n)
				next = pSquare;
			digit ++;
			
		}
		return next;
		
	}

	public static void main(String[] args) {
		System.out.println(nextPerfectSquare(36));
	

	}

}
