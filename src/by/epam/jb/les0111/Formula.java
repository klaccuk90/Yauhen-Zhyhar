package by.epam.jb.les0111;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double q; //квадрат
		double w; //перва€ скобка
		double e; //втора€ скобка
		double r; //итоговое значение
		
		Scanner sc = new Scanner(System.in);

		System.out.print("¬ведите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("¬ведите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.print("¬ведите c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		
		q = a * a;
		w = (b - c) * (b-c);
		e = Math.log(b * b + 1);
		r = q - w + e;
		System.out.println("r = " + r);		
	}

}
