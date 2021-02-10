import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("Clean code", "Robert Martin", "Computing & Internet");
        book2 = new Book("Effective Java", "Joshua Bloch", "Computing & Internet");
        book3 = new Book("Idiomatic Python", "Jeff Knupp", "Computing & Internet");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Clean code", book1.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Clean code", book1.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Clean code", book1.getGenre());
    }


}
