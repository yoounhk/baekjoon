package archive.P10833;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int caseSize = scanner.nextInt();
		int appleRemained = 0;
		int student = 0;
		int apple = 0;
		for (int i = 0; i < caseSize; i++) {
			student = scanner.nextInt();
			apple = scanner.nextInt();
			appleRemained += apple % student;
		}
		System.out.println(appleRemained);
		scanner.close();
	}
}