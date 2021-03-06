package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
/**
 * Represents a Person's unit address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidUnit(String)}
 */
public class Unit {
    public static final String EXAMPLE = "#00-00";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit must be #number-number";
    public static final String UNIT_VALIDATION_REGEX = "#[\\p{Digit}]+-[\\p{Digit}]+";
    
    public final String value;
    
    /**
     * Validates given unit.
     *
     * @throws IllegalValueException if given unit string is invalid.
     */
    public Unit(String unit) throws IllegalValueException {
        if (!isValidunit(unit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.value = unit;
    }
    
    
    /**
     * Returns true if a given string is a valid address unit.
     */
    public static boolean isValidunit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.value.equals(((Unit) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
