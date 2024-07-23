package printJ_FileWriter.questions01;

public class Person {
	String firstName;
	String name;
	int age;
	String job;
	
	public Person(String firstName,String name,int age,String job) {
		// TODO 自動生成されたコンストラクター・スタブ
		setFirstName(firstName);
		setName(name);
		setAge(age);
		setJob(job);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
