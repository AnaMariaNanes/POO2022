import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

    public String name;
    public int id;

    public EmployeeHashSet(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        EmployeeHashSet emp = (EmployeeHashSet) obj;
        return (emp.name == this.name && emp.id == this.id);
    }

    //a common algorithm is to start with some arbitrary number and
    //to repeatedly multiply it with another (often a small prime) before adding a field’s hash:
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + this.id;
        return result;
    }

    public static void main(String[] args) {

        EmployeeHashSet emp1 = new EmployeeHashSet(1, "John");
        EmployeeHashSet emp2 = new EmployeeHashSet(1, "John");

        System.out.println("Emp1 name :" + emp1.name + ", ID : " + emp1.id);
        System.out.println("Emp2 name :" + emp2.name + ", ID : " + emp1.id);

        //comparing both objects
        System.out.println("Equality between emp1 and emp2 objects = " + emp1.equals(emp2));

        System.out.println("emp1 has hashcode = " + emp1.hashCode());
        System.out.println("emp2 has hashcode = " + emp2.hashCode());

        Set<EmployeeHashSet> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        System.out.println(employees);
    }
}
