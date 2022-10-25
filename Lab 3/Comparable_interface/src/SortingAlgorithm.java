import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAlgorithm {
    public static void main(String args[]) {

        List<Author> authorList = new ArrayList<Author>();
        authorList.add(new Author("Henry", "Miller", "Tropic of Cancer", 34));
        authorList.add(new Author("Nalo", "Hopkinson", "Brown Girl in the Ring", 26));
        authorList.add(new Author("Frank", "Miller", "300", 21));
        authorList.add(new Author("Deborah", "Hopkinson", "Sky Boys", 40));
        authorList.add(new Author("George R. R.", "Martin", "Song of Ice and Fire", 31));

        Collections.sort(authorList);

        for (Author author : authorList) {
            System.out.println(author);
        }
    }
}