// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class AIOven_2530 {
	private static Scanner scanner = new Scanner(System.in);
	private static final int HOURS_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;
	private static final int SECONDS_PER_MINUTES = 60;

	public static void main(String args[]) {
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int second = scanner.nextInt();
		int timeSpent = scanner.nextInt();
		int endTime;
		int currentMinutes = hour * MINUTES_PER_HOUR + minute;
		int currentSeconds = currentMinutes * SECONDS_PER_MINUTES + second;
		endTime = currentSeconds + timeSpent;
		endTime = cutTimeOver24Hours(endTime);
		int[] result = formatTime(endTime);
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
		scanner.close();
	}

	private static int[] formatTime(int time) {
		int hour = time / (SECONDS_PER_MINUTES * MINUTES_PER_HOUR);
		int minute = time / SECONDS_PER_MINUTES - hour * MINUTES_PER_HOUR;
		int second = time % SECONDS_PER_MINUTES;
		int[] result = { hour, minute, second };
		return result;
	}

	private static int cutTimeOver24Hours(int time) {
		while (time >= SECONDS_PER_MINUTES * MINUTES_PER_HOUR * HOURS_PER_DAY) {
			if (time >= SECONDS_PER_MINUTES * MINUTES_PER_HOUR * HOURS_PER_DAY) {
				time = time - SECONDS_PER_MINUTES * MINUTES_PER_HOUR * HOURS_PER_DAY;
			}
		}
		return time;
	}
}