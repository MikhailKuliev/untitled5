import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addBook(String title, String author, int year) {
        Book book = (new Book(title, author, year));

    }
    public ArrayList<Book> getBooks() {
        return books;
    }
}


class LibraryMember {
    private String name;
    private int MembershipId;
    public LibraryMember(String name, int MembershipId) {
        this.name = name;
        this.MembershipId = MembershipId;

    }
    public String getMemberInfo() {
        return " Название : " + name + ", Id: " + MembershipId;

    }
}

