import controller.PhoneBookCrawler;
import org.junit.Test;
import entity.PhoneBook;

import java.util.Optional;

import static org.junit.Assert.*;

public class PhoneBookCrawlerTest {

    PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();
    PhoneBook obj=new PhoneBook();
   //phoneBookCrawler.LoadData();

    @Test
    public void findPhoneByNameAndPunishIfNothingFound() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("punit"), Optional.of(896));
    }

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFound() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("punit"), Optional.of(896));
    }

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreams() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundStream("punit"), Optional.of(896));
    }

    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundStream("punit"), Optional.of(896));
    }

    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumber() {
        assertEquals(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Mohit", 896), Optional.of(896));
    }
}