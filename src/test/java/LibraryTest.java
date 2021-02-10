import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before(){
        book1 = new Book("Clean code", "Robert Martin", "Computing & Internet");
        book2 = new Book("Effective Java", "Joshua Bloch", "Computing & Internet");
        book3 = new Book("Idiomatic Python", "Jeff Knupp", "Computing & Internet");
        library = new Library(10);
    }

    @Test
    public void hasCapactiy(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(Book1);
        library.addBook(Book2);
        library.addBook(Book3);
        assertEquals(3, library.getBookCount());
    }

}
