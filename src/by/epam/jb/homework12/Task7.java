package by.epam.jb.homework12;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

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
		if (a > 0) {
			a = (a * a * a);
		}
		if (a < 0) {
			a = (a * a * a * a);
		}
		if (b > 0) {
			b = (b * b * b);
		}
		if (b < 0) {
			b = (b * b * b * b);
		}
		if (c > 0) {
			c = (c * c * c);
		}
		if (c < 0) {
			c = (c * c * c * c);
		}
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);

	}

}
