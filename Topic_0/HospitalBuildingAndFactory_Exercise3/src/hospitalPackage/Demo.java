package hospitalPackage;

public class Demo {

	public static void main(String[] args) {
		
		HospitalBuilder hBuilder = new ItalianHospital();
		ConcreteHospital hDirector = new ConcreteHospital(hBuilder);
		hDirector.constructHospital();
		Hospital hospital = hDirector.getHospital();
		System.out.println("Hospital name: "+hospital+"\n");

	}

}
