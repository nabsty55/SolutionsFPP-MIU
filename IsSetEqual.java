package practice;

public class IsSetEqual {
	static int isSetEqual(int[] a, int[] b) {
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < b.length; j++) {
				if(a[i] == b[j])
					break;
				if(j == b.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 7, 8};
		int[] arr2 = {1, 7, 1};
		System.out.println(isSetEqual(arr1, arr2));

	}

}
