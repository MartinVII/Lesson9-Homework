import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Borrowing {
    public Borrowing(Book book, Subscriber subscriber, LocalDate date){
        this.book = book;
        this.subscriber = subscriber;
        this.todayDate = date;
    }

    Book book;
    Subscriber subscriber;
    LocalDate todayDate;
    LocalDate returnDate;
    int days;

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setReturnDate() {
        this.returnDate = LocalDate.now();
    }

    public String numberOfDays() {
        long daysBetween = DAYS.between(todayDate, returnDate);

        if (daysBetween >= 0) {
            return "The number of days the book was borrowed for: " + daysBetween;
        }
        else {
            return "Invalid return date. Return date is older than borrowing date.";
        }

    }
}
