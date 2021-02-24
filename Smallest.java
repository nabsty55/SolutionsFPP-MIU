package practice;

public class Smallest {
	static int smallest(int n) {
		int number = 0;
		outer: for(int i=1; ;i++) {
			int multiple = 1;
			for(int j=1; j <= n; j++) {
				multiple = i*j;
				int digit = 0;
				int count = 0;
				while(multiple > 0) {
					digit = multiple%10;
					if(digit == 2)
						count++;
					multiple /= 10;
					
				}
				if(count ==0)
					continue outer;
				
				
			}
			number = i;
			break;
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(smallest(3));

	}

}
