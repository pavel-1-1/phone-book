import org.example.PhoneBook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {
    PhoneBook bookTest = new PhoneBook();

    @Before
    public void startAddContact() {
        bookTest.add("pavel", 2323);
        bookTest.add("roma", 4545);
    }

    @Test
    public void Add() {
        assertEquals(2, bookTest.add("pavel", 2323));
    }

    @Test
    public void findByNumber() {
        assertEquals("pavel", bookTest.findByNumber(2323));
    }

    @Test
    public void findByNumber_IsNull() {
        assertEquals("null", bookTest.findByNumber(2345));
    }

    @Test
    public void findByName() {
        assertEquals(2323, bookTest.findByName("pavel"));
    }

    @Test
    public void findByName_IsNull() {
        assertEquals(0, bookTest.findByName("rico"));
    }
}
