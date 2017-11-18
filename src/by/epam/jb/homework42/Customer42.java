package by.epam.jb.homework42;

import java.util.Scanner;

public class Customer42 {

	public static void main(String[] args) {

		Customer customer = new Customer("Petrov", "Petr", "Petrovich", "Petrovskaya str", "5555 6666 77770",
				"123456789");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1 for customer's name; Input 2 for customers's bank info; "
				+ "Input 3 for customer's full info; Input 4 for update customer's credit number"
				+ "Input 5 for update customer's second name");
		int temp = sc.nextInt();
		switch (temp) {
		case 1:
			customer.showSecondName();
			customer.showFirstName();
			customer.showThirdName();
			break;
		case 2:
			customer.showCreditNumber();
			customer.showBankNumber();
			break;
		case 3:
			customer.showCustomerInfo();
			break;
		case 4:
			System.out.println("Set new credit number:");
			String creditNumber = sc.nextLine();
			customer.setCreditNumber(creditNumber);
			break;
		case 5:
			System.out.println("Set new second name:");
			String secondName = sc.nextLine();
			customer.setSecondName(secondName);
			break;
		default:
			System.out.println("Input correct number:");
		}

	}
}

class Customer {

	private String secondName;
	private String firstName;
	private String thirdName;
	private String address;
	private String creditNumber;
	private String bankNumber;

	public Customer(String _secondName, String _firstName, String _thirdName, String _address, String _creditNumber,
			String _bankNumber) {

		secondName = _secondName;
		firstName = _firstName;
		thirdName = _thirdName;
		address = _address;
		creditNumber = _creditNumber;
		bankNumber = _bankNumber;
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

	public String getAddress() {
		return address;
	}

	public String getCreditNumber() {
		return creditNumber;
	}

	public String getBankNumber() {
		return bankNumber;
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

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCreditNumber(String creditNumber) {
		this.creditNumber = creditNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
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

	public void showAddress() {
		System.out.println("Address: " + address);
	}

	public void showCreditNumber() {
		System.out.println("CreditNumber: " + creditNumber);
	}

	public void showBankNumber() {
		System.out.println("BankNumber: " + bankNumber);
	}

	public void showCustomerInfo() {
		showSecondName();
		showFirstName();
		showThirdName();
		showAddress();
		showCreditNumber();
		showBankNumber();
	}
}
