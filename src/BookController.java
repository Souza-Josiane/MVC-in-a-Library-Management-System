public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookTitle(String title) {
        model.setTitle(title);
    }
    public String getBookTitle() {
        return model.getTitle();
    }

    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }
    public String getBookAuthor() {
        return model.getAuthor();
    }

    public void setBookISBN(String isbn) {
        model.setIsbn(isbn);
    }
    public String getBookISBN() {
        return model.getIsbn();
    }

    public void setBookGenre(String genre) {
        model.setGenre(genre);
    }
    public String getBookGenre() {
        return model.getGenre();
    }

    public void updateView() {
        view.printBookDetails(
                model.getTitle(),
                model.getAuthor(),
                model.getIsbn(),
                model.getGenre()
        );
    }
}
