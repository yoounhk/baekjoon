package P5554;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static final int INPUT_DATA = 4;

  public static void main(String args[]) {
    int sum = 0;
    for (int i = 0; i < INPUT_DATA; i++) {
      sum += scanner.nextInt();
    }
    int min = 0;
    int sec = 0;
    min = sum / 60;
    sec = sum % 60;
    System.out.println(min);
    System.out.println(sec);
    scanner.close();
  }
}