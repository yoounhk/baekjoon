// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class Cake_17256 {
	private static Scanner scanner = new Scanner(System.in);
	private static final int X = 0;
	private static final int Y = 1;
	private static final int Z = 2;

	public static void main(String args[]) {
		int[] a = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		int[] c = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		int[] b = new int[3];

		b[X] = c[X] - a[Z];
		b[Y] = c[Y] / a[Y];
		b[Z] = c[Z] - a[X];
		System.out.println(b[X] + " " + b[Y] + " " + b[Z]);
		scanner.close();
	}
}