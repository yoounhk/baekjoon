package P_10991;

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
    for (int i = 1; i <= n; i++) { // i == 1
      printFirstBlank(n - i);
      printUnit(i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printFirstBlank(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printUnit(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("* ");
    }
  }

}