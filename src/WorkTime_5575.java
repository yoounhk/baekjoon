package src;

import java.util.Scanner;

public class WorkTime_5575 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Worker[] workers = new Worker[3];
		for (int i = 0; i < 3; i++) {
			String input = scanner.nextLine();
			String[] array = input.split(" ");
			String[] inTime = { array[0], array[1], array[2] };
			String[] outTime = { array[3], array[4], array[5] };
			workers[i] = Worker.newType(inTime, outTime);
			workers[i].print();
		}
		scanner.close();
	}

}

class Worker {
	private int inTime;
	private int outTime;
	private int workingTime;

	private Worker() {
		return;
	}

	public static Worker newType(String[] inTime, String[] outTime) {
		Worker worker = new Worker();
		worker.inTime = toTime(inTime);
		worker.outTime = toTime(outTime);
		worker.workingTime = worker.outTime - worker.inTime;
		return worker;
	}

	private static int toTime(String[] hhmmss) {
		int hour = Integer.parseInt(hhmmss[0]);
		int minute = Integer.parseInt(hhmmss[1]);
		int second = Integer.parseInt(hhmmss[2]);
		return hour * 60 * 60 + minute * 60 + second;
	}

	private int[] getHMS(int time) {
		int hour = time / (60 * 60);
		int minute = time / 60 - hour * 60;
		int second = time % 60;
		return new int[] { hour, minute, second };
	}

	public void print() {
		int[] array = getHMS(this.workingTime);
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
}
