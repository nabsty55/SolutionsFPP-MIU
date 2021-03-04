package practice;

public class IsWave {
	static int isWave(int[] a) {
		for(int i=0; i < a.length-1; i++) {
			if(a[i]%2 == 0) {
				if(a[i+1]%2 == 0)
					return 0;
			}
			else if(a[i]%2 == 1) {
				if(a[i+1]%2 == 1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isWave(new int[] {2}));

	}

}
