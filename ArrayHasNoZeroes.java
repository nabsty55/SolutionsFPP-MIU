package practice;

public class ArrayHasNoZeroes {
	static int arrayHasNoZeroes(int[] a) {
		
		for( int i = 0; i < a.length; i++ ) {
			if(a[i]== 0)
				return 0;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 0};
		System.out.println(arrayHasNoZeroes(arr));
		

	}

}
