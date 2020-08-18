package not_refactored.P_10992;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      printFirstBlank(n - i);
      printEmptyTriangle(i);
      System.out.println();
    }
    printLastLine(n);
    scanner.close();
  }

  private static void printLastLine(int n) {
    for (int i = 0; i < n * 2 - 1; i++) {
      System.out.print("*");
    }
  }

  private static void printFirstBlank(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printEmptyTriangle(int n) {
    boolean isBlank = false;
    for (int i = 0; i < n * 2 - 1; i++) {
      if (i == n * 2 - 2) {
        isBlank = false;
      }
      if (isBlank) {
        System.out.print(" ");
      } else {
        System.out.print("*");
        isBlank = true;
      }
    }
  }

}