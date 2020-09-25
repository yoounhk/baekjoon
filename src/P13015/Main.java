package archive.P13015;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.print("*");
			scanner.close();
			return;
		}
		printTopOrBottom(n);
		System.out.println();
		for (int i = -n + 2; abs(i) < n - 1; i++) {
			printStringNtime(" ", n - abs(i) - 1);
			printXUnit(n);
			if (i == 0) {
				printStringNtime(" ", n - 2);
				System.out.print("*");
			} else {
				printStringNtime(" ", abs(i) * 2 - 1);
				printXUnit(n);
			}

			System.out.println();
		}
		printTopOrBottom(n);
		scanner.close();
	}

	private static void printTopOrBottom(int n) {
		printStringNtime("*", n);
		printStringNtime(" ", n * 2 - 3);
		printStringNtime("*", n);
	}

	private static void printXUnit(int n) {
		System.out.print("*");
		printStringNtime(" ", n - 2);
		System.out.print("*");
	}

	public static void printStringNtime(String str, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(str);
		}
	}

	public static int abs(int n) {
		if (n >= 0)
			return n;
		else {
			return -n;
		}
	}

}