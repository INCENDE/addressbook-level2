package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

    /**
     * Test isAnyNull method using 2 objects
     */

    @Test
    public void isAnyNull_noNull() {
	Object obj1 = new Object();
	Object obj2 = new Object();
	final boolean result = Utils.isAnyNull(obj1, obj2);
	assertFalse(result);
    }

    @Test
    public void isAnyNull_hasNull() {
	Object obj1 = new Object();
	Object obj2 = null;
	final boolean result = Utils.isAnyNull(obj1, obj2);
	assertTrue(result);
    }

    /**
     * Test elementsAreUnique method
     */

    @Test
    public void elementsAreUnique_isUnique() {
	ArrayList<Object> list = new ArrayList<Object>();
	Object obj1 = new Object();
	Object obj2 = new Object();
	list.add(obj1);
	list.add(obj2);
	final boolean result = Utils.elementsAreUnique(list);
	assertTrue(result);
    }

    @Test
    public void elementsAreUnique_notUnique() {
	ArrayList<Object> list = new ArrayList<Object>();
	Object obj1 = new Object();
	Object obj2 = obj1;
	list.add(obj1);
	list.add(obj2);
	final boolean result = Utils.elementsAreUnique(list);
	assertFalse(result);
    }
}
