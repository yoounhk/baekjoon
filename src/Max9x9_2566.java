package src;

import java.util.Scanner;

public class Max9x9_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max =Integer.MIN_VALUE;
        int resultRow = 0;
        int resultCol = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int input = sc.nextInt();
                if (input > max) {
                    max = input;
                    resultRow = i;
                    resultCol = j;
                }
            }
        }
        System.out.println(max +"\n"+resultRow+" "+resultCol);
    }
}
