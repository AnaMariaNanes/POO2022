package inheritance;

public class BaseAndSubDemo {

    public static void main(String[] args) {
        Sub s = new Sub();
        Base b = s;

        // method overrifing testing
        System.out.println(s.getField());
        System.out.println(b.getField());

        System.out.println(((Sub)b).getField());
        System.out.println(((Base)s).getField());
    }
}
