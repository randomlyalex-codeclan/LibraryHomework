import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Tom");
        book1 = new Book("Clean code", "Robert Martin", "Computing & Internet");
        book2 = new Book("Effective Java", "Joshua Bloch", "Computing & Internet");
        book3 = new Book("Idiomatic Python", "Jeff Knupp", "Computing & Internet");
        library = new Library(3);
   }

    @Test
    public void hasName(){
        assertEquals("Tom", borrower.getName());
    }

    @Test
    public void collectionStartsAtZero(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void canTakeBookFromLibrary_checkLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.takeBookFromLibrary(book1, library);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canTakeBookFromLibrary_checkBorrower(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.takeBookFromLibrary(book1, library);
        assertEquals(1, borrower.getBookCount());
    }




}
