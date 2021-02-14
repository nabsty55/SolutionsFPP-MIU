package practice;

public class IsSquare {
	int isSquare(int n) {
		boolean isSquare = false;
		if(n < 0)
			return 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				int multiple = n/i;
				if(multiple == i)
					isSquare = true;
				if(isSquare)
					break;
			}
		}
		if(isSquare || n == 0)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		IsSquare is = new IsSquare();
		System.out.println(is.isSquare(1));
		

	}

}
