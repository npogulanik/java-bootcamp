package Ej9;
public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>23 || hour <0 ){
			throw new IllegalArgumentException("Error: Invalid hour!.");
		}else{
		this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>59 || minute <0 ){
			throw new IllegalArgumentException("Error: Invalid minute!.");
		}else{
		this.minute = minute;
		}		
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second>59 || second <0 ){
			throw new IllegalArgumentException("Error: Invalid second!.");
		}else{
		this.second = second;
		}
	}
	public void setTime(int hour, int minute, int second){
		if (0 < hour|| hour<24 || minute>60|| second>60|| minute<0|| second<0){
			throw new IllegalArgumentException("Error: Invalid hour, minute, or second!.");
		}
	}
	@Override
	public String toString() {
		return this.getHour() + ":" + this.getMinute() + ":" +this.getSecond();
	}
	public MyTime nexSecond(){
		if (this.second== 59 && this.minute == 59 && this.hour==23){
			this.second=0;
			this.minute=0;
			this.hour=0;
		}else if( second ==59 && this.minute ==59){
			this.second=0;
			this.minute=0;
			this.hour=this.hour+1;
		}else if(this.second==59){
			this.second=0;
				
		}else {
			this.second=this.second+1;
		}
		MyTime time=new MyTime(this.hour, this.minute, this.second);
		return time;
	}
	public MyTime nexMinute(){
		if (this.minute == 59 && this.hour==23){
			this.minute=0;
			this.hour=0;
		}else if( this.minute ==59){
			this.minute=0;
			this.hour=this.hour+1;		
		}else {
			this.minute=this.minute+1;
			this.hour=this.hour+1;
		}
		MyTime time=new MyTime(this.hour, this.minute, this.second);
		return time;
	}
	public MyTime nexHour(){
			if (this.hour==23) {				
				this.hour=0;			
			} else {				
				this.hour=this.hour+1;
			}
			MyTime time=new MyTime(this.hour, this.minute, this.second);
			return time;		
	}
	public MyTime previusSecond(){
		if (this.second== 0 && this.minute == 0 && this.hour==0){
			this.second=59;
			this.minute=59;
			this.hour=23;
		} else if(this.second==0 && this.minute == 0){
			this.second=59;
			this.minute=59;
			this.hour=this.hour-1;
		}else if(this.second==0){
			this.second=59;
			this.minute=this.minute-1;
			this.hour=this.hour-1;					
		}		
		MyTime time=new MyTime(this.hour, this.minute, this.second);
		return time;		
	}
	public MyTime previusMinute(){
		if (this.minute == 0 && this.hour==0){			
			this.minute=59;
			this.hour=23;
		} else if(this.minute == 0){			
			this.minute=59;
			this.hour=this.hour-1;
		}else {			
			this.minute=this.minute-1;		
	}
		MyTime time=new MyTime(this.hour, this.minute, this.second);
		return time;
		}
	public MyTime previusHour(){
		if (this.hour==0){
			this.hour=23;
		}else {
			this.hour=this.hour-1;
		}
		MyTime time=new MyTime(this.hour, this.minute, this.second);
		return time;		
	}
}