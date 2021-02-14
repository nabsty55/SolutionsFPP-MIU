package practice;

public class Is121Array {
	static int is121Array(int[] a) {
		int countFirst1s = 0;
		int countLast1s = 0;
		int count1s = 0;
		int count2s = 0;
		boolean all1sOr2s = true;
		boolean both1sAnd2s = true;
		boolean firstAndLast1s = false;
		boolean firstAndLast1sMatch = false;
		boolean middleAll2s = true;
		
		if(a.length == 0)
			return 0;
		
		 for(int i=0; i < a.length; i++) {
			 if(a[i]< 1 || a[i]> 2)
				 all1sOr2s = false;
			 else if(a[i] ==1)
				 count1s ++;
			 else if(a[i]== 2)
				 count2s ++;
				
		}
		if(count1s ==0 || count2s == 0)
			both1sAnd2s = false;
		if(a[0] == 1 && a[a.length-1] == 1 ) {
			firstAndLast1s = true;
		}
		for(int j = 0; j < a.length; j++) {
			if(a[j] == 1) {
				countFirst1s ++;
//				continue;
			}else
				break;
				
		}
		for( int k = a.length-1; k >=0; k--) {
			if(a[k]== 1) {
				countLast1s ++;
//				continue;
			}
			else
				break;
		}
		if(countFirst1s == countLast1s)
			firstAndLast1sMatch = true;
		for(int l = countFirst1s; l < a.length - countFirst1s; l++) {
			if(a[l] != 2)
				middleAll2s = false;
		}
		if( all1sOr2s && both1sAnd2s && firstAndLast1s && firstAndLast1sMatch && middleAll2s)
			return 1;
		return 0;
		
	}

	public static void main(String[] args) {
		int [] arr = {1,1,1,2,1,1,1};
		System.out.println(is121Array(arr));
		

	}

}
