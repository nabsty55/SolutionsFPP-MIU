package practice;

public class MinDistance {
	static int minDistance(int n) {
		int min = n - 1;
		int diff = 0;
		int previous = 1;
		for(int i=2; i <= n; i++) {
			if(n%i == 0) {
				diff = i - previous;
				if(diff < min)
					min = diff;
				previous = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(minDistance(13013));
	}

}
