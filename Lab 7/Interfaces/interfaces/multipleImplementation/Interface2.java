package interfaces.multipleImplementation;

public interface Interface2 {

    default void show()
    {
        System.out.println("show from Interface2");
    }

    default void show_2()
    {
        System.out.println("show from Interface2");
    }
}
