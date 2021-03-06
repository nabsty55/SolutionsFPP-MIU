package practice;

public class IsSmart {
	static int isSmart(int n) {
		int num = 1;
		int count = 1;
		while(num <=n) {
			if(num == n)
				return 1;
			num += count;
			count++;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isSmart(12));

	}

}
