package practice;

public class IsBean2 {
	static int isBean(int[] a) {
		for(int i=0; i < a.length; i++) {
			int n = a[i] + 1;
			int m = a[i] - 1;
			for(int j=0; j < a.length; j++) {
				if(a[j] == n || a[j] ==m)
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isBean(new int[] {3, 4, 5, 7}));
	}

}
