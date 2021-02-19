package practice;

public class DecodeArray {
	static int decodeArray(int[] a) {
		int[] b = new int[a.length-1];
		int k = 0;
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			int diff = a[i] - a[j];
			if(diff < 0)
				diff *= -1;
			b[k] = diff;
			k++;
		}
		int encodedNum = 0;
		int multiple10 =1;
		for(int l= b.length-1; l >=0; l--) {
			int digit = b[l]* multiple10;
			encodedNum += digit;
			multiple10 *= 10;
			
		}
		if(a[0] < 0)
			encodedNum *= -1;
		return encodedNum;
	}

	public static void main(String[] args) {
		System.out.println(decodeArray(new int[] {1, 1}));

	}

}
