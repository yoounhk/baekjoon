package src;

import java.util.Scanner;

public class TV_1297 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String input = scanner.nextLine();
		float diagonalLength = Float.parseFloat(input.split(" ")[0]);
		float heightRatio = Float.parseFloat(input.split(" ")[1]);
		float widthRatio = Float.parseFloat(input.split(" ")[2]);
		float ratio = widthRatio / heightRatio;
		float height = (float) (diagonalLength / (Math.sqrt(Math.pow(ratio, 2) + 1)));
		float width = height * ratio;
		System.out.println((int) height + " " + (int) width);
	}
}
