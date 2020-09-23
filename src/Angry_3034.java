package src;

import java.util.Scanner;

public class Angry_3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i]*a[i] <= w*w + h*h)
                System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
