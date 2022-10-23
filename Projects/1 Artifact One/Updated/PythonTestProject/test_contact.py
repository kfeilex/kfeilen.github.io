import unittest
from ContactClass import Contact


# A test class to call functions from the Contact class
# Then check to make sure the exceptions are thrown
class MyTestCase(unittest.TestCase):

    # Testing the unique ID length with an ID that's too long
    def test_unique_id_too_long(self):
        self.assertRaises(ValueError, Contact.get_unique_id, Contact(12345678912))

    # Testing the unique ID length with an ID that is empty
    def test_unique_id_null(self):
        self.assertRaises(ValueError, Contact.get_unique_id, Contact(''))

    # Testing the first name length with a name that's too long
    def test_first_name_too_long(self):
        self.assertRaises(ValueError, Contact.get_contact_first_name, Contact(
            1, 'Bob..........'))

    # Testing the first name length with an empty string
    def test_first_name_empty(self):
        self.assertRaises(ValueError, Contact.get_contact_first_name, Contact(
            1, ''))

    # Testing the last name length with a name that's too long
    def test_last_name_too_long(self):
        self.assertRaises(ValueError, Contact.get_contact_last_name, Contact(
            1, 'Bob', 'Smith............'))

    # Testing the last name length with an empty string
    def test_last_name_empty(self):
        self.assertRaises(ValueError, Contact.get_contact_last_name, Contact(
            1, 'Bob', ''))

    # Testing the phone number with a number that's too long
    def test_phone_number_too_long(self):
        self.assertRaises(ValueError, Contact.get_contact_phone_number, Contact(
            1, 'Bob', 'Smith', '555-123-4466'))

    # Testing the phone number length with an empty string
    def test_phone_number_empty(self):
        self.assertRaises(ValueError, Contact.get_contact_phone_number, Contact(
            1, 'Bob', 'Smith', ''))

    def test_address_too_long(self):
        self.assertRaises(ValueError, Contact.get_contact_address, Contact(
            1, 'Bob', 'Smith', '5551234466', '4545 Story Road New York, New York'))

    def test_address_empty(self):
        self.assertRaises(ValueError, Contact.get_contact_address, Contact(
            1, 'Bob', 'Smith', '5551234466', ''))


if __name__ == '__main__':
    unittest.main()
