package src;

import java.util.Scanner;

public class DuckOven_2525 {
	private static Scanner scanner = new Scanner(System.in);
	private static final int HOURS_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;

	public static void main(String args[]) {
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int timeSpent = scanner.nextInt();
		int endTime;
		int currentMinutes = hour * MINUTES_PER_HOUR + minute;
		endTime = currentMinutes + timeSpent;
		endTime = cutTimeOver24Hours(endTime);
		String result = formatTime(endTime);
		System.out.println(result);
		scanner.close();
	}

	private static String formatTime(int time) {
		int hour = time / MINUTES_PER_HOUR;
		int minute = time % MINUTES_PER_HOUR;
		return (hour + " " + minute);
	}

	private static int cutTimeOver24Hours(int time) {
		if (time >= MINUTES_PER_HOUR * HOURS_PER_DAY) {
			return time - MINUTES_PER_HOUR * HOURS_PER_DAY;
		} else {
			return time;
		}
	}
}
