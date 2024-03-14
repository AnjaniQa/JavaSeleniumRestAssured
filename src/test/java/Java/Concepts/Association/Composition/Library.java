package Java.Concepts.Association.Composition;

import java.util.List;

public class Library {

    List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary() {
        return books;
    }
}
