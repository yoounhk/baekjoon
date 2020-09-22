package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Noise_2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        sc.nextLine();
        char operator = sc.nextLine().charAt(0);
        BigInteger b = sc.nextBigInteger();
        if (operator == '+') System.out.println(a.add(b));
        else if (operator == '*') System.out.println(a.multiply(b));
    }
}
