package practice;

public class IsLegalNumber {
	static int isLegalNumber(int[] a, int n) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= n) {
				return 0;
			}
		}
		
		return 1;
	}

	public static void main(String[] args) {
		int [] arr = {3,5,1};
		System.out.println(isLegalNumber(arr, 6));

	}

}
