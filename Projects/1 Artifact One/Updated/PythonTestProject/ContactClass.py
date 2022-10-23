# Kenny F
# 10/22/2022
# This project represents a section of a larger project that was originally in java
# I rewrote this project in Python to show testing in different languages

class Contact(object):

    # Setting up the contact class and setting variables
    def __init__(self, unique_id=int, first_name=str, last_name=str, phone_number=int, address=str):

        self.unique_id = unique_id
        self.first_name = first_name
        self.last_name = last_name
        self.phone_number = phone_number
        self.address = address

    # Defining constraints for the unique ID
    def get_unique_id(self):
        self.unique_id = str(self.unique_id)
        if len(self.unique_id) > 10 or len(self.unique_id) < 1:
            raise ValueError('Unique ID cannot be null or greater than 10!!')
        return self.unique_id

    # Defining constraints for the contacts first name
    def get_contact_first_name(self):
        if len(self.first_name) > 10 or len(self.first_name) < 1:
            raise ValueError('First name cannot be null or greater than 10!!')
        return self.first_name

    # Defining constraints for the contacts last name
    def get_contact_last_name(self):
        if len(self.last_name) > 10 or len(self.last_name) < 1:
            raise ValueError('Last name cannot be null or greater than 10!!')
        return self.last_name

    # Defining constraints for contacts phone number
    def get_contact_phone_number(self):
        self.phone_number = str(self.phone_number)
        if len(self.phone_number) > 10 or len(self.phone_number) < 1:
            raise ValueError('Phone number cannot be over 10 characters or empty!!')
        return self.phone_number

    # Defining constraints for the contacts address
    def get_contact_address(self):
        if len(self.address) > 30 or len(self.address) < 1:
            raise ValueError('Address cannot be empty or longer than 30 characters')
        return self.address


# Calls and prints these values before the test is ran.
A = Contact(499, 'Kenny', '.', '5551234466', '4545 Story Road NY, NY')
print(Contact.get_unique_id(A))
print(Contact.get_contact_first_name(A))
print(Contact.get_contact_phone_number(A))
print(Contact.get_contact_address(A))
