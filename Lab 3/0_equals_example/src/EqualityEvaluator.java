public class EqualityEvaluator {

    public static void main(String[] args) {
        evaluateStringEquality();

        System.out.println("");

        evaluateStudentEquality();
    }

    public static void evaluateStringEquality() {
        String s1 = new String("John");
        String s2 = new String("John");
        String s3 = s1; //references of the same object

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + (s1.equals(s2)));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + (s1.equals(s3)));
    }

    public static void evaluateStudentEquality() {
        Student studentDaniel = new Student("Daniel", 1998, "100896");
        Student studentDanielMihai = new Student("Daniel", 1998, "100896");
        Student studentAndrei = new Student("Andrei", 1997, "100895");
        Student studentAlina = new Student("Alina", 1997, "1000942");

        System.out.println(studentDaniel == studentDanielMihai);
        System.out.println(studentDaniel.equals(studentDanielMihai));
        System.out.println(studentDaniel == studentAndrei);
        System.out.println(studentAlina.equals(studentAndrei));
    }
}
