package archive.P10995;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1)
				System.out.print(" ");
			printStringNtime("* ", n);
			System.out.println();
		}
		scanner.close();
	}

	public static void printStringNtime(String str, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(str);
		}
	}
}