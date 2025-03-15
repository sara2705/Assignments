package classesandObjects;

import java.util.List;

public class BookDto {
	private String title;
	private String author;
	private double price;
	private String ISBN;
	private String publisher;
    private int publicationYear;
    private int pages;
    private String genre;
	private List<String> chapters;
	
	
	//getter
	public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }
    
    public String getGenre(){
    	return genre;
    }

    public List<String> getChapters(){
    	return chapters;
    }
    
    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public void setGenre(String genre){
    	this.genre= genre;
    }
    
    public void addChapters(String chapter) {
        this.chapters.add(chapter);
    }
    
    

}
