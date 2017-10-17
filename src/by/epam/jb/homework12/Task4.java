package by.epam.jb.homework12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int n = 0;
		int more15 = 0;
		int less2 = 0;
		int dev54 = 0;
		int summ = 0;

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
			if (temp % 5 == 4) {
				summ = (summ + temp);
			}
			if (temp > 15) {
				more15++;
			}
			if (temp < 2) {
				less2++;
			}
		}
		System.out.println("More15 = " + more15);
		System.out.println("Less2 = " + less2);
		System.out.println("Summ = " + summ);
	}
}
