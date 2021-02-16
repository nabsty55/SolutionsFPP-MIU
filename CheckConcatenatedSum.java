package practice;

public class CheckConcatenatedSum {
	static int checkConcatenatedSum(int n, int catlen) {
		int num = n;
		int sum = 0;
		int digit = 0;
		
		
		
		while(num > 0) {
			digit = num %10;
			int catlenDigit = 0;
			int multiple10 = 1;
			for(int i=0; i < catlen; i++) {
				catlenDigit +=(digit* multiple10);
				multiple10 *=10;
				
			}
			sum += catlenDigit;
			num /= 10;
			
			
			
		}
		if(sum ==n)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(checkConcatenatedSum(13332, 4));

	}

}
