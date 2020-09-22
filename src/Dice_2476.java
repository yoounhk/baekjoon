package src;

import java.util.Scanner;

public class Dice_2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int[] dice = new int[3];
            dice[0] = sc.nextInt();
            dice[1] = sc.nextInt();
            dice[2] = sc.nextInt();
            int score = getScore(dice);
            if (score > max) max = score;
        }
        System.out.println(max);

    }

    private static int getScore(int[] dice) {
        int score = 0;
        if (dice[0] == dice[1] && dice[1] == dice[2]) score = 10000 + dice[0] * 1000;
        else if (dice[0] == dice[1]) score = 1000 + dice[0] * 100;
        else if (dice[1] == dice[2]) score = 1000 + dice[1] * 100;
        else if (dice[0] == dice[2]) score = 1000 + dice[2] * 100;
        else score = Math.max(Math.max(dice[0], dice[1]), Math.max(dice[1],dice[2])) * 100;
        return score;
    }
}
