package practice;

public class AllValuesTheSame {
	static int allValuesTheSame(int[] a) {
		for(int i=0, j=i+1; j < a.length; j++) {
			if(a[i] != a[j])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(allValuesTheSame(new int[] {122323232}));

	}

}
