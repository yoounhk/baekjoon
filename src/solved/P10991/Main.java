package P10991;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      printBlank(n - i - 1);
      printStringNTime("* ", i + 1);
      System.out.println();
    }
    scanner.close();
  }

  public static void printBlank(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printStringNTime(String str, int time) {
    for (int i = 0; i < time; i++) {
      System.out.print(str);
    }
  }

}