package by.epam.jb.homework12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int n = 0;
		int even = 0;
		int more = 0;
		double temp = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Imput n: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Imput a real number: ");
			if (sc.hasNextDouble()) {
				temp = sc.nextDouble();
			}

			int temp1 = (int) temp;

			if (temp1 % 2 == 0) {
				even++;
			}

			if (temp1 < 15) {
				more++;
			}
		}
		System.out.println("Even = " + even);
		System.out.println("More = " + more);
	}
}
