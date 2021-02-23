package practice;

public class CountRepresentations {
	static int countRepresentations(int numRupees) {
		int count = 0;
		for(int rupee20=0; rupee20 <= numRupees; rupee20 +=20) {
			for(int rupee10=0; rupee10 <= (numRupees-rupee20); rupee10 +=10) {
				for(int rupee5=0; rupee5 <=(numRupees-rupee10); rupee5 +=5) {
					for(int rupee2=0; rupee2 <= (numRupees-rupee5); rupee2 +=2) {
						for(int rupee1=0; rupee1 <= (numRupees-rupee2); rupee1++) {
							if(rupee1+rupee2+rupee5+rupee10+rupee20 == numRupees) {
											count++;
											continue;
							}
							
						}
					}
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		System.out.println(countRepresentations(12));

	}

}
