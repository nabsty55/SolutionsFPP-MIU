package practice;

public class IsContinuousFactored {
	static int isContinuousFactored(int n) {
		int prev = 1;
		
		for(int i=2; i < n; i++) {
			if(n%i == 0) {
				prev = i;
				int mult = 1;
				mult *= i;
				for(int j= i+1; j < n; j++) {
					if(n%j == 0) {
						if((j-prev) == 1) {
							mult *= j;
							if(mult == n)
								return 1;
							if(mult > n)
								break;
							prev = j;
							continue;
						}
					}
					break;
				}
			}	
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(isContinuousFactored(13));

	}

}
