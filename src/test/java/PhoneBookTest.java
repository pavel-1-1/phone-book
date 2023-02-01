import org.example.PhoneBook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {
    PhoneBook bookTest = new PhoneBook();

    @Before
    public void startAddContact() {
        bookTest.add("pavel",2323);
        bookTest.add("roma", 4545);
    }

    @Test
    public void Add() {
        boolean actual = bookTest.add("pavel", 2323);
        assertFalse(actual);
    }

    @Test
    public void findByNumber() {
        assertEquals("pavel", bookTest.findByNumber(2323));
    }

    @Test
    public void findByNumber_IsNull() {
        assertNotEquals("rico", 2323);
    }

}
