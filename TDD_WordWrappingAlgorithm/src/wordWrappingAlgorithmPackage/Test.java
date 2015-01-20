package wordWrappingAlgorithmPackage;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		String auxSentence = "Hello world! something else";
		StringTokenizer st = new StringTokenizer(auxSentence);
	    while(st.hasMoreTokens()) { 
        	//System.out.println(auxSentence = st.nextToken());
        	a.add(st.nextToken());
        } 
	    System.out.println(a.toString());
	    
	    
		//Sentence s1 = new  Sentence("Hello world!", 7);
		//System.out.println(s1.wrappWords());
	}

}
