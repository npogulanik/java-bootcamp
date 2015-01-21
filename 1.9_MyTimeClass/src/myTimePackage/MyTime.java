package myTimePackage;

public class MyTime {
	
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second) {  
		  this.setTime(hour, minute, second);
	}
		
	public void setTime(int hour, int minute, int second){
	
		if(((0 <= hour) && ( hour <= 23)) 
			&&((0 <= minute) && (minute <= 59)) 
			&& ((0 <= second) && (second <= 59))){
				this.setHour(hour);
				this.setMinute(minute);
				this.setSecond(second);
		}
		else{
			throw (new IllegalArgumentException("Invalid hour, minute, or second!"));
		}
	}
	
	public void setHour(int hour){
		if((0 <= hour) && ( hour <= 24)){
			this.hour = hour;
		}
		else{
			throw (new IllegalArgumentException("Invalid hour!"));
		}
	}
	
	public void setMinute(int minute){
		if((0 <= minute) && (minute <= 59)){
			this.minute = minute;
		}
		else{
			throw (new IllegalArgumentException("Invalid minute!"));
		}
	}
	
	public void setSecond(int second){
		if((0 <= second) && (second <= 59)){
			this.second = second;
		}
		else{
			throw (new IllegalArgumentException("Invalid second!"));
		}
	}
	
	public String toString(){
		return (hour + ":" + minute + ":" + second);
	}
	
    public int nextSecond(){
    	if(second != 59){
    		return(second +1);
    	}
    	else{
    		return(0);
    	}
    }
	
	public int nextMinute(){
		if(minute != 59){
    		return(minute +1);
    	}
    	else{
    		return(0);
    	}
	}
	
    public int nextHour(){
    	if(hour != 23){
    		return(hour +1);
    	}
    	else{
    		return(0);
    	}
    }
    
    public int previousSecond(){
    	if(second != 0){
    		return(second - 1);
    	}
    	else{
    		return(59);
    	}
    }
    
    public int previousMinute(){
    	if(minute != 0){
    		return(minute - 1);
    	}
    	else{
    		return(59);
    	}
    }
    
    public int previousHour(){
    	if(hour != 0){
    		return(hour - 1);
    	}
    	else{
    		return(23);
    	}
    }

}
