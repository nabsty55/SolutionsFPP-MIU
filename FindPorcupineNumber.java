package practice;

public class FindPorcupineNumber {
	static int isPrime(int n) {
		if(n <=1)
			return 0;
		
		for(int i=2; i < n; i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}
	static int findPorcupineNumber(int n) {
		int previous = 1;

		int start = n+1;
		boolean flag = false;
		 starter: while(flag == false) {
			if(isPrime(start) == 1) {
				if(start%10 == 9) {
					if(previous%10 ==9 ) {
						flag= true;
						break;
						
					}
					previous = start;
					start ++;
					continue starter;
				}
				previous = start;
				start ++;
				continue starter;
				
			}
			start++;
		}
		return previous;
		
	}

	public static void main(String[] args) {
		System.out.println(findPorcupineNumber(139));

	}

}
