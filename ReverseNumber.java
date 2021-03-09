package practice;

public class ReverseNumber {
	static int reverseNumber(int n) {
		int sign = 1;
		if(n == 0)
			return 0;
		if(n < 0) {
			sign = -1;
			n = -n;
		}
		int reverse = 0;
		while(n != 0) {
			reverse = (reverse*10) + (n%10);
			n /= 10;
		}
		return reverse*sign;
		
	}
//		int sign = 1;
//		if(n == 0)
//			return 0;
//		if(n < 0) {
//			sign = -1;
//			n = -n;
//			
//		}
//		int count = 0;
//		int num = n;
//		
//		while(num != 0) {
//
//			count ++;
//			num /= 10;
//		}
//		int multiple = 1;
//		
//		for(int i=0; i < count-1; i++) {
//			multiple *= 10;
//		}
//		
//		
//		int sum = 0;
//		int num2 = n;
//		while(num2 > 0) {
//			int digit = num2%10;
//			sum += (digit*multiple);
//			multiple /= 10;
//			num2 /= 10;
//		}
//		return sum* sign;
//	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(-4321));

	}

}
