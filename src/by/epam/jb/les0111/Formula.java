package by.epam.jb.les0111;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double q; //�������
		double w; //������ ������
		double e; //������ ������
		double r; //�������� ��������
		
		Scanner sc = new Scanner(System.in);

		System.out.print("������� a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("������� b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.print("������� c: ");
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
