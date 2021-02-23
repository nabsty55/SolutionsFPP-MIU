package practice;

public class Is121Array {
	static int is121Array(int[] a) {
		
		//Check If Length of array is at least 3
		if(a.length < 3)
			return 0;
		
		//Check if array starts and ends with one
		if(a[0]!= 1 && a[a.length-1] != 1)
			return 0;
		
		//Check if array has only Ones and Twos and no other numbers
		int count1S = 0;
		int count2S = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] ==1) {
				count1S ++;
				continue;
			}
			if(a[i] == 2) {
				count2S ++;
				continue;
			}
			return 0;	
		}
		if(count1S == 0 || count2S == 0)
			return 0;
		
		//Count number of Ones at beginning and at the end and compare
		int count1SBefore = 0;
		int count1SAfter = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] == 1) {
				count1SBefore++;
				continue;
			}
			break;
		}
		for(int i=a.length-1; i >= 0; i--) {
			if(a[i] ==1) {
				count1SAfter ++;
				continue;
			}
			break;
		}
		if(count1SBefore != count1SAfter)
			return 0;
		
		//Check if its only 2s Left in the middle
		for(int i = count1SBefore; i < a.length-count1SAfter; i++) {
			if(a[i] != 2)
				return 0;
		}
		return 1;
	}		
		
//	First Method
	
//		int countFirst1s = 0;
//		int countLast1s = 0;
//		int count1s = 0;
//		int count2s = 0;
//		boolean all1sOr2s = true;
//		boolean both1sAnd2s = true;
//		boolean firstAndLast1s = false;
//		boolean firstAndLast1sMatch = false;
//		boolean middleAll2s = true;
//		
//		if(a.length == 0)
//			return 0;
//		
//		 for(int i=0; i < a.length; i++) {
//			 if(a[i]< 1 || a[i]> 2)
//				 all1sOr2s = false;
//			 else if(a[i] ==1)
//				 count1s ++;
//			 else if(a[i]== 2)
//				 count2s ++;
//				
//		}
//		if(count1s ==0 || count2s == 0)
//			both1sAnd2s = false;
//		if(a[0] == 1 && a[a.length-1] == 1 ) {
//			firstAndLast1s = true;
//		}
//		for(int j = 0; j < a.length; j++) {
//			if(a[j] == 1) {
//				countFirst1s ++;
////				continue;
//			}else
//				break;
//				
//		}
//		for( int k = a.length-1; k >=0; k--) {
//			if(a[k]== 1) {
//				countLast1s ++;
////				continue;
//			}
//			else
//				break;
//		}
//		if(countFirst1s == countLast1s)
//			firstAndLast1sMatch = true;
//		for(int l = countFirst1s; l < a.length - countFirst1s; l++) {
//			if(a[l] != 2)
//				middleAll2s = false;
//		}
//		if( all1sOr2s && both1sAnd2s && firstAndLast1s && firstAndLast1sMatch && middleAll2s)
//			return 1;
//		return 0;
//		
//	}

	public static void main(String[] args) {
		int [] arr = {1,2,1};
		System.out.println(is121Array(arr));
		

	}

}
