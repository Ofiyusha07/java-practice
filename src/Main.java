import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> list1 = new ArrayList<>();
        list1.add(new Book("1984", "George Orwell"));
        list1.add(new Book("Brave New World", "Aldous Huxley"));

        ArrayList<Book> list2 = new ArrayList<>();
        list2.add(new Book("1984", "George Orwell")); // дубликат
        list2.add(new Book("Fahrenheit 451", "Ray Bradbury"));


        Set<Book> mergedSet = new HashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);


        ArrayList<Book> mergedList = new ArrayList<>(mergedSet);


        for (Book book : mergedList) {
            System.out.println(book);
        }
    }
}

