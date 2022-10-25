public class NameModifier {

    public static void main(String[] args) {
        Person person = new Person("Initial Person");

        modifyName1(person);
        System.out.println("Method modify1(Person p): " + person.getName());

        System.out.println();

        modifyName2(person);
        System.out.println("Method modify2(Person p): " + person.getName());
    }

    public static void modifyName1(Person p) {
        p = new Person("Daniela");
        System.out.print(p.getName());
    }

    public static void modifyName2(Person p) {
        p.setName("Cornel");
        System.out.print(p.getName());
    }
}
