package practice;

public class CountOnes {
	static int countOnes(int n) {
		int count = 0;
		int num = n;
		while(num > 0) {
			int digit = num%2;
			if(digit == 1)
				count ++;
			num /= 2;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countOnes(15));

	}

}
