package by.epam.jb.homework12;

import java.util.Scanner;

public class tusk1 {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double q;
		double w;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("Введите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.print(" ");
			if (a == b) {
				System.out.println("скоро Новый Год!");
				
			} else
				System.out.print("Введите c: ");
				if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				}
				q = a + b + c;
				w = (a * a)+(b * b);
				System.out.println("q = " + q);
				System.out.println("w = " + w);
				System.out.println("Каталония");
				
			 {
				
			 }

	}
}
