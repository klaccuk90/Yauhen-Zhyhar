package by.epam.jb.homework31;

import java.util.Scanner;

public class Task3 {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input massive size");
		int n = readFromConsole(sc);
		int[] array = initArray(sc, n);

		checkArray(n, array);
	}

	private static void checkArray(int n, int[] array) {
		boolean temp = true;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] >= array[i + 1]) {
				temp = false;
				System.out.println("Array is not ascending ");
				break;
			}
		}
		if (temp) {
			System.out.println("Array is ascending ");
		}
	}
}