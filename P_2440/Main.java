package P_2440;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      printStar(n - i);
    }
    scanner.close();
  }

  public static void printStar(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}