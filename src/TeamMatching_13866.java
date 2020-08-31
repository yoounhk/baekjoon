package src;

import java.util.Scanner;

public class TeamMatching_13866 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String[] str = scanner.nextLine().split(" ");
		int[] level = new int[str.length];
		for (int i = 0; i < level.length; i++) {
			level[i] = Integer.parseInt(str[i]);
		}
		for (int i = 0; i < level.length; i++) {
			for (int j = 0; j < level.length - 1; j++) {
				if (level[j] > level[j + 1]) {
					level = swap(level, j, j + 1);
				}
			}
		}
		System.out.println(Math.abs(level[0] + level[3] - level[1] - level[2]));
		scanner.close();
	}

	private static int[] swap(int[] array, int a, int b) {
		int temp;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
	}

}
