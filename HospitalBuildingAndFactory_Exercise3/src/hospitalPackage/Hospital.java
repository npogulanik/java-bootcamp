package hospitalPackage;
import java.util.ArrayList;

public class Hospital {
	
	private String name;
	private ArrayList<String> bathroom = new ArrayList<String>();
	private ArrayList<String> bedroom = new ArrayList<String>();;
	private String waitingRoom;
	private String speciality;
	private ArrayList<String> departments = new ArrayList<String>();
	private String Kitchen;
	
	public Hospital(){
		
	}
	
	public String getKitchen() {
		return Kitchen;
	}

	public void setKitchen(String kitchen) {
		Kitchen = kitchen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getBathroom() {
		ArrayList<String> bath = new ArrayList<String>();
		for( int i = 0; i <= bathroom.size(); i++){
			bath.add(bathroom.get(i));
		}
		return bath;
	}

	public void addBathroom(String bathroom) {
		this.bathroom.add(bathroom);
	}

	public ArrayList<String> getBedroom() {
		ArrayList<String> bed = new ArrayList<String>();
		for( int i = 0; i <= bedroom.size(); i++){
			bed.add(bedroom.get(i));
		}
		return bed;
	}

	public void addBedroom(String bedroom) {
		this.bedroom.add(bedroom);
	}

	public String getWaitingRoom() {
		return waitingRoom;
	}

	public void setWaitingRoom(String waitingRoom) {
		this.waitingRoom = waitingRoom;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public ArrayList<String> getDepartments() {
		ArrayList<String> dept = new ArrayList<String>();
		for( int i = 0; i <= departments.size(); i++){
			dept.add(departments.get(i));
		}
		return dept;
	}

	public void addDepartments(String departments) {
		this.departments.add(departments);
	}
	
	public String toString(){
		System.out.println(" Hospital " + name);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		return " ";
	}

}
