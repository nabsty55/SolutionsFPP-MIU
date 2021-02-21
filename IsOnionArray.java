package practice;

public class IsOnionArray {
	static int isOnionArray(int[] a) {
		if(a.length < 2)
			return 0;
		for(int i = 0; i < a.length/2; i++) {
			int j = (a.length-1) -i;
			if((a[i]+a[j]) <= 10) {
				if(i == a.length/2-1)
					return 1;
				continue;
			}
			return 0;
				
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isOnionArray(new int[] {1, 2, 3, 4, 15}));

	}

}
