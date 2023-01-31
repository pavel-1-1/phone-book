import org.example.PhoneBook;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhoneBookTest {
    PhoneBook book = new PhoneBook();
    @Test
    public void testAdd() {

        boolean actual = book.add("Vasia", 800);

        assertTrue(actual);

    }
}
