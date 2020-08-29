package src;

import java.util.Scanner;

public class SpecialDay_10768 {
	private static Scanner scanner = new Scanner(System.in);
	private static final int[] END_DAY_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String args[]) {
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int date = 0;
		for (int i = 1; i < month; i++) {
			date += END_DAY_MONTH[i];
		}
		date += day;
		int specialDay = END_DAY_MONTH[1] + 18;
		if (date > specialDay) {
			System.out.println("After");
		} else if (date < specialDay) {
			System.out.println("Before");
		} else {
			System.out.println("Special");
		}
		scanner.close();
	}
}