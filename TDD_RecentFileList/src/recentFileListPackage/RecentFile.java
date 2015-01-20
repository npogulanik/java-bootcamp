package recentFileListPackage;
import java.util.LinkedList;

public class RecentFile {
	
	public static LinkedList<File> queue; //= new LinkedList<File>();
	
	public RecentFile(){
		queue = null;
	}
	
	
	
	public  static void enterQueue(File file){
		if(queue.contains(file)){
			queue.remove(file);
		}
		if(queue.size() >= 15){
			queue.removeLast();
		}
		queue.addFirst(file);	
	}
	
	public static File leaveQueue(){
		return queue.removeLast();
	}
	
	public static void openFile(File file){
		enterQueue(file);
		System.out.println("PATH"+ file.getPath() + "\nFile name: " + file.getName() + "\n"+file.getContent());
	}
	
	public boolean equals(File file){
		if(file.getName() == queue.getName()){
			
		}
		else{
			
		}
	}

	

}
