package src;

import java.util.Scanner;

public class Pentagon_1964 { // TODO: WIP
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 5;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 4 + (i-1)*3+ dp[i-1]; //
        }
        System.out.println(dp[n] % 45678);
    }

}
