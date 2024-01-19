public class LibraryApp {
    public static void main(String[] args) {
        // Create an initial book and set its details
        Book model = retrieveBookFromDatabase();

        // Create a view to display book details
        BookView view = new BookView();

        BookController controller = new BookController(model, view);

        controller.updateView();

        // Update the book information
        controller.setBookTitle("Rich Dad Poor Dad");
        controller.setBookAuthor("Robert T. Kiyosaki");
        controller.setBookISBN("0-446-67745-0");
        controller.setBookGenre("Personal Finance");

        // Display the updated book details
        System.out.println("\nBook Details After Updating!");

        controller.updateView();
    }

    private static Book retrieveBookFromDatabase() {
        Book book = new Book();
        book.setTitle("Alice's Adventures in Wonderland");
        book.setAuthor("Lewis Carroll");
        book.setIsbn("0-553-21364-4");
        book.setGenre("Fantasy");
        return book;
    }

}
