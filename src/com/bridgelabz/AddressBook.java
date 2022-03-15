package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	/**
	 * PROCEDURE:
	 * 1.creating array list object
	 * 2.to add person details into array list
	 * 3. method to display array list content
	 */
	/**
	 * 1.creating array list object
	 */
	ArrayList<Persons> persons;
	public AddressBook() {
		persons=new ArrayList<Persons>();

	}
	/**
	 * 2.to add person details into array list
	 */
	public void addPerson() {
		Scanner s=new Scanner(System.in);
		Persons person = new Persons();
		System.out.println("Enter the First name:");
		String fname = s.next();
		person.setFirst_name(fname);

		System.out.println("Enter the Last name:");
		String lname = s.next();
		person.setLast_name(lname);


		System.out.println("Enter the Address:");
		String address = s.next();
		person.setAddress(address);

		System.out.println("Enter the City:");
		String city = s.next();
		person.setCity(city);
		
		System.out.println("Enter the State:");
		String state = s.next();
		person.setState(state);
		
		System.out.println("Enter the Zip:");
		String zip = s.next();
		person.setZip(zip);

		
		
		System.out.println("Enter the Phone :");
		Long phone = s.nextLong();
		person.setPhone_number(phone);
		
		System.out.println("Enter the Email :");
		String email = s.next();
		person.setEmail(email);
		persons.add(person);
	}
	/**
	 *3. method to display array list content
	 */
	public void display() {
		for (Persons person : persons)

			System.out.println("Person details " + person.getFirst_name() +"\t" +person.getLast_name()+"\t"+person.getAddress()+"\t" 
					+person.getCity()+"\t"+person.getState()+ "\t"+person.getZip()+"\t"+person.getPhone_number()+"\t"+person.getEmail());

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System ");
		AddressBook ab=new AddressBook();

		System.out.println("Choose option to perform action");
		System.out.println("Enter 1 to add person details");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		char choice;
		do {
			switch(num) {
			case 1:

				ab.addPerson();
				ab.display();
				break;


			}
			System.out.println("Do You Want To Continue(Y/N)");
			choice = sc.next().charAt(0);

		}
		while(choice == 'Y'|| choice == 'y');

		sc.close();

	}


}

