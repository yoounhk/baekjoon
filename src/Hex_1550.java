// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class Hex_1550 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String input = scanner.nextLine();
		int output = 0;
		int digit = input.length(); // 자리수
		for (int i = 0; i < digit; i++) {
			output += hexToDecimal(input.charAt(digit - i - 1), i);
		}
		System.out.println(output);
		scanner.close();
	}

	private static int hexToDecimal(char ch, int digit) {
		int num;
		if (ch >= 'A' && ch <= 'F') {
			num = ch - 'A' + 10;
		} else {
			num = ch - '0';
		}
		return num * pow(16, digit);
	}

	private static int pow(int n, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= n;
		}
		return result;
	}

}
