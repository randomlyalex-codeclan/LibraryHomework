import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Tom");
    }

    @Test
    public void hasName(){
        assertEquals("Tom", borrower.getName());
    }

    @Test
    public void collectionStartsAtZero(){
        assertEquals(0, borrower.getBookCount());
    }




}
