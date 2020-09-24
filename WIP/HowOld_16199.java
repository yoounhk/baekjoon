// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class HowOld_16199 {
	private static Scanner scanner = new Scanner(System.in);
	private static boolean IS_LEAP_YEAR = false;

	public static void main(String args[]) {
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		Date birthDate = new Date(year, month, day);

		year = scanner.nextInt();
		month = scanner.nextInt();
		day = scanner.nextInt();
		Date nowDate = new Date(year, month, day);

		int globalAge = getGlobalAge(nowDate, birthDate);
		int koreanAge = getKoreanAge(nowDate, birthDate);
		int yearAge = koreanAge - 1;
		scanner.close();
	}

	private static int getTime(Date date) {
		int yearToMonth = 365;
		int monthToDay = date.getMonth();
		if (isLeapYear(date.getYear())) {
			yearToMonth += 1;
			monthToDay += 1;
		}
		return yearToMonth + monthToDay + date.getDay();
	}

	private static int getMonthToDay(int month) {
		final int[] MONTH_END_DAY = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		switch (month) {
			case 1:
				return MONTH_END_DAY[1];
			case 2:
				return MONTH_END_DAY[2];
			case 3:
				return MONTH_END_DAY[3];
			case 4:
				return MONTH_END_DAY[4];
			case 5:
				return MONTH_END_DAY[5];
			case 6:
				return MONTH_END_DAY[6];
			case 7:
				return MONTH_END_DAY[7];
			case 8:
				return MONTH_END_DAY[8];
			case 9:
				return MONTH_END_DAY[9];
			case 10:
				return MONTH_END_DAY[10];
			case 11:
				return MONTH_END_DAY[11];
			case 12:
				return MONTH_END_DAY[12];
			default:
				return -1;
		}
	}

	private static int getKoreanAge(Date nowDate, Date birthDate) {
		return nowDate.getYear() - birthDate.getYear() + 1;
	}

	private static int getGlobalAge(Date nowDate, Date birthDate) {
		// 만나이 계산하기
		return 0;
	}

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 400 == 0) {
				return true;
			}
			if (year % 100 == 0) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}

class Date {
	private int year;
	private int month;
	private int day;

	public Date(String date) {
		this.year = Integer.parseInt(date.split(" ")[0]);
		this.month = Integer.parseInt(date.split(" ")[1]);
		this.day = Integer.parseInt(date.split(" ")[2]);
	}

	public Date(int y, int m, int d) {
		this.year = y;
		this.month = m;
		this.day = d;
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

}