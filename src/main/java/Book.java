public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }
    public String getInfo() {
        return title +" cтраниц: " + author + "\nОпубликован в " + year + " году";
    }

}

