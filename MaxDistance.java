package practice;

/* Question: Write a function called maxDistance that find the max distance 
 * between non-trivial factors of a number. Non-trivial means, neither 1 
 * nor the number it self. For example: 12 has factors: 2, 3, 4, 6 -> 
 * max distance is 6-2 = 4. If the number has only one factor 
 * (e.g. 49 has only one factor which 7) the method should return 0. 
 * If the number has no factors (e.g. 13), the method should return -1
 */


public class MaxDistance {
	static int maxDistance(int n) {
		int lowest = 0;
		int distance = 0;
		int previous = 0;
		int count = 0;
		outer: for(int i= 1; i <= n; i++) {
			if(n%i == 0) {
				count ++;
				if(previous == 1) {
					lowest = i;
					previous = i;
					continue outer;
				}
				if(i == n) {
					distance = previous - lowest;
					break;
				}
				previous = i;
				continue outer;
			}
		}
		if(count == 2)
			return -1;
		return distance;
	}

	public static void main(String[] args) {
		System.out.println(maxDistance(12));

	}

}
