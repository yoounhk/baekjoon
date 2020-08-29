package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiply17_5893 {
	private static final String STR_MAGIC_NUMBER = "17";
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String input = scanner.nextLine();
		BigInteger big = new BigInteger(input, 2);
		big = big.multiply(new BigInteger(STR_MAGIC_NUMBER));
		String output = big.toString(2);
		System.out.print(output);
		scanner.close();
	}
}
