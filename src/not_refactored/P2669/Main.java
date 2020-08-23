package not_refactored.P2669;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    final int BOX_NUMBER = 4;
    Box[] boxes = new Box[BOX_NUMBER];
    String inputString = "";
    for (int i = 0; i < BOX_NUMBER; i++) {
      inputString = scanner.nextLine();
      boxes[i] = new Box(inputString);
      boxes[i].fillCell();
    }
    Box.getArea();
    Box.printAreaValue();
    scanner.close();
  }
}

class Box {
  final static int MAX_X = 99 + 1;
  final static int MAX_Y = 99 + 1;
  private static int[][] cell = new int[MAX_X][MAX_Y];
  private static int sum = 0;
  private int x1, y1, x2, y2;

  public Box(String inputString) {
    String[] array = inputString.split(" ");
    this.x1 = Integer.parseInt(array[0]);
    this.y1 = Integer.parseInt(array[1]);
    this.x2 = Integer.parseInt(array[2]);
    this.y2 = Integer.parseInt(array[3]);
  }

  public void fillCell() {
    for (int i = 1; i < MAX_X; i++) {
      for (int j = 1; j < MAX_Y; j++) {
        if ((i >= this.x1 && i < this.x2) && (j >= this.y1 && j < this.y2)) {
          cell[i][j] = 1;
        }
      }
    }
  }

  public static void getArea() {
    for (int i = 0; i < MAX_X; i++) {
      for (int j = 0; j < MAX_Y; j++) {
        if (cell[i][j] == 1) {
          sum += cell[i][j];
        }
      }
    }
  }

  public static void printAreaValue() {
    System.out.println(sum);
  }
}