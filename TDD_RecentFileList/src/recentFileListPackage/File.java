package recentFileListPackage;

public class File {
	
	private String name;
	private String content;
	private String path;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File() {
		
	}

	public File(String name, String content, String path) {
		this.name = name;
		this.content = content;
		this.path = path;
	}
	
	public File(File anotherFile){
		name = anotherFile.name;
		content = anotherFile.content;
		path = anotherFile.path;
	}
	
	
	
}
