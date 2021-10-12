public class Book {
    private String name;
    private String author;
    private String edition;
    private int year;
    private int pages;
    private int price;

    Book(String name, String author, String edition, int year, int pages, int price) {
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\n" + "Автор: " + author + "\n" + "Видавництво: " + edition + "\n" + "Рік: " + year + "\n" +
                "Сторінок: " + pages + "\n" + "Ціна: " + price + "\n";
    }


}
