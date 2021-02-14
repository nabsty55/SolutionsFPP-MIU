package practice;

public class ComputeDepth2 {
	static int computeDepth(int n) {
		int depthCount = 0;
		int countNumbers = 0;
		int result = 0;
		int digit = 0;
		int [] a = new int[10];
		outer: while(countNumbers < 10) {
			for(int i =1;;i++) {
				result = n * i;
				depthCount ++;
				
				
			
		inner:	while(result != 0) {
				digit = result%10;
				if(countNumbers == 0) {
					a[countNumbers] = digit;
					countNumbers ++;
					result /= 10;
					continue;
				}
				for(int j=0; j < countNumbers; j++) {
					if(digit == a[j]) {
						result /= 10;
						continue inner;
					}
				}
				a[countNumbers] = digit;
				countNumbers ++;
				if(countNumbers == 10)
					continue outer;
				result /= 10;
				
				
			}
			
		}
		
	}
		return depthCount;
	}

	public static void main(String[] args) {
		System.out.println(computeDepth(42));
		

	}

}
