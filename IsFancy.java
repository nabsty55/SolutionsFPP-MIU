package practice;

public class IsFancy {
	static int isFancy(int n) {
		int before = 1;
		int previous = 1;
		int fancy = 1;
		while(fancy < n) {
			fancy = 3*previous + 2*before;
			if(fancy == n)
				return 1;
			before = previous;
			previous = fancy;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isFancy(61));

	}

}
