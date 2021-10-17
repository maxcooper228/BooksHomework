import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {
//    a) список книг заданого автора в порядку зростання року видання;
    public static List<Book> booksByAuthor(List<Book> books, String author){
        return books.stream().filter(book -> book.getAuthor().equals(author)).sorted(Comparator.comparing(Book::getYear)).collect(Collectors.toList());
    }
//    b) список книг, що видані заданим видавництвом;
    public static List<Book> booksByPublishing(List<Book> books, String publishing){
        return books.stream().filter(book -> book.getPublishing().equals(publishing)).collect(Collectors.toList());
    }
//   c) список книг, що випущені після заданого року;
    public static List<Book> booksAfterYear(List<Book> books, int year){
        return books.stream().filter(book -> book.getYear()>=year).collect(Collectors.toList());
    }
//    d) список авторів в алфавітному порядку;
    public static List<String> authorByABC(List<Book> books){
        return books.stream().map(Book::getAuthor).sorted().collect(Collectors.toList());
}
//    e) список видавництв, книги яких зареєстровані в системі без повторів;
    public static List<String > publishingDistinct(List<Book> books){
        return books.stream().map(Book::getPublishing).distinct().collect(Collectors.toList());
    }
//    f) для кожного видавництва визначити список книг, виданих ним.
//      вывод книг как объекты
   public static Map<String, List<Book>> allBooksByPublishing1(List<Book> books){
        return books.stream().collect(Collectors.groupingBy(Book::getPublishing));
    }
// вывод только названий книг
public static Map<String, List<String>> allBooksByPublishing2 (List<Book> books){
    return books.stream().collect(Collectors.groupingBy(Book::getPublishing, Collectors.mapping(Book::getName, Collectors.toList())));}

}
