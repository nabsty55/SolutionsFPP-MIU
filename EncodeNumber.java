package practice;


public class EncodeNumber {
	static int [] encodeNumber(int n) {
		if(n <= 1)
			return null;
		int count = 0;
		int num = n;
		while(num > 1) {
			for(int i=1; i <= num; ) {
				if(num % i == 0) {
					if(isPrime(i) == 1) {
						num /= i;
						count ++;
						continue;
					}
					
					
				}
				i++;
				
			}
			
		}
		int[] a = new int[count];
		int startCount = 0; 
		while(n > 1) {
			start:for(int j=1; j <= n; ) {
				if(n % j == 0) {
					if(isPrime(j) == 1) {
						for(int k=startCount; k < count; ) {
							a[k] = j;
							startCount++;
							n /= j;
							
							continue start;
							
						}
						
					}
					j++;
					continue;
					
				}
				j++;
				
			}
			
		}
		
		return a;
	}
	
	static int isPrime(int n) {
		if(n <= 1)
			return 0;
		for(int i=2; i < n; i++) {
			if(n%i == 0)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(encodeNumber(1200));

	}

}
