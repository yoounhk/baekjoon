package src;

import java.util.Scanner;

public class TenDayCar_10797 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int date = scanner.nextInt();
		int onesPlace = date % 10;
		int[] numbers = new int[5];
		int illegal = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			if (onesPlace == numbers[i]) {
				illegal++;
			}
		}
		System.out.println(illegal);
		scanner.close();
	}
}
