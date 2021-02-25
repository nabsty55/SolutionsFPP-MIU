package practice;

public class IsPacked {
	static int isPacked(int[] a) {
		
		for(int i = 0; i < a.length; ) {
			int count = 0;
			int countAll = 0;
			for(int k=0; k < a.length; k++) {
				if(a[i] == a[k])
					countAll ++;
			}
			if(countAll != a[i])
				return 0;
			
			for(int j = i; j < a.length; j++) {
				if(a[i] == a[j])
					count ++;
				if(a[i] != a[j])
					break;
			}
			if( count != a[i])
				return 0;
			i += count;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(isPacked(new int[] {}));

	}

}
