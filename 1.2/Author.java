/*
 * @author Gonzalo H. Mendoza
 * 
 */
public class Author {

	private String name;
	private String mail;
	private char gender;
	
	//Making a Constructor
	public Author(String name, String mail, char gender){
		this.name = name;
		this.mail = mail;
		this.gender = gender;
	}
	
	//Setters and getters
	
	public void setMail(String mail){
		this.mail = mail;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getMail(){
		return this.mail;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public String toString(){
		return "Author: name = " + this.getName() + "; email = " + this.getMail() + "; gender = " + this.getGender();
	}
}
