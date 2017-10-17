package by.epam.jb.homework12;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		double R = 0;
		double circle = 0;
		double PI = 3.14;
		double S = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Imput R: ");
		if (sc.hasNextInt()) {
			R = sc.nextInt();
		}

		circle = (2 * R * PI);
		S = (R * R * PI);

		System.out.println("Ñircumference = " + circle);
		System.out.println("Area of a circle = " + S);
	}

}
