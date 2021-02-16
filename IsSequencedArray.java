package practice;

public class IsSequencedArray {
	static int isSequencedArray(int[] a, int m, int n) {
		for(int i=0; i < a.length-1; i++) {
			if(a[i] > a[i+1])
				return 0;
		}
		for(int j=m; j <= n; j++) {
			int count = 0;
			for(int k=0; k < a.length; k++) {
				if(j == a[k])
					count++;
				if(k == (a.length-1)) {
					if(count < 0)
						return 0;
				}
					
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {-5,-5,-4,-4,-4,-3,-3,-2,-2};
		System.out.println(isSequencedArray(arr, -5,-2));

	}

}
