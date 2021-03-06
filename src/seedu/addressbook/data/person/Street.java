package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
/**
 * Represents a Person's street address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidStreet(String)}
 */
public class Street {
    public static final String EXAMPLE = "123";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Street must be a number or alphabet";
    public static final String STREET_VALIDATION_REGEX = "[\\w\\s\\.]+";
    
    public final String value;
    
    /**
     * Validates given street.
     *
     * @throws IllegalValueException if given street string is invalid.
     */
    public Street(String street) throws IllegalValueException {
        if (!isValidStreet(street)) {
            throw new IllegalValueException(street + ": " + MESSAGE_STREET_CONSTRAINTS);
        }
        this.value = street;
    }
    
    
    /**
     * Returns true if a given string is a valid address street.
     */
    public static boolean isValidStreet(String test) {
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
}
