package practice;

public class LargestDifferenceOfEvens {
	static int largestDifferenceOfEvens(int[] a) {
		int largestEven = 0;
		int smallestEven = 0;
		int count = 0;
		for(int i= 0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				count ++;
				if(count ==1) {
					largestEven = a[i];
					smallestEven = a[i];
					continue;
				}
					
				if(a[i] > largestEven)
					largestEven = a[i];
				if(a[i] < smallestEven)
					smallestEven = a[i];
			}
		}
		if(count == 0)
			return -1;
		return (largestEven - smallestEven);
	}
	

	public static void main(String[] args) {
		System.out.println(largestDifferenceOfEvens(new int[] {-2, 3, 4, 9}));

	}

}
