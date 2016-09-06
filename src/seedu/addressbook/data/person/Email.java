package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's email in the address book. Guarantees: immutable; is
 * valid as declared in {@link #isValidEmail(String)}
 */
public class Email implements Contact {

    public static final String EXAMPLE = "valid@e.mail";
    public static final String MESSAGE_EMAIL_CONSTRAINTS = "Person emails should be 2 alphanumeric/period strings separated by '@'";
    public static final String EMAIL_VALIDATION_REGEX = "[\\w\\.]+@[\\w\\.]+";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given email.
     *
     * @throws IllegalValueException
     *             if given email address string is invalid.
     */
    public Email(String email, boolean isPrivate) throws IllegalValueException {
	this.isPrivate = isPrivate;
	email = email.trim();
	if (!isValidEmail(email)) {
	    throw new IllegalValueException(MESSAGE_EMAIL_CONSTRAINTS);
	}
	this.value = email;
    }

    /**
     * Checks if a given string is a valid person email.
     */
    public static boolean isValidEmail(String test) {
	return test.matches(EMAIL_VALIDATION_REGEX);
    }

    /* (non-Javadoc)
     * @see seedu.addressbook.data.person.Contact#toString()
     */
    @Override
    public String toString() {
	return value;
    }

    /* (non-Javadoc)
     * @see seedu.addressbook.data.person.Contact#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
	return other == this // short circuit if same object
		|| (other instanceof Email // instanceof handles nulls
			&& this.value.equals(((Email) other).value)); // state
								      // check
    }

    /* (non-Javadoc)
     * @see seedu.addressbook.data.person.Contact#hashCode()
     */
    @Override
    public int hashCode() {
	return value.hashCode();
    }

    /* (non-Javadoc)
     * @see seedu.addressbook.data.person.Contact#isPrivate()
     */
    public boolean isPrivate() {
	return isPrivate;
    }
}