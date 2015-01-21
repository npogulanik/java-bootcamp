package hospitalPackage;

public class DepartmentFactory {
	
	public Department getDepartment(String type) {
		if ("Pediatric".equals(type)) {	
			return new Pediatric();
		} 
		if("Pathological".equals(type)){
			return new Pathological();
		}
		else{
			return new Pediatric();
		}
	}

}
