// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class TwoRuleArithmetic_15726 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		System.out.println((long) Math.max(a * b / c, a / b * c));
		scanner.close();
	}
}
