import java.util.*;

public class Library {

    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "abc", 250);

        Book b2 = new Book("Alternate Universe", "Christopher Nolan", 590);

        Book b3 = new Book("Error Book", "John", -59);

        DigitalBook db = new DigitalBook("Java Guide", "bcd", 560, 92);

        LibraryManager library = new LibraryManager();

        try {

            library.addBook(b1);
            library.addBook(b2);
            library.addBook(b3);
            library.addBook(db);

        } catch (InvalidPriceException e) {

            System.out.println("Error : " + e.getMessage());
        }

        library.printBook();

        library.getBookMap();
    }
}

class Book {

    private String title;
    private String author;
    private int price;

    Book(String title, String author, int price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public int getPrice() {

        return price;
    }

    public void getDetails() {

        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

class DigitalBook extends Book {

    private int fileSize;

    DigitalBook(String title, String author, int price, int fileSize) {

        super(title, author, price);

        this.fileSize = fileSize;
    }

    @Override
    public void getDetails() {

        super.getDetails();

        System.out.println("File Size : " + fileSize);
    }
}

class InvalidPriceException extends Exception {

    InvalidPriceException(String message) {

        super(message);
    }
}

class LibraryManager {

    ArrayList<Book> books = new ArrayList<>();

    HashMap<String, Integer> bookMap = new HashMap<>();

    public void addBook(Book book) throws InvalidPriceException {

        if (book.getPrice() < 0) {

            throw new InvalidPriceException("Price cannot be negative");

        } else {

            books.add(book);

            bookMap.put(book.getTitle(), book.getPrice());
        }
    }

    public void printBook() {

        for (Book b : books) {

            b.getDetails();

            System.out.println();
        }
    }

    public void getBookMap() {

        for (String title : bookMap.keySet()) {

            System.out.println(title + " : " + bookMap.get(title));
        }
    }
}