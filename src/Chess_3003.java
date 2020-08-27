package src;

import java.util.Scanner;

public class Chess_3003 {
	private static Scanner scanner = new Scanner(System.in);
	private static final int NUM_KING = 1;
	private static final int NUM_QUEEN = 1;
	private static final int NUM_ROOK = 2;
	private static final int NUM_BISHOP = 2;
	private static final int NUM_KNIGHT = 2;
	private static final int NUM_PAWN = 8;

	public static void main(String args[]) {
		String str = scanner.nextLine(); // input ex: 1 0 1 1 0 6
		int[] currentPiece = Input.stringToIntegerArray(str);
		int[] pieceNeeded = { NUM_KING, NUM_QUEEN, NUM_ROOK, NUM_BISHOP, NUM_KNIGHT, NUM_PAWN };
		for (int i = 0; i < currentPiece.length; i++) {
			pieceNeeded[i] -= currentPiece[i];
			System.out.print(pieceNeeded[i] + " ");
		}
		scanner.close();
	}
}

class Input {
	public static int[] stringToIntegerArray(String str) {
		String[] array = str.split(" ");
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		return result;
	}
}