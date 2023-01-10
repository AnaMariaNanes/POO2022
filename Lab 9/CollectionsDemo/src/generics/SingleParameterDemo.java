package generics;

// We use < > to specify Parameter type
public class SingleParameterDemo<T> {

    // An object of type T is declared
    T obj;

    SingleParameterDemo(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        // instance of Integer type
        SingleParameterDemo<Integer> iObj = new SingleParameterDemo<>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        SingleParameterDemo<String> sObj = new SingleParameterDemo<>("One String value.");
        System.out.println(sObj.getObject());

        //Obj = sObj;
    }
}
