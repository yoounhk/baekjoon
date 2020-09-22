package src;

import java.util.Scanner;

public class Binary_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        String[] outputs = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            String binary = Integer.toBinaryString(sc.nextInt());
            int[] digit = new int[binary.length()];
            outputs[i] = "";
            for (int j = 0; j < binary.length(); j++) {
                int x = binary.length() - 1 - j;
                digit[x] = binary.charAt(j) == '1' ? 1 : 0;
                if (digit[x] == 1) outputs[i] += x+" ";
            }
            String[] output = outputs[i].trim().split(" ");
            for (int j = output.length - 1; j >= 0; j--) {
                System.out.print(output[j]+" ");
            }
            System.out.println();
        }
    }
}
