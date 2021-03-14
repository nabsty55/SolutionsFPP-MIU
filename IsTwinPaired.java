package practice;

public class IsTwinPaired {
	static int isTwinPaired(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				int prev = a[i];
				for(int j= i+1; j < a.length; j++) {
					if(a[j]%2 == 0) {
						if(a[j] < prev)
							return 0;
						prev = a[j];
					}
				}
				break;
			}
			
		}
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 1) {
				int prev = a[i];
				for(int j= i+1; j < a.length; j++) {
					if(a[j]%2 == 1) {
						if(a[j] < prev)
							return 0;
						prev = a[j];
					}
				}
				break;
			}
			
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isTwinPaired(new int[] {1, 3, 5, 2, 4, 3}));

	}

}
