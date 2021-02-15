package practice;

public class IsHollow {
	static int isHollow(int[] a) {

		
		int countPreceeding = 0;
		int countZeroes = 0;
		int countFollowing = 0;
		
		for(int i= 0; i < a.length; i++ ) {
			
			if(a[i] != 0) {
				countPreceeding ++;
				continue;
				
			}
			if(a[i] == 0) {
				 for(int j=i; j < a.length; j++, i++ ) {
					if(a[j] == 0) {
						countZeroes ++;
//						i ++;
						continue;
					}
					if(a[j] != 0) {
						for(int k=j; k < a.length; k++, i++, j++) {
							if(a[k] != 0) {
								countFollowing ++;
//								i ++;
//								j ++;
								continue;
								
								
							}
							if(a[k] == 0)
								return 0;
						}
					}
				}
			}
		}
		if((countPreceeding == countFollowing) && countZeroes >= 3)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1, 1};
		System.out.println(isHollow(arr));

	}

}
