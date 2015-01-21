package houseBuilerPackage;

public class HouseDemo {

	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new IgluBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println("Description of the Iglu: "+house+"\n");

	}

}
 