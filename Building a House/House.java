import java.util.ArrayList;

public class House {

	private ArrayList<RoomBuilder> roomsBuilders = new ArrayList<RoomBuilder>();
	private KitchenRoom kitchen;
	private LivingRoom living;

	public House(ArrayList<RoomBuilder> r) {
		this.roomsBuilders = r;
		this.kitchen = new KitchenRoom();
		this.living = new LivingRoom();
		r.add(this.kitchen);
		r.add(living);
	}

	public void addRoomBuilder(RoomBuilder rb) {
		this.roomsBuilders.add(rb);
	}

	public void addRoom(RoomBuilder roomB) {
		this.roomsBuilders.add(roomB);
	}

	public RoomBuilder getRoomBuilder(int index) {
		return this.roomsBuilders.get(index);
	}

	public int countRooms() {
		return this.roomsBuilders.size();
	}

	public RoomBuilder getkitchen(){
		return this.kitchen;
	}
}
