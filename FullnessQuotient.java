package practice;

public class FullnessQuotient {
	static int fullnessQuotient(int n) {
		if(n < 0)
			return -1;
		int count = 0;
		outer: for(int i=2; i <= 9; i++) {
			int num = n;
			while(num > 0) {
				int digit = num % i;
				if(digit == 0)
					continue outer;
				num /= i;
			}
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(fullnessQuotient(-4));

	}

}
