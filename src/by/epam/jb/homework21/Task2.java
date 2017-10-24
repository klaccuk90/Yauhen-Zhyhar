package by.epam.jb.homework21;

import java.util.Scanner;

public class Task2 {

	public static int calculateSum(int x, int y) {
		return x + y;
	}

	public static int calculateMul(int x, int y) {
		return x * y;
	}

	public static int readConsole(Scanner conin) {
		while (!conin.hasNextInt()) {
			conin.next();
		}
		return conin.nextInt();
	}

	public static void main(String[] args) {
		int x;
		int y;
		int sum, mul;

		Scanner conin = new Scanner(System.in);

		System.out.println("Input x: ");
		x = readConsole(conin);
		
		System.out.println("Input y: ");
		y = readConsole(conin);

		sum = calculateSum(x, y);
		mul = calculateMul(x, y);

		System.out.println("sum = " + sum + "; mul = " + mul);
	}
}
