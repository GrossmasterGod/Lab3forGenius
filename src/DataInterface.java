import java.util.List;

interface DataInterface {
    List<Book> getbooklist();

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByEdition(String edition);

    List<Book> getBooksByYear(Integer year);

    List<Book> sortBooksByEdition();
}
