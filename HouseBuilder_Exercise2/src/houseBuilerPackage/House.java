package houseBuilerPackage;
import java.util.ArrayList;
public class House {
	
	private ArrayList<String> bathroom;
	private ArrayList<String> bedroom;
	private String kitchen;
	private String livingRoom;
	
	public House(){
		bedroom = new ArrayList<String>();
		bathroom = new ArrayList<String>();
	}
	
	public String getBathroom(){
		String sentence = " ";
		for(int i = 0; i < bathroom.size(); i ++ ){
			sentence = bathroom.get(i);
		}
		return sentence;	
	}
	
	public void setBathroom(String aBathroom) {
		bathroom.add(aBathroom);
	}
	
	public String getBedroom() {
		String sentence = " ";
		for(int i = 0; i < bedroom.size(); i ++ ){
			sentence = bedroom.get(i);
		}
		return sentence;
	}
	
	public void setBedroom(String aBedroom) {
		bedroom.add(aBedroom);
	}
	
	public String getKitchen() {
		return kitchen;
	}
	
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	public String getLivingRoom() {
		return livingRoom;
	}
	public void setLivingRoom(String livingRoom) {
		this.livingRoom = livingRoom;
	}
	
	public String toString(){	
		
		String varBathrooms = this.getBathroom();
		String varBedrooms = this.getBedroom();
		
		return("\nLivingRoom: " +livingRoom
			+"\nKitchen: "+kitchen
			+"\nNumber of bathrooms: " + bathroom.size()
			+"\nBathroom description: " + varBathrooms
			+"\nBathroom: "+bathroom
			+"\nBedrooms description: " + varBedrooms 
			+"\nNumber of Bedrooms: "+bedroom.size());			
	}
	
}
