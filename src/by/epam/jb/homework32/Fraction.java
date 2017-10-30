package by.epam.jb.homework32;

import java.util.Scanner;

public class Fraction {

	private int num;
	private int den;

	public Fraction(int num1, int den1) {
		num = num1;
		den = den1;
	}

	public double getFraction() {
		return (double) num / (double) den;
	}

	public String toString() {
		return num + "/" + den;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size:");
		int k = sc.nextInt();
		Fraction[] array = new Fraction[k];

		for (int i = 0; i < k; i++) {
			System.out.println("Input numerator:");
			int num = sc.nextInt();

			System.out.println("Input denominator:");
			int den = sc.nextInt();
			while (den <= 0) {
				if (den <= 0) {
					System.out.println("Input positive and not null number:");
					den = sc.nextInt();
				}
			}

			array[i] = new Fraction(num, den);
		}
		for (int i = 0; i < k; i++) {

			System.out.println("Fraction[" + i + "]=" + array[i].toString() + "=" + array[i].getFraction());
		}
	}
}
