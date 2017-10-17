package by.epam.jb.homework12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		int n = 0;
		int even = 0;
		int fold = 0;
		int module = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Imput n: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int temp = 0;
			System.out.print("Imput a number: ");
			if (sc.hasNextInt()) {
				temp = sc.nextInt();
			}
			if (temp % 2 == 0) {
				even++;
			}
			if (temp % 3 == 0) {
				fold++;
			}
			if (Math.abs(temp) < 3) {
				module++;
			}
		}
		System.out.println("Even = " + even);
		System.out.println("Fold = " + fold);
		System.out.println("Module = " + module);
	}
}
