package BookLoanControl;

public class BookLoanControl {
    public static void main(String[] args) {
        Book book = new Book(1L, "Don Casmurro", "Machado de Assis", 1.89);
        User user = new User(1L, "John Lock", "108.786.908-34");

        Loan loan = new Loan(book, user);
        System.out.println("Empréstimo Realizado!");
        System.out.println(loan);
    }
}