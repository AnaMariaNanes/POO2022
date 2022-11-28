package exceptions.date;

public class WrongDayException extends Exception {

    public WrongDayException() {
    }

    public WrongDayException(String msg) {
        super(msg);
    }
}
