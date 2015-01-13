import java.util.ArrayList;

public class HouseTwoFloor implements House {

	private ArrayList<Integer> stepList;
	
	// Making the default Constructor
	public HouseTwoFloor() {

	}

	// Init the construction
	private void Init() {
		System.out.println("Begin the process to build the house");
	}
	
	private void buildUpBathrooms(){
		System.out.println("Building the bathrooms");
	}
	
	private void buildLivingRoom(){
		System.out.println("This is a living room");
	}
	
	private void buildKitchen(){
		System.out.println("Building a kitchen");
	}
	
	private void buildUpFloors(){
		System.out.println("Building the floors");
	}
	
	private void buildUpRooms(){
		System.out.println("Building the two rooms");
	}
	
	private void finish(){
		System.out.println("Finish");
	}

	public void build() {
		this.Init();
		for(Integer i: this.stepList){
			switch(i){
			case 0: this.buildUpFloors(); break;
			case 1: this.buildUpBathrooms(); break;
			case 2: this.buildUpRooms(); break;
			case 3: this.buildKitchen(); break;
			case 4: this.buildLivingRoom(); break;
			default: System.out.println("This step to build is unknown");
			}
		}
		this.finish();
	}

	public void loadSteps(ArrayList<Integer> list) {
		this.stepList = list;
	}

}
