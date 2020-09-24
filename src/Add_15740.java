package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Add_15740 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;

        Scanner sc = new Scanner(System.in);
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        System.out.println(a.add(b));
    }
}
