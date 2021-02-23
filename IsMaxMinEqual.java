package practice;

public class IsMaxMinEqual {
	static int isMaxMinEqual(int[] a ) {
		
		if(a.length < 2)
			return 0;
		
		int maxValue = a[0];
		int minValue = a[0];
		int countMaxValues = 0;
		int countMinValues = 0;
		
		for(int i=0; i< a.length;i++) {
			for(int j=0; j < a.length; j++) {
				if(a[i] != a[j])
					break;
				if(i == a.length-1)
					return 0;
			
			}
		}
		for(int k= 0; k < a.length; k++) {
			if(a[k]>maxValue)
				maxValue = a[k];
			if(a[k]< minValue)
				minValue = a[k];
		}
		for(int l= 0; l < a.length; l++) {
			if(a[l]== maxValue)
				countMaxValues ++;
			if(a[l] == minValue)
				countMinValues ++;
		}
		if(countMaxValues == countMinValues)
			return 1;
		return 0;
		
	}

	public static void main(String[] args) {
		int[] arr = {2,4,6,2,8,11,11};
		System.out.println(isMaxMinEqual(arr));

	}

}
