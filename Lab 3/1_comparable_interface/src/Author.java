public class Author implements Comparable<Author> {

    private String firstName;
    private String lastName;
    private String bookName;
    private int age;

    Author(String first, String last, String book, int age) {
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
        this.age = age;
    }

    @Override
    public int compareTo(Author author) {
        int last = this.lastName.compareTo(author.lastName);
        return last == 0 ? this.firstName.compareTo(author.firstName) : last;
    }

    @Override
    public String toString() {
        return this.firstName + " " +
                this.lastName + " " +
                this.age + " " +
                "Book: " + this.bookName;
    }
}