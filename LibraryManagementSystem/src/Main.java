public class Main {
    public static void main(String[] args) {
        // Create a new book object
        Book book1 = new Book("Think Like a Monk", "Jay Shetty", "978-1982134488");

        // Display book details
        book1.displayBookInfo();

        // Update availability and display again
        book1.setAvailable(false);
        System.out.println("\nAfter updating availability:");
        book1.displayBookInfo();
    }
}