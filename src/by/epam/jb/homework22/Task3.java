package by.epam.jb.homework22;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of the month");
		String month = sc.next();
		int monthNumber = Integer.valueOf(month);
		switch (monthNumber){
			case 1 :
			case 2 :
			case 12 :
				System.out.println("Winter");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("Spring");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("Summer");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("Autumn");
				break;
			default:
				System.out.println("Invalid month");
		}

	}

}
