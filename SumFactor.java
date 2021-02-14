package practice;

public class SumFactor {
	static int sumFactor(int[] a) {
		int sum = 0;
		int sumFactor = 0;
		for(int i=0; i< a.length; i++) {
			sum += a[i];
		}
		for(int j=0; j< a.length; j++) {
			if(a[j] == sum)
				sumFactor ++;
		}
		return sumFactor;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {3, 0, 2, -5, 0};
		
		System.out.println(sumFactor(arr));
		

	}

}
