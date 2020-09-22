package src;

import java.util.Scanner;

public class FourNumbers_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = new String();
        input = sc.nextLine();

        String[] a = input.split(" ");
        String x = a[0]+a[1];
        String y = a[2]+a[3];
        System.out.println(Long.parseLong(x) + Long.parseLong(y));
    }
}
