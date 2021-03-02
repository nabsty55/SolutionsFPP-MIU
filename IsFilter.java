package practice;

public class IsFilter {
	static int isFilter(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(a[i] == 9) {
				for(int j=0; j < a.length; j++) {
					if(a[j] == 11)
						break;
					if(j == a.length-1)
						return 0;
				}
			}
			if(a[i] ==7) {
				for(int j=0; j < a.length; j ++) {
					if(a[j] == 13)
						return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isFilter(new int[] {4, 7, 13}));

	}

}
