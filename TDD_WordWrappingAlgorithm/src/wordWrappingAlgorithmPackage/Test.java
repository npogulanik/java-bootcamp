package wordWrappingAlgorithmPackage;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		int length = 5;
		StringTokenizer st = new StringTokenizer("Excelent");
		String newSentence = "";
		
		while (st.hasMoreTokens()) { 
            String token = st.nextToken();  
            if((token.length()) <= length){ 
            	newSentence = newSentence + token;
            	newSentence = newSentence + ",";
            }    
            else{
            	int count = 0;
            	String aux = "";
            	for (int i = 0; i < token.length(); i++){
            		char letter = token.charAt(i);
            		aux = aux + letter;
            		count ++;
            		if((count == length)||(i == token.length() - 1)){
            			newSentence = newSentence + aux;
    	            	newSentence = newSentence + ",";
    	            	aux = "";
    	            	count = 0;
            		}
            		}
            }  
		} 
		newSentence = newSentence.substring (0, newSentence.length() - 1);
		
		System.out.println(newSentence);
		
	}

}
