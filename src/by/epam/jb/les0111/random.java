package by.epam.jb.les0111;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double q; //������ ��������
		double w; //������ ��������
		
		Scanner sc = new Scanner(System.in);

		System.out.print("������� a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("������� b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.print("> ");
			if (a > b) {
				System.out.print("������� c: ");
				if (sc.hasNextDouble()) {
					c = sc.nextDouble();
				}
				q = b + c;
				System.out.println("q = " + q);
				
			} else if (a == b) {
				
				System.out.println("�����");
				
			} else if (a < b) {	
				
				System.out.print("������� c: ");
				if (sc.hasNextDouble()) {
					c = sc.nextDouble();
				}
				
				w = a + b + c;
				
				System.out.println("����� ��� = " + w);
			}
	}

}
