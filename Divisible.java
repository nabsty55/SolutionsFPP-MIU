package practice;

public class Divisible {
	
	static int isDivisible(int[]a, int divisor) {
		int count = 0;
		for(int i=0; i< a.length; i++) {
			if(a[i]% divisor != 0)
				count ++;
			
		}
		if(count == 0)
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args) {
		int[] arr = {3, 3, 6, 36};
		System.out.println(isDivisible(arr, 3));
		

	}

}
