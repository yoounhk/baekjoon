// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class FindRunner_15727 {
	private static Scanner scanner = new Scanner(System.in);
	private static int count = 0;

	public static void main(String args[]) {
		int n = scanner.nextInt();
		int output = getRecursiveAnswer(n);
		System.out.println(output);
		scanner.close();
	}

	private static int getRecursiveAnswer(int n) {
		if (n <= 5) {
			return count + 1;
		} else {
			count++;
			return getRecursiveAnswer(n - 5);
		}
	}
}