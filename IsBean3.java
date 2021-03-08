package practice;

public class IsBean3 {
	static int isBean(int[] a) {
		for(int i=0; i < a.length; i++) {
			int n1 = 2*a[i];
			int n2 = 2*a[i] + 1;
			int n3 = a[i]/2;
			for(int j=0; j < a.length; j++) {
				if(a[j] == n1|| a[j] == n2 || a[j] == n3)
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isBean(new int[]  {3, 8, 4}));

	}

}
