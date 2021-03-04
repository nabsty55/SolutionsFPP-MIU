package practice;

public class IsNice {
	static int isNice(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int num1 = a[i] + 1;
			int num2 = a[i] - 1;
			for(int j=0; j < a.length; j++) {
				if(a[j] == num1 || a[j] == num2)
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isNice(new int[] {3, 4, 5, 7}));

	}

}
