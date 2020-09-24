package src.unsolved.P_10834;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    int numberOfBelt = scanner.nextInt();
    ArrayList<Belt> belts = new ArrayList<Belt>();
    String str = new String();
    Belt belt = new Belt();
    for (int i = 0; i < numberOfBelt; i++) {
      str = scanner.nextLine();
      belt.set(str);
      belts.add(belt);
    }
    scanner.close();
  }

  public static class Belt {
    int wheelRatio1 = 0;
    int wheelRatio2 = 0;
    boolean isClockwise = true;

    public void set(String str) {
      String[] array = str.split(" ");
      this.wheelRatio1 = Integer.parseInt(array[0]);
      this.wheelRatio2 = Integer.parseInt(array[1]);
      this.isClockwise = (array[2].equals("0")) ? true : false;
    }
  }
}