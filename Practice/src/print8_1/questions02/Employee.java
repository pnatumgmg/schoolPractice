package print8_1.questions02;

public class Employee {
	int id_data;             //社員番号
	String name_data;        //氏名
	String division_data;   //所属部署
	int salary_data;         //給与
	
	public void setAll(int id, String name, String division, int salary) {
		this.id_data = id;
		this.name_data = name;
		this.division_data = division;
		this.salary_data = salary;
	}
	
	public void information() {
		System.out.println("社員番号  :%d".formatted(id_data));
		System.out.println("氏名      :%s".formatted(name_data));
		System.out.println("所属部署  :%s".formatted(division_data));
		System.out.println("給与      :%d".formatted(salary_data));
	
	}
		
}