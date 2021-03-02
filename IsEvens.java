package practice;

public class IsEvens {
	static int isEvens(int n) {
		int num = n;
		while(num > 0) {
			int digit = num%2;
			if(digit%2 != 0)
				return 0;
			num /= 10;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isEvens(426854));

	}

}
