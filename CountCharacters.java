package practice;

import java.util.Arrays;

public class CountCharacters {
	static String[] countCharacters(char[] a) {
		if(a == null || a.length == 0)
			return new String[0];
		int count = 0;
		int index = 0;
		outer: for(int i=0, k=0; i < a.length; i++, k++) {
			for(int j=0; j < k; j++) {
				if(a[i] == a[j])
					continue outer;
			}
			count ++;
		}
		String[] mainStr = new String [count];
		outer2: for(int i=0, k=0; i < a.length; i++, k++) {
			for(int j=0; j < k; j++) {
				if(a[i] == a[j])
					continue outer2;
			}
			String str = a[i] + "--";
			for(int l=0; l < a.length; l++) {
				if(a[i] == a[l])
					str += "*";
			}
			mainStr[index] = str;
			index ++;
				
		}
		return mainStr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countCharacters(new char[] {'a','b','a','b','c','d','a','c','a','b','d','f'})));

	}

}
