package practice;

public class IsCentered {
	static int isCentered(int[] a) {
		if(a.length%2 == 0)
			return 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] <= a[a.length/2] && i != a.length/2)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isCentered(new int[] {2,1,3}));

	}

}
