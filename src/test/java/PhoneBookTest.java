import org.example.PhoneBook;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class PhoneBookTest {
    PhoneBook bookTest = new PhoneBook();

    @Test
    public void testAdd() {
        bookTest.add("pavel", 2323);

        boolean actual = bookTest.add("pavel", 2323);

        assertFalse(actual);

    }
}
