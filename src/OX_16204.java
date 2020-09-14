// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class OX_16204 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int K = scanner.nextInt();
		int result = Integer.min(M, K) + Integer.min(N - M, N - K);
		System.out.println(result);
		scanner.close();
	}
}
