package src;

import java.util.Scanner;

public class Average_10039 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		final int NUMBER = 5;
		int[] points = new int[NUMBER];
		int sum = 0;
		for (int i = 0; i < points.length; i++) {
			points[i] = scanner.nextInt();
			if (points[i] < 40) {
				points[i] = 40;
			}
			sum += points[i];
		}
		System.out.println(sum / NUMBER);
		scanner.close();
	}
}
