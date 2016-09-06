package seedu.addressbook.data.tag;

import java.util.EnumMap;
import java.util.StringJoiner;

import seedu.addressbook.data.person.Person;

public class Tagging {
	public enum TagStatus { 
        TAG_ADDED, 
        TAG_DELETED 
    }
    
    private Person person;
    private Tag tag;
    private TagStatus tagStatus;
    public static final EnumMap<TagStatus, String> tagStatusPrefix = new EnumMap<>(TagStatus.class);
    
    public Tagging(Person person, Tag tag, TagStatus tagStatus) {
        this.person = person;
        this.tag = tag;
        this.tagStatus = tagStatus;
        tagStatusPrefix.put(TagStatus.TAG_ADDED, "+");
        tagStatusPrefix.put(TagStatus.TAG_DELETED, "-");
    }
    
    public Person getPerson() {
        return person;
    }
    public Tag getTag() {
        return tag;
    }
    public TagStatus getTagStatus() {
        return tagStatus;
    }
    
    @Override
    public String toString() {
    	return new StringJoiner(tagStatusPrefix.get(tagStatus), "[", "]")
    			.add(this.person.getName().toString())
    			.add(this.tag.tagName.toString()).toString();
    }
}
