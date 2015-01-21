

public class Latin {
	
	private int roman;
	
	public Latin(int roman){
		this.roman = roman;
	}

	public  String toRoman() {
		if (roman < 1 || roman > 3999){
	        return "Invalid Roman Number Value";
		}
		String s = "";
		while(roman >= 1000){
			s += "M";
			roman = roman - 1000;
		}
		if(roman >= 900){
			s += "CM";
			roman = roman - 900;
		}
		if(roman >= 500){
			s += "D";
			roman = roman - 500;
		}
		if(roman >= 400){
			s += "CD";
			roman = roman - 400;
		}
		while(roman >= 100){
			s += "C";
			roman = roman - 100;
		}
		if(roman >= 90){
			s += "XC";
			roman = roman - 90;
		}
		while(roman >= 50){
			s += "L";
			roman = roman -50;
		}
		while(roman >= 40){
			s += "XL";
			roman = roman - 40;
		}
		while(roman >= 10){
			s += "X";
			roman = roman - 10;
		}
		if(roman == 9){
			s += "IX";
			roman = roman -9;
		}
		if(roman == 5){
			s += "V";
			roman = roman -5;
		}
		if(roman == 4){
			s += "IV";
			roman = roman - 4;
		}
		while( roman >= 1){
			s += "I";
			roman --;
		}
		return s;
	}
	
}