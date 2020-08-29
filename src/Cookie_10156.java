package src;

import java.util.Scanner;

public class Cookie_10156 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int price = scanner.nextInt();
		int ammount = scanner.nextInt();
		int money = scanner.nextInt();
		int need = price * ammount - money;
		if (need < 0) {
			need = 0;
		}
		System.out.println(need);
		scanner.close();
	}
}
