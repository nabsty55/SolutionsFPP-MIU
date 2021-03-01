package practice;

public class IsZeroLimited {
	static int isZeroLimited(int[] a) {

		for(int i=0; i < a.length; i++) {
			int index = 3 * i + 1;
			if(index > a.length-1)
				break;
			if(a[index] != 0)
				return 0;
			if(index == a.length-1) {
				if(a[index-1] == 0)
					return 0;
				break;
			}
			if(a[index-1] == 0 || a[index+1] == 0)
				return 0;
			
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isZeroLimited(new int[] {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));

	}

}
