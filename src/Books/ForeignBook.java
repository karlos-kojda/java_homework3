package Books;

public class ForeignBook extends Books.Book {

    private String language = "English";


    public ForeignBook(String book_name, String author, int pages_count, String language) {
        super(book_name, author, pages_count);
        this.language = language;
    }

    public ForeignBook(String book_name, String author, int pages_count) {
        super(book_name, author, pages_count);
        this.language = "English";
    }

    public String toString() {
        return "Book name: " + super.getBook_name() + ", Author: " + super.getAuthor()
                + ", Pages count: " + super.getPages_count() + ", Language: " + this.language;
    }
}
