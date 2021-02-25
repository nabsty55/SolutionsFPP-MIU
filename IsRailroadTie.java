package practice;

public class IsRailroadTie {
	static int isRailroadTie(int[] a) {
		for(int i=0; i < a.length; i ++) {
			if(a[i] != 0)
				break;
			if(i == a.length-1)
				return 0;
		}
		for(int i=1, j=i-1, k=i+1; i < a.length-1; i++, j++, k++) {
			if(a[0] == 0 || a[a.length-1] == 0)
				return 0;
			if(a[i] != 0) {
				if(a[j] !=0 && a[k] != 0)
					return 0;
			}
			if(a[i] == 0) {
				if(a[j] == 0 || a[k] == 0)
					return 0;
			}
			
			
		}
		return 1;
		
	}

	public static void main(String[] args) {
		System.out.println(isRailroadTie(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));

	}

}
