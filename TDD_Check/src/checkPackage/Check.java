package checkPackage;

public class Check {
	
	private double amount;
	private String text = "";
	private int integer;
	private int mantissa;

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
			if((100<= integer) && (integer < 1000)){
				integer = (int) integer / 100;
				text = text + getUnity();
				text = text + " hundred ";
				integer = (int) amount;
				integer = integer - (int) (Math.round(amount / 100))*100;
			}
			if((9<integer) && (integer < 100)){
				text = text + getDecade();
				
			}
				//if (integer == 61) {return "Sixty-one dollars";}
				if (integer != 0){
					text = text + getUnity();
				}
				
				text = completeSentence();
				return text;
		}
	}

	private String getDecade() {
		
		switch(integer){
		case 10:{
			integer = integer - 10;
			return "ten";
		}
		case 11:{
			integer = integer -11;
			return "eleven";
		}
		case 12:{
			integer = integer - 12;
			return "twelve";
		}
		case 13:{
			integer = integer -13;
			return "thirteen";
		}
		case 14:{
			integer = integer -14;
			return "fourteen";
		}
		case 15:{
			integer = integer -15;
			return "fifteen";
		}
		case 16:{
			integer = integer -16;
			return "eleven";
		}
		case 17:{
			integer = integer -17;
			return "seventeen";
		}
		case 18:{
			integer = integer -18;
			return "eighteen ";
		}
		case 19:{
			integer = integer - 19;
			return "nineteen ";
		}
		case 20:{
			integer = integer - 20;
			return "twenty ";
		}
		case 30:{
			integer = integer - 30;
			return "thirty ";
		}
		case 40:{
			integer = integer - 40;
			return "forty ";
		}
		case 50:{
			integer = integer - 50;
			return "fifty ";
		}
		case 60:{
			integer = integer - 60;
			return "sixty ";
		}
		case 70:{
			integer = integer - 70;
			return "seventy ";
		}
		case 80:{
			integer = integer - 80;
			return "eighty ";
		}
		case 90:{
			integer = integer - 90;
			return "ninety ";
		}
		}
		
		
		int auxInteger = integer /10;
		switch(auxInteger){
		case 2:{
			integer = integer - 20;
			return "twenty-";
		}
		case 3:{
			integer = integer - 30;
			return "thirty-";
		}
		case 4:{
			integer = integer - 40;
			return "forty-";
		}
		case 5:{
			integer = integer - 50;
			return "fifty-";
		}
		case 6:{
			integer = integer - 60;
			return "sixty-";
		}
		case 7:{
			integer = integer - 70;
			return "seventy-";	
		}
		case 8:{
			integer = integer - 80;
			return "eighty-";
		}
		case 9:{
			integer = integer - 90;
			return "ninety-";
		}
		default:{
		throw new IllegalArgumentException("Argument Invalid");
		}
		}
	}

	private String completeSentence() {
		if(mantissa != 0){
			text  += mantissa+ "/100";
		}
		text += " dollars";
		String mayus = text.charAt(0) + "";
		mayus = mayus.toUpperCase();
		text = text.replaceFirst(text.charAt(0) + "",mayus);
		return text;
	}

	public String getUnity(){
		switch(integer){
		case 1:{
			integer = integer - 1;
			return "one";
		}
		case 2:{
			integer = integer - 2;
			return "two";
		}
		case 3:{
			integer = integer - 3;
			return "three";
		}
		case 4:{
			integer = integer - 4;
			return "four";
		}
		case 5:{
			integer = integer - 5;
			return "five";
		}
		case 6:{
			integer = integer - 6;
			return "six";
		}
		case 7:{
			integer = integer - 7;
			return "seven";
		}
		case 8:{
			integer = integer - 8;
			return "eight";
		}
		case 9:{
			integer = integer - 9;
			return "nine";
		}
		case 0:{
			return "";
		}
		default:{
			return "Not a valid number";
		}
	}
		
	}

	
	
	
	
	
	
}
