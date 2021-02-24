package practice;

public class IsVesuvian {
	static int isVesuvian(int n) {
		int count = 0;
		for(int i=1; i < n; i++) {
			for(int j=1; j < n; j++) {
				int sum = i + j;
				if(sum == n && isSquare(i) && isSquare(j)) {
					count ++;
					if(count > 1)
						return 1;
				}
			}
		}
		return 0;
	}
	
	static boolean isSquare(int n) {
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				int x = n/i;
				if(x == i)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isVesuvian(85));

	}

}
