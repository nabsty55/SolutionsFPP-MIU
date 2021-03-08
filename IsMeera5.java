package practice;

public class IsMeera5 {
	static int isMeera(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(a[i] == 1) {
				for(int j=0; j < a.length; j++) {
					if(a[j] == 9)
						return 1;
					if(j == a.length-1)
						return 0;
				}
			}
			if(a[i] == 9) {
				for(int j=0; j < a.length; j++) {
					if(a[j] == 1)
						return 1;
					if(j == a.length-1)
						return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isMeera(new int[] {1, 1, 0, 8, 0, 9, 9, 1}));

	}

}
