package practice;

public class LengthBumpy {
	static int lengthBumpy(int n) {
		int count = 1;
		int num = n;
		while(num > 1) {
			if(num%2 == 0) {
				num /= 2;
				count ++;
				continue;
			}else if(num%2 == 1) {
				num *= 3;
				num += 1;
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(lengthBumpy(11));

	}

}
