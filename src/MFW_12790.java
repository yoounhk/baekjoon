package src;

import java.util.Scanner;

public class MFW_12790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        // hp, mp, 공, 방 / 장비 hp mp 공 방
        for (int i = 0; i < testCase; i++) {
            int baseHp = sc.nextInt();
            int baseMp = sc.nextInt();
            int baseAttack = sc.nextInt();
            int baseDefense = sc.nextInt();
            int itemHp = sc.nextInt();
            int itemMp = sc.nextInt();
            int itemAttack = sc.nextInt();
            int itemDefense = sc.nextInt();
            int bp = 0;
            if (baseHp + itemHp < 1) bp += 1;
            else bp+=baseHp+itemHp;
            if (baseMp + itemMp < 1) bp+=5;
            else bp+=5*(baseMp+itemMp);
            if ( baseAttack + itemAttack < 0) bp+=0;
            else bp+=2*(baseAttack+itemAttack);
            bp += 2*(baseDefense+itemDefense);
            System.out.print(bp);
            if (!(i == testCase - 1))
            System.out.println();
        }
    }
}
