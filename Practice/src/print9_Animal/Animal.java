package print9_Animal;

//1
public class Animal {
	//2
	private String kind;
	private String name;
	private String cry;
	private int age;
	
	//3
	Animal(){
		
	}
	
	//4
	Animal(String kind, String name, String cry, int age){
		this.setName(name);
		this.setKind(kind);
		this.setCry(cry);
		this.setAge(age);
	}
	
	//5
	void setKind(String kind) {
		this.kind = kind;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setCry(String cry) {
		this.cry = cry;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void show() {
		System.out.println("%s は%s で、年齢は%d 歳、鳴き声は%s".formatted(this.name,this.kind,this.age,this.cry));
	}
}
