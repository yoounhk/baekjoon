package src;

import java.util.Scanner;

public class Temperature_14470 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int currentTemperature = scanner.nextInt();
		int targetTemperature = scanner.nextInt();
		int warmFrostMeatPerSecond = scanner.nextInt();
		int defrostSecond = scanner.nextInt();
		int heatPerSecond = scanner.nextInt();
		int second = 0;
		if (currentTemperature < 0) {
			second = Math.abs(currentTemperature * warmFrostMeatPerSecond) + defrostSecond
					+ targetTemperature * heatPerSecond;
		} else if (currentTemperature > 0) {
			second = heatPerSecond * (targetTemperature - currentTemperature);
		}
		System.out.println(second);
		scanner.close();
	}
}
