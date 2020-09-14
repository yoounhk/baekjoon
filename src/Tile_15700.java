// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class Tile_15700 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		long width = scanner.nextLong();
		long height = scanner.nextLong();
		long result = 0;
		if (even(width) || even(height)) {
			result = width * height / 2;
		} else if (odd(width) && odd(height)) {
			result = (width * height - 1) / 2;
		}
		System.out.println(result);
		scanner.close();
	}

	private static boolean even(long n) {
		return n % 2 == 0 ? true : false;
	}

	private static boolean odd(long n) {
		return n % 2 == 1 ? true : false;
	}
}
