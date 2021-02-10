import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
        library = new Library(2);
    }

    @Test
    public void hasCapactiy(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void checkCapacityBeforeAdding(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void checkFalseReturnAddingToFullLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertFalse(library.checkFreeCapacity());
    }


}
