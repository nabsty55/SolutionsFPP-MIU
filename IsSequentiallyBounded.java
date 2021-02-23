package practice;

public class IsSequentiallyBounded {
	static int isSequentiallyBound(int[] a) {
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			if(a[i] <=0 || a[j] <=0)
				return 0;
			if(a[i] > a[j])
				return 0;
		}
		for(int i=0; i< a.length; i++) {
			int count = 0;
			for(int j=0; j < a.length; j++) {
				if(a[i] == a[j])
					count ++;
			}
			if(count >= a[i])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isSequentiallyBound(new int[] {5, 5, 5, 2, 5}));

	}

}
