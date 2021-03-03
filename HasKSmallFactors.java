package practice;

public class HasKSmallFactors {
	static boolean hasKSmallFactors(int k, int n) {
		for(int i = 1; i < k; i ++) {
			if(n%i == 0) {
				int result = n/i;
				if(result < k)
					break;
				if(i == k-1)
					return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(hasKSmallFactors(7, 30));

	}

}
