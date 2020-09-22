import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      printWhiteSpace(i);
      printStar(n - i);
      System.out.println();
    }
    scanner.close();
  }

  private static void printWhiteSpace(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }

  private static void printStar(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
  }

}