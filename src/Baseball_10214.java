package src;

import java.util.Scanner;

public class Baseball_10214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int[] a = new int[9];
            int[] b = new int[9];
            int aScore = 0;
            int bScore = 0;
            for (int j = 0; j < 9; j++) {
                a[j] = sc.nextInt();
                b[j] = sc.nextInt();
                aScore+=a[j];
                bScore+=b[j];
            }
            if (aScore > bScore) System.out.println("Yonsei");
            else if (aScore<bScore) System.out.println("Korea");
            else if (aScore == bScore) System.out.println("Draw");
        }
    }
}
