package interfaces.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("ab", 20, "278097352001", 1000);
        String filename = "students.txt";

        // Serialization
        try {

            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(student);

            out.close();
            file.close();

            System.out.println("Object has been serialized\n");
            System.out.println(student);

            //student.value = 2000;
            Student.value = 2000;

            Student testStudent  = new Student("Adi", 22, "33333");
            System.out.println("\nTest: " + student.value);


        } catch (Exception e) {
           e.getStackTrace();
        }

        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            Student readStudent = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized\n");
            System.out.println(readStudent);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
