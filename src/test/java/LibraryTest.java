import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        library = new Library(9);
        book = new Book("The Day of the Jackal", "Frederick Forsyth", "Fiction");
        book1 = new Book("The Hobbit", "JRR Tolkien", "Fiction");
        book2 = new Book("It", "Stephen King", "Horror");
        book3 = new Book("Misery", "Stephen King", "Horror");

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }


    @Test
    public void countBooks() {
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void stockLevel(){
        assertEquals(9, library.getStockLevel());
    }

    @Test
    public void canNotAddIfFull(){
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(8, library.bookCount());
        assertEquals(true, library.addBookIfStockLevelHasRoom());
//        assertFalse("Cannot add more Books", false);


    }
}