import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String args[]) {
        FileReader fr = null;
        try {
            File file = new File("file.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);
            for (char c : a)
                System.out.print(c);
        } catch (IOException e) {
            System.out.println("IOException catched:");
            e.printStackTrace();
        } finally {

            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        //try-with-resources
        /*
        try(FileReader fr = new FileReader("E://file.txt")) {
            char [] a = new char[50];
            fr.read(a);
            for(char c : a)
                System.out.print(c);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
