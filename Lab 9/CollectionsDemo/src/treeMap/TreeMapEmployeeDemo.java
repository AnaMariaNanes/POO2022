package treeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEmployeeDemo {
    public static void main(String a[]) {

        //By using name comparator (String comparison)
        TreeMap<Employee, String> tm = new TreeMap<>(new MyNameComp());
        tm.put(new Employee("Ram", 3000), "RAM");
        tm.put(new Employee("John", 6000), "JOHN");
        tm.put(new Employee("Crish", 2000), "CRISH");
        tm.put(new Employee("Tom", 2400), "TOM");
        Set<Employee> keys = tm.keySet();
        for (Employee key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }
        System.out.println("\n\n");

        //By using salary comparator (int comparison)
        TreeMap<Employee, String> trmap = new TreeMap<>(new MySalaryComp());
        trmap.put(new Employee("Ram", 3000), "RAM");
        trmap.put(new Employee("John", 6000), "JOHN");
        trmap.put(new Employee("Crish", 2000), "CRISH");
        trmap.put(new Employee("Tom", 2400), "TOM");
        Set<Employee> ks = trmap.keySet();
        for (Employee key : ks) {
            System.out.println(key + " ==> " + trmap.get(key));
        }
    }
}

class Employee {

    private String name;
    private int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + this.name + "-- Salary: " + this.salary;
    }
}

class MyNameComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class MySalaryComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) return 1;
        if (e1.getSalary() == e2.getSalary()) return 0;
        return -1;
    }
}
