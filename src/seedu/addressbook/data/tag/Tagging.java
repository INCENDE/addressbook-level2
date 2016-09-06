package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private final Person person;
    private final Tag tag;
    private final boolean isAdd;

    private static final String TAG_ADD = "+";
    private static final String TAG_DELETE = "-";

    public Tagging(Person person, Tag tag, boolean isAdd) {
	this.person = person;
	this.tag = tag;
	this.isAdd = isAdd;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	if (isAdd) {
	    builder.append(TAG_ADD);
	} else {
	    builder.append(TAG_DELETE);
	}
	builder.append(" ");
	builder.append(person.getName());
	builder.append(" ");
	builder.append("[");
	builder.append(tag.tagName);
	builder.append("]");
	return builder.toString();
    }
}
