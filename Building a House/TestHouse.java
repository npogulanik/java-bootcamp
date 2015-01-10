import java.util.ArrayList;

public class TestHouse {

	/**
	 * @param args
	 * @author Gonza
	 */
	public static void main(String[] args) {
		// Making a DormRoom
		RoomBuilder dormRoom = new DormRoomBuilder();
		dormRoom.buildColor("Blue");
		dormRoom.buildFloor(2.5, 5.4);

		// Making a BathRoom
		RoomBuilder bathRoom = new BathRoomBuilder();
		bathRoom.buildColor("Cyan");
		bathRoom.buildFloor(1.2, 8.3);

		ArrayList<RoomBuilder> list = new ArrayList<RoomBuilder>();
		list.add(dormRoom);
		list.add(bathRoom);

		House myHouse = new House(list);
		System.out.println("The house have " + myHouse.countRooms() + " rooms");
		for (int i = 0; i < myHouse.countRooms(); i++) {
			System.out.println(myHouse.getRoomBuilder(i));
		}

		/*
		 * The output after run the program is:
		 * The house have 4 rooms
		 * DormRoom - Room: long = 2.5; width = 5.4; color = Blue
		 * BathRoom - Room: long = 1.2; width = 8.3; color = Cyan
		 * Elements of the Bathroom:
		 *	a toilet
		 *	a shower
		 *	a washer
		 * KitchenRoom - Room: long = 1.0; width = 1.0; color = White
		 * Elements of the kitchen:
		 *	a oven
		 *	a refrigerator
		 *	a microwave
		 *	a table
		 * LivingRoom - Room: long = 1.0; width = 1.0; color = White
		 */
	}

}
