package exceptions.date;

public class DateFormatChecker {

    public static void checkDate() throws WrongDayException {
        int dayOfWeek = (new java.util.Date()).getDay();
        if (dayOfWeek != 2 && dayOfWeek != 4)
            throw new WrongDayException("Tue. or Thur.");
        System.out.println("Did it");
    }
}
