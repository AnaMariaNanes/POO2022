package interfaces.multipleImplementation;

public interface Interface1 {

    default void show()
    {
        System.out.println("show from Interface1");
    }

    default void show_1()
    {
        System.out.println("show from Interface1");
    }
}
