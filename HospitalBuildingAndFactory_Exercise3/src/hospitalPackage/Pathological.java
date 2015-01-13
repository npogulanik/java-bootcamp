package hospitalPackage;

import java.util.ArrayList;

public class Pathological extends Departments{
	
	public  Pathological(){
		
		getDepartments();
		
	}
	
	@Override
	public ArrayList<String> getDepartments( ){
		
		ArrayList<String> dept = new ArrayList<String>();
		dept.add("Laboratory");
		dept.add("Emergency room");
		dept.add("Oncology");	
		return dept;
	
	}

}
