package not_refactored.P_2511;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    final int NUM_CARD = 10;
    final int A = 0;
    final int B = 1;
    final int DRAW = -1;
    String str = "";
    str = scanner.nextLine();
    String[] cards = str.split(" ");
    int[] a = new int[NUM_CARD];
    int[] score = { 0, 0 };
    for (int i = 0; i < NUM_CARD; i++) {
      a[i] = Integer.parseInt(cards[i]);
    }
    str = scanner.nextLine();
    cards = str.split(" ");
    int[] b = new int[NUM_CARD];
    for (int i = 0; i < NUM_CARD; i++) {
      b[i] = Integer.parseInt(cards[i]);
    }
    int[] win = new int[10]; // draw == -1
    for (int i = 0; i < NUM_CARD; i++) {
      if (a[i] > b[i]) {
        score[A] += 3;
        win[i] = A;
      } else if (b[i] > a[i]) {
        score[B] += 3;
        win[i] = B;
      } else {
        score[A]++;
        score[B]++;
        win[i] = DRAW;
      }
    }
    System.out.printf("%d %d\n", score[A], score[B]);
    if (score[A] > score[B]) {
      System.out.print("A");
      return;
    } else if (score[B] > score[A]) {
      System.out.print("B");
      return;
    } else if (score[A] == score[B]) {
      for (int i = NUM_CARD - 1; i > 0; i--) {
        if (win[i] == A) {
          System.out.println("A");
          return;
        } else if (win[i] == B) {
          System.out.println("B");
          return;
        }
        if (win[i] == DRAW && win[i - 1] != DRAW) {
          if (win[i - 1] == A) {
            System.out.print("A");
            return;
          } else if (win[i - 1] == B) {
            System.out.print("B");
            return;
          }
        }
      }
    }
    System.out.print("D");
  }
}
