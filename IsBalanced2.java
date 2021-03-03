package practice;

public class IsBalanced2 {
	static int isBalanced(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(i%2 == 0) {
				if(a[i]%2 == 1)
					return 0;
			}
			else if(i%2 == 1) {
				if(a[i]%2 == 0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isBalanced(new int[] {7, 15, 2, 3} ));

	}

}
