package by.epam.jb.homework32;

public class Student {

	private int[] points;
	private int size;

	Student(int[] points) {
		this.points = points;
		this.size = points.length;
	}

	public double avaragePoints() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += points[i];
		}
		return sum / size;
	}

	public boolean isAchiver() {
		for (int i = 0; i < size; i++) {
			if (points[i] < 5) {
				return false;
			}
		}
		return true;
	}

	public boolean hasTwoPoints() {
		for (int i = 0; i < size; i++) {
			if (points[i] == 2) {
				return true;
			}
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}

}
