public class Student {

    private String name;
    private int yearOfBirth;
    private String studentID;

    Student(String name, int yearOfBirth, String studentID) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.studentID = studentID;
    }

    @Override
    public boolean equals(Object student) {
        if (!(student instanceof Student)) {
            return false;
        }
        Student studentToCompare = (Student) student;
        return name == studentToCompare.name &&
                yearOfBirth == studentToCompare.yearOfBirth &&
                studentID == studentToCompare.studentID;
    }
}
