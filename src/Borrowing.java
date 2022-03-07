import Books.Book;
import Subscription.Subscriber;

import java.time.LocalDate;

public class Borrowing {

    private Book borrowed_book;
    private Subscriber person;
    private LocalDate borrowing_date;
    private LocalDate return_date;

    public Borrowing(Books.Book borrowed_book, Subscriber person, LocalDate borrowing_date) {
        this.borrowed_book = borrowed_book;
        this.person = person;
        this.borrowing_date = borrowing_date;
    }

    public void setReturnDate(LocalDate return_date) {
        this.return_date = return_date;
    }
}
