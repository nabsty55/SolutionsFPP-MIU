package practice;

public class FactorEqual {
	static int factorEqual(int n, int m) {
		int count1 = 0;
		int count2 = 0;
		for(int i=1; i <=n ; i++) {
			if(n%i == 0)
				count1 ++;
		}
		for(int i=1; i <=m ; i++) {
			if(m%i == 0)
				count2 ++;
		}
		if(count1 == count2)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(factorEqual(9, 10));

	}

}
