import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;

    @Before
    public void before(){
        book1 = new Book("The Day of the Jackal", "Frederick Forsyth", "Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Day of the Jackal", book1.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Frederick Forsyth", book1.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fiction", book1.getGenre());
    }
}