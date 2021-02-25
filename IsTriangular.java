package practice;

public class IsTriangular {
	static int isTriangular(int n) {
		int sum = 0;
		int num = 1;
		while(sum < n) {
			sum += num;
			num ++;
		}
		if(sum == n)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isTriangular(10));

	}

}
