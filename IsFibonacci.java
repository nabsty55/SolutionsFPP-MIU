package practice;

public class IsFibonacci {
	static int isFibonacci(int n) {
		
		int previous = 1;
		int next = 1;
		while(next < n) {
			int temp = next;
			next = previous + next;
			previous = temp;
		}
		if(next == n)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isFibonacci(13));

	}

}
