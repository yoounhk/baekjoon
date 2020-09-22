package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisor_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] divisors = getDivisors(n);
        if (k > divisors.length) System.out.println(0);
        else System.out.println(divisors[k-1]);
    }

    private static Integer[] getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) divisors.add(i);
        }
        Integer[] result = (Integer []) divisors.toArray(new Integer[divisors.size()]);
        return result;
    }
}
