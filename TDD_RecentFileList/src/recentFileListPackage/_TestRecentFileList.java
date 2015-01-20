package recentFileListPackage;
import static org.junit.Assert.*;

import org.junit.Test;

public class _TestRecentFileList {

	@Test
	public void testFirstTime() {
		RecentFile q = new RecentFile();
		assertEquals(RecentFile.queue,null);		
	}
	
	@Test
	public void test_a_file(){
		File aFile = new File("file1.txt","Some plot around here","C://users/");
		//RecentFile aQueue = new RecentFile();
		RecentFile.enterQueue(aFile);
		//File anotherFile = new File(RecentFile.queue.get(0));
		assertEquals(RecentFile.queue.get(0).toString(),aFile);		
	}

}
