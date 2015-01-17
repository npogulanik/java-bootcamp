package wordWrappingAlgorithmPackage;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sentence {
	
	private String sentence;
	private int length;

	public Sentence(String sentence, int length) {	
		this.sentence = sentence;
		this.length =length;
	}
	
	public String wrappWords(){
		if(sentence.length() <= length){
			return sentence;
		}
		if(sentence.length() > length){
			String auxSentence = sentence;
			ArrayList<String> a = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(auxSentence);
		    while(st.hasMoreTokens()) { 
		    	a.add(st.nextToken());
		    } 
			return a.toString();
		}
		else{
			return null;
		}
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
