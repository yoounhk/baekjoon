// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class Compare_2752 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int[] array = { a, b, c };
		int min = min(min(a, b), min(b, c));
		int max = max(max(a, b), max(b, c));
		int middle = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != min && array[i] != max) {
				middle = array[i];
			}
		}
		System.out.println(min + " " + middle + " " + max);
		scanner.close();
	}

	private static int max(int x, int y) {
		return x > y ? x : y;
	}

	private static int min(int x, int y) {
		return x < y ? x : y;
	}
}
