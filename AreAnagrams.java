package practice;

public class AreAnagrams {
	static int areAnagrams(char[] a1, char[] a2) {
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < a1.length; i++) {
			for(int j =0; j < a1.length; j++) {
				if(a1[i] == a1[j])
					count1 ++;
			}
			for(int k = 0; k < a2.length; k++) {
				if(a1[i] == a2[k])
					count2 ++;
			}
			if(count1 != count2)
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		char[] arr1 = {'p','o','o','l'};
		char[] arr2 = {'p','o','l','l'};
		System.out.println(areAnagrams(arr1, arr2));

	}

}
