package by.epam.jb.homework32;

public class Group {

	private Student[] students;
	private int groupSize;

	public Student[] getStudents() {
	return students;
	}

	public int getGroupSize() {
	return groupSize;
	}

	public Group(Student[] students) {
		this.students = students;
		this.groupSize = students.length;
	}

	public double calculateGroupAverage() {
		double sum = 0;
		for (int i = 0; i < groupSize; i++) {
			sum += students[i].avaragePoints();
		}
		return sum / groupSize;
	}
}
