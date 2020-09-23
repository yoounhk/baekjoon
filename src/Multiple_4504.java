package src;

import java.util.Scanner;

public class Multiple_4504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int input;
        while (true) {
            input = sc.nextInt();
            if (input == 0) break;
            if (input % base == 0) {
                System.out.println(input+ " is a multiple of "+ base+".");
            }
            else {
                System.out.println(input+ " is NOT a multiple of "+ base+".");
            }
        }

    }
}
