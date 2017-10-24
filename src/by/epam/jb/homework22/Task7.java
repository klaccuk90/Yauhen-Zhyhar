package by.epam.jb.homework22;

import java.util.Scanner;

public class Task7 {

	public static void findMax(double[] array) {
		if (array.length == 0) {
			System.out.println("Massive is empty");
			return;
		}
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Max " + max);
	}

	public static void findMinAndIndex(double[] array) {
		if (array.length == 0) {
			System.out.println("Massive is empty");
			return;
		}
		double min = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("Min " + min);
		System.out.println("Index " + index);
	}

	public static void sortArray(double[] array) {
		int minValueIndex = 0;
		for (int i = 0; i < array.length; i++) {
			minValueIndex = i;
			for (int j = i + 1; j < array.length; i++) {
				if (array[j] < array[minValueIndex]) {
					minValueIndex = j;
				}
			}
			double temp = array[i];
			array[i] = array[minValueIndex];
			array[minValueIndex] = temp;
		}
	}

	public static void main(String[] args) {
		double[] array = new double[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "]=>");
			array[i] = sc.nextDouble();
		}
		findMax(array);
		findMinAndIndex(array);
		sortArray(array);		
	}
// to do: print sorted massive
}
