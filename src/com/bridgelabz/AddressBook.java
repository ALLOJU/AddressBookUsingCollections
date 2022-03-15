package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
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
	Scanner s=new Scanner(System.in);

	public void addPerson() {
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
	public void editPerson() {
		System.out.println("Enter your First name:");
		String fname = s.next();
		Iterator<Persons> iterator = persons.listIterator();
		while (iterator.hasNext()) {
			Persons person = iterator.next();
			if (fname.equals(person.getFirst_name())) {

				System.out.println("Enter Last Name");
				String last_name=s.next();
				//p.setFirst_name(first_name);
				//p.setLast_name(last_name);


				System.out.println("Enter Address");
				String address=s.next();
				//p.setAddress(address);

				System.out.println("Enter City");
				String city=s.next();
				//p.setCity(city);

				System.out.println("Enter State");
				String state=s.next();
				//p.setState(state);

				System.out.println("Enter Zip code");
				String zip=s.next();
				//p.setZip(zip);

				System.out.println("Enter Phone Number");
				long phone_number=s.nextLong();
				//p.setPhone_number(phone_number);

				System.out.println("Enter email");
				String email=s.next();


				person.setLast_name(last_name);
				person.setAddress(address);
				person.setCity(city);
				person.setState(state);
				person.setZip(zip);
				person.setPhone_number(phone_number);
				person.setEmail(email);
			}
		}
	}
	//Method to delete values from arraylist
	private void deletePerson(String fname) {

		for(int i=0;i<persons.size();i++) {
			Persons p=(Persons)persons.get(i);
			System.out.println("person details are");
			if(fname.equals(p.getFirst_name()))
			{
				persons.remove(i);
				System.out.println("Record deleted successfully");
			}
		}


	}


	public static void main(String[] args) {
		AddressBook ab=new AddressBook();
		int num;
		do {
			
		
		
		System.out.println("Please Enter 1 to add person details");
		System.out.println("Please Enter 2 to edit person details");
		System.out.println("Please Enter 3 to delete person details");
		System.out.println("Choose option to perform action");
		Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		
			switch(num) {
			case 1:
			
				ab.addPerson();
				
				ab.display();
		
				break;
				
			case 2:
				
				ab.editPerson();
				ab.display();
				break;
			case 3:
				System.out.println("Enter Name to Delete ");
				String fname=sc.next();
				ab.deletePerson(fname);
				ab.display();
				break;
				
			}
			

	}while(num!=0);
	}


}

