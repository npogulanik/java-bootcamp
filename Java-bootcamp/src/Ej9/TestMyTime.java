package Ej9;
import java.util.Scanner;
public class TestMyTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("----Test My Tyme App!----");
		MyTime time = new MyTime(23,59,59);
		System.out.println(time.toString());
		time.nexSecond();
		System.out.println(time.toString());		
		time.previusSecond();
		System.out.println(time.toString());
		System.out.println("set the hour: ");
		int h= in.nextInt();
		System.out.println("se the minute: ");
		int m= in.nextInt();
		System.out.println("set the seconds");
		int s= in.nextInt();
		MyTime time2 = new MyTime(h,m,s);
		time2.setHour(h);
		time2.setMinute(m);
		time2.setSecond(s);
		System.out.println("the time is: "+time2.toString());		
		System.out.println("and the sext second is: ");
		time2.nexSecond();
		System.out.println("the time is: "+time2.toString());
	}
}
