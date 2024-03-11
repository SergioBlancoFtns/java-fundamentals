class Book {
    
    String title;
    String author;

    public Book(String theAuthorsBook, String theTitlesBook) {
        this.author = theAuthorsBook;
        this.title = theTitlesBook;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    void showBookInfo() {
        System.out.println(title + ", " + author);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Book firstBook = new Book("Nacho", "Nacho lee");
        Book ancientBook = new Book("Odisea");

        firstBook.showBookInfo();
        ancientBook.showBookInfo();
    }
}
