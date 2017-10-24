package by.epam.jb.homework31;

import java.util.Scanner;

public abstract class Task1 {

	public static int readFromConsole(Scanner sc){
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
	
	private static int calcSumOfK(int n, int k, int[] array) {
		int sumOfK = 0;
		for (int i = 0; i < n; i++){
			if (array[i] % k == 0) {
				sumOfK += array[i];
			}
		}
		return sumOfK;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input massive size");
		int n = readFromConsole(sc);
		System.out.println("Input multiplicity");
		int k = readFromConsole(sc);
		
		int[] array = initArray(sc, n);
		int sumOfK = calcSumOfK(n, k, array);
	
		System.out.println("Sum of K " + sumOfK);
	}

}
