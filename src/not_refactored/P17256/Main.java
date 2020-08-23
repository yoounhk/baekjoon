package not_refactored.P17256;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {
    String str;

    str = scanner.nextLine();
    String[] array = str.split(" ");
    Cake a = new Cake(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]));
    str = scanner.nextLine();
    array = str.split(" ");
    Cake c = new Cake(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]));
    for (int i = 1; i <= 100; i++) {
      for (int j = 1; j <= 100; j++) {
        for (int k = 1; k <= 100; k++) {
          Cake b = new Cake(i, j, k);
          if (a.piece(b).equals(c)) {
            b.print();
            scanner.close();
            return;
          }
        }
      }
    }
    scanner.close();
  }
}

class Cake {
  int x, y, z;

  Cake(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Cake piece(Cake cake) {
    return new Cake(this.z + cake.x, this.y * cake.y, this.x + cake.z);
  }

  public boolean equals(Cake cake) {
    if (this.x == cake.x) {
      if (this.y == cake.y) {
        if (this.z == cake.z) {
          return true;
        }
      }
    }
    return false;
  }

  public void print() {
    System.out.println(this.x + " " + this.y + " " + this.z);
  }
}