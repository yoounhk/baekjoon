package src;

import java.util.Scanner;

public class Sequence_10539 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = b[i]*(i+1);
        }
        int[] a = new int[n];
        a[0] = s[0];
        System.out.print(a[0]+" ");
        for (int i = 1; i < n; i++) {
            a[i] = s[i] - s[i-1];
            System.out.print(a[i]+" ");
        }
    }
}
