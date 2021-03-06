package practice;

public class IsComplete3 {
	static int isComplete(int[] a) {
		int maxEven = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] < 0)
				return 0;
			if(a[i]%2 == 0)
				maxEven = a[i];
		}
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				if(a[i] > maxEven)
					maxEven = a[i];
			}
		}
		for(int i=2; i < maxEven; i +=2) {
			for(int j=0; j < a.length; j++) {
				if(a[j] == i)
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {2, 3, 3, 6}));

	}

}
