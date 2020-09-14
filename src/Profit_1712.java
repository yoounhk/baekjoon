// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class Profit_1712 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String input = scanner.nextLine();
		int fixedCost = Integer.parseInt(input.split(" ")[0]);
		int cost = Integer.parseInt(input.split(" ")[1]);
		int price = Integer.parseInt(input.split(" ")[2]);
		if (cost >= price) {
			System.out.println(-1);
			scanner.close();
			return;
		}
		int result = fixedCost / (price - cost) + 1;
		if (result <= 0) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
		scanner.close();
	}
}
