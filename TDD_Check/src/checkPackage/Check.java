package checkPackage;
import java.util.HashMap;

public class Check {
	
	private double amount;
	private String text = "";
	private Integer integer;
	private int mantissa;
	public HashMap<Integer, String> unity = new HashMap<Integer, String>();
	public HashMap<Integer, String> decade = new HashMap<Integer, String>();
	
	public Check(double amount) {
		this.amount = amount;
		this.integer = (int) amount;
		if(integer > amount){
			integer --;
		}
		this.mantissa =(int) Math.round(((amount - integer) * 100));
	}

	public String toText() {
		
		if(amount == 1){
			return "One dollar";
		}
		if(amount == 0){
			return "Zero dollars";
		}
		else{
			
			unity.put(1,"one");
			unity.put(2,"two");
			unity.put(3,"three");
			unity.put(4,"four");
			unity.put(5,"five");
			unity.put(6,"six");
			unity.put(7,"seven");
			unity.put(8,"eight");
			unity.put(9,"nine");
			
			decade.put(10,"ten");
			decade.put(11,"eleven");
			decade.put(12,"twelve");
			decade.put(13,"thirteen");
			decade.put(14,"fourteen");
			decade.put(15,"fifteen");
			decade.put(16,"sixteen");
			decade.put(17,"seventeen");
			decade.put(18,"eighteen");
			decade.put(19,"nineteen");
			decade.put(20,"twenty");
			decade.put(30,"thirty");
			decade.put(40,"fourty");
			decade.put(50,"fifty");
			decade.put(60,"sixty");
			decade.put(70,"seventy");
			decade.put(80,"eighty");
			decade.put(90,"ninety");
			decade.put(2,"twenty-");
			decade.put(3,"thirty-");
			decade.put(4,"fourty-");
			decade.put(5,"fifty-");
			decade.put(6,"sixty-");
			decade.put(7,"seventy-");
			decade.put(8,"eighty-");
			decade.put(9,"ninety-");
			
			if((1000 <=integer) && (integer <1000000)){
				int auxInt = (int) integer / 1000;
				if((100 <= auxInt ) && (auxInt < 1000)){
				
					int aux = (int) auxInt / 100;
					text = text + unity.get(aux);
					text = text + " hundred ";
					auxInt = ((int) auxInt) - aux * 100;
					integer = integer - aux * 100000;
		
				}
				
				if((9< auxInt) && (auxInt < 100)){
					
					//auxInt = (int) integer;
					if(decade.containsKey(auxInt)){
						text = text + decade.get(auxInt) + " ";
						integer = integer - auxInt *1000;
						auxInt = 0;
					}
					else{
						int aux = (int) auxInt / 10;
						text = text + decade.get(aux);
						integer = integer - aux *10000;
						auxInt = (int) auxInt - aux * 10;
					}
					
				}
				
				if((1 <= auxInt) && ( auxInt <=9)){
					text = text + unity.get(auxInt) + " ";
					integer = integer - auxInt * 1000;
				}
				
				text = text + "thousand ";
			}
			
			if((100<= integer) && (integer < 1000)){
				
				int auxInt = (int) integer / 100;
				text = text + unity.get(auxInt);
				text = text + " hundred ";
				integer = ((int) integer) - auxInt * 100;
	
			}
			
			if((9<integer) && (integer < 100)){
				
				int auxInt = (int) integer;
				if(decade.containsKey(auxInt)){
					text = text + decade.get(auxInt) + " ";
					integer = ((int) integer) - auxInt;
				}
				else{
					auxInt = (int) integer / 10;
					text = text + decade.get(auxInt);
					integer = ((int) integer) - auxInt * 10;
				}
				
			}
			
			if((1 <= integer) && (integer <=9)){
				text = text + unity.get(integer) + " ";
				integer = (int) amount;
			}
			}	
			text = completeSentence();
			return text;
		}
		
	
	
	private String completeSentence() {
		if(mantissa != 0){
			text  += mantissa+ "/100 ";
		}
		text += "dollars";
		String mayus = text.charAt(0) + "";
		mayus = mayus.toUpperCase();
		text = text.replaceFirst(text.charAt(0) + "",mayus);
		return text;
	}
	
}
