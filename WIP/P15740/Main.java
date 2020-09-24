package unsolved.P15740;

// TODO 큰수를 계산하기 위해 숫자를 문자열 형태로 바꿔서 계산하기
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  // private static Scanner scanner = new Scanner(System.in);
  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<>();
    String[] array = splitEach19Letters("10000000000000000000000000000000000000");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    // String a = scanner.next();
    // String b = scanner.next();
    // System.out.println(a);
    // System.out.println(b);

    // scanner.close();
  }

  // public String addPositive(String a, String b) {
  // String[] splitedA = splitEach18Letters(a);
  // String[] splitedB = splitEach18Letters(b);
  // }

  private static String[] splitEach19Letters(String a) {
    String[] result = 
  }

  private String reverse(String a) {
    StringBuffer strBuffer = new StringBuffer();
    // 버퍼에 문자열을 넣고
    strBuffer.append(a);
    // 버퍼안에 reverse()를 이용해 거꾸로 출력
    return strBuffer.reverse().toString();
  }

  private int minLength(String a, String b) {
    return a.length() > b.length() ? a.length() : b.length();
  }
}
