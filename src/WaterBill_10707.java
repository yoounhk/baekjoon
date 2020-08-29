package src;

import java.util.Scanner;

public class WaterBill_10707 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int aCostPerLiter = scanner.nextInt();
		int bBaseCost = scanner.nextInt();
		int bBaseCapacity = scanner.nextInt();
		int bExtraCostPerLiter = scanner.nextInt();
		int literUsed = scanner.nextInt();
		int aTotalFee = aCostPerLiter * literUsed;
		int bTotalFee = bBaseCost;
		if (literUsed > bBaseCapacity) {
			bTotalFee += (literUsed - bBaseCapacity) * bExtraCostPerLiter;
		}
		int cheap = Integer.min(aTotalFee, bTotalFee);
		System.out.println(cheap);
		scanner.close();
	}
}