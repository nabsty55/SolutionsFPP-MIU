package practice;

public class EncodeArray {
	static int encodeArray(int[] a) {
		int count = 0;
		int previous = -1;
		for(int i=0; i < a.length; i++) {
			if(a[i] == -1)
				continue;
			if(a[i] == 0) {
//				count ++;
				previous = a[i];
				continue;
				
			}
			if(a[i] == 1 && previous == 0) {
				count ++;
				previous = a[i];
				continue;
			}
			if(a[i] ==1 && previous == 1) {
				count ++;
				previous = a[i];
				continue;
				
			}
			
			
			
		}
		int multiplyBy = 1;
		while(count > 1) {
			multiplyBy *= 10;
			count --;
		}
		int count2 = 0;
		int number = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] == -1)
				continue;
			if(a[i] == 0) {
				count2 ++;
				previous = a[i];
				continue;
				
			}
			if(a[i] == 1 && previous == 0) {
				int digit = count2;
				digit *= multiplyBy;
				multiplyBy /=10;
				number += digit;
				count2 = 0;
				continue;
			}
			if(a[i] ==1 && previous == 1) {
				multiplyBy /=10;
				previous = a[i];
				continue;
				
			}
			
			
			
		}
		if(a[0] == -1) {
			number *= -1;
			return number;
		}
			
		return number;
	}

	public static void main(String[] args) {
		System.out.println(encodeArray(new int[] {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));

	}

}
