// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class FANumber_14935 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String input = scanner.nextLine();
		String output = getFA(input);
		if (!output.equals("")) {
			System.out.println("FA");
		} else {
			System.out.println("NFA"); // 주어진 범위에서 NFA인 경우는 없다
		}
		scanner.close();
	}

	private static String getFA(String input) {
		String output = Integer.toString(input.length() * Integer.parseInt(input.substring(0, 1)));
		if (input.equals(output)) {
			return output;
		}
		return getFA(output);
	}
}
