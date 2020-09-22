package src;

import java.util.Scanner;

public class BountyHunter_15953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ath = sc.nextInt();
            int bth = sc.nextInt();
            int money = 0;

            if (ath == 0) money += 0;
            else if (ath == 1) money += 5000000;
            else if (ath <= 3) money += 3000000;
            else if (ath <= 6) money += 2000000;
            else if (ath <= 10) money += 500000;
            else if (ath <= 15) money += 300000;
            else if (ath <= 21) money += 100000;

            if (bth == 0) money += 0;
            else if (bth == 1) money += 5120000;
            else if (bth <= 3) money += 2560000;
            else if (bth <= 7) money += 1280000;
            else if (bth <= 15) money += 640000;
            else if (bth <= 31) money += 320000;

            System.out.println(money);
        }
    }
}
