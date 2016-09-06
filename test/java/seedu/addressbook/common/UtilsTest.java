package seedu.addressbook.common;

import static org.junit.Assert.*;
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
}
