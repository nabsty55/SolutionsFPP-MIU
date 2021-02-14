package practice;

import java.util.Arrays;

public class Solve10 {
	static int factorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	static int[] solve10() {
		int[] a = new int[2];
		int tenFactorial = factorial(10);
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			for(int j =1; j < 10; j++) {
				sum = factorial(i)+ factorial(j);
				if(sum == tenFactorial) {
					a[0] = i;
					a[1] = j;
					return a;
				}
			}
		}
		return a;
	}
	

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solve10()));
		

	}
}

