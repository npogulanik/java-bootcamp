package hospitalPackage;



public interface HospitalBuilder {
	
	public void buildName();
	public void buildKitchen();
	public void buildWaitingRoom();
	public void buildBathroom();
	public void buildBedroom();
	public void buildSpeciality();
	public void buildDepartments();
	Hospital getHospital();
}
