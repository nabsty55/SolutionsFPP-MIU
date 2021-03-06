package practice;

public class IsTriple {
	static int isTriple(int[] a) {
		for(int i=0; i < a.length; i++) {
			int count = 0;
			for(int j=0; j < a.length; j++) {
				if(a[i] == a[j])
					count ++;
				if(j == a.length-1) {
					if(count != 3)
						return 0;
				}
					
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isTriple(new int[] {3, 1, 1, 1} ));

	}

}
