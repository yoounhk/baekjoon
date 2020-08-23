package P2522;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) { // i == 1
      printBlank(n - i);
      printStar(i);
      System.out.println();
    }
    for (int i = 1; i <= n; i++) { // i == 1
      printBlank(i);
      printStar(n - i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printStar(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
  }

  private static void printBlank(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

}