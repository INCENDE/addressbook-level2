package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {
    public static final String EXAMPLE = Block.EXAMPLE + ", " + Street.EXAMPLE + ", " + Unit.EXAMPLE + ", " + PostalCode.EXAMPLE;//"123, some street 80, #00-00, 123456";
    public static final String ADDRESS_SPLIT_REGEX = ", ";

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if any part of the address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        
        String[] split = address.split(ADDRESS_SPLIT_REGEX);
        block = new Block(split[0]);
        street = new Street(split[1]);
        unit = new Unit(split[2]);
        postalCode = new PostalCode(split[3]);
    }

    @Override
    public String toString() {
        return block.value + ", " + street.value + ", " + unit.value + ", " + postalCode.value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.block.equals(((Address)other).block)
                && this.street.equals(((Address)other).street)
                && this.unit.equals(((Address)other).unit)
                && this.postalCode.equals(((Address)other).postalCode)); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}