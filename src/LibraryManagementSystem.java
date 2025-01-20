public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "12345"));
        library.addBook(new Book("1984", "George Orwell", "67890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "11121"));

        User user1 = new User("Jamshid", 1);

        // Display available books
        library.displayAvailableBooks();


        library.borrowBook("The Alchemist", user1);
        library.borrowBookByISBN("67890", user1);
        // Display available books after borrowing

        library.displayAvailableBooks();

        // Return a book
        library.returnBook("The Alchemist", user1);

        // Display available books after returning
        library.displayAvailableBooks();
    }
}