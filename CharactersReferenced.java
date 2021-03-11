package practice;

import java.util.Arrays;

public class CharactersReferenced {
	static char[] charactersReferenced(int[] a, char[] b) {
		if(a.length == 0 || b.length == 0)
			return new char[0];
		for(int i=0; i < a.length; i++) {
			if(a[i] > b.length-1)
				return new char[0];
		}
		char[] arr = new char[a.length];
		for(int i=0, j=0; i < a.length; i++, j++) {
			arr[j] = b[a[i]];
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(charactersReferenced(new int[] {0, 4, 7}, new char[] {'h', 'a', 'p', 'p', 'i', 'n', 'e', 's', 's'})));

	}

}
