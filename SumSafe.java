package practice;

public class SumSafe {
	static int isSumSafe(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		for(int j=0; j<a.length; j++) {
			if(a[j] == sum)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isSumSafe(new int[] {5,-2,1}));

	}

}
