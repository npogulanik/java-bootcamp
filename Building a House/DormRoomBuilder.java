
public class DormRoomBuilder extends RoomBuilder{

	public DormRoomBuilder()
	{
		super.room = new Room();
	}
	
	public void buildColor(String color) {
		super.room.setColor(color);	
	}

	public void buildFloor(double longer, double width) {
		super.room.setLongDeep(longer);
		super.room.setWidth(width);
	}

	public void buildLong(double longer) {
		super.room.setLongDeep(longer);
	}

	public void buildWidth(double width) {
		super.room.setWidth(width);		
	}
	
	//overload the toString method for show the room data type
	public String toString()
	{
		return "DormRoom - " +this.room.toString();
	}
	
}
