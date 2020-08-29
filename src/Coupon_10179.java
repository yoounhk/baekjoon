package src;

import java.util.Scanner;

public class Coupon_10179 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int testCase = scanner.nextInt();
		double[] price = new double[testCase];
		for (int i = 0; i < price.length; i++) {
			price[i] = scanner.nextDouble();
			price[i] = price[i] * 0.8;
			System.out.println(format(price[i]));
		}

		scanner.close();
	}

	private static String format(double d) {
		return String.format("$%.2f", d);
	}
}
