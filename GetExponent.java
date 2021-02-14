package practice;

public class GetExponent {
	static int getExponent(int n, int p) {
		if(p <= 1)
			return -1;
		if(n < 0)
			n = -n;
		
		int count = 0;
		
		while(n > 0) {
			if(n%p == 0)
				count ++;
			else break;
			n /=p;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(getExponent(128, 4));

	}

}
