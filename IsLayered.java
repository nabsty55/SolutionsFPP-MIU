package practice;

public class IsLayered {
	static int isLayered(int[] a) {
		if(a.length < 2)
			return 0;
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			if(a[i] > a[j])
				return 0;
		}
		outer:for(int i= 0; i < a.length; ) {
			int count = 0;
			for(int j=i; j < a.length; j++) {
				if(a[i] == a[j])
					count++;
				if(a[i] != a[j]) {
					if(count < 2)
						return 0;
					i =j;
					continue outer;
				}
				if(j == a.length-1) {
					if(count < 2)
						return 0;
					j++;
					i=j;
					continue outer;
				}
					
				
			}
				
			
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isLayered(new int[] {1,1,2,2,3,3,3,4,4,4,5,5}));

	}

}
