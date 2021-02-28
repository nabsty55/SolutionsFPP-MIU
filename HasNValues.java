package practice;

public class HasNValues {
	static int hasNValues(int[] a, int n) {
		int[] arr = new int[n];
		int count = 0;
		int index = 0;
		outer: for(int i= 0; i < a.length; i++) {
			for(int j=0; j <count; j++) {
				if(a[i] == arr[j])
					continue outer;
			}
			count ++;
			if(count > n)
				return 0;
			arr[index] = a[i];
			index ++;
			
		}
		if(count < n)
			return 0;
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 10));

	}

}
