package generics;

public class GenericFunctionDemo {

    // A Generic method example
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(103);

        // Calling generic method with String argument
        genericDisplay("John is here.");

        // Calling generic method with double argument
        genericDisplay(35.2);
    }
}
