package by.epam.jb.les0111;

public class triang {

	public static void main(String[] args) {
		double a, b; //��� ������
		double c = 0; //����������
		double p; //��������
		double s; //�������
		a = 10;
		b = 20;
		
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a * b;

		System.out.println("���������� = " + c + " ������� = " + s);

	}

}
