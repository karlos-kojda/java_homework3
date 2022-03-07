package Books;

public class Book {

    private String book_name;
    private String author;
    private int pages_count;

    public Book(String book_name, String author, int pages_count) {
        this.book_name = book_name;
        this.author = author;
        this.pages_count = pages_count;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages_count() {
        return pages_count;
    }

    public String toString() {
        return "Book name: " + this.book_name + ", Author: "
                + this.author + ", Pages count: " + this.pages_count;
    }
}