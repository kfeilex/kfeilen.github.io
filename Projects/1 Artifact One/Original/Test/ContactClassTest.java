package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import School.ContactClass;

class ContactClassTest {

//Testing that the program pulls correct data
	@Test
	void testContactClass() {
		ContactClass contactClass = new ContactClass("123", "Kenny", "Feilex", "4255553121", "1234 Story Lane, Astoria, OR");
		assertTrue(contactClass.getContactID().equals("123"));
		assertTrue(contactClass.getfirstName().equals("Kenny"));
		assertTrue(contactClass.getlastName().equals("Feilex"));
		assertTrue(contactClass.getphoneNumber().equals("4255553121"));
		assertTrue(contactClass.getaddress().equals("1234 Story Lane, Astoria, OR"));
	}
	
//Testing each variable for being too long
	@Test
	void testContactClassIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("12345678901", "Kenny", "Feilex", "4255553121", "1234 Story Lane, Astoria, OR");
		});     }
	
	@Test
	void testContactClassFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny    Fe", "Feilex", "4255553121", "1234 Story Lane, Astoria, OR");
		});     }
	
	@Test
	void testContactClassLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", "Feilex    K", "4255553121", "1234 Story Lane, Astoria, OR");
		});     }

	@Test
	void testContactClassPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", "Feilex", "14255553121", "1234 Story Lane, Astoria, OR");
		});     }
	//Testing phone number for being too short
	@Test
	void testContactClassPhoneNumberToShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", "Feilex", "5553121", "1234 Story Lane, Astoria, OR");
		});     }

	@Test
	void testContactClassAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", "Feilex", "4255553121", "1234 Story Lane, Astoria, Oregon");
		});     }

//Testing each variable for being null
	
	@Test
	void testContactClassIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass(null, "Kenny", "Feilex", "4255553121", "1234 Story Lane, Astoria, OR");
		});     }
	
	@Test
	void testContactClassFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", null, "Feilex", "4255553121", "1234 Story Lane, Astoria, OR");
		});     }
	
	@Test
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", null, "4255553121", "1234 Story Lane, Astoria, OR");
		});     }

	@Test
	void testContactClassPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", "Feilex", null, "1234 Story Lane, Astoria, OR");
		});     }

	@Test
	void testContactClassAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123", "Kenny", "Feilex", "4255553121", null);
		});     }

}
