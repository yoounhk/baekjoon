// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class CASIO_15963 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		if (n == m) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scanner.close();
	}
}
