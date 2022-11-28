package exceptions.finallyBlock;

public class FinallyBlockReturnDemo {

    public static void main(String[] args) {
        System.out.println(count());
    }

    public static int count() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally block will execute even after a return statement in a method");
        }
    }
}
