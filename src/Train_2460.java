package src;

import java.util.Scanner;

public class Train_2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < 10; i++) {
            if (current > max) max = current;
            int out = sc.nextInt();
            current -= out;
            int in =sc.nextInt();
            current += in;
        }
        System.out.println(max);
    }
}
