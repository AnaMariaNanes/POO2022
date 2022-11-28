package exceptions.finallyBlock;

public class FinallyBlockExitDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            System.exit(0);
        } finally {
            System.out.println("Finally block was executed.");
        }
    }
}
