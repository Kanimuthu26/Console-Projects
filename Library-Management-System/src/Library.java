import java.util.*;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(int id, String name) {
        books.add(new Book(id, name));
        System.out.println("Book added.");
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.id + " - " + b.name + " - " + (b.issued ? "Issued" : "Available"));
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.issued) {
                b.issued = false;
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }
}
