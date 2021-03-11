package practice;

import java.util.Arrays;

public class TexicOrder {
	static char[] texicOrder(char[] a, char[] b) {
		if(a==null || b == null)
			return null;
		int count1 = 0;
		int count2 =0;
		for(int i=0, j=i+1; i < a.length-1; i++, j++) {
			if(a[i] < a[j])
				count1 ++;
		}
		for(int i=0, j=i+1; i < b.length-1; i++, j++) {
			if(b[i] < b[j])
				count2 ++;
		}
		if(count1 == count2)
			return a;
		if(count1 > count2)
			return a;
		else
			return b;
		
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(texicOrder(new char[] {'a', 'b', 'e', 'd'}, new char[] {'a', 'b', 'c', 'd'})));

	}

}
