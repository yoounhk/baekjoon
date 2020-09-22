package src;

import java.util.Scanner;

public class IsBig_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = b = -1;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) break;
            if (a > b) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
