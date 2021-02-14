package practice;

public class CountSquarePairs2 {
	static int isPerfectSquare(int n) {
		boolean isSquare = false;
		if(n < 0)
			return 0;
		for(int i = 1; i <= n/2; i++) {
			if(n%i == 0) {
				int multiple = n/i;
				if(multiple == i)
					isSquare = true;
			}
		}
		if(isSquare || n == 0)
			return 1;
		return 0;
	}
	static int countSquarePairs(int[] a) {
		
		if(a.length < 2)
			return 0;
		int count = 0;
		int sum = 0;
		outer:for(int i=0; i < a.length; i++) {
			 inner:for(int j=0; j < a.length; j++ ) {
				 if(a[i] <=0)
					 continue outer;
				 if(a[j] <= 0)
					 continue inner;
				int x = a[i];
				int y = a[j];
				if(x >= y)
					continue;
				sum = x + y;
					if(isPerfectSquare(sum) == 1)
						count ++;		
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int [] arr = {11, 5, 4, 20};
		System.out.println(countSquarePairs(arr));

	}

}
