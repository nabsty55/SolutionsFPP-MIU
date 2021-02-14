package practice;

public class IsMadhavArray {
	static int isMadhavArray(int[] a) {
		
		boolean rightLength = false;
		for(int i = 0; i < a.length; i++) {
			int requiredLength = (i*(i+1))/2;
			if(requiredLength == a.length)
				rightLength = true;
				continue;
		}
		if(!rightLength)
			return 0;
		int index = 1;
		int numberOfTimesToAdd = 2;
		int incrementIndex = 2;
		int limit = 2;
		
		while(index < a.length) {
			int sum = 0;
			for(int i = index; i <= limit; i++) {
				sum += a[i];
			}
			if(sum != a[0])
				return 0;
			index += incrementIndex;
			incrementIndex ++;
			limit = index + numberOfTimesToAdd;
			numberOfTimesToAdd ++;
			
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,1,4,-1,-1};
		System.out.println(isMadhavArray(arr));

	}

}
