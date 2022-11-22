package interfaces.serializable;

import java.io.Serializable;

public class Student {

    private static final long serialversionUID = 129348938L;

    String name;
    int age;

    transient String cnp; // will not be serialized
    static int value;

    public Student(String name, int age, String cnp, int value) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.value = value;
    }

    public Student(String name, int age, String cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public String toString() {
        return "name = " + name + "\n" +
                "age = " + age + "\n" +
                "cnp = " + cnp + "\n" +
                "value = " + value;
    }
}
