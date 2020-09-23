package src;

import java.math.BigInteger;
import java.util.Scanner;

public class Center_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2;
        for (int i = 0; i < n; i++) {
            size += size - 1;
        }
        System.out.println(size * size);
    }