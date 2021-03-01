package practice;

public class IsZeroBalanced {
	static int isZeroBalanced(int[] a) {
		if(a.length == 0)
			return 0;
		int sum = 0;
		for(int i=0; i < a.length; i++) {
			sum += a[i];
		}
		if(sum != 0)
			return 0;
		outer:for(int i=0; i < a.length/2; i++) {
			for(int j=i+1; j < a.length; j++) {
				if(a[i] > 0) {
					int num = a[i] * -1;
					if(num == a[j])
						continue outer;
					if(j == a.length-1)
						return 0;
				}
				if(a[i] < 0) {
					int num = a[i] * -1;
					if(num == a[j])
						continue outer;
					if(j == a.length-1)
						return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isZeroBalanced(new int[] {3,-3,-3}));

	}

}
