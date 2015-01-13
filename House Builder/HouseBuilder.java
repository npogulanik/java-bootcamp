import java.util.ArrayList;


public class HouseBuilder {
	private House myHouse;
	private ArrayList<Integer> list;
	
	public HouseBuilder(){
		this.list = new ArrayList<Integer>();
	}
	
	public void setHouseType(int i){
		if(i == 0){
			this.myHouse = new HouseTwoFloor();
		}
		else{
			this.myHouse = new HouseFourRooms();
		}	
	}
	
	public void setRoomToBuild(int i)
	{
		this.list.add(i);
	}
	
	public House getHouse(){
		this.myHouse.loadSteps(this.list);
		return this.myHouse;
	}
}
