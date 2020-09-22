

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int r1, s;
    r1 = scanner.nextInt();
    s = scanner.nextInt();
    System.out.println(s * 2 - r1);
    scanner.close();
  }
}