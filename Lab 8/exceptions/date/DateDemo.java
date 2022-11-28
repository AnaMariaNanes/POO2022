package exceptions.date;

public class DateDemo {
    public static void main(String[] argv) {
        try {
            DateFormatChecker.checkDate();
        } catch (WrongDayException e) {
            System.out.println("The date is not " + e.getMessage());
        }
    }
}
