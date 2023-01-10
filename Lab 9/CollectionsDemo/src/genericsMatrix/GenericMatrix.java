package genericsMatrix;

public abstract class GenericMatrix<E extends Number> {
    /**
     * Metoda abstracta pentru adunarea a doua elemente ale matricelor
     */
    protected abstract E add(E o1, E o2);

    /**
     * Metoda abstracta pentru inmultirea a doua elemente ale matricelor
     */
    protected abstract E multiply(E o1, E o2);

    /**
     * Metoda abstracta pentru definirea elementului zero al matricelor
     */
    protected abstract E zero();

    /**
     * Aduna doua matrice
     */
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {

        // Check bounds of the two matrices
        if ((matrix1.length != matrix2.length) ||
                (matrix1[0].length != matrix2[0].length)) {
            throw new RuntimeException(
                    "Matricele au dimensiuni diferite ");
        }
        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];

        // Efectueaza adunarea
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        return result;
    }

    /**
     * Inmulteste doua matrice
     */
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
        // Verifica limitele
        if (matrix1[0].length != matrix2.length) {
            throw new RuntimeException(
                    "Matricele nu au dimensiuni compatibile ");
        }

        // Creaza matricea rezultat
        E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
        // Efectueaza inmultirea a doua matrici
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add(result[i][j],
                            multiply(matrix1[i][k], matrix2[k][j]));
                }
            }
        }
        return result;
    }

    /**
     * Tipareste matricele, operatorul si rezultatul operatiei
     */
    public static void printResult(
            Number[][] m1, Number[][] m2, Number[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++)
                System.out.print(" " + m1[i][j]);
            if (i == m1.length / 2)
                System.out.print(" " + op + " ");
            else
                System.out.print(" ");
            for (int j = 0; j < m2.length; j++)
                System.out.print(" " + m2[i][j]);
            if (i == m1.length / 2)
                System.out.print(" = ");
            else
                System.out.print(" ");
            for (int j = 0; j < m3.length; j++)
                System.out.print(m3[i][j] + " ");
            System.out.println();
        }
    }
}



