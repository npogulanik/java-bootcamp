package hospitalPackage;

public class Hospital {
	
	private String name;
	private String bathroom;
	private String bedroom;
	private String waitingRoom;
	private String speciality;
	private String departments;
	private String kitchen;
	
	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBathroom() {
		
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String getBedroom() {		
		return bedroom;
	}

	public void setBedroom(String bedroom) {
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

	public String getDepartments() {	
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}
	
	public String toString(){
		
		return   name
				+"\nBathrooms: " + bathroom
				+"\nBedrooms: " + bedroom
				+"\nKitchen: " + kitchen
				+"\nWaitingRoom: " + waitingRoom
				+"\nSpeciality: " + speciality
				+"\nDepartments: " + departments;
	}

}
