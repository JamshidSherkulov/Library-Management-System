import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display available books
    public void displayAvailableBooks() {
        System.out.println("Available books: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    // Borrow book by title
    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with title '" + title + "' is not available");
    }

    public void borrowBookByISBN(String isbn, User user) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN '"+ isbn + "' is not available");
    }

    // Return book
    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setAvailable(true);
                user.returnBook(book);
                System.out.println(user.getName() + " returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("No book with title '" + title + "' found in user's borrowed books.");
    }

}
