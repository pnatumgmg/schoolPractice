package print8_1.questions03;

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
		System.out.println("社員番号  :%d".formatted(this.id_data));
		System.out.println("氏名      :%s".formatted(this.name_data));
		System.out.println("所属部署  :%s".formatted(this.division_data));
		System.out.println("給与      :%d".formatted(this.salary_data));
	}
	
//	public static void countDivision(Employee[] employees) {
	public void countDivision(Employee[] employees) {
		int eigyou = 0;
		int soumu = 0;
		
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].division_data.equals("営業部"))
				eigyou ++;
			else if (employees[i].division_data.equals("総務部"))
				soumu ++;
		}
		
		System.out.println("営業部：%d人".formatted(eigyou));
		System.out.println("総務部：%d人".formatted(soumu));
	}
}