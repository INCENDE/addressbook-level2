package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
/**
 * Represents a Person's postal code address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidPostalCode(String)}
 */
public class PostalCode {
    public static final String EXAMPLE = "123";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "PostalCode must be a number";
    public static final String POSTAL_CODE_VALIDATION_REGEX = "\\p{Digit}+";
    
    public final String value;
    
    /**
     * Validates given postal code.
     *
     * @throws IllegalValueException if given postalCode string is invalid.
     */
    public PostalCode(String postalCode) throws IllegalValueException {
        if (!isValidPostalCode(postalCode)) {
            throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
        }
        this.value = postalCode;
    }
    
    
    /**
     * Returns true if a given string is a valid address postal code.
     */
    public static boolean isValidPostalCode(String test) {
        return test.matches(POSTAL_CODE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PostalCode // instanceof handles nulls
                && this.value.equals(((PostalCode) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
