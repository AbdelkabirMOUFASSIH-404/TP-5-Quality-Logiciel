package library.model;

public class Book implements Lendable {
    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean borrow() {
        if (borrowed) {
            return false;
        }
        borrowed = true;
        return true;
    }

    @Override
    public boolean returnItem() {
        if (!borrowed) {
            return false;
        }
        borrowed = false;
        return true;
    }

    @Override
    public boolean isBorrowed() { return borrowed; }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String getDescription() {
        return title + " by " + author;
    }
}
