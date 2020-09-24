package src;

import java.util.Scanner;

public class MoveFruit_11943 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		final int APPLE = 0;
		final int ORANGE = 1;
		final int SIZE = 2;
		int[] box1 = new int[SIZE];
		int[] box2 = new int[SIZE];
		int count = 0;
		box1[APPLE] = scanner.nextInt();
		box1[ORANGE] = scanner.nextInt();
		box2[APPLE] = scanner.nextInt();
		box2[ORANGE] = scanner.nextInt();
		int totalApple = box1[APPLE] + box2[APPLE];
		int totalOrange = box1[ORANGE] + box2[ORANGE];
		int[] appleBox = new int[2];
		int[] orangeBox = new int[2];
		if (box1[APPLE] > box2[APPLE]) {
			appleBox = box1;
			orangeBox = box2;
		} else if (box1[APPLE] < box2[APPLE]) {
			orangeBox = box1;
			appleBox = box2;
		} else if (box1[APPLE] == box2[APPLE] && box1[ORANGE] == box2[ORANGE]) {
			count += box1[APPLE] + box2[ORANGE];
			System.out.println(count);
			scanner.close();
			return;
		} else if (box1[APPLE] == box2[APPLE] && box1[ORANGE] != box2[ORANGE]) {
			count = totalOrange - Integer.min(box1[ORANGE], box2[ORANGE]) + box1[APPLE];
			System.out.println(count);
			scanner.close();
			return;
		}
		count += totalApple - appleBox[APPLE];
		count += totalOrange - orangeBox[ORANGE];
		if (orangeBox[APPLE] == 0) {
			if (appleBox[ORANGE] == 0) {
				count = 0;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
