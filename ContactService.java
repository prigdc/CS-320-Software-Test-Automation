package ContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	//list of the contacts
	private ArrayList<Contact> contacts;
	
	//Default constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	//Assign a unique ID
	private String ContactID;
	private List<Contact> contactList = new ArrayList<>(); {
		ContactID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	
	//Add a contact
	public boolean add(Contact contact) {
		//check if the contact already exists
		boolean exist = false;
		for(Contact contactList:contacts) {
			if (contactList.equals(contact)) {
				exist = true;
			}
		}
		if (!exist) {
			contacts.add(contact);
			System.out.println("Contact added successfully");
			return true;
		} else {
			System.out.println("Contact already exists");
			return false;
		}
	}
	
	//Delete a contact
	public boolean delete(String contactID) {
		for (Contact contactList: contacts) {
			if (contactList.getContactID().equals(contactID)) {
				contacts.remove(contactList);
				System.out.println("Contact deleted");
				return true;
			}
		}
		System.out.println("Contact does not exist");
		return false;
	}
	
	//update contact
	public boolean update(String contactID, String firstName, String lastName, String number, String address) {
		for (Contact contactList:contacts) {
			if (contactList.getContactID().equals(contactID)) {
				if (!firstName.equals(""))
					contactList.setFirstName(firstName);
				if (!lastName.equals(""))
					contactList.setLastName(lastName);
				if (!number.equals(""))
					contactList.setAddress(number);
				if (!address.equals(""))
					contactList.setAddress(address);
				System.out.println("Contact updated successfully");
				return true;
			}
		}
		System.out.println("Contact not existent");
		return false;
	}
}