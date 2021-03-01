package practice;

public class IsDaphne {
	static int isDaphne(int[] a) {
		for(int i=1; i < a.length; i++) {
			if(a[0]%2 == 0) {
				if(a[i]%2 != 0)
					return 0;
			}
			if(a[0]%2 != 0) {
				if(a[i]%2 == 0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isDaphne(new int[] {2,4,6,9}));

	}

}
