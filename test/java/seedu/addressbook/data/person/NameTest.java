package seedu.addressbook.data.person;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    /**
     * Test the most obvious case
     * @throws IllegalValueException
     */
    @Test 
    public void isSimilar_totallySimilar() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = new Name(name1.fullName);
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);
    }
    
    @Test
    public void isSimilar_caseDifferent() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = new Name("JoHn SmItH");
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);	
    }
}
