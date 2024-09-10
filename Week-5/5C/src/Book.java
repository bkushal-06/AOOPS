// Book class that represents a book in the library
class Book implements LibraryItem, Borrowable {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            return true;
        }
        return false;
    }
}
