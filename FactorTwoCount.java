package practice;

public class FactorTwoCount {
	static int factorTwoCount(int n) {
		int count = 0;
		int num = n;
		while(num%2 ==0) {
			count ++;
			num /= 2;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(factorTwoCount(64));

	}

}
