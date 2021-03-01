package practice;

public class IsAllPossibilities {
	static int isAllPossibilities(int[] a) {
		if(a.length == 0)
			return 0;
		for(int i= 0; i < a.length; i++) {
			for(int j=0; j < a.length; j++) {
				if(a[i] == j)
					break;
				if(j == a.length-1)
					return 0;
				
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isAllPossibilities(new int[] {1,2,4,3}));

	}

}
