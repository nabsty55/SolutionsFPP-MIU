package practice;

/* Question: An array is called paired if all even indices have odd values 
 * and all odd indices have even value. For example {1, 4, 7} is paired 
 * because a[0] and a[2] have odd values, and a[1] has even value. 
 * The method should return 1 if the paired, 0 otherwise. 
*/

public class Paired {
	static int paired(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(i%2 == 0) {
				if(a[i]%2 == 0)
					return 0;
			}
			if(i%2 != 0) {
				if(a[i]%2 != 0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, 5};
		System.out.println(paired(arr));

	}

}
