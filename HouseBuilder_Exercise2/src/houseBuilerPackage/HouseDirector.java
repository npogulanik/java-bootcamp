package houseBuilerPackage;

public class HouseDirector {
	
	private HouseBuilder houseBuilder; 
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse(){
		houseBuilder.buildKitchen();
		houseBuilder.buildLivingRoom();
		houseBuilder.buildBathroom();
		houseBuilder.buildBedroom();
		houseBuilder.buildBedroom();
	}
	
	public House getHouse(){
		return houseBuilder.getHouse();
	}

}
