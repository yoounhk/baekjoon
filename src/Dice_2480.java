// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class Dice_2480 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int[] dice = new int[7];
		int[] input = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
		int reward = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			dice[input[i]] += 1;
		}
		for (int i = 0; i < dice.length; i++) {
			if (dice[i] == 3) {
				reward = 10000 + (i * 1000);
			} else if (dice[i] == 2) {
				reward = 1000 + (i * 100);
			} else if (dice[i] != 0 && max < i) {
				max = i;
				reward = max(reward, max * 100);
			}
		}
		System.out.println(reward);
		scanner.close();
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
