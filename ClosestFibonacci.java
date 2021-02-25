package practice;

public class ClosestFibonacci {
	static int closestFibonacci(int n) {
		if(n < 1)
			return 0;
		int previous = 1;
		int next = 1;
		while(next < n) {
			int temp = next;
			next = previous + next;
			previous = temp;
		}
		if(next > n)
			return previous;
		return next;
	}

	public static void main(String[] args) {
		System.out.println(closestFibonacci(100));

	}

}
