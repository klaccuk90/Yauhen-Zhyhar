package by.epam.jb.homework12;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		double Fx;
		double x = 0;
		double a = 0;
		double b = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Imput x: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}

		a = (Math.tan(x / 2));
		Fx = (2 * a + 1);

		System.out.println("X " + x);
		System.out.println("Fx " + Fx);

	}

}
