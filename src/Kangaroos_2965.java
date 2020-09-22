package src;

import java.util.Scanner;

public class Kangaroos_2965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        while (!(c - b == 1 && b - a == 1)) {
            int tmp = b;
            if ( c - b >= b - a) {
                b++;
                a = tmp;
            }
            else {
                b--;
                c = tmp;
            }
            count++;
        }
        System.out.println(count);
    }
}
