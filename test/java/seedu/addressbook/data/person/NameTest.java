package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    /**
     * Test the most obvious case
     */
    @Test 
    public void isSimilar_totallySimilar() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = new Name(name1.fullName);
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);
    }

    /**
     * Test the case sensitivity
     */
    @Test
    public void isSimilar_caseDifferent() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = new Name("JoHn SmItH");
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);	
    }
    
    /**
     * Test the other name is null
     */
    @Test
    public void isSimilar_otherNull() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = null;
	final boolean result = name1.isSimilar(name2);
	assertFalse(result);	
    }
    
    
    
    /**
     * Test the case where the second name only contains some part of the name, split by white space
     */
    @Test
    public void isSimilar_containsSomePart() throws IllegalValueException {
	Name name1 = new Name("John Smith");
	Name name2 = new Name("John");
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);	
    }
    
    @Test
    public void isSimilar_containsSomePartDifferentOrder() throws IllegalValueException {
	Name name1 = new Name("John K Smith A");
	Name name2 = new Name("Smith A John K");
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);	
    }
    
    @Test
    public void isSimilar_containsSomePartDifferentOrderAndCase() throws IllegalValueException {
	Name name1 = new Name("John K Smith A");
	Name name2 = new Name("SMITH a joHN k");
	final boolean result = name1.isSimilar(name2);
	assertTrue(result);	
    }
}
