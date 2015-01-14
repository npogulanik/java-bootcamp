package hospitalPackage;

public class ItalianHospital implements HospitalBuilder {

	private Hospital hospital;
	
	public ItalianHospital(){
		hospital = new Hospital();
	}
	
	@Override 
	public void buildSpeciality(){
		hospital.setSpeciality("pathological");
	}
	
	@Override
	public void buildDepartments(){
		DepartmentFactory deptFactory = new DepartmentFactory();
		Department d = deptFactory.getDepartment("Pathological");
		hospital.setDepartments(d.getDescription());
		

	}
	
	
	@Override
	public void buildKitchen(){
		hospital.setKitchen("Small. Mesures: 5m x 4m x 2m");
	}
	
	@Override
	public void buildWaitingRoom(){
		hospital.setWaitingRoom("Includes small chimney to make it cosy.");
	}
	
	@Override
	public void buildBathroom(){
		hospital.setBathroom("Female bathrooms: 10 cubicules, color Green. \nMale bathrooms: 10 cubicles, Color Green. ");
	}
	
	
	@Override
	public void buildBedroom(){
		hospital.setBedroom("High cost: 50 single bedroom with premium attention.\nMedium cost: 35 double bebooms.\nLow cost: No low cost boedrooms in this Hospital.");
			
	}
	
	
	@Override 
	public void buildName(){
		hospital.setName("Italian Hospital");
	}
	
	@Override
	public Hospital getHospital(){
		return hospital;
	}
	
	
}
