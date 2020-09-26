package src;

import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Star_2447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = (int) (log(i) / log(3));
            double ThreeOfK = pow(3, k);
            for (int j = 0; j < n; j++) {
                if ((i % 3 == 1 && j % 3 == 1)
                        || ((i / ThreeOfK >= 1.0 && i / ThreeOfK < 2) && (i / 3 % (int) ThreeOfK == 1))
                        || (j / ThreeOfK >= 1.0 && j / ThreeOfK < 2) && (j / 3 % (int) ThreeOfK == 1))
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}

