package authorAndBookPackage;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, char gender, String email){
		this.name = name;
		this.email = email;
		if((gender == 'm') || ( gender == 'f')){
			this.gender = gender;
		}	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	
	public String toString(){
		String sentence;
		sentence = name + "(" + email + ")" + email;
		return sentence;
	}

}
