package practice;

public class Is235Array {
	static int is235Array(int[] a) {
		int countDivisible2 = 0;
		int countDivisible3 = 0;
		int countDivisible5 = 0;
		int countNotDivisible = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i]%2 == 0)
				countDivisible2 ++;
			if(a[i]%3 == 0)
				countDivisible3 ++;
			if(a[i]%5 == 0)
				countDivisible5 ++;
			if(a[i]%2 !=0 && a[i]%3 != 0 && a[i]%5 != 0)
				countNotDivisible ++;
		}
		if((countDivisible2+countDivisible3+countDivisible5+countNotDivisible) == a.length)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(is235Array(new int[] {}));

	}

}
