package checkPackage;

public class Test {

	public static void main(String[] args) {
		/*
		double amount = 0.04; 
		int integer = (int) amount;
		int mantissa =(int) (Math.round((amount -integer) * 10));
		System.out.println("Amount:"+ amount);

		System.out.println("Integer:"+ integer);
		System.out.println("Mantissa:"+ mantissa);

		System.out.println("Amount - integer "+ (amount - integer));
		*/
		System.out.println(new Check(120.20).toText());
	}

}
