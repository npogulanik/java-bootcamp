package houseBuilerPackage;

public class IgluBuilder implements HouseBuilder {
	
	private House house;
	
	public IgluBuilder() {
		house = new House();
	}
	
	@Override
	public void buildKitchen(){
		house.setKitchen("Frozen kitchen.");
	}
	
	@Override
	public void buildLivingRoom(){
		house.setLivingRoom("Includes small chimney to make it cosy.");
	}
	
	@Override
	public void buildBathroom(){
		house.setBathroom("Cold, very cold...");
		house.setBathroomNum(1);
	}
	
	@Override
	public void buildBedroom(){
		house.setBedroom("Human heat and balankets make a good enviroment of them. ");
		house.setBedroomNum(2);	
	}
	
	@Override
	public House getHouse(){
		return house;
	}

}
