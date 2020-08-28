package src;

import java.util.Scanner;

public class Divide_1008 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        String str = scanner.nextLine();
        double a = Double.parseDouble(str.split(" ")[0]);
        double b = Double.parseDouble(str.split(" ")[1]);
        System.out.println(a / b);
        scanner.close();
    }
}