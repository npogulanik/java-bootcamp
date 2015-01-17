import static org.junit.Assert.*;

import org.junit.Test;


public class _TestRomanToLatin {

	@Test
	public void test_for_convert_I_to_1(){
		assertEquals(new Roman("I").toLatin(),1);	
	}
	
	@Test
	public void test_for_convert_II_to_2(){
		assertEquals(new Roman("II").toLatin(),2);
	}
	
	@Test
	public void test_for_convert_V_to_5(){
		assertEquals(new Roman("V").toLatin(),5);
	}
	
	@Test
	public void test_for_convert_3_to_III(){
		assertEquals(new Latin(3).toRoman(),"III");
	}
	
	@Test
	public void test_for_convert_13_to_XII(){
		assertEquals(new Latin(13).toRoman(),"XIII");
	}
	
	@Test
	public void test_for_convert_3999_to_MMMCMXCIX(){
		assertEquals(new Latin(3999).toRoman(),"MMMCMXCIX");
	}

}
