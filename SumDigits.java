package practice;

public class SumDigits {
	static int sumDigits(int n) {
		int sum = 0;
		int num = n;
		while(num > 0) {
			int digit = num%10;
			sum += digit;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumDigits(0));

	}

}
