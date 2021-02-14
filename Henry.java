package practice;

public class Henry {
	
	boolean isPerfectNumber(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n%i == 0)
				sum += i;
		}
			if(sum == n)
				return true;
			else
				return false;
		
	}
	
	int henry(int i, int j) {
		int count = 0; 
		int henrySum = 0;

		
		for(int k =1; ; k++) {
			if(isPerfectNumber(k)) {
				count ++;
				if(count ==i) {
					henrySum +=k;
					
				}
				else if(count == j) {
					henrySum +=k;
					break;
				}
			}
		}
		return henrySum;
		
	}

	public static void main(String[] args) {
		Henry h = new Henry();
		System.out.println(h.henry(1, 3));
		

	}

}
