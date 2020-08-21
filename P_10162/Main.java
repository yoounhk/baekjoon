package P_10162;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int time = scanner.nextInt();
    int count[] = { 0, 0, 0 };
    final int A = 300;
    final int B = 60;
    final int C = 10;
    count[0] = time / A;
    time = time % A;
    count[1] = time / B;
    time = time % B;
    count[2] = time / C;
    time = time % C;
    if (time != 0)
      System.out.println(-1);
    else {
      for (int i = 0; i < count.length; i++) {
        System.out.print(count[i] + " ");
      }
    }
    scanner.close();
  }
}