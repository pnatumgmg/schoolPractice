package printH_1Exception.questions09;

public class User{
	private int id;
	private String name;
	private int age;
	
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
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) throws IllegalArgumentException{
		if(age < 0 || age > 121) {
			System.out.println("年齢は0～120の間で入力して下さい。");
			throw new IllegalArgumentException();
		}
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User[id=" + getId() + ",name=" + getName() + "]";
	}
}

