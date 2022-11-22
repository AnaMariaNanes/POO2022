package interfaces.cloning;

public class CloningDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Daniel", "Smith", 21);
        Employee employee2 = employee1;
        Employee employee3;

        try {
            //clone the Employee object
            employee3 = (Employee) employee1.clone();

            System.out.println(employee1.getFirstName());
            System.out.println(employee3.getFirstName());
            System.out.println();

            //check the addresses
            System.out.println("Employee1: " + employee1);
            System.out.println("Employee2: " + employee2);
            System.out.println("Employee3: " + employee3);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
