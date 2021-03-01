package practice;

public class Eval {
	static double eval(double x, int[] a) {
		double sum = 0d;
		for(int i=0; i < a.length; i++) {
			double num = 1.0d;
			for(int j=0; j < i; j++) {
				num *= x;
			}
			sum += a[i]*num;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(eval(10.0, new int[] {0, 1} ));

	}

}
