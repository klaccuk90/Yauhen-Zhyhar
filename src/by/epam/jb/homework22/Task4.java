package by.epam.jb.homework22;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of the month");
		String month = sc.next();
		int monthNumber = Integer.valueOf(month);
		if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
			System.out.println("Winter");
		} else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
			System.out.println("Spring");
		} else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
			System.out.println("Summer");
		} else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
			System.out.println("Autumn");
		} else {
			System.out.println("Invalid month");
		}

	}

}