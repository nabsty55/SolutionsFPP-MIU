package practice;

public class DigitIncreasing {
	int isDigitIncreasing(int n) {
		for(int digit=1; digit <=9; digit++) {
			int sumOfDigits = 0;
			int nextDigit = 0;
			
			while(sumOfDigits < n) {
				nextDigit = (nextDigit*10)+ digit;
			 	sumOfDigits += nextDigit;
			}
			if(sumOfDigits == n)
				return 1;
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		DigitIncreasing di = new DigitIncreasing();
		System.out.println(di.isDigitIncreasing(984));
	

	}

}
