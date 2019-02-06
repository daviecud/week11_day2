import java.util.ArrayList;

public class Library {
    private int stock;
    private ArrayList<Book> books;

    public Library(int stock) {
        this.stock = stock;
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int getStockLevel() {
        return this.stock;
    }

    public boolean addBookIfStockLevelHasRoom() {
        if (this.bookCount() < this.stock) {
            return true;
        }
        return false;
    }

}
