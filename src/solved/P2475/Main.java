package P2475;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    String str = scanner.nextLine();
    String[] array = str.split(" ");
    ArrayList<Integer> n = new ArrayList<Integer>();
    for (String s : array) {
      n.add(Integer.parseInt(s));
    }
    int sum = 0;
    for (int i = 0; i < n.size(); i++) {
      sum += square(n.get(i));
    }
    int verify = sum % 10;
    System.out.println(verify);
    scanner.close();
  }

  private static int square(Integer n) {
    return n * n;
  }
}
