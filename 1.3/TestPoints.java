
public class TestPoints {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Another implementation 
		MyPoint[] puntos = new MyPoint[10];
		for(int i = 0; i < puntos.length; i++){
			//Instance of MyPoint like an example
			puntos[i] = new MyPoint(i,i);
		}
		//Show the distance between two points
		System.out.println(puntos[2].distance(puntos[1]));
	}

}
