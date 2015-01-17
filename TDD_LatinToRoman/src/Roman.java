

public class Roman {

	private String latin;
	
	public Roman(String latin){
		this.latin = latin;
	}
	
	public int toLatin(){
		return RomanDigit.valueOf(latin).latin;
	}
		
	enum RomanDigit
	{
	  I(1),II(2),V(5),X(10);
	  private final int latin;
	  RomanDigit(int latin)
	  {
		  this.latin = latin;
	  }
	}
		
}
