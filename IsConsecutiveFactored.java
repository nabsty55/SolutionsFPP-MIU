package practice;

public class IsConsecutiveFactored {
	static int isConsecutiveFactored(int n) {
		int previous = 1;
		for(int i=2; i < n; i++) {
			if(n%i == 0) {
				if(previous >1) {
					if(i == (previous+1))
						return 1;
				}
				previous = i;
				continue;
			}
			continue;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isConsecutiveFactored(90));

	}

}
