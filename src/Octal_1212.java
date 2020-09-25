package src;

import java.util.Scanner;

public class Octal_1212 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String octal = scanner.nextLine();
		StringBuilder binary = new StringBuilder();
		int n = octal.length();
		for (int i = 0; i < n; i++) {
			binary = binary.append(octalToBinary(octal.charAt(i)));
		}
		for (int i = 0; i < binary.length(); i++) { /// 1이 나올때까지 0을 삭제
			if (binary.charAt(i) == '1') {
				System.out.println(binary.substring(i));
				scanner.close();
				return;
			}
		}
		System.out.println(0);
		scanner.close();
	}

	private static String octalToBinary(char ch) {
		switch (ch) {
			case '0':
				return "000";
			case '1':
				return "001";
			case '2':
				return "010";
			case '3':
				return "011";
			case '4':
				return "100";
			case '5':
				return "101";
			case '6':
				return "110";
			case '7':
				return "111";
			default:
				return null;
		}
	}
}