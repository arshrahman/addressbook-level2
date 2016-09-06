package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact implements Printable{
	
	private final String value;
	private final String className;
	private boolean isPrivate;
	
	public Contact(String contact, boolean isPrivate, String validationRegex, String messageConstraints, String className) throws IllegalValueException {
		this.value = contact;
		this.className = className;
		this.isPrivate = isPrivate;
		if (!isValidContact(contact, validationRegex)) {
			throw new IllegalValueException(messageConstraints);
		}
	}

	public static boolean isValidContact(String test, String validationRegex) {
		return test.matches(validationRegex);
	}

	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	@Override
	public String getPrintableString() {
		return className + ((this.isPrivate) ? detailIsPrivate : value);
	}
}
