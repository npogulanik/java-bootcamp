package recentFileListPackage;

public class Test {

	public static void main(String[] args) {
		File aFile = new File("file1.txt","Some plot around here","C://users/");
		RecentFile aQueue = new RecentFile();
		aQueue.enterQueue(aFile);
		System.out.println(aFile.toString());
		//System.out.println(RecentFile.queue.get(0).toString());
		//aQueue.openFile(aFile);
		//File anotherFile = new File(aQueue.queue.get(0));
		//System.out.println(anotherFile.toString());

	}

}
