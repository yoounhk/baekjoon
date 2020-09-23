// https://github.com/yoounhk/baekjoon
package src;

import java.util.Scanner;

public class CardGame_2511 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int round = 10;
        int aScore = 0;
        int bScore = 0;
		String[] a = sc.nextLine().split(" ");
		String[] b = sc.nextLine().split(" ");
        for (int i = 0; i < round; i++) {
            if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) aScore += 3;
            else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) bScore += 3;
            else {
                aScore++;
                bScore++;
            }
        }
        System.out.println(aScore + " " + bScore);
        char winner = 'D';
        if (aScore > bScore) winner = 'A';
        else if (aScore < bScore) winner = 'B';
        else {
            for (int i = round - 1; i >= 0; i--) {
                if (!a[i].equals(b[i])) {
                    winner = Integer.parseInt(a[i]) > Integer.parseInt(b[i]) ? 'A' : 'B';
                    break;
                }
            }
        }
        System.out.println(winner);
    }
}