
import entity.PhoneBook;

import java.util.Optional;

import static org.junit.Assert.*;

public class PhoneBookTest {

    PhoneBook obj = new PhoneBook();



    @org.junit.Test
    public void findPhoneByName() {
        assertEquals(obj.findPhoneByName("Mohit"), Optional.empty());
    }

    @org.junit.Test
    public void findNameByPhoneNumber() {
        assertEquals(obj.findNameByPhoneNumber("punit", 896), Optional.of(896));
    }
}