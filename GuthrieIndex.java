package practice;

public class GuthrieIndex {
	static int guthrieIndex(int n) {
		int count = 0;
		while(n>1) {
			if(n%2 == 0) {
				n /= 2;
				count ++;
			}
			else if(n % 2 != 0) {
				n *= 3;
				n += 1;
				count ++;
			}
		}
		return count; 
	}

	public static void main(String[] args) {
		System.out.println(guthrieIndex(3));
		

	}

}
