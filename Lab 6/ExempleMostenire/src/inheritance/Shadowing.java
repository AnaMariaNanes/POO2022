package inheritance;

public class Shadowing {

    public static void main(String[] args) {
        Sub sub = new Sub();
        Base base = sub;

        // variable shadowing
        System.out.println(sub.field);
        System.out.println(((Base) sub).field);

        System.out.println(base.field);
        System.out.println(((Sub) base).field);
    }
}
