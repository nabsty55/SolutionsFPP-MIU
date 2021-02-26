package practice;

import java.util.Arrays;

public class ComputeHMS {
	static int[] computeHMS(int seconds) {
		int hours = 0;
		int min = 0;
		int sec = 0;
		int[] hms = new int[3];
		int number = seconds;
		while(number > 0) {
			if(number >= 3600) {
				number -= 3600;
				hours ++;
				continue;
			}
			if(number >=60) {
				number -= 60;
				min ++;
				continue;
			}
			if(number < 60) {
				sec = number;
				number -= number;
			}
		}
		hms[0] = hours;
		hms[1] = min;
		hms[2] = sec;
		return hms;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(computeHMS(61)));

	}

}
