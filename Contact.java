package ContactService;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	//Conditional checks
	public Contact(String contactID, String firstName, String lastName, String number, String address) {
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		//Set the variables for the object
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	
	//Settler and getters
	public String getContactID() {
		return contactID;
	}
	
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
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void updateAddress(String address) {
	}
	
	public void updateNumber(String number) {
	}
	
	public void updateLastName(String lastName) {
	}
	
	public void updateFirstName(String fisrtName) {
	}
}