package practice;

public class StantonMeasure {
	static int stantonMeasure(int[] a) {
		int n = 0;
		int count =0;
		for(int i=0; i< a.length; i++) {
			if(a[i] == 1)
				n++;
		}
		for(int j=0; j< a.length; j++) {
			if(a[j] == n)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(stantonMeasure(arr));

	}

}
