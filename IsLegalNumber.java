package practice;

public class IsLegalNumber {
	static int isLegalNumber(int[] a, int n) {
		int countIllegal = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= n) {
				countIllegal ++;
				break;
			}
		}
		if(countIllegal == 0)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		int [] arr = {3,7,1};
		System.out.println(isLegalNumber(arr, 6));

	}

}
