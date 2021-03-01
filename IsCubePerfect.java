package practice;

public class IsCubePerfect {
	static int isCubePerfect(int[] a) {
		for(int i =0; i < a.length; i++) {
			if(isCube(a[i]) == 0)
				return 0;
		}
		return 1;
	}
	static int isCube(int n) {
		int num = n;
		if( num < 0)
			num *= -1;
		for(int i = 0; i <= num; i++) {
			int cube = i * i * i;
			if(cube == num)
				return 1;
			if(cube > num)
				break;
		}
		return 0;
			
	}

	public static void main(String[] args) {
		System.out.println(isCubePerfect(new int[] {3, 7, 21, 36}));
	}

}
