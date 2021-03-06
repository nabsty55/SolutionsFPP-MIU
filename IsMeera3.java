package practice;

public class IsMeera3 {
	static int isMeera(int[] a) {
		int sum = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] > i)
				return 0;
			sum += a[i];
		}
		if(sum == 0)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] {-8, 0, 0, 8, 0}));

	}

}
