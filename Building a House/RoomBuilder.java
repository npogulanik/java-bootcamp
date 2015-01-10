
public abstract class RoomBuilder {

	protected Room room;
	
	public Room getRoom(){
		return this.room;
	}
	public void createRoom(){
		this.room = new Room();
	}
	
	public abstract void buildFloor(double longer, double width);
	public abstract void buildLong(double longer);
	public abstract void buildWidth(double width);
	public abstract void buildColor(String color);
}
