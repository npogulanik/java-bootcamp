package Ej10;
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
	}
	public MyDate(int year, int month, int day) {	
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year<=9999 & year >=0 ){
		this.year = year;}
		else{
			throw new IllegalArgumentException("Error: invalid year");
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month <=12 & month >=1){
		this.month = month;
		}else {
			throw new IllegalArgumentException("Error: invalid month");
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if ((month==4 ||month==6 ||month==9 ||month==11)& day<31){
			this.day = day;
		}else if(month==2 & isLeapYear(year)& day< 30){
			this.day = day;
		}else if(month==2 & day<29){
			this.day = day;
		}else {
			throw new IllegalArgumentException("Error: invalid day");
		}		
	}	
	private String[] strMonths={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dic"};
	private String[] strDays={"Sunday","Monday","Tuesday","Wendsday","Thursday","Friday","Satrday"};
	private int[] daysInMonths={31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
	public boolean isLeapYear(int year){
		boolean check=false; 
		if (year%4==0){
			check = true;
		}
		return check;
	}
	public boolean isValidDate(int year, int month, int day){
		boolean check=true;
		
		
		
		
		
		
		
		
		if ((day<31 && day>=0)&& (year<=9999 && year >=0)){
			if ((month==4 ||month==6 ||month==9 ||month==11)& day<31){
				check=true;				
			}else if(month==2 & this.isLeapYear(year)& day< 30){
				check=true;
			}else if(month==2 & day<29){
				check=true;
			}else {
				check = false;
			}
		}else{check = false;}
		
		return check;
	}
	public int getDayOfWeek(int year, int month, int day){
		int dw=0;
		dw = ((day+month+year+(year/100)+(year/4))%7);
		return dw;
	}
	public void setDate(int year, int month, int day){
		if(this.isValidDate(year, month, day)){
			this.day=day;
			this.month=month;
			this.year=year;
		}else {
			throw new IllegalArgumentException("Error: invalid day, month or year");
		}
	}
	public String toString(){
		return this.strDays[this.getDayOfWeek(getYear(), getMonth(), getDay())-1]+
				" "+this.getDay()+" "+(this.strMonths[(this.getMonth()-1)])+
				" "+this.getYear();
	}
	public MyDate nextYear(){
		MyDate md = new MyDate();
		if (this.getYear()<=9999){
		md.setYear(this.getYear()+1);		
		} else{throw new IllegalArgumentException("Error: year out of range!");
		}
		return md;
	}
	public MyDate previousYear(){
		MyDate md = new MyDate(this.getYear(),this.getMonth(),this.getDay());
		if (this.getYear()>0){
		md.setYear(this.getYear()-1);
		}else {
			md.setYear(9999);
		}
		return md;
	}
	public MyDate nextMonth(){
		MyDate md = new MyDate(this.getYear(),this.getMonth(),this.getDay());
		if (this.getMonth()==12){
			md.setDate(this.getYear()+1,1,this.getDay());			
		}else{
			md.setDate(this.getYear(),this.getMonth()+1,this.getDay());
		}
		return md;
	}
	public MyDate previousMonth(){
		MyDate md = new MyDate(this.getYear(),this.getMonth(),this.getDay());
		if (this.month==1){
			md.setMonth(12);
			md.setYear(year-1);
		}else{
			md.setMonth(this.getMonth()-1);
		}
		return md;
	}	
	public MyDate nextDay(){
	MyDate md = new MyDate(this.getYear(),this.getMonth(),this.getDay());
	if ((month==4 ||month==6 ||month==9 ||month==11)& day<30){
		md.setDate(getYear(), getMonth(), getDay()+1);;				
	}else if((month==4 ||month==6 ||month==9 ||month==11)& day==30){
		md.setDate(getYear(), getMonth()+1, 1);;
	}else if(month==2 & day<29){
		md.setDate(getYear(), getMonth(), getDay()+1);;
	}else if(month==2 & isLeapYear(this.getYear())& day== 29){
		md.setDate(getYear(), getMonth()+1, 0);
	}md.setDay(day+1);
	return md;
	}
	public MyDate previousDay(){
		MyDate md = new MyDate(this.getYear(),this.getMonth(),this.getDay());
		if ((month==4 ||month==6 ||month==9 ||month==11)& day==1){
			md.setDate(getYear(), getMonth()-1, 31);				
		}else if((month==4 ||month==6 ||month==9 ||month==11)& day>0){
			md.setDate(getYear(), getMonth(), this.getDay()-1);;
		}else if(month==1 & day==1){
			md.setDate(getYear()-1, getMonth()-1, 31);
		}else if(month==3 & isLeapYear(this.getYear())& day== 1){
			md.setDate(getYear(), 2, 29);
		}
		return md;
	}
}
