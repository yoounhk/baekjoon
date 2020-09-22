package src;

import java.util.Scanner;

public class DivMul_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while (true) {
            String input = sc.nextLine();
            a = Integer.parseInt(input.split(" ")[0]);
            b = Integer.parseInt(input.split(" ")[1]);
            if (a == 0 && b == 0) break;
            else if (b % a == 0) System.out.println("factor");
            else if (a % b == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
    }
}
