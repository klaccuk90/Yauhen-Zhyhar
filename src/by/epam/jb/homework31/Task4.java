package by.epam.jb.homework31;

import java.util.Scanner;

public class Task4 {

	public static int readFromConsole(Scanner sc) {
		return sc.nextInt();
	}

	private static int[] initArray(Scanner sc, int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("array[" + i + "]=>");
			array[i] = readFromConsole(sc);
		}
		return array;
	}

	private static int findNewArrayDemention(int n, int[] array) {
		int arrayOfEvenNumsDemention = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				arrayOfEvenNumsDemention++;
			}
		}
		return arrayOfEvenNumsDemention;
	}

	private static int[] fillInNeArray(int n, int[] array, int arrayOfEvenNumsDemention) {
		int[] arrayOfEvenNums = new int[arrayOfEvenNumsDemention];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				arrayOfEvenNums[j] = array[i];
				j++;
			}
		}
		return arrayOfEvenNums;
	}

	private static void displayNewArray(int arrayOfEvenNumsDemention, int[] arrayOfEvenNums) {
		System.out.print("Even nums are: ");
		for (int i = 0; i < arrayOfEvenNumsDemention; i++) {
			System.out.print(arrayOfEvenNums[i] + ",");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input massive size");
		int n = readFromConsole(sc);
		int[] array = initArray(sc, n);

		int arrayOfEvenNumsDemention = findNewArrayDemention(n, array);

		if (arrayOfEvenNumsDemention == 0) {
			System.out.println("No even nums is presented");
		} else {
			int[] arrayOfEvenNums = fillInNeArray(n, array, arrayOfEvenNumsDemention);

			displayNewArray(arrayOfEvenNumsDemention, arrayOfEvenNums);
		}
	}
}
