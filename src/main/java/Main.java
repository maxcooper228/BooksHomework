import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>(
            Arrays.asList(new Book(1, "1st book", "Author", "London", 1991, 200, 70),
                    new Book(2, "2st book", "Author2", "London", 1992, 180, 50),
                    new Book(3, "3st book", "Author2", "NY", 1988, 120, 60),
                    new Book(4, "4st book", "Author3", "Paris", 1999, 500, 100),
                    new Book(5, "5st book", "Author3", "Paris", 2001, 320, 140)));

//        List<Book> filter1 = Filter.booksByAuthor(books, "Author3");
//        System.out.println(filter1);
//        List<Book> filter2 = Filter.booksByPublishing(books, "London");
//        System.out.println(filter2);
//        List<Book> filter3 = Filter.booksAfterYear(books, 1991);
//        System.out.println(filter3);
//          List<String> filter4 = Filter.authorByABC(books);
//          System.out.println(filter4);
//        List<String> filter5 = Filter.publishingDistinct(books);
//          System.out.println(filter5);
        Map<String, List<Book>> filter6_1 = Filter.allBooksByPublishing1(books);
        System.out.println(filter6_1);
        Map<String, List<String>> filter6_2 = Filter.allBooksByPublishing2(books);
        System.out.println(filter6_2);


    }

}
