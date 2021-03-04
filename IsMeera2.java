package practice;

public class IsMeera2 {
	static int isMeera(int n) {
		int count = 0;
		for(int i=2; i < n; i++ ) {
			if(n%i == 0)
				count ++;
		}
		for(int i=2; i < n; i ++) {
			if(n%i ==0) {
				if(i== count)
					return 1;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		System.out.println(isMeera(21));

	}

}
