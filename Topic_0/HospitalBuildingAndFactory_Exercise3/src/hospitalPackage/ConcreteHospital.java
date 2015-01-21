package hospitalPackage;

/*public class HouseDirector {
	
	private HouseBuilder houseBuilder; 
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
//	}*/
public class ConcreteHospital {

	private HospitalBuilder aHospitalBuilder;
	
	public ConcreteHospital(HospitalBuilder aHospitalBuilder) {
		this.aHospitalBuilder = aHospitalBuilder;
	}
	
	public void constructHospital(){
		aHospitalBuilder.buildKitchen();
		aHospitalBuilder.buildWaitingRoom();
		aHospitalBuilder.buildBathroom();
		aHospitalBuilder.buildBedroom();
		aHospitalBuilder.buildBedroom();
		aHospitalBuilder.buildName();
		aHospitalBuilder.buildSpeciality();
		aHospitalBuilder.buildDepartments();
	}
	
	public Hospital getHospital(){
		return aHospitalBuilder.getHospital();
	}
	
	

}
