package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Binary_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            String binary = Integer.toBinaryString(sc.nextInt());
            ArrayList<Integer> idxOfOne = new ArrayList<>();
            for (int j = 0; j < binary.length(); j++)
                if (binary.charAt(j) == '1')
                    idxOfOne.add(j);
            for (int j = 0; j < idxOfOne.size(); j++) {
                for (int k = 0; k < idxOfOne.size() - j; k++) {
                    // TODO: WIP 정렬 + 인덱스 매핑
                }
            }
            for (int j = 0; j < idxOfOne.size(); j++) {
                System.out.printf("%d ", idxOfOne.get(j));
            }
        }
    }
}
