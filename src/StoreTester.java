import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class StoreTester {
    @Test

    public void addBookTest() {
        System.out.println("hello");
        Store test = new Store();
        Book book = new Book();
        test.addBook(book);
        assertTrue(!test.isEmpty());
    }
    @org.junit.Test
    public void testAddBookandPhone(){
        Store test = new Store();
        Book book = new Book();
        Phone phone = new Phone();
        test.addBook(book);
        test.addPhone(phone);
        assertTrue((!test.isEmpty()));
    }

    @org.junit.Test
    public void phoneTester(){
        Store test = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        phone2.setLocation("Room 514");
        phone1.setLocation("Room 514");
        test.addPhone(phone1);
        test.addPhone(phone2);

        assertEquals(phone1.getLocation(), "Room 514");
    }

    @org.junit.Test
    public void getItemTester(){
        Store test = new Store();
        Phone p = new Phone();
        Book b = new Book();
        p.setLocation("Room 514");
        b.setLocation("boooook");
        ArrayList<CISItem> bookArrayList = test.getItems("Book");
        ArrayList<CISItem> phoneArrayList = test.getItems("Phone");
        for (int i = 0; i < phoneArrayList.size(); i++) {
            assertEquals(phoneArrayList.get(i).getClass(),p.getClass());
        }
        for (int i = 0; i < bookArrayList.size(); i++) {
            assertEquals(bookArrayList.get(i).getClass(),b.getClass());
        }
    }
}