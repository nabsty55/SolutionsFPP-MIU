package practice;

public class IsDigitSum {
	static int isDigitSum(int n, int m) {
		if(n < 0)
			return -1;
		int num = n;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		if(sum < m)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isDigitSum(-543, 3));

	}

}
