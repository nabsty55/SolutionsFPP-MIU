package practice;

import java.util.Arrays;

public class LengthCharacters {
	static char[] f(char[] a, int start, int len) {
		if(start > a.length-1 || start+len > a.length || start < 0 || len < 0)
			return null;
		char[] arr = new char[len];
		for(int i= start, k=0; k < len; i++, k++) {
			arr[k] = a[i];
		}
		return arr;
			
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(f(new char[] {'a', 'b', 'c'}, 1, 2)));

	}

}
/*Write a function that accepts a character array, a zero-based start position
 *  and a length. It should return a character array containing containing 
 *  lengthcharacters starting with the startcharacter of the input array.
 *   The function should do error checking on the start position and the 
 *   length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
 * 
 */
