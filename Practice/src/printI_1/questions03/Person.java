package printI_1.questions03;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Person(String name,int age,int height,int weight){
		setName(name);
		setAge(age);
		setHeight(height);
		setWeight(weight);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
