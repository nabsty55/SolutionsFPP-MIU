package practice;

public class IsAllPossiblilities {
	static int isAllPossibilities(int[] a) {
		if(a.length == 0)
			return 0;
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a.length; j++) {
				if(a[j] == i)
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isAllPossibilities(new int[] {}));

	}

}
