package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
    public static final String EXAMPLE = "123";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Street must be a number or alphabet";
    public static final String STREET_VALIDATION_REGEX = "\\p{Alnum}+";
    
    public final String value;
    private boolean isPrivate;
    
    /**
     * Validates given street.
     *
     * @throws IllegalValueException if given street string is invalid.
     */
    public Street(String street, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidstreet(street)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.value = street;
    }
    
    
    /**
     * Returns true if a given string is a valid address street.
     */
    public static boolean isValidstreet(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.value.equals(((Street) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
	return isPrivate;
    }
}
