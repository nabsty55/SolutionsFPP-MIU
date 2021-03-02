package practice;

public class IsNormal {
	static int isNormal(int n) {
		for(int i =2; i < n; i++) {
			if(n%i == 0) {
				if(i%2 == 1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isNormal(9));

	}

}
