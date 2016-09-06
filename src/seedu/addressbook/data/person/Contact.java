package seedu.addressbook.data.person;

public interface Contact {

    String toString();

    boolean equals(Object other);

    int hashCode();

    boolean isPrivate();

}