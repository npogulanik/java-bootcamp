package wordWrappingAlgorithmPackage;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sentence {
	
	private String sentence;
	private int length;

	public Sentence(String sentence, int length) {	
		this.sentence = sentence;
		this.length = length;
	}
	
	public String wrappWords(){
		
		if(sentence.length() <= length){
			return sentence;
		}
		else{
			StringTokenizer st = new StringTokenizer(sentence);
			String newSentence = "";
			
			while (st.hasMoreTokens()) { 
	            String token = st.nextToken();  
	            if(token.length() <= length){ 
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
			return newSentence;
			
		}
		
		
		}
		
		/*
		if(sentence.length() <= length){
			String[] a = {sentence};
			
			return toString(a);
		}
		if(sentence.length() > length){

			String auxSentence = sentence;
			StringTokenizer st = new StringTokenizer(auxSentence);
			String[] a = new String[st.countTokens()];
			
		    for(int i = 0 ; i <= a.length ; i++){
		    	a[i] = st.nextToken();
		    }
		    return toString(a);
		}
		else{
			return null;
		}
		*/
	
	
	public String toString(String[] s){
		String aSentence = "";
		for(int i = 0; i <= s.length; i++){
			aSentence.concat(s[i]);
		}
		return aSentence;
	}
	
	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
