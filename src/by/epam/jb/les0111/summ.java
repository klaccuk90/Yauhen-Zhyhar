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
			
			System.out.println("¬ведите x: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			x = conin.nextInt();
			
			System.out.println("¬ведите y: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			y = conin.nextInt();
			
			System.out.println("¬ведите c: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			c = conin.nextInt();
			
			System.out.println("¬ведите z: ");
			while(!conin.hasNextInt())		{
				conin.next();
			}
			z = conin.nextInt();
					
					
			sum = x + y + c + z;
			System.out.println("sum = " + sum);
	}

}
