package practice;

public class IsBalanced {
	static int isBalanced(int[] a) {
		int num = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] < 0)
				num = a[i] * -1;
			if(a[i] > 0)
				num = a[i];
			
			for(int j=0; j < a.length; j++) {
				if(a[j] == num)
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isBalanced(new int[] {-2, 3, 2, -3} ));

	}

}
