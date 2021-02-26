package practice;

public class IsMartian {
	static int isMartian(int[] a) {
		int countOnes = 0;
		int countTwos = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] == 1)
				countOnes ++;
			if(a[i] == 2)
				countTwos ++;
		}
		if(countOnes <= countTwos)
			return 0;
		for(int i= 0, j=i+1; i < a.length-1; i++, j++) {
			if(a[i] == a[j])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isMartian(new int[] {2}));

	}

}
