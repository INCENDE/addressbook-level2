package seedu.addressbook.data.person;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    
    @Test 
    public void isSimilar_totallySimilar() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = new Name(name1.fullName);
	final boolean result = name1.isSimilar(name2);
    }
    
    @Test
    public void isSimilar_caseDifferent() {
	
    }
}
