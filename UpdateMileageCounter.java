package practice;

public class UpdateMileageCounter {
	static int [] addOneMile(int[] a) {
		int limit = 2;
		outer: for(int i=0; i < limit && i < a.length; ) {
			if(a[i] == 9) {
				a[i] = 0;
				limit ++;
				i++;
				continue outer;
			}
			a[i] += 1;
			break;
		}
		return a;
	}
	static void updateMileageCounter(int [] a, int miles) {
		for(int i = 0; i < miles; i++) {
			addOneMile(a);
			continue;
		}
	}

	public static void main(String[] args) {
		

	}

}
