package by.epam.jb.les0111;

import java.util.Scanner;

public class summ {

	public static void main(String[] args) {
			int x;
			int y;
			int c;
			int z;
			int sum;
			
			Scanner conin = new Scanner(System.in);
			
			System.out.println("������� x: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			x = conin.nextInt();
			
			System.out.println("������� y: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			y = conin.nextInt();
			
			System.out.println("������� c: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			c = conin.nextInt();
			
			System.out.println("������� z: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			z = conin.nextInt();
					
					
			sum = x + y + c + z;
			System.out.println("sum = " + sum);
	}

}
