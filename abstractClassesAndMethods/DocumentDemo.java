package abstractClassesAndMethods;

import java.util.List;

public class DocumentDemo {
	public static void main(String[] args) {
        Document pdf = new PDFDocument("ProjectReport.pdf", 500);
        Document text = new TextDocument("Notes.txt", 50);
        Document image = new ImageDocument("Photo.png", 200);
        
        List<Document> documents = List.of(pdf, text, image);
        
        for (Document doc : documents) {
            doc.printDetails();
            doc.open();
            doc.save();
            doc.close();
            System.out.println();
        }
    }
}
abstract class Document {
 private String title;
 private int size;
 
 public Document(String title, int size) {
     this.title = title;
     this.size = size;
 }
 
 public String getTitle() {
     return title;
 }
 
 public int getSize() {
     return size;
 }
 
 public abstract void open();
 public abstract void save();
 public abstract void close();
 
 public void printDetails() {
     System.out.println("Document Title: " + title + ", Size: " + size + "KB");
 }
}

class PDFDocument extends Document {
 public PDFDocument(String title, int size) {
     super(title, size);
 }
 
 @Override
 public void open() {
     System.out.println("Opening PDF document: " + getTitle());
 }
 
 @Override
 public void close() {
     System.out.println("Closing PDF document: " + getTitle());
 }
 
 @Override
 public void save() {
     System.out.println("Saving PDF document: " + getTitle());
 }
}

//Subclass TextDocument
class TextDocument extends Document {
 public TextDocument(String title, int size) {
     super(title, size);
 }
 
 @Override
 public void open() {
     System.out.println("Opening Text document: " + getTitle());
 }
 
 @Override
 public void close() {
     System.out.println("Closing Text document: " + getTitle());
 }
 
 @Override
 public void save() {
     System.out.println("Saving Text document: " + getTitle());
 }
}

class ImageDocument extends Document {
 public ImageDocument(String title, int size) {
     super(title, size);
 }
 
 @Override
 public void open() {
     System.out.println("Opening Image document: " + getTitle());
 }
 
 @Override
 public void close() {
     System.out.println("Closing Image document: " + getTitle());
 }
 
 @Override
 public void save() {
     System.out.println("Saving Image document: " + getTitle());
 }
}
