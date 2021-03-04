package practice;

public class IsBean {
	static int isBean(int[] a) {
		for(int i=0; i < a.length; i ++) {
			if(a[i] == 9) {
				for(int j=0; j < a.length; j++) {
					if(a[j] == 13)
						break;
					if(j == a.length-1)
						return 0;
				}
			}
			if(a[i] == 7) {
				for(int j=0; j < a.length; j++) {
					if(a[j] == 16)
						return 0;
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isBean(new int[] { 9, 6, 18}));

	}

}
