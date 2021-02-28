package practice;

public class SameNumberOfFactors {
	static int sameNumberOfFactors(int n1, int n2) {
		if(n1 < 0 || n2 < 0)
			return -1;
		int count1 = 0;
		int count2 = 0;
		for(int i=1; i <= n1; i++) {
			if(n1%i == 0)
				count1 ++;
		}
		for(int i=1; i <= n2; i++) {
			if(n2%i == 0)
				count2 ++;
		}
		if(count1 == count2)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(sameNumberOfFactors(0, 0));

	}

}
