package practice;

public class IsTrivalent {
	static int isTrivalent(long[] a) {
		long x = a[0];
		long y = a[0];
		long z = a[0];
		for(int i=1; i < a.length; i++) {
			if(a[i]!= x && x==y) {
				y = a[i];
				continue;
			}
			if(a[i] != x && x == z && a[i] != y) {
				z = a[i];
				continue;
			}
			if(a[i] != x && a[i] != y && a[i] != z) {	
					return 0;
				}	
			}
		return 1;
		
	}

	public static void main(String[] args) {
		System.out.println(isTrivalent(new long[] { 1,1,1,1,2,3,3,3,3}));

	}

}
