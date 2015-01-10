
public class KitchenRoom extends RoomBuilder {

	private String oven;
	private String refrigerator;
	private String microwave;
	private String table;
	
	public KitchenRoom(){
		this.oven = "a oven";
		this.refrigerator = "a refrigerator";
		this.microwave = "a microwave";
		this.table = "a table";
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
	
	//Overload the toString method to show data kitchen
	public String toString(){
		return "KitchenRoom - " + super.room.toString() + "\nElements of the kitchen:\n\t" + this.oven + "\n\t" + this.refrigerator + "\n\t" + this.microwave + "\n\t" + this.table;
	}

}
