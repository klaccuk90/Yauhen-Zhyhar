package by.epam.jb.homework41;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[4][4];

		System.out.println("Input the first number");
		int firstNumber = sc.nextInt();
		array[0][0] = firstNumber;
		System.out.println("Input the second number");
		int secondNumber = sc.nextInt();
		array[0][1] = secondNumber;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == 0 && j == 0) || (i == 0 && j == 1)) {
					break;
				}
				if ((j - 1 > 0 && j - 2 > 0)) {
					array[i][j] = array[i][j - 1] + array[i][j - 2];
				}
				if ((j - 1) >= 0 && (j - 2) < 0) {
					array[i][j] = array[i][j - 1] + array[i - 1][array[i].length - 1];
				}
				if ((j - 1) < 0 && (j - 2) < 0) {
					array[i][j] = array[i - 1][array[i].length - 1] + array[i - 1][array[i].length - 2];
				}
			}
		}
	}

}
