package archive.P16430;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.print(b - a + " " + b);
		scanner.close();
	}
}