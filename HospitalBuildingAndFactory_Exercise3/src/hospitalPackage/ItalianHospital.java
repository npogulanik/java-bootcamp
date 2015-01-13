package hospitalPackage;

import java.util.ArrayList;


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
		ArrayList<String> dept = new ArrayList<String>();
		hospital.setDepartment(dept.DepartmentsFactory.getDepartments("pathological"));
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
		private ArrayList<String> b = new ArrayList<String>();
		for(int i = 0; i <= 3 ; i++){
			b.add("Female bathroom. Color Green");
			b.add("Male bathroom. Color Green");
		}
		hospital.setBathroom(b);
	}
	
	
	@Override
	public void buildBedroom(){
		private ArrayList<String> b = new ArrayList<String>();
		for(int i = 0; i <= 3 ; i++){
			b.add("Single Bedroom. Low Price. ";
			b.add("Double Bedroom. Medium Price. ");
		}
		hospital.setBedroom(b);
			
	}
	
	
	@Override 
	public void buildName(){
		hospital.setName("Italian Hospital");
	}
	
	@Override
	public Hospital getHospital(){
		return hospital();
	}
	
	
}
