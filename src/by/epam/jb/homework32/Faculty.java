package by.epam.jb.homework32;

public class Faculty {

	public static void main(String[] args) {

			int [] student1Points = new int[] {5,5,5,5,5,5,5,5};
			Student student1 = new Student(student1Points);

			int [] student2Points = new int[] {5,4,3,2};
			Student student2 = new Student(student2Points);

			Student[]students = new Student[] {student1, student2};

			Group group = new Group(students);
			int studentsAmount = group.getGroupSize();
				
			double groupAvaragePoint = group.calculateGroupAverage();
			System.out.println("Group average point: " + groupAvaragePoint);

			for (int i = 0; i < studentsAmount; i++) {
				System.out.println("Student " + (i+1) + " Avarage point: " + students [i].avaragePoints());
			}
			
			int achiverAmount = 0;
			for (int i = 0; i < studentsAmount; i++){
				if (students [i].isAchiver()){
					achiverAmount ++;
				}
			}
			System.out.println("Achivers amount: " + achiverAmount);
			
			int twoPointStudents = 0;
			for (int i = 0; i < studentsAmount; i++){
				if (students [i].hasTwoPoints()){
					twoPointStudents++;
				}
			}
			System.out.println("Two Point Students: " + twoPointStudents);
	}

}
