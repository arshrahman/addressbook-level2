package seedu.addressbook.parser;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import seedu.addressbook.common.Utils;

public class UtilsTest {

	@Test
	public void isAnyNull() {
		assertTrue(Utils.isAnyNull(new Integer(3), null));

	}
	
	@Test
	public void isAnyNotNull() {
		assertFalse(Utils.isAnyNull("haha", "not null"));
	}
	
	@Test
	public void elementsAreUnique() {
		assertTrue(Utils.elementsAreUnique(Arrays.asList("CS1010", "CS1020", "CS2010")));

	}
	
	@Test
	public void elementsAreNotUnique() {
		assertFalse(Utils.isAnyNull(Arrays.asList("CS2103", "CS2103")));
	}

}
