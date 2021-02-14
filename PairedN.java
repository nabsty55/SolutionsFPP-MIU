package practice;

public class PairedN {
	
	int sumValues =0;
	int sumIndexes =0;
	
	int isPairedN(int[]a, int n){
		if(a.length <2 || n < 0 || a.length < n)
			return 0;
		for(int i=0; i < a.length-1; i++ ) {
			for(int j=1; j< a.length; j++) {
				sumValues = a[i]+a[j];
				sumIndexes = i + j;
			
				if(sumValues == sumIndexes) {
					return 1;
				}
					
					
			}		
					
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = {1, 4, 1, 4, 5, 6};
		PairedN pn = new PairedN();
		System.out.println(pn.isPairedN(arr, 5));
		
		

	}
	

}
