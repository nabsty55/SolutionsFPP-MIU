package practice;

public class ConvertToBase10 {
	int isLegalNumber(int[] a, int n) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= n)
				return 0;
		}
		
		return 1;
	}
	int convertToBase10(int[] a, int base) {
		int sum = 0;
		int multiplier = 1;
		if(isLegalNumber(a, base) == 0)
			return -1;
		else
			for(int i = a.length-1; i >= 0; i --) {
				sum += a[i]*multiplier;
				multiplier *=base;
				
			}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = {1, 1, 2};
		ConvertToBase10 ctb = new ConvertToBase10();
		System.out.println(ctb.convertToBase10(arr, 3));

	}

}
