package seedu.addressbook.ui;

import java.util.ArrayList;
import java.util.List;

import static seedu.addressbook.ui.Formats.*;

import seedu.addressbook.data.person.ReadOnlyPerson;

public class Formatter {

    /** Format of indexed list item */
    static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";


    /** Offset required to convert between 1-indexing and 0-indexing.  */
    static final int DISPLAYED_INDEX_OFFSET = 1;

    /** Formats a list of strings as a viewable indexed list. */
    static String getIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }
    /**
     * Shows a list of persons to the user, formatted as an indexed list.
     * Private contact details are hidden.
     */
    static List<String> getPersonListView(List<? extends ReadOnlyPerson> persons) {
        final List<String> formattedPersons = new ArrayList<>();
        for (ReadOnlyPerson person : persons) {
            formattedPersons.add(person.getAsTextHidePrivate());
        }
        return formattedPersons;
    }
    
    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
    
    /**
     * Formats the output in a certain style
     * 
     * @param output before formatting
     * @return formatted string
     */
    static String formatOutput(String output) {
	return LINE_PREFIX + output.replace("\n", LS + LINE_PREFIX);
    }
    
    static String formatString(String format, Object... args) {
	return String.format(format, args);
    }
}
