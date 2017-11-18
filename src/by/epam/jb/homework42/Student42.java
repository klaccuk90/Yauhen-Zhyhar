package by.epam.jb.homework42;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Student42 {

	public static void main(String[] args) {

		Student student = new Student("Ivanov", "Ivan", "Ivonovich", LocalDate.of(2000, Month.AUGUST, 10),
				"Ivanovkaya str", "+375293333333", "Economical", 3);

		Scanner sc = new Scanner(System.in);

		System.out.println("Input 1 for student's name; Input 2 for student's birthday, phone number and address; "
				+ "Input 3 for student's faculty and course; Input 4 for all student's info"
				+ "Input 5 for update student's phone number; Input 6 for updute student's adress; Input 0 to exit");
		int temp = sc.nextInt();
		switch (temp) {
		case 1:
			student.showSecondName();
			student.showFirstName();
			student.showThirdName();
			break;
		case 2:
			student.showAddress();
			student.showBrithday();
			student.showPhoneNumber();
			break;
		case 3:
			student.showCourse();
			student.showFaculty();
			break;
		case 4:
			student.showStudentInfo();
			break;
		case 5:
			System.out.println("enter new phone number");
			String phoneNumberNew = sc.nextLine();
			student.setAddress(phoneNumberNew);
			break;
		case 6:
			System.out.println("enter new address");
			String addressNew = sc.nextLine();
			student.setAddress(addressNew);
			break;
		default:
			System.out.println("Incorrect choise");

		}

	}
}

class Student {
	private String secondName;
	private String firstName;
	private String thirdName;
	private LocalDate brithday;
	private String address;
	private String phoneNumber;
	private String faculty;
	private int course;

	public Student(String _secondName, String _firstName, String _thirdName, LocalDate _brithday, String _address,
			String _phoneNumber, String _faculty, int _course) {
		secondName = _secondName;
		firstName = _firstName;
		thirdName = _thirdName;
		brithday = _brithday;
		address = _address;
		phoneNumber = _phoneNumber;
		faculty = _faculty;
		course = _course;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public LocalDate getBrithday() {
		return brithday;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFaculty() {
		return faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public void setBrithday(LocalDate brithday) {
		this.brithday = brithday;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void showSecondName() {
		System.out.println("SecondName: " + secondName);
	}

	public void showFirstName() {
		System.out.println("FirstName: " + firstName);
	}

	public void showThirdName() {
		System.out.println("ThirdName: " + thirdName);
	}

	public void showBrithday() {
		System.out.println("Brithday: " + brithday);
	}

	public void showAddress() {
		System.out.println("Address: " + address);
	}

	public void showPhoneNumber() {
		System.out.println("PhoneNumber: " + phoneNumber);
	}

	public void showFaculty() {
		System.out.println("Faculty: " + faculty);
	}

	public void showCourse() {
		System.out.println("Course: " + course);
	}

	public void showStudentInfo() {
		showSecondName();
		showFirstName();
		showThirdName();
		showBrithday();
		showAddress();
		showPhoneNumber();
		showFaculty();
		showCourse();
	}
}
