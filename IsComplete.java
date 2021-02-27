package practice;

public class IsComplete {
	static int isComplete(int[] a) {
		if(a.length < 2)
			return 0;
		for(int i= 0; i < a.length; i++) {
			if(a[i]%2 == 0)
				break;
			if(i == a.length-1)
				return 0;
		}
		for(int i = 0; i < a.length; i++) {
			if(isPerfectSquare(a[i]) == 1)
				break;
			if(i == a.length-1)
				return 0;
		}
		for(int i=0; i < a.length-1; i++) {
			for(int j=i+1; j < a.length; j++) {
				if(a[i]+a[j] == 8)
					return 1;
			}
		}
		return 0;
	}
	static int isPerfectSquare(int n) {
		for(int i=1; i <= n; i++) {
			if(n%i == 0) {
				int num = n/i;
				if(num == i)
					return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {3, 2, 1, 1, 5, 6}));

	}

}
