import java.util.List;

public class ConsoleView implements View{
    @Override
    public void showGetBooklist(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Override
    public void showGetBooksByAuthor(List<Book> sortedbyAuthor) {
        for (Book book : sortedbyAuthor) {
            System.out.println(book);
        }
    }

    @Override
    public void showGetBooksByEdition(List<Book> sortedByEdition) {
        for (Book book : sortedByEdition) {
            System.out.println(book);
        }
    }

    @Override
    public void showGetBooksByYear(List<Book> sortedByYear) {
        for (Book book : sortedByYear) {
            System.out.println(book);
        }
    }

    @Override
    public void showSortBooksByEdition(List<Book> BookList) {
        for (Book book : BookList) {
            System.out.println(book);
        }
    }
}
