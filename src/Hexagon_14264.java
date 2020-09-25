package src;

// TODO 그래프로 구현해보기 (세변의 길이 알떄 넓이 구하기로)
import java.util.Scanner;

public class Hexagon_14264 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		double x = scanner.nextDouble();
		double pi = Math.PI;
		double a, b, c, d;
		a = x * x * Math.sin(pi / 6) * Math.cos(pi / 6);
		b = x * x * Math.cos(pi / 6);
		c = x * x / 2 * Math.sin(pi / 6);
		d = x * x / 2 * Math.tan(pi / 3);
		double[] s = new double[4];
		s[1] = Math.min(a, b);
		s[2] = Math.min(c, d);
		s[3] = Math.min(Math.min(a, b), Math.min(c, d));
		System.out.println(Math.max(Math.max(s[1], s[2]), Math.max(s[2], s[3])));
		scanner.close();
	}
}
