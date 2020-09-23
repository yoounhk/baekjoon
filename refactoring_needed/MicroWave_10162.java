// https://github.com/yoounhk/baekjoon
package in_progress.refactoring_needed;

import java.util.Scanner;

public class MicroWave_10162 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int time = scanner.nextInt();
		if (time % 10 != 0) {
			System.out.println(-1);
			scanner.close();
			return;
		}
		int a = 300;
		int b = 60;
		int c = 10;
		int aCount = time / a;
		int bCount = (time - (aCount * a)) / b;
		int cCount = (time % b) / c;
		System.out.println(aCount + " " + bCount + " " + cCount);
		scanner.close();
	}
}
