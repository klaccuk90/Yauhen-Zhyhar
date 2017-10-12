package by.epam.jb.les0111;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double q; //первое значение
		double w; //второе значение
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("Введите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.print("> ");
			if (a > b) {
				System.out.print("Введите c: ");
				if (sc.hasNextDouble()) {
					c = sc.nextDouble();
				}
				q = b + c;
				System.out.println("q = " + q);
				
			} else if (a == b) {
				
				System.out.println("Конец");
				
			} else if (a < b) {	
				
				System.out.print("Введите c: ");
				if (sc.hasNextDouble()) {
					c = sc.nextDouble();
				}
				
				w = a + b + c;
				
				System.out.println("Новый год = " + w);
			}
	}

}
