// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class Homework_5532 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int vacation = scanner.nextInt();
		float targetKorean = scanner.nextFloat();
		float targetMath = scanner.nextFloat();
		float dailyKorean = scanner.nextFloat();
		float dailyMath = scanner.nextFloat();
		float workingDay = max((targetKorean / dailyKorean), (targetMath / dailyMath));
		int freeday = vacation - (int) Math.ceil(workingDay);
		System.out.println(freeday);
		scanner.close();
	}

	private static float max(float a, float b) {
		return a >= b ? a : b;
	}
}
