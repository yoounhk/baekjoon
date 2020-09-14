package src;

import java.util.Scanner;

public class Triangle_10101 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		boolean isTriangle = a + b + c == 180;
		if (isTriangle) {
			if (a == b && b == c) {
				System.out.println("Equilateral");
			} else if ((a == b) || (a == c) || (b == c)) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}
		scanner.close();
	}
}