package practice;

public class IsCentered15 {
	int isCentered15(int[] a) {
		int lengthArr = a.length;
		boolean isCentered = false;
		if(lengthArr%2 != 0) {
			int sum = a[lengthArr/2];
			if(sum == 15) {
				isCentered = true;
				
			}
			for(int i =lengthArr/2; i <= a.length/2; i++) {
				sum += a[i-1]+ a[i+1];
				if(sum == 15) {
					isCentered = true;
					break;
				}
			}
			if(isCentered)
				return 1;
		
		return 0;
	}
		else {
			
			int halfLength = a.length/2;
			int sum = 0;
			for(int i = halfLength; i < a.length;) {
				for(int j = i-1; j >= 0; i++, j--) {
					sum += a[i]+a[j];
					if(sum == 15) {
						isCentered = true;
//						break;
					}
				}
			}
			if(isCentered)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,11,2,1,1};
		IsCentered15 ic = new IsCentered15();
		System.out.println(ic.isCentered15(arr));

	}

}
