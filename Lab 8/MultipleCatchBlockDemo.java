public class MultipleCatchBlockDemo {
    public static void main(String[] args) {

        try {
            int array[] = new int[5];

            System.out.println(array[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }
    }
}
