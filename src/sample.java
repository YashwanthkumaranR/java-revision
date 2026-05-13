import java.util.ArrayList;
import java.util.HashMap;

public class sample {
}


class Book{
    private String name;
    private String author;
    private int price;

    Book(String name,String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }

    public void getDetails(){
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}

class DigitalBook extends Book{
    private int fileSize;

    DigitalBook(String name, String author, int price, int fileSize){
        super(name,author,price);
        this.fileSize = fileSize;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println(fileSize);
    }
}

class InvalidPriceException extends Exeption{
    InvalidPriceException(String message){
        super(message);
    }
}

public class LibraryManager{
    ArrayList<Book> books = new ArrayList<>();
    HashMap<String ,Integer> mapBook = new HashMap<>();


    public void addBook(Book b)throws InvalidPriceException{
        if(b.getPrice() < 0){
            throw new InvalidPriceException("Invalid Book");
        }
        else {

            books.add(b);
            mapBook.put(b.getName(),b.getPrice());
        }
    }

    public void printBook(){
        for(Book book : books){
            getD

        }
    }
}