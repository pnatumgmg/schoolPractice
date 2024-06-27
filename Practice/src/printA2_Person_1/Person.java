package printA2_Person_1;

public class Person {
	private String name;
	private Day birthday;
	private Day today;
	
	Person(Day today,String name,int birthYear,int birthMonth,int birthDay){
		this.today = today;
		this.name = name;
		this.birthday = new Day(birthYear,birthMonth,birthDay);
	}
	
	String getName() {
		return this.name;
	}
	
	Day getBirthday() {
		return this.birthday;
	}
	
	Day getToday() {
		return this.today;
	}
	
	
	//5-1
	int calculateAge() {
		int age = this.getToday().getYear() - this.getBirthday().getYear();
		if(this.getToday().getMonth() == this.getBirthday().getMonth()) {
			if (this.getToday().getDay() < this.getBirthday().getDay()) {
				return age --;
			}else {
				return age;
			}
		}else if (this.getToday().getMonth() < this.getToday().getMonth()) {
			return age --;
		}else {
			return age;
		}
	}
	//5-2
	void introduce() {
		System.out.println("こんにちは。私の名前は%sです。\n年齢は%dです。"
				.formatted(getName(),calculateAge()));
	}
}
