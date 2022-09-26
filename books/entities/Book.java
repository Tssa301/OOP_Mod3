package books.entities;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int numberOfPages;

    // Constructor
    public Book(String isbn, String title, String author, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Getters and Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {

    }

    // Method - toString
    public String toString() {
        return "The book with title " + title + ", ISBN " + isbn + " and author " + author + " has " + numberOfPages
                + " pages";
    }

}
