package practice;

public class StackedNumber {
	static int isStacked(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(sum == n) {
				return 1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isStacked(9));

	}

}
