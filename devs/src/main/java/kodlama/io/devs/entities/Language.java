package kodlama.io.devs.entities;

public class Language {
	
	int Id;
	String Name;
	
	public Language() {
		
	}

	public Language(int id, String name) {
		Id = id;
		Name = name;
	}
	
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
}
