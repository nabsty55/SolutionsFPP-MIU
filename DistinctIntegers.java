package practice;

public class DistinctIntegers {
	static int distinctIntegers(int[] a) {
		int count = 0;
		outer: for(int i=0, k=0; i < a.length; i++, k++) {
			for(int j=0; j < k; j++) {
				if(a[i] == a[j])
					continue outer;
			}
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(distinctIntegers(new int[] {5,5,5,5}));

	}

}
