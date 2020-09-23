package src;

import java.util.Scanner;

public class Polygon_10569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int vertex = sc.nextInt();
            int edge = sc.nextInt();
            int face = 2 - vertex + edge;
            System.out.println(face);
        }
    }
}
