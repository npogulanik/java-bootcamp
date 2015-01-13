
public class ClientHouseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HouseBuilder constructor = new HouseBuilder();
		constructor.setHouseType(0);
		constructor.setRoomToBuild(0);
		constructor.setRoomToBuild(2);
		constructor.setRoomToBuild(3);
		constructor.setRoomToBuild(4);
		House myHouse = constructor.getHouse();
		myHouse.build();

	}

}
