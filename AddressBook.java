package day9_addressBook;

import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AddressBook obj = new AddressBook();
		obj.addContact();
	}
	
	public void addContact() {
		System.out.println("\nCreating a new contact!");
		System.out.print("Enter First Name :	");
		String firstname = sc.next();
		System.out.print("Enter Last Name :	");
		String lastname = sc.next();
		System.out.print("Enter City :	");
		String city = sc.next();
		System.out.print("Enter State :	");
		String state = sc.next();
		System.out.print("Enter zip :	");
		String zip = sc.next();
		System.out.print("Enter Phone Number :	");
		String number = sc.next();
		System.out.print("Enter Email Address :	");
		String email = sc.next();
		
		Contacts newcontact = new Contacts();
		Address address = new Address();
		newcontact.setFirstName(firstname);
		newcontact.setLastName(lastname);
		newcontact.setPhoneNumber(number);
		newcontact.setEmailID(email);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		newcontact.setAddress(address);
		displayContact(newcontact);
		editContact(newcontact);
	}
	
	public void displayContact(Contacts contact) {
		System.out.println(contact);
	}
	
	public void editContact(Contacts contact) {
		int choice = 0;
		while (choice < 1 || choice > 4) {
			System.out.println("\nWhat would you like to update?");
			System.out.println("1. Name");
			System.out.println("2. Phone Number");
			System.out.println("3. Email Id");
			System.out.println("4. Address");
			System.out.print("\nEnter your choice : ");
			choice = sc.nextInt();
			
			if (!(choice >=1 && choice <= 4))
				System.out.println("\nInvalid choice!\nPlease try again.\n");
		}
		
		switch (choice) {
		case 1 :
			System.out.print("Enter the updated First Name :	");
			String firstname = sc.next();
			System.out.print("Enter the updated Last Name :	");
			String lastname = sc.next();
			contact.setFirstName(firstname);
			contact.setLastName(lastname);
			break;
			
		case 2 :
			System.out.print("Enter the updated Phone Number :	");
			String number = sc.next();
			contact.setPhoneNumber(number);
			break;
			
		case 3 :
			System.out.print("Enter the updated Email Address :	");
			String email = sc.next();
			contact.setEmailID(email);
			break;
			
		case 4 :
			System.out.print("Enter the updated City :	");
			String city = sc.next();
			System.out.print("Enter the updated State :	");
			String state = sc.next();
			System.out.print("Enter the updated zip :	");
			String zip = sc.next();
			contact.address.setCity(city);
			contact.address.setState(state);
			contact.address.setZip(zip);
			break;
		}
		
		System.out.println("\nIs there anything else you'd like to update?");
		System.out.print("Enter 'Y' or 'N' : ");
		char continueEdit = sc.next().charAt(0);
		if (continueEdit == 'Y' || continueEdit == 'y') {
			editContact(contact);

		}
		else if (continueEdit == 'N' || continueEdit == 'n') {
			System.out.println("\n\nHere is the updated Address Book.");
			displayContact(contact);
		}
		else {
			System.out.println("\nInvalid Input.\nPlease try again!");
		}
	}

}
class Contacts {
	
	String firstName;
	String lastName;
	Address address;
	String phoneNumber;
	String emailID;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}	

	@Override
	public String toString() {
		return "\nContact Info : \nFirst Name : " + firstName + "\nLast Name : " + lastName + "\nAddress :\n" + address + "\nPhone Number : "
				+ phoneNumber + "\nEmail ID : " + emailID;
	}
}
class Address {
	
	String city;
	String state;
	String zip;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "City : " + city + "\tState : " + state + "\tZip : " + zip;
	}

}


		