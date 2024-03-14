package Java.Concepts.Association.Composition;

import java.util.ArrayList;
import java.util.List;

public class TestComposition {

    public static void main(String[] args) {

        Book b1 = new Book(12, "Aman");
        Book b2 = new Book(16, "Mohan");

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);

        Library l = new Library(bookList);

        List<Book> bks = l.getTotalBooksInLibrary();

        // Iterating over books using for each loop
        for (Book bk : bks) {

            // Printing the title and author name of book on
            // console
            System.out.println("Id : " + bk.id
                    + " and "
                    + " Author : " + bk.author);
        }




    }
}
