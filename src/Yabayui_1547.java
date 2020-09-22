package src;

import java.util.Scanner;

public class Yabayui_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] whereBall = {0, 1, 0, 0};
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            whereBall = swap(whereBall, x, y);
        }
        System.out.println(find(whereBall));
    }

    private static int find(int[] whereBall) {
        for (int i = 0; i < whereBall.length; i++) if (whereBall[i] == 1) return i;
        return -1;
    }

    private static int[] swap(int[] whereBall, int x, int y) {
        int tmp = whereBall[x];
        whereBall[x] = whereBall[y];
        whereBall[y] = tmp;
        return whereBall;
    }
}
