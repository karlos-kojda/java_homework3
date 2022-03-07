package Books;

public class ScientificBook extends Books.Book {

    private String scientific_area;

    public ScientificBook(String book_name, String author, int pages_count, String scientific_area) {
        super(book_name, author, pages_count);
        this.scientific_area = scientific_area;
    }

    public String toString() {
        return "Book name: " + super.getBook_name() + ", Author: " + super.getAuthor()
                + ", Pages count: " + super.getPages_count() + ", Scientific area: " + this.scientific_area;
    }
}
