package hospitalPackage;
import java.util.ArrayList;

public class Hospital {
	
	public String name;
	private ArrayList<String> bathroom;
	private ArrayList<String> bedroom;
	private String waitingRoom;
	private String speciality;
	private ArrayList<String> departments;
	private String Kitchen;
	
	public Hospital(){
		bedroom = new ArrayList<String>();
		bathroom = new ArrayList<String>();
		departments = new ArrayList<String>();
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
		return bathroom;
	}

	public void setBathroom(ArrayList<String> bathroom) {
		this.bathroom = bathroom;
	}

	public ArrayList<String> getBedroom() {
		return bedroom;
	}

	public void setBedroom(ArrayList<String> bedroom) {
		this.bedroom = bedroom;
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
		return departments;
	}

	public void setDepartments(ArrayList<String> departments) {
		this.departments = departments;
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
