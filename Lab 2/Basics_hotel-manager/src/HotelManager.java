
public class HotelManager {

    private static final int FIRST_ROOM_NUMBER = 0;
    private static final int LAST_ROOM_NUMBER = 919;

    public static void main(final String[] args) {
//        isClean(-10);
//        isClean(200);
//        isClean(190);
//        isClean(3);
//
//        isClean(10);
//        isClean(14);
//        isClean(400);
    }

    /**
     * If on second floor then not clean (e.g. 200) If on any other floor and even
     * number then clean Not clean otherwise
     *
     * @param roomNumber XAA (X - floor number, AA - 0->19 room number) < 0 && > 920
     *                   .. 655 invalid room number 0->19 is valid room number
     * @return
     */
    public static boolean isClean(int roomNumber) {

        if (roomNumber >= FIRST_ROOM_NUMBER && roomNumber <= LAST_ROOM_NUMBER) {
            if (roomNumber / 100 != 2 && roomNumber % 2 == 0) {
                if (roomNumber % 100 < 20) {
                    System.out.println("Room " + roomNumber + " is clean");
                    return true;
                }
            }
        }
        System.out.println("Room " + roomNumber + " is not clean or invalid");
        return false;
    }
}
