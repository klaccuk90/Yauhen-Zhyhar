package by.epam.jb.homework22;

import java.util.Scanner;

public class Task2 {

	public static int getNumberOfDays(String month, int year) {
		switch (month) {
		    case "January":
		    case "March":
		    case "May":
		    case "July":
		    case "August":
		    case "October":
		    case "December":
		    	return 31;
		    case "April":
		    case "Jyne":
		    case "September":
		    case "November":
		    	return 30;
		    case "February":
		    	return getNumberOfFebruaryDays(year);
		    default:
		    	return 0;
		}
	}
	
	private static int getNumberOfFebruaryDays(int year) {
		if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
			return 29;
		} else {
			return 28;
		}
	}

	public static void main(String[] args) {
		String month;
		int numDays = 0;
		int year;

		Scanner sc = new Scanner(System.in);

		System.out.print("Input month: ");
		month = sc.next();

		System.out.print("Input year: ");
		year = sc.nextInt();

		numDays = getNumberOfDays(month, year);

		if (numDays == 0) {
			System.out.println("Unavailable mounth");
		} else {
			System.out.println("Number of days = " + numDays);
		}
	}

}
