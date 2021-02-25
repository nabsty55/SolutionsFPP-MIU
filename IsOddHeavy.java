package practice;

public class IsOddHeavy {
	static int isOddHeavy(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 !=0)
				break;
			if(i == a.length-1)
				return 0;
		}
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 != 0) {
				for( int j= 0; j < a.length; j++) {
					if(a[j]%2 == 0) {
						if(a[j] > a[i])
							return 0;
					}
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isOddHeavy(new int[] {-2, -4, -6, -8, -11}));

	}

}
