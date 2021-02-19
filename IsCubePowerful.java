package practice;

public class IsCubePowerful {
	static int isCubePowerful(int n) {
		if(n <=0)
			return 0;
		int sum = 0;
		int num = n;
		while(num > 0 ) {
			int digit = num%10;
			int cube = digit*digit*digit;
			sum += cube;
			num /= 10;
		}
		if(sum == n)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isCubePowerful(-81));

	}

}
