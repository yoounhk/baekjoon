package src;

import java.util.Scanner;

public class Apple_10833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSchool = sc.nextInt();
        int left = 0;
        for (int i = 0; i < nSchool; i++) {
            int nStu = sc.nextInt();
            int nApple = sc.nextInt();
            left += nApple % nStu;
        }
        System.out.println(left);
    }
}
