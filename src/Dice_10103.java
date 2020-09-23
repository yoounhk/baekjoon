package src;

import java.util.Scanner;

public class Dice_10103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int aScore = 100;
        int bScore = 100;
        for (int i = 0; i < round; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ( a < b) aScore -= b;
            else if ( a > b) bScore -= a;
        }
        System.out.println(aScore);
        System.out.println(bScore);
    }
}
