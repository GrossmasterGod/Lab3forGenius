import java.util.Scanner;

public class Conroller {
    Scanner scanner = new Scanner(System.in);
    DataInterface dataInterface = new Data();
    View view = new ConsoleView();
    private boolean flag = true;

    void execute() {
        while (flag) {
            System.out.println("""
                    Виберіть варіант дій:\s
                     1 - вивести всі книги\s
                     2 - вивести книги за автором\s
                     3 - вивести книги за видавництвом\s
                     4 - вивести книги пізніше заданого року\s
                     5 - відсортувати книги за видавництвом\s
                     6 - завершити виконання""");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case (1) -> view.showGetBooklist(dataInterface.getbooklist());
                case (2) -> {
                    System.out.println("Введіть автора: ");
                    String author = scanner.nextLine();
                    view.showGetBooksByAuthor(dataInterface.getBooksByAuthor(author));
                }
                case (3) -> {
                    System.out.println("Введіть видавництво: ");
                    String edition = scanner.nextLine();
                    view.showGetBooksByEdition(dataInterface.getBooksByEdition(edition));
                }
                case (4) -> {
                    System.out.println("Введіть рік: ");
                    int year = scanner.nextInt();
                    view.showGetBooksByYear(dataInterface.getBooksByYear(year));
                }
                case (5) -> view.showSortBooksByEdition(dataInterface.sortBooksByEdition());
                case (6) -> flag = false;
            }
        }

    }

}
