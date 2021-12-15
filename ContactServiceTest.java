package ContactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ContactService.Contact;
import ContactService.ContactService;

class ContactServiceTest {

	//Test the add method
	@Test
	public void addTest() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("123456789", "John", "Smith", "1234567890", "123 Silly St.");
		Contact c2 = new Contact("123456799", "Francisca", "Lopez", "1234567890", "123 Dolly Rd.");
		
		assertEquals(true, cs.add(c1));
		assertEquals(true, cs.add(c2));
	}
	
	//Test the delete method
	@Test
	public void deleteTest() {
		ContactService cs = new ContactService(); 
		Contact c1 = new Contact("123456789", "John", "Smith", "1234567890", "123 Silly St.");
		cs.add(c1);
		Contact c2 = new Contact("123456799", "Jane", "Smith", "1234567890", "123 Silly St.");
		cs.add(c2);
		Contact c3 = new Contact("123456999", "Susa", "Patel", "1234567890", "456 Silly St.");
		cs.add(c3);
		
		assertEquals(true, cs.delete("123456789"));
		assertEquals(false, cs.delete("112345678"));
		assertEquals(false, cs.delete("112233445"));
	}
	
	//Test the update method
	@Test
	public void updateTest() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("123456789", "John", "Smith", "1234567890", "123 Silly St.");
		cs.add(c1);
		Contact c2 = new Contact("123456799", "Jane", "Smith", "1234567890", "123 Silly St.");
		cs.add(c2);
		Contact c3 = new Contact("123456999", "Susan", "Patel", "1234567890", "456 Silly St.");
		cs.add(c3);
		
		assertEquals(true, cs.update("123456789", "Jose", "", "", ""));
		assertEquals(false, cs.update("11123456", "Maria", "", "", "44 Circle Rd."));
		assertEquals(true, cs.update("123456799", "", "Mendonza", "0987654321", ""));
		assertEquals(true, cs.update("123456999", "", "", "", "90 Swamp way, apt 54"));
	}

}
