import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Borrow a book by ID
    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println("Book borrowed successfully: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available or already borrowed.");
    }

    // Return a book by ID
    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned successfully: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }

    // Search for a book by title
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found Book: " + book);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
