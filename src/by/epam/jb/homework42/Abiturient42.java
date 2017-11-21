package by.epam.jb.homework42;

public class Abiturient42 {

	public static void main(String[] args) {
		Abiturient abiturient1 = new Abiturient(5, "Ivanov");
		Abiturient abiturient2 = new Abiturient(3, "Petrov");
		Abiturient abiturient3 = new Abiturient(4, "Sidorov");
		Abiturient abiturient4 = new Abiturient(5, "Kozlov");
		Abiturient abiturient5 = new Abiturient(2, "Smirnow");

		Abiturient[] listOfAbiturients = new Abiturient[] { abiturient1, abiturient2, abiturient3, abiturient4,
				abiturient5 };
		/*
		 * Abiturient[] list = new Abiturient[5]; list[0] = abiturient1; list[1]
		 * = abiturient2; list[2] = abiturient3; list[3] = abiturient4; list[4]
		 * = abiturient5;
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (listOfAbiturients[i].getPoint() < listOfAbiturients[j].getPoint()) {
					Abiturient temp = listOfAbiturients[j];
					listOfAbiturients[j] = listOfAbiturients[i];
					listOfAbiturients[i] = temp;
				}
			}
		}
		int successAbiturient = 3;

		for (int i = 0; i < successAbiturient; i++) {
			Abiturient tempNew = listOfAbiturients[i];
			System.out.println("Student:" + tempNew.getName() + " " + tempNew.getPoint());
		}
	}

}

class Abiturient {
	private int point;
	private String name;

	public Abiturient(int pointConstr, String nameConstr) {
		point = pointConstr;
		name = nameConstr;
	}

	public int getPoint() {
		return point;
	}

	public String getName() {
		return name;
	}
}
