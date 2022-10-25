import javax.swing.*;
import java.util.Scanner;

public class IntroScanner {
    public static void main(String[] args) {
//        String nume;
//        Scanner input_scanner = new Scanner(System.in);
//
//        System.out.println("Care e numele tau, prietene?");
//        nume = input_scanner.nextLine();
//
//        System.out.println("Du-ma la seful vostru, " + nume);
//
//        System.out.println("Introduceti un intreg: ");
//        int int_value = input_scanner.nextInt();
//        System.out.println("Numarul de tip intreg citit este: " + int_value);
//
//        float float_value;
//        System.out.println("Introduceti un numar real: ");
//        float_value = input_scanner.nextFloat();
//        System.out.println("Numarul de tip float citit este: " + float_value);

        int valoare_int = getInt("Introduceti un intreg.");
        System.out.println("Numarul introdus este: " + valoare_int );

//        input_scanner.close();
    }

    public static int getInt(String mess) {
        int int_value;
        while (true) {
            String s = JOptionPane.showInputDialog(null, mess);
            try {
                System.out.println("A intrat in blocul try.");
                int_value = Integer.parseInt(s);
                System.out.println("A iesit din blocul try.");
                break;
            } catch (NumberFormatException nx) {
                JOptionPane.showMessageDialog(null, "Introduceti un intreg valid!");
            }
        }
        return int_value;
    }
}