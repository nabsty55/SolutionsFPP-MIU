package practice;

public class IsMinMaxDisjoint {
	static int isMinMaxDisjoint(int[] a) {
		if(a.length < 2)
			return 0;
		int min = a[0];
		int max = a[0];
		for(int i=0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
			
		}
		if( min == max)
			return 0;
		for(int i=0, j= i+1; i < a.length-1; i++, j++) {
			if(a[i] == min && a[j] == max)
				return 0;
			if(a[i] == max && a[j] == min)
				return 0;
		}
		int countMin = 0;
		int countMax = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] == min) {
				countMin ++;
				if(countMin > 1)
					return 0;
			}
			if(a[i] == max) {
				countMax ++;
				if(countMax > 1)
					return 0;
			}
		}
		return 1;
		
	}

	public static void main(String[] args) {
		System.out.println(isMinMaxDisjoint(new int[] {0, 5, 18, 0, 9}));
	}

}
