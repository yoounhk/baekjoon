// https://github.com/yoounhk/baekjoon 
package src;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplyBinary_14623 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		long x = toLong(a);
		long y = toLong(b);
		String result = toBinary(x * y);
		System.out.println(result);
		scanner.close();
	}

	private static String toBinary(long n) {
		String result = "";
		long quotients = 0;
		ArrayList<Long> remainders = new ArrayList<>();
		while (n > 0) {
			remainders.add(n % 2);
			quotients = n / 2;
			n = n / 2;
		}
		remainders = reverse(remainders);
		if (quotients == 1) {
			result += String.valueOf(quotients);
		}
		for (int i = 0; i < remainders.size(); i++) {
			result += String.valueOf(remainders.get(i));
		}
		return result;
	}

	private static ArrayList<Long> reverse(ArrayList<Long> list) {
		ArrayList<Long> reversed = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			reversed.add(list.get(list.size() - 1 - i));
		}
		return reversed;
	}

	private static long toLong(String a) {
		long result = 0L;
		for (int i = 0; i < a.length(); i++) {
			result += (a.charAt(i) - '0') * square(2, a.length() - i - 1);
		}
		return result;
	}

	private static long square(long x, long n) {
		if (n == 0) {
			return 1L;
		} else {
			return square(x, n - 1) * x;
		}
	}
}
