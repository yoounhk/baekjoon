package unsolved.P_9095;

// import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int testCase = scanner.nextInt();
    int[] numbers = new int[testCase];
    initArray(numbers);
    for (int i = 0; i < numbers.length; i++) {

    }
    scanner.close();
  }

  private static void initArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }
  }

  // public class setOfNumbers {
  // private int target;
  // private ArrayList<Integer> combination = new ArrayList<Integer>();

  // public setOfNumbers(int target) {
  // this.target = target;

  // }
  // }
}