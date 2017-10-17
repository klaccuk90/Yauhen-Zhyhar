package by.epam.jb.homework12;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		double x = 0;
		double z = 0;
		double s = 0;

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

		z = (Math.sqrt(b * b + 4 * a * c));
		s = ((b + z) / (2 * a));
		x = (s - (a * a * a * c + b));

		System.out.println("X = :" + x);

	}

}
