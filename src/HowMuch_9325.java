package src;

import java.util.Scanner;

public class HowMuch_9325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int fullOptionPrice = 0;
        for (int i = 0; i < testCase; i++) {
            int price = sc.nextInt();
            int nOption = sc.nextInt();
            int optionTotal = 0;
            for (int j = 0; j < nOption; j++) {
                int q = sc.nextInt();
                int p = sc.nextInt();
                optionTotal += q * p;
            }
            fullOptionPrice = optionTotal + price;
            System.out.println(fullOptionPrice);
        }

    }
}
