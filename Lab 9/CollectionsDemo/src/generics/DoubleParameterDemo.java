package generics;

// We use < > to specify Parameter type
class DoubleParameterDemo<T, U> {
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    DoubleParameterDemo(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        DoubleParameterDemo<String, Integer> testObject1 = new DoubleParameterDemo<>("A String value.", 22);
        testObject1.print();
        System.out.println();

        DoubleParameterDemo<Double, Boolean> testObject2 = new DoubleParameterDemo<>(47.5, false);
        testObject2.print();
        System.out.println();
    }
}
