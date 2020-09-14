package src;

import java.util.Scanner;

public class Party_2845 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String str = scanner.nextLine();
		int[] input = toIntegerArray(str);
		str = scanner.nextLine();
		int[] news = toIntegerArray(str);
		int num = input[0] * input[1];
		for (int i = 0; i < news.length; i++) {
			System.out.print((news[i] - num) + " ");
		}
		scanner.close();
	}

	public static int[] toIntegerArray(String str) {
		String[] array = str.split(" ");
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		return result;
	}
}
