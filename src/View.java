import java.util.List;

public interface View {
    void showGetBooklist(List<Book> bookList);
    void showGetBooksByAuthor(List<Book> sortedbyAuthor);
    void showGetBooksByEdition(List<Book> sortedByEdition);
    void showGetBooksByYear(List<Book> sortedByYear);
    void showSortBooksByEdition(List<Book> BookList);
}
