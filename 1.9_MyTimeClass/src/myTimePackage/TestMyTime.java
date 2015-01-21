package myTimePackage;

public class TestMyTime {

	public static void main(String[] args) {
		
		MyTime aTime = new MyTime(7,5,7);
		System.out.println(aTime.toString());
		System.out.println(aTime.nextHour());
		System.out.println(aTime.nextMinute());		
		System.out.println(aTime.nextSecond());
		
		System.out.println(aTime.previousHour());
		System.out.println(aTime.previousMinute());
		System.out.println(aTime.previousSecond());
		
	}

}
