// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class Cow_16431 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int bessie_x = scanner.nextInt();
		int bessie_y = scanner.nextInt();
		int daisy_x = scanner.nextInt();
		int daisy_y = scanner.nextInt();
		int john_x = scanner.nextInt();
		int john_y = scanner.nextInt();
		int bessie_x_distance = abs(john_x - bessie_x);
		int bessie_y_distance = abs(john_y - bessie_y);
		int bessieMove = max(bessie_x_distance, bessie_y_distance);
		int daisyMove = abs(john_x - daisy_x) + abs(john_y - daisy_y);
		if (bessieMove < daisyMove) {
			System.out.println("bessie");
		} else if (daisyMove < bessieMove) {
			System.out.println("daisy");
		} else {
			System.out.println("tie");
		}
		scanner.close();
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	private static int abs(int a) {
		return a > 0 ? a : -a;
	}
}