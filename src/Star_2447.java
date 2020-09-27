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
            double ThreeOfK = pow(3, k); // 3의 k승
            for (int j = 0; j < n; j++) {
                if (true) // TODO: 여기만 수정하면 됨
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}

