package not_refactored.P_10995;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if (n == 1) {
      System.out.print("*");
      scanner.close();
      return;
    }
    for (int i = 1; i <= n; i++) {
      if (isEvenLine(i)) {
        System.out.print(" ");
      }
      printPattern(n);
      System.out.println();
    }
    scanner.close();
  }

  private static boolean isEvenLine(int n) {
    if (n % 2 == 0)
      return true;
    return false;
  }

  private static void printPattern(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("* ");
    }
  }
}