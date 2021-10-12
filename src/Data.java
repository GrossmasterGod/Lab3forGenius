import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Data implements DataInterface {
    String[] names = {"Trainspotting", "Marabou Stork Nightmares", "The Sea-Wolf", "White Fang"
            , "Crime and Punishment", "The Idiot", "Fathers and Sons", "Gulliver's Travels", "Master and Margarita", "Heart of a Dog"};
    String[] authors = {"Irvine Welsh", "Irvine Welsh", "Jack London", "Jack London"
            , "Fyodor Dostoevsky", "Fyodor Dostoevsky", "Ivan Turgenev", "Jonathan Swift", "Mikhail Bulgakov", "Mikhail Bulgakov"};
    String[] editions = {"Harwilll Seeker", "Harwilll Seeker", "Macmillan", "Macmillan"
            , "Russian Messenger", "Russian Messenger", "Russian Messenger", "Benjamin Mot", "YMCA Press", "Harcourt Brace"};
    Integer[] years = {1993, 1995, 1904, 1906, 1866, 1869, 1862, 1726, 1967, 1925};
    Integer[] pages = {390, 368, 296, 316, 417, 390, 226, 454, 358, 198};
    Integer[] prices = {75, 50, 23, 54, 17, 26, 76, 127, 84, 92};

    @Override
    public List<Book> getbooklist() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Book b = new Book(names[i], authors[i], editions[i], years[i], pages[i], prices[i]);
            bookList.add(b);
        }
        return bookList;
    }


    public List<Book> getBooksByAuthor(String author) {
        List<Book> filteredAuthor = new ArrayList<>();
        for (int i = 0; i < getbooklist().size(); i++) {
            if (author.equals(getbooklist().get(i).getAuthor())) {
                filteredAuthor.add(getbooklist().get(i));
            }
        }
        return filteredAuthor;
    }

    public List<Book> getBooksByEdition(String edition) {
        List<Book> sortedByEdition = new ArrayList<>();
        for (int i = 0; i < getbooklist().size(); i++) {
            if (edition.equals(getbooklist().get(i).getEdition())) {
                sortedByEdition.add(getbooklist().get(i));
            }
        }
        return sortedByEdition;
    }

    public List<Book> getBooksByYear(Integer year) {
        List<Book> sortedByYear = new ArrayList<>();
        for (int i = 0; i < getbooklist().size(); i++) {
            if (year < (getbooklist().get(i).getYear())) {
                sortedByYear.add(getbooklist().get(i));
            }
        }
        return sortedByYear;
    }

    public List<Book> sortBooksByEdition() {
        List<Book> BookList = getbooklist();
        BookList.sort(Comparator.comparing(Book::getEdition));
        return BookList;
    }


}

