package practice;

public class IsOddValent {
	static int isOddValent(int[] a) {

		outer:for(int i=0; i < a.length-1; i++) {
			int count = 0;
			for(int j =i; j< a.length; j++) {
				if(a[i] == a[j])
					count ++;
				if(count > 1)
					break outer;
				
			}
			if(i == a.length-2)
				return 0;
		}
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 != 0)
				return 1;
		}
		return 0;
	
	}

	public static void main(String[] args) {
		System.out.println(isOddValent(new int[] {2, 2, 2, 4, 4}));

	}

}
