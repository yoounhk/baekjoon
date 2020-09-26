// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class CardGame_2511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        char[] winner = new char[10];
        int aScore = 0;
        int bScore = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                aScore += 3;
                winner[i] = 'A';
            } else if (b[i] > a[i]) {
                bScore += 3;
                winner[i] = 'B';
            } else {
                aScore++;
                bScore++;
                winner[i] = 'D';
            }
        }
        System.out.println(aScore + " " + bScore);
        if (aScore != bScore) System.out.println(aScore > bScore ? 'A' : 'B');
        else {
            for (int i = 0; i < 10; i++) {
                if (winner[10 - i - 1] != 'D') {
                    System.out.println(winner[10 - i - 1]);
                    return;
                }
            }
            System.out.println('D');
        }
    }
}