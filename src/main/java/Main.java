//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
// добавление книг
        library.addBook(new Book("5000", "Лев толстой", 1901 ));
        library.addBook(new Book("3124", "Пушкин", 1860 ));
        // создание члена библеотеки
        LibraryMember member = new LibraryMember("Alice", 1);
        System.out.println(member.getMemberInfo());

        BookAction action = new BookAction() {
            @Override
            public void performAction(Book book) {
                System.out.println("выполнения действий: " + book.getInfo() );

            }
        };
        for(Book book : library.getBooks()) {
            System.out.println(book.getInfo());
        }


    }
}