package in_progress.refactoring_needed.P2669;

import java.util.Scanner;

public class SumArea_2669 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		final int BOX_NUMBER = 4;
		Box[] boxes = new Box[BOX_NUMBER];
		for (int i = 0; i < BOX_NUMBER; i++) {
			boxes[i] = new Box(scanner.nextLine());
			boxes[i].fillCell();
		}
		Box.getArea();
		Box.printAreaValue();
		scanner.close();
	}
}

class Box {
	private static int maxWidth;
	private static int maxHeght;
	private static int[][] cell = new int[maxWidth][maxHeght];
	private static int sum = 0;
	private static int objectCount = 0; // TODO 최대 범위를 제한하고 그 안에서 넓이 겹치지 않게 구해보기
	private int x1, y1, x2, y2;
	private int width;
	private int height;

	public Box(String str) {
		String[] array = str.split(" ");
		this.x1 = Integer.parseInt(array[0]);
		this.y1 = Integer.parseInt(array[1]);
		this.x2 = Integer.parseInt(array[2]);
		this.y2 = Integer.parseInt(array[3]);
		this.width = x2 - x1;
		this.height = y2 - y1;
		objectCount++;
	}

	public void fillCell() {
		for (int i = 0; i < width; i++) {
			for (int j = ; j < cell.length; j++) {
				
			}
		}
		for (int i = 1; i < MAX_X; i++) {
			for (int j = 1; j < MAX_Y; j++) {
				if ((i >= this.x1 && i < this.x2) && (j >= this.y1 && j < this.y2)) {
					cell[i][j] = 1;
				}
			}
		}
	}

	public static void getArea() {
		for (int i = 0; i < MAX_X; i++) {
			for (int j = 0; j < MAX_Y; j++) {
				if (cell[i][j] == 1) {
					sum += cell[i][j];
				}
			}
		}
	}

	public static void printAreaValue() {
		System.out.println(sum);
	}

	private static setBoundary() {
		for (int i = 0; i < cell.length; i++) {
			
		}
		maxHeght;
	}
}