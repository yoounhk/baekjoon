package P_10990;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      printFirstBlank(n - i - 1);
      System.out.print("*");
      printMiddleBlank(i);
      if (i == 0) {
        System.out.println();
        continue;
      }
      System.out.println("*");
    }
    scanner.close();
  }

  private static void printFirstBlank(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printMiddleBlank(int n) {
    for (int i = 1; i <= n * 2 - 1; i++) {
      System.out.print(" ");
    }
  }
}