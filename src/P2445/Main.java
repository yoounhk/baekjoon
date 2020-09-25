

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int degree = scanner.nextInt();
    for (int i = 1; i <= degree; i++) {
      printStar(i);
      printWhitespace(degree - i);
      printStar(i);
      System.out.println();
    }
    for (int i = 1; i < degree; i++) {
      printStar(degree - i);
      printWhitespace(i);
      printStar(degree - i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printWhitespace(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
      System.out.print(" ");
    }
  }

  private static void printStar(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
  }
}