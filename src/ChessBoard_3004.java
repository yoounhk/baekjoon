// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class ChessBoard_3004 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scanner.nextInt();
		int x;
		if (n % 2 == 1) {
			x = (n + 1) / 2;
			System.out.println(x * (x + 1));
		} else {
			x = n / 2;
			System.out.println((x + 1) * (x + 1));
		}
		scanner.close();
	}
}
