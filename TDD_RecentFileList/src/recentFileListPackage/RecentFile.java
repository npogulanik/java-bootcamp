package recentFileListPackage;
import java.util.LinkedList;

public class RecentFile {
	
	public static LinkedList<File> queue; //= new LinkedList<File>();
	
	public RecentFile(){
		queue = null;
	}
	
	public void enterQueue(File file){
		for(int i = 0; i <= queue.size(); i++){
			if(queue.equals(file)){
				queue.remove(file);
			}
		}
		if(queue.size() >= 15){
			queue.removeLast();
		}
		queue.addFirst(file);	
	}
	
	public boolean equals(Object aFile){
		for(int i = 0; i <= queue.size(); i++){
			if(queue.get(i) == aFile){
				return true;
			}	
		}
		return false;
	}
	
	public static File leaveQueue(){
		return queue.removeLast();
	}
	
	public void getFile(){
		
	}
	

	

}
