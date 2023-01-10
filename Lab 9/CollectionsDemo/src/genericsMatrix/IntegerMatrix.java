package genericsMatrix;

public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override
    /** Aduna doi intregi */
    protected Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }

    @Override
    /** Inmulteste doi intregi */
    protected Integer multiply(Integer o1, Integer o2) {
        return o1 * o2;
    }

    @Override
    /** Specifica zero pentru un intreg */
    protected Integer zero() {
        return 0;
    }
}
