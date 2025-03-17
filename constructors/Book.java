package constructors;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private double price;
    private String ISBN;
    private String publisher;
    private int publicationYear;
    private int pages;
    private String genre;
    private List<String> chapters;

    // Constructor
    public Book(String title, String author, double price, String ISBN, String publisher, int publicationYear, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.genre = genre;
        this.chapters = new ArrayList<>();
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public double getPrice() { return price; }
    public String getPublisher() { return publisher; }
    public int getPublicationYear() { return publicationYear; }
    public int getPages() { return pages; }
    public String getGenre() { return genre; }
    public List<String> getChapters() { return chapters; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setPrice(double price) { this.price = price; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    public void setPages(int pages) { this.pages = pages; }
    public void setGenre(String genre) { this.genre = genre; }
    public void addChapter(String chapter) { this.chapters.add(chapter); }

    // Display method
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: ₹" + price);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Chapters: " + String.join(", ", chapters));
    }

    public static void main(String[] args) {
    	
    	List<Book> bookList = new ArrayList<>();

        Book book1 = new Book("Effective Java", "Joshua Bloch", 1500, "978-0134685991", "Addison-Wesley", 2018, 416, "Programming");
        book1.addChapter("Introduction");
        book1.addChapter("Creating and Destroying Objects");
        book1.addChapter("Methods Common to All Objects");

        Book book2 = new Book("Clean Code", "Robert C. Martin", 1754, "978-0132350884", "Prentice Hall", 2008, 464, "Programming");
        book2.addChapter("Meaningful Names");
        book2.addChapter("Functions");
        book2.addChapter("Comments");

        bookList.add(book1);
        bookList.add(book2);

        for (Book book : bookList) {
            book.displayBookDetails();
            System.out.println("-------------------------");
        }
    }
}
