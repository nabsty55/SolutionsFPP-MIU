package practice;

public class IsVanilla {
	static int isVanilla(int[] a) {
		if(a.length == 0)
			return 1;
		int number = a[0];
		while(number > 0) {
			int digit = number%10;
			for(int i=1; i < a.length; i ++) {
				int number2 = a[i];
				while(number2 > 0) {
					int digit2 = number2%10;
					if(digit != digit2)
						return 0;
					number2 /= 10;
				}
			}
			number /= 10;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isVanilla(new int[] {111,1,11,1,1,111}));

	}

}
