public class Book {

    // Step 1 : Define Attributes

    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // Step 2 : Constructor
    public Book(String title, String author, String ISBN){

        this.title =title;
        this.author =author;
        this.ISBN   =ISBN;
        this.available = true;
    }

    //step 3 Getters and setter 

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    //Display book details
    public void displayBookInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + ISBN);
    System.out.println("Available: " + (available ? "Yes" : "No"));

    }


}
