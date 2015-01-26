package wordWrappingAlgorithmPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class _TestWordWrappingAlgorithm {

	@Test
	public void longword_to_longword(){
		Sentence s1 = new  Sentence("This is such a long sentence, but not really", 60);	 
		assertEquals(s1.wrappWords(),"This is such a long sentence, but not really");
	}
		
	@Test
	public void helloWorld_to_hello_world() {
		Sentence s1 = new  Sentence("Hello world", 7); 
		assertEquals(s1.wrappWords(),"Hello,world");
	}
	
	@Test
	public void _letter_split() {
		Sentence s1 = new  Sentence("a b c d e f", 3); 
		assertEquals(s1.wrappWords(),"a,b,c,d,e,f");
	}
	
	@Test
	public void _wrapp_word() {
		Sentence s1 = new  Sentence("Excelent", 5); 
		assertEquals(s1.wrappWords(),"Excel,ent");
	}
	
	
}
