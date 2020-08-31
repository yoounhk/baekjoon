package in_progress.refactoring_needed.P2511;

import java.util.Scanner;

public class CardGame_2511 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Card a = new Card(toIntegerArray(scanner.nextLine()));
		Card b = new Card(toIntegerArray(scanner.nextLine()));
		Card.play(a, b);
		String winner = Card.getWinner();
		int[] scores = Card.getMatchScore();
		System.out.println(scores[0] + " " + scores[1]);
		System.out.println(winner);
	}

	private static int[] toIntegerArray(String str) {
		String[] array = str.split(" ");
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		return result;
	}
}

class Card {
	private static final int MATCH_SIZE = 10;
	private static String latestWinner = "D";
	private static String winner = "";
	private static int[] scores = { 0, 0 };
	private int[] cards = new int[MATCH_SIZE];

	public Card(int[] cards) {
		this.cards = cards;
	}

	public static void play(Card a, Card b) {
		for (int i = 0; i < MATCH_SIZE; i++) {
			if (a.cards[i] > b.cards[i]) {
				scores[0] += 3;
				latestWinner = "A";
			} else if (a.cards[i] < b.cards[i]) {
				scores[1] += 3;
				latestWinner = "B";
			} else if (a.cards[i] == b.cards[i]) {
				scores[0] += 1;
				scores[1] += 1;
			}
			if (scores[0] > scores[1]) {
				winner = "A";
			} else if (scores[0] < scores[1]) {
				winner = "B";
			} else if (scores[0] == scores[1]) {
				winner = latestWinner;
			}
		}
	}

	public static int[] getMatchScore() {
		return new int[] { scores[0], scores[1] };
	}

	public static String getWinner() {
		return winner;
	}
}