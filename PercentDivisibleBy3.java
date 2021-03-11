package practice;

public class PercentDivisibleBy3 {
	static float percentDivisibleBy3(int[] a) {
		float count = 0.0f;
		for(int i=0; i < a.length; i++) {
			if(a[i]%3 == 0)
				count ++;
		}
		return count/a.length*100;
	}

	public static void main(String[] args) {
		System.out.println(percentDivisibleBy3(new int[] {3, 4, 36, 12, 25, 5, 7}));

	}

}
