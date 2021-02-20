package practice;

public class IsZeroPlentiful {
	static int isZeroPlentiful(int[] a) {
		int count = 0;
		int previous = 1;
		int sequence = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] == 0) {
				count++;
				previous = a[i];
			}
			if(a[i] != 0 && previous == 0) {
				if(count < 4)
					return 0;
				sequence ++;
				count = 0;
				previous = a[i];
				continue;
			}
			if(a[i] == 0 && i == a.length-1) {
				if(count < 4)
					return 0;
				sequence ++;
				continue;
			}
			if(a[i] != 0) {
				continue;
			}
			
			}
		return sequence;
		}
		
	

	public static void main(String[] args) {
		System.out.println(isZeroPlentiful(new int[] {}));

	}

}
