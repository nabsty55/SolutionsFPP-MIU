package practice;

public class IsMercurial {
	static int isMercurial(int [] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				for(int j=i; j < a.length; j++, i++) {
					if(a[j] == 3) {
						for(int k=j; k < a.length; k++, j++, i++) {
							if(a[k] == 1)
								return 0;
						}
						
					}
				}
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		
		int[] arr = {8,2,1,1,18,3,5};
		System.out.println(isMercurial(arr));

	}

}
