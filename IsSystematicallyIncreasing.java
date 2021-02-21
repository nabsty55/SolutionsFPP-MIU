package practice;

public class IsSystematicallyIncreasing {
	static int isSystematicallyIncreasing(int[] a) {
		int limit = 2;
		for(int i = 0; i < a.length;) {
			for(int j=i, k=1; k < limit; j++, k++, i++) {
				if(a[j] != k)
					return 0;
				continue;
			}
			limit ++;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isSystematicallyIncreasing(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));

	}

}
