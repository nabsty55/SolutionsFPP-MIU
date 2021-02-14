package practice;

public class Inertial {
	static int inertial(int[] a) {
		int oddCount = 0;
		int maxValue = a[0];
		boolean oddGreater = true;
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 != 0)
				oddCount ++;
			if(a[i] > maxValue)
				maxValue = a[i];
			
			
		}
		for(int l=0; l < a.length; l++) {
			if(a[l]%2 != 0) {
				for(int j=0; j < a.length; j++) {
					if(a[j]%2 == 0 && a[j] != maxValue) {
						if(a[l] < a[j])
							oddGreater = false;
					}
				}
			}
		}
		if(oddCount == 0) {
			return 0;
		}
		if(maxValue %2 != 0)
			return 0;
		if(oddGreater)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 7};
		System.out.println(inertial(arr));

	}

}
