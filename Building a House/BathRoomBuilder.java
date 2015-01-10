
public class BathRoomBuilder extends RoomBuilder {

	private String toilet;
	private String washer;
	private String shower;
	
	public BathRoomBuilder(){
		this.toilet = "a toilet";
		this.washer = "a washer";
		this.shower = "a shower";
		this.room = new Room();
	}
	
	public void buildColor(String color) {
		super.room.setColor(color);
	}

	//Make a dimension of floor (large and width in pounds)
	public void buildFloor(double longer, double width) {
		super.room.setLongDeep(longer);
		super.room.setWidth(width);
	}

	//Consist in the large of the room
	public void buildLong(double longer) {
		super.room.setLongDeep(longer);
	}

	//Consist in the width (pounds) of the room
	public void buildWidth(double width) {
		super.room.setWidth(width);
	}
	
	//Overload the toString method to show a personalized output
	public String toString()
	{
		return "BathRoom - " +this.room.toString() + "\nElements of the Bathroom:\n\t" + this.toilet + "\n\t" + this.shower + "\n\t" + this.washer;
	}
}
