package P10990;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      printBlank(n - i - 1);
      System.out.print("*");
      printBlank(2 * i - 1);
      if (i > 0)
        System.out.print("*");
      System.out.println();
    }
    scanner.close();
  }

  public static void printBlank(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }
}
