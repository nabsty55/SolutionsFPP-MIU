package practice;

public class IntegerEquivalent {
	static int integerEquivalent(char[] a) {
		if(a == null || a.length ==0)
			return -1;
		int sum = 0;
		int mult = 1;
		for(int i= a.length-1; i >=0; i--) {
			int digit = Character.getNumericValue(a[i]);
			if(digit == -1)
				return -1;
			sum += (digit* mult);
			mult *= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(integerEquivalent(new char[] {'1', '3', '9'}));

	}

}
