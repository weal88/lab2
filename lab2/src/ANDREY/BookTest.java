package ANDREY;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.name.set("1984");
        book.author.set("george","orwell");
        book.year.setYear(1949);
        System.out.println(book.author.getName() + " " + book.author.getSurname());
        System.out.println(book.year.getYear());
        System.out.println(book.name.getName());
    }
}