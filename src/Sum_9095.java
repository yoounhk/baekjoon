package src;

import java.util.Scanner;

public class Sum_9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = get(n);
            System.out.println(a);
        }
    }

    private static int get(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                for (int k = 0; k <= n; k++)
                    if (i + 2 * j + 3 * k == n) {
                        int x = 0;
                        if (i * j * k != 0) x = f(i + j + k) / (f(i)*f(j)*f(k)); // 여기가 문제
                        else if (i == 0 && j == 0 && k == 0) x = 0; // ok
                        else if (i == 0 && j == 0) x = 1; // ok
                        else if (j == 0 && k == 0) x = 1; // ok
                        else if (k == 0 && i == 0) x = 1; // ok
                        else if (i == 0) {
                            x = f(j + k) / (f(j) * f(k));
                        } else if (j == 0) {
                            x = f(i + k) / (f(k) * f(i));
                        } else if (k == 0) {
                            x = f(i + j) / (f(i) * f(j));
                        }
                        count += x; // TODO: 여기를 집중 디버깅
                    }
        return count;
    }

    public static int f(int n) {
        int fact = 1;
        while (n >= 1) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
