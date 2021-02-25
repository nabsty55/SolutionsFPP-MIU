package practice;

public class IsOneBalanced {
	static int isOneBalanced(int[] a) {
		int countOnes = 0;
		int countNonOnes = 0;
		for(int i= 0; i < a.length; i++) {
			if(a[i] == 1)
				countOnes ++;
			if(a[i] != 1)
				countNonOnes ++;
		}
		if(countOnes != countNonOnes)
			return 0;
		int countSeq = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] != 1) {
				for(int j=i; j < a.length; j++, i++) {
					if(a[j] == 1) {
						countSeq ++;
						break;
						
					}
					if(j == a.length-1) {
						countSeq ++;
						break;
					}
						
					
				}
			}
		}
		if(countSeq != 1)
			return 0;
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isOneBalanced(new int[] {1,1,1,1,1}));

	}

}
