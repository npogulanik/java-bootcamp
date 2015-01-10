
public class LivingRoom extends RoomBuilder{

	//Making a simple constructor
	public LivingRoom(){
		super.room = new Room();
	}
	
	@Override
	public void buildColor(String color) {
		super.room.setColor(color);
	}

	@Override
	public void buildFloor(double longer, double width) {
		super.room.setLongDeep(longer);
		super.room.setWidth(width);
	}

	@Override
	public void buildLong(double longer) {
		super.room.setLongDeep(longer);
	}

	@Override
	public void buildWidth(double width) {
		super.room.setWidth(width);
	}

	public String toString() {
		return "LivingRoom - " + super.room.toString();
	}

	
}
