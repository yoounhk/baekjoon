package P_13015;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      printLeftMargin(i);
      if (i == 1) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      } else {
        printXShapeUnit(n);
      }
      printCenterMarign(n - i);
      if (i == 1) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      } else {
        printXShapeUnit(n);
      }
      System.out.println();
    }
    printLeftMargin(n);
    printMiddleLine(n);
    System.out.println();
    for (int i = 1; i < n; i++) {
      printLeftMargin(n - i);
      if (i == n - 1) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      } else {
        printXShapeUnit(n);
      }
      printCenterMarign(i);
      if (i == n - 1) {
        for (int j = 0; j < n; j++) {
          System.out.print("*");
        }
      } else {
        printXShapeUnit(n);
      }
      System.out.println();
    }
    scanner.close();
  }

  private static void printMiddleLine(int n) {
    for (int i = 1; i <= n * 2 - 1; i++) {
      if (i == 1 || i == n || i == n * 2 - 1) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }
  }

  private static void printCenterMarign(int n) {
    for (int i = 0; i < n * 2 - 1; i++) {
      System.out.print(" ");
    }
  }

  private static void printXShapeUnit(int n) {
    for (int i = 0; i < n; i++) {
      if (i == 0 || i == n - 1) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }
  }

  private static void printLeftMargin(int n) {
    for (int i = 0; i < n - 1; i++) {
      System.out.print(" ");
    }
  }
}
