package src;

import java.util.Scanner;

public class FastFood_5543 {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int first = scanner.nextInt();
    int second = scanner.nextInt();
    int third = scanner.nextInt();
    int coke = scanner.nextInt();
    int soda = scanner.nextInt();

    int minBurger = min(min(first, second), min(second, third));
    int minBeverage = min(coke, soda);
    System.out.println(minBurger + minBeverage - 50);

    scanner.close();
  }

  private static int min(int a, int b) {
    return a < b ? a : b;
  }
}
