// https://github.com/yoounhk/baekjoon 
package src;

import java.util.Scanner;

public class VonFly_14924 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int trainVelocity = scanner.nextInt();
		int flyVelocity = scanner.nextInt();
		int distance = scanner.nextInt();
		int meetingHour = distance / (trainVelocity * 2);
		int flyMove = flyVelocity * meetingHour;
		System.out.println(flyMove);
		scanner.close();
	}
}
