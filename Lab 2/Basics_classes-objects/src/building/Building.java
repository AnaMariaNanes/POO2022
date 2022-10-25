package building;

public class Building {

    private int floorsIndex = 0;
    public Address address = new Address();
    public Floor[] floors = new Floor[10];

    public void addFloor(Floor floor) {
        floors[floorsIndex++] = floor;
    }

    public String describeYourself() {
        return "";
    }
}
