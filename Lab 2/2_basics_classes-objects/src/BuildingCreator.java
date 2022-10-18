import building.Building;
import building.Floor;
import building.Room;

public class BuildingCreator {

	public static void main(String[] args) {
		Room room = new Room();
		room.number = 10;

		Floor floor = new Floor();
		floor.addRoom(room);

		Building building = new Building();
		building.addFloor(floor);
		
		room.number = 200;
		
		System.out.println(building.floors[0].rooms[0].number);
		
		building.describeYourself();
	}
}
