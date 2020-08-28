package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich_1271 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        String input = scanner.nextLine();
        BigInteger money = new BigInteger(input.split(" ")[0]);
        BigInteger people = new BigInteger(input.split(" ")[1]);
        System.out.print(money.divide(people));
        System.out.println(" " + money.mod(people));
        scanner.close();
    }
}