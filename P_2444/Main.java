package P_2444;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int degree = scanner.nextInt();
    for (int i = 1; i <= degree; i++) { // i == 1
      printWhiteSpace(degree - i);
      printOddNumberStar(i);
      System.out.println();
    }
    for (int i = 1; i < degree; i++) { // i == 1
      printWhiteSpace(i);
      printOddNumberStar(degree - i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printWhiteSpace(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printOddNumberStar(int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
      System.out.print("*");
    }
  }

}