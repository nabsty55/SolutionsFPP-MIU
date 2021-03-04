package practice;

public class IsMeera {
	static int isMeera(int[] a) {
		for(int i=0; i < a.length; i++) {
			int num = a[i]*2;
			for(int j=0; j < a.length; j++) {
				if(a[j] ==num)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] {8, 3, 4}));

	}

}
