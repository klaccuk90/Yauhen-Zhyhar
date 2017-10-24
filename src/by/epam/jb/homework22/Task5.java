package by.epam.jb.homework22;

import java.util.Scanner;

public class Task5 {
	public static String readFromComsole(Scanner sc) {
		System.out.println("Input string");
		return sc.next();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = readFromComsole(sc);
		String str2 = readFromComsole(sc);
		boolean equalsResult = str1.equals(str2);
		boolean operatorResult = str1 == str2;
		System.out.println("Equals result " + equalsResult);
		System.out.println("Operator result " + operatorResult);
	}

}
