package by.epam.jb.homework41;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[3][3];
		System.out.println("Input a number");
		array[0][0] = sc.nextInt();
		System.out.println("Input a number");
		array[0][1] = sc.nextInt();
		System.out.println("Input a number");
		array[0][2] = sc.nextInt();
		System.out.println("Input a number");
		array[1][0] = sc.nextInt();
		System.out.println("Input a number");
		array[1][1] = sc.nextInt();
		System.out.println("Input a number");
		array[1][2] = sc.nextInt();
		System.out.println("Input a number");
		array[2][0] = sc.nextInt();
		System.out.println("Input a number");
		array[2][1] = sc.nextInt();
		System.out.println("Input a number");
		array[2][2] = sc.nextInt();

		System.out.println("Initial array: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("{ ");
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("}");
			System.out.println();
		}

		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 2; k++) {
				for (int i = 0; i < 2; i++) {
					if (array[i][j] > array[i + 1][j]) {
						int temp = array[i][j];
						array[i][j] = array[i + 1][j];
						array[i + 1][j] = temp;
					}
				}
			}
		}

		System.out.println("Sorted array: ");
		for (int i = 0; i < 3; i++) {
			System.out.print("{ ");
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("}");

			System.out.println();
		}
	}
}
