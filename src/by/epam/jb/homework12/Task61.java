package by.epam.jb.homework12;

import java.util.Scanner;

public class Task61 {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double z = 0;
		double y = 0;
		double v = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Imput a: ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		System.out.println("Imput b: ");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
		System.out.println("Imput c: ");
		if (sc.hasNextInt()) {
			c = sc.nextInt();
		}
		System.out.println("Imput d: ");
		if (sc.hasNextInt()) {
			d = sc.nextInt();
		}
		z = ((a * b - c) / (c * d));
		y = ((a / c) * (b / d));
		v = (y - z);

		System.out.println("Result = " + v);
	}

}
