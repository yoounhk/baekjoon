package src;

import java.util.Scanner;

public class Hanhwa_14652 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int mySeatNumber = scanner.nextInt();
		int index = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (index == mySeatNumber) {
					System.out.println(i + " " + j);
				}
				index++;
			}
		}
		scanner.close();
	}
}