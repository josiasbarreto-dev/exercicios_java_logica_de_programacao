package BookLoanControl;

import java.util.Date;

public class Loan {
    private Book book;
    private User user;
    private Date date;

    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.date = new Date();
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "book=" + book +
                ", user=" + user +
                ", date=" + date +
                '}';
    }
}
