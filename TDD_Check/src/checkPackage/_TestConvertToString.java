package checkPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class _TestConvertToString {

	@Test
	public void test_4_four() {
		Check check = new Check(4);
		assertEquals(check.toText(),"Four dollars");
	}

	@Test
	public void test_7_seven(){
		assertEquals(new Check(7).toText(),"Seven dollars");
	}
	
	@Test 
	public void test_1_one(){
		assertEquals(new Check(1).toText(),"One dollar");
	}
	
	@Test
	public void test_61_sixty_one(){
		assertEquals(new Check(61).toText(),"Sixty-one dollars");
	}
	
	@Test
	public void test_04_to_4_100(){
		assertEquals(new Check(0.04).toText(),"4/100 dollars");
	}
	
	@Test
	public void test_20_twenty(){
		assertEquals(new Check(20).toText(),"Twenty dollars");
	}
	
	@Test
	public void test_12_twelve(){
		assertEquals(new Check(12).toText(),"Twelve dollars");
	}
	
	@Test
	public void test_104_Hundred_four(){
		assertEquals(new Check(104).toText(),"One hundred four dollars");
	}
	
	@Test
	public void test_120_60_one_hundred_twenty_6_100(){
		assertEquals(new Check(120.60).toText(),"One hundred twenty 60/100 dollars");
	}
	
	@Test
	public void _1568_to_onethousand_fiftyhundred_sixtyeight_dollars(){
		assertEquals(new Check(1568).toText(),"One thousand five hundred sixty-eight dollars");
	}
	
	@Test
	public void _523568_toString(){
		assertEquals(new Check(523568).toText(),"Five hundred twenty-three thousand five hundred sixty-eight dollars");
	}
	
}
