package src;

import java.util.Scanner;

public class Point_2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nP = sc.nextInt();
        int[] points = new int[nP];
        for (int i = 0; i < points.length; i++) {
            points[i] = sc.nextInt();
        }
        int total = 0;
        total = points[0];
        int streak = 0;
        for (int i = 1; i < nP; i++) {
            if (points[i-1] == 1) {
                streak++;
            }
            else streak = 0;
            if (points[i] == 1) total += streak + points[i];
        }
        System.out.println(total);
    }
}
