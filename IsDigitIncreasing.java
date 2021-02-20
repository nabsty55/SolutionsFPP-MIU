package practice;

public class IsDigitIncreasing {
	static int isDigitIncreasing(int n) {
		if(n < 10)
			return 1;
		int firstDigit = 0;
		int count = 0;
		int num = n;
		int digit = 0;
		while(num > 0) {
			digit = num%10;
			count ++;
			firstDigit = digit;
			num /=10;
		}
		
		int multiple10 = 10;
		for(int i=firstDigit; i > 0; i--) {
			int sumDigit = i;
			int counter = count;
			int sum = 0;
			while(counter > 0) {
				sum +=sumDigit;
				sumDigit *= multiple10;
				sumDigit += i;
				counter --;
			}
			if(sum == n)
				return 1;
		}
		return 0;
		
	}
	

	public static void main(String[] args) {
		System.out.println(isDigitIncreasing(7404));

	}

}
