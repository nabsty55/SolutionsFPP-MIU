package practice;

public class IsDaphne2 {
	static int isDaphne(int[] a) {
		int countBegin = 0;
		int countEnd = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 1)
				break;
			if(i == a.length-1)
				return 0;
		}
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 0)
				countBegin ++;
			if(a[i]%2 == 1)
				break;
		}
		for(int i=a.length-1; i >= 0; i--) {
			if(a[i]%2 == 0)
				countEnd ++;
			if(a[i]%2 == 1)
				break;
		}
		if(countBegin == countEnd)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isDaphne(new int[] {2, 8, 7, 10, -4, 6}));

	}

}
