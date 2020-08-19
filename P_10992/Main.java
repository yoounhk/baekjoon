package P_10992;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      if (i == n - 1) {
        printCharacterNtime('*', i * 2 + 1);
        break;
      }
      printCharacterNtime(' ', n - i - 1); // skip when i == 0
      printCharacterNtime('*', 1);
      printCharacterNtime(' ', 2 * i - 1);
      if (i > 0)
        printCharacterNtime('*', 1);
      System.out.println();
    }
    scanner.close();
  }

  public static void printCharacterNtime(char ch, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(ch);
    }
  }

}