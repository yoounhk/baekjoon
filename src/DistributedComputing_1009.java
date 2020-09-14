// https://github.com/yoounhk/baekjoon 
package src;

import java.util.ArrayList;
import java.util.Scanner;

public class DistributedComputing_1009 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int testCase = scanner.nextInt();
		int result[] = new int[testCase];
		for (int i = 0; i < testCase; i++) {
			result[i] = getLastDigit(scanner.nextInt(), scanner.nextInt());
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		scanner.close();
	}

	private static int getLastDigit(int a, int b) {
		ArrayList<Integer> setOfLastDigits = new ArrayList<>();
		int multiplication = a;
		int lastdigit = multiplication % 10;
		while (!setOfLastDigits.contains(lastdigit)) {
			setOfLastDigits.add(lastdigit);
			multiplication *= a;
			lastdigit = multiplication % 10;
		}
		int turn = (b - 1) % setOfLastDigits.size();
		int result = setOfLastDigits.get(turn);
		return result;
	}
}
