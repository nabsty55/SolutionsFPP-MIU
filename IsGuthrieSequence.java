package practice;

public class IsGuthrieSequence {
	static int isGuthrieSequence(int[] a) {
		if(a[a.length-1] != 1)
			return 0;
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			if(a[i]%2 ==0) {
				if(a[i]/2 != a[j])
					return 0;
				continue;
			}
			if(a[i]%2 != 0) {
				if((a[i]*3+1) != a[j])
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {8, 4, 2, 1};
		System.out.println(isGuthrieSequence(arr));

	}

}
