package P5522;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  static final int INPUT_DATA = 5;

  public static void main(String args[]) {
    int sum = 0;
    int INPUT_DATA = 5;
    for (int i = 0; i < INPUT_DATA; i++) {
      sum += scanner.nextInt();
    }
    System.out.println(sum);
    scanner.close();
  }
}