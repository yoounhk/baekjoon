// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class Finger_17362 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		long n = scanner.nextInt();
		int determinator = (int) n % 8;
		int result = 0;
		switch (determinator) {
			case 1:
				result = 1;
				break;
			case 2:
				result = 2;
				break;
			case 3:
				result = 3;
				break;
			case 4:
				result = 4;
				break;
			case 5:
				result = 5;
				break;
			case 6:
				result = 4;
				break;
			case 7:
				result = 3;
				break;
			case 0:
				result = 2;
				break;
			default:
				break;
		}
		System.out.println(result);
		scanner.close();
	}
}
