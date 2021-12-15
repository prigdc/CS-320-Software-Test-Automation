package ContactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ContactService.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("123456789", "John", "Smith", "1234567890", "123 Silly St.");
		assertTrue(contact.getContactID().equals("123456789"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Silly St."));
	}
	
	//Test ID requirements
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789123", "John", "Smith", "1234567890", "123 Silly St.");
		});
	}
	
	@Test
	void testContactIDisNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "John", "Smith", "1234567890", "123 Silly St.");
		}); 
	}
	
	//Test firstName requirements
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", "John Smithson", "Smith", "1234567890", "123 Silly St.");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", null, "Smith", "1234567890", "123 Silly St.");
		}); 
	}
	
	//Test lastName requirements
	@Test 
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", "John", "Smithsooned12", "1234567890", "123 Silly St.");
		}); 
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", "John", null, "1234567890", "123 Silly St.");
		});
	}
	
	//Test phone number requirements
	@Test
	void testContactNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", "John", "Smith", null, "123 Silly St.");
		});
	}
	
	@Test
	void testContactNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", "John", "Smith", null, "123 Silly St.");
		});
	}
	
	//Test address requirements
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("123456789", "John", "Smith", "1234567890", "123 Silly St. 12345678901234567890");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "John", "Smith", "1234567890", null);
		});
	}

}
