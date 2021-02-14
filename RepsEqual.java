package practice;

public class RepsEqual {
	int repsEqual(int[] a, int n) {
		int lengthArray = a.length;
		int multipleOfTen = 1;
		int arrayToNumber = 0;
		for(int i= lengthArray-1; i >= 0; i--) {
			arrayToNumber += (a[i]*multipleOfTen);
			multipleOfTen *= 10;
			
			
		}
		if(arrayToNumber == n)
			return 1;
		return 0;
		
		
		
	}

	public static void main(String[] args) {
		int[] arr = {0, 0, 3, 2, 0, 5, 3};
		RepsEqual re = new RepsEqual();
		System.out.println(re.repsEqual(arr, 32053));

	}

}
