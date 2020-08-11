package P_2442;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      printWhiteSpace(n - i);
      print2nMinus1Star(i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printWhiteSpace(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void print2nMinus1Star(int n) {
    for (int i = 0; i < n * 2 - 1; i++) {
      System.out.print("*");
    }

  }
}