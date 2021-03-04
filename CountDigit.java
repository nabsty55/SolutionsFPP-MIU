package practice;

public class CountDigit {
	static int countDigit(int n, int digit) {
		if(n < 0 || digit < 0)
			return -1;
		int num = n;
		int count = 0;
		while(num > 0) {
			if(num%10 == digit)
				count++;
			num /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigit(3112311, 2));

	}

}
