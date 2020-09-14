// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class starFruits_17496 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int summerDuration = scanner.nextInt();
		int growthInterval = scanner.nextInt();
		int farmSize = scanner.nextInt();
		int price = scanner.nextInt();
		int fruitsPerCell = (summerDuration - 1) / growthInterval;
		int income = fruitsPerCell * farmSize * price;
		System.out.println(income);
		scanner.close();
	}
}