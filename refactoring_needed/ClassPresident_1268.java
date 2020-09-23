// https://github.com/yoounhk/baekjoon
package in_progress.refactoring_needed;

import java.util.Scanner;

public class ClassPresident_1268 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int numberOfStudent = scanner.nextInt();
		int[][] classData = new int[numberOfStudent + 1][5];
		for (int i = 1; i < classData.length; i++) {
			for (int j = 0; j < 5; j++) {
				classData[i][j] = scanner.nextInt();
			}
		}
		int[][] classWith = new int[numberOfStudent + 1][numberOfStudent + 1];
		int[] presidentScore = new int[numberOfStudent + 1];
		for (int i = 1; i < classWith.length; i++) {
			presidentScore[i] = 0;
			for (int j = 1; j < classWith.length; j++) {
				classWith[i][j] = getClassWith(classData, i, j);
				if (classWith[i][j] > 0) {
					presidentScore[i] += 1;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		int whoIsPresident = 0;
		for (int i = 1; i < presidentScore.length; i++) {
			if (presidentScore[i] > max) {
				max = presidentScore[i];
				whoIsPresident = i;
			}
		}
		System.out.println(whoIsPresident);
		scanner.close();
	}

	private static int getClassWith(int[][] classData, int a, int b) {
		if (a == b) {
			return -1;
		}
		int[] studentA = classData[a];
		int[] studentB = classData[b];
		int result = 0;
		for (int i = 0; i < studentA.length; i++) {
			if (studentA[i] == studentB[i]) {
				result += 1;
			}
		}
		return result;
	}
}