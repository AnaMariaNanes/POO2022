import java.util.Scanner;

public class ArithMeticExceptionDemo {
    public static void main(String[] args) {
        int value = 50;

        System.out.println("Introduce a number to divide with: ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        int data;
        try {
            data = value / number;
            System.out.println("The result is: " + data);
        } catch (Exception e) {
            System.out.println("Division by zero.");
        }

        //add finally block
        //
    }
}
