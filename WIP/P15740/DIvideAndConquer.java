package unsolved.P15740;

import java.util.ArrayList;
import java.util.Scanner;

public class DIvideAndConquer {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    String a = scanner.next();
    String b = scanner.next();
    int bigLength = max(a.length(), b.length());
    int smallLength = min(a.length(), b.length());
    int bigIterator = bigLength;
    int smallIterator = smallLength;
    String result = "";
    while (bigIterator >= 0) {
      if (smallIterator > 0) {
        Digit.add(a.charAt(bigIterator), b.charAt(smallIterator));
      } else if (smallIterator == 0) {
        // 남은 big의 마지막 자리에 자리올림을 해주고, 두 문자열을 합침(big_modified + small)
        // result.concat(smallResult);
      }
    }

    scanner.close();
  }

  private static int min(int a, int b) {
    return a > b ? a : b;
  }

  private static int max(int a, int b) {
    return a < b ? a : b;
  }
}

class Digit {
  private static int digit = 0;
  private static int carriage = 0;
  private static ArrayList<String> sum = new ArrayList<>();

  public static void add(char a, char b) {
    int n1 = a - '0';
    int n2 = b - '0';
    int result = n1 + n2 + carriage;
    digit = result % 10;
    carriage = result / 10;
    sum.add(sum.size(), Integer.toString(digit));

  }
}
