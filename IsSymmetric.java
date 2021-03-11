package practice;

public class IsSymmetric {
	static int isSymmetric(int[] a) {
		if(a.length%2 == 1) {
			int mid = a.length/2;
			for(int i=mid-1, j = mid+1; j < a.length; i--, j++) {
				if(a[i] != a[j])
					return 0;
				
			}
		}else {
			int mid1 = a.length/2;
			int mid2 = a.length/2-1;
			for(int i= mid1+1, j= mid2-1; i < a.length; i++, j--) {
				if(a[i] != a[j])
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isSymmetric(new int[] {4, 5, 6, 6, 5, 4}));

	}

}
