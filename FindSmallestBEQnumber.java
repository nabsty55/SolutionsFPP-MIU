package practice;

public class FindSmallestBEQnumber {
	static int findSmallestBEQnumber() {
		int num = 0;
		for(int i=1; ;i++) {
			int count = 0;
			long cube = i * i * i;
			while(cube > 0) {
				long digit = cube%10;
				if(digit == 6)
					count ++;
				cube /= 10;
			}
			if(count == 4) {
				num = i;
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(findSmallestBEQnumber());

	}

}
