package printH_1Exception.questions06;

public class User{
	private int id;
	private String name;
	
	User(int id,String name)throws IllegalArgumentException{
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setId(int id) throws IllegalArgumentException{
		if (id < 0) {
			System.out.println("idが負の数です。");
			throw new IllegalArgumentException();
		}
		this.id = id;
	}
	
	public void setName(String name) throws IllegalArgumentException{
		if(name.isEmpty() | name == null) {
			System.out.println("nameがnullまたは空です。");
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User[id=" + getId() + ",name=" + getName() + "]";
	}
}

