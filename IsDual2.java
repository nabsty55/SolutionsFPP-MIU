package practice;

public class IsDual2 {
	static int isDual(int[] a) {
		if(a.length%2 == 1)
			return 0;
		for(int i=0, j=2; j < a.length-1; i +=2, j +=2) {
			int sum1 = a[i] + a[i+1];
			int sum2 = a[j] + a[j+1];
			if(sum1 != sum2)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isDual(new int[] {1, 2, 1}));

	}

}
