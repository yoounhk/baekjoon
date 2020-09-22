

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int song = scanner.nextInt();
    int melody = scanner.nextInt();
    System.out.println(song * (melody - 1) + 1);
    scanner.close();
  }
}