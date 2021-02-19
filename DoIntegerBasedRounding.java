package practice;

public class DoIntegerBasedRounding {
	static void doIntegerBasedRounding(int[] a, int n) {
		for(int i=0; i < a.length; i++) {
			if(n <= 0)
				break;
			if(a[i] < 0)
				continue;
			int multiple = 0;
			int multiplier = 1;
			int previous = 0;
			while(multiple < a[i]) {
				multiple = multiplier*n;
				if(multiple > a[i])
					break;
				previous = multiple;
				multiplier ++;
			}
			if(previous == a[i])
				a[i] = previous;
			else if(a[i]-previous > multiple - a[i])
				a[i] = multiple;
			else if(a[i]-previous < multiple-a[i])
				a[i] = previous;
			else if(a[i]-previous == multiple -a[i]){
				a[i] = multiple;
	
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 2,3,4,5};
		doIntegerBasedRounding(arr, 100);
	}

}
