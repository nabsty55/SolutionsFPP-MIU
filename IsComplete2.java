package practice;

public class IsComplete2 {
	static int isComplete(int[] a) {
		int min = a[0];
		int max = a[0];
		for(int i=0; i< a.length; i++) {
			if(a[i]%2 ==0) {
				min = a[i];
				max = a[i];
				break;
				
			}
				
			if(i == a.length-1)
				return 0;
		}
		
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 0) {
				if(a[i] > max)
					max = a[i];
				if(a[i] < min)
					min = a[i];
			}
		}
		if(max == min)
			return 0;
		for(int i= min+1; i < max; i++) {
			for(int j=0; j < a.length; j++) {
				if(i == a[j])
					break;
				if(j == a.length-1)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isComplete(new int[] {5, 7, 9, 13} ));

	}

}
