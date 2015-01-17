package recentFileListPackage;
import java.util.LinkedList;

public class RecentFile {
	
	LinkedList<File> queue = new LinkedList<File>();
	
	public RecentFile(){
		queue = null;
	}
	
	public RecentFile(File file){
		queue.addFirst(file);	
	}
	
	public void enterQueue(File file){
		if(queue.contains(file)){
			queue.remove(file);
		}
		if(queue.size() >= 15){
			queue.removeLast();
		}
		queue.addFirst(file);	
	}
	
	public File leaveQueue(){
		return queue.removeLast();
	}
	
	public void openFile(File file){
		enterQueue(file);
		System.out.println("PATH"+ file.getPath() + "\nFile name: " + file.getName() + "\n"+file.getContent());
	}

	

}
