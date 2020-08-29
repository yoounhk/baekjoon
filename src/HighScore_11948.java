package src;

import java.util.Scanner;

public class HighScore_11948 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		//////////////////////////
		int e = scanner.nextInt();
		int f = scanner.nextInt();
		int sum = 0;
		sum += (a + b + c + d) - Integer.min(Integer.min(a, b), Integer.min(c, d));
		sum += Integer.max(e, f);
		System.out.println(sum);
		scanner.close();
	}
}
