package books.application;

import books.entities.Book;

public class Program {

    public static void main(String[] args) {

        // Created a Book object.
        Book book1 = new Book("978-0132350884", "Clean code", "Robert C. Martin", 422);
        Book book2 = new Book("978-8558954854", "Domain-Driven", "Eric Evans", 560);

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);

        System.out.println();

        // Checking which of the two books has more pages
        if (book1.getNumberOfPages() > book2.getNumberOfPages()) {
            System.out.println("*" + book1.getTitle() + " has more pages than " + book2.getTitle());
        } else {
            System.out.println("*" + book2.getTitle() + " has more pages than " + book1.getTitle());
        }
    }
}
