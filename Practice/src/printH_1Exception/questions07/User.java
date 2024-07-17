package printH_1Exception.questions07;

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
		if(name == null) {
			System.out.println("nameがnullです。");
			throw new IllegalArgumentException();
		}else if(name.isEmpty()) {
			System.out.println("nameが空です。");
			throw new IllegalArgumentException();
		}else if(!(name.matches("[a-zA-Z]+"))) {
			System.out.println("nameはローマ字で入力して下さい。");
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User[id=" + getId() + ",name=" + getName() + "]";
	}
}

