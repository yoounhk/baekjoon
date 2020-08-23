package P15964;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    long a = scanner.nextInt();
    long b = scanner.nextInt();
    System.out.println((a + b) * (a - b));
    scanner.close();
  }
}