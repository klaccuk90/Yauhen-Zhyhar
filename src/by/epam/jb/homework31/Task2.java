package by.epam.jb.homework31;

import java.util.Scanner;

public class Task2 {
	
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input massive size");	
		int n = readFromConsole(sc);
		int[] array = initArray(sc, n);
		
		int arrayOfZeroElementsDemention = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == 0){
				arrayOfZeroElementsDemention++;
			}
		}
		
		int[] arrayOfZeroElements = new int [arrayOfZeroElementsDemention];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == 0){
				arrayOfZeroElements[j] = i;
				j++;
			}
		}
		
		System.out.print("Indexes of zero elements are: ");
		for (int i = 0; i < arrayOfZeroElementsDemention; i++) {
			System.out.print(arrayOfZeroElements[i] + ",");
		}
	}

}
