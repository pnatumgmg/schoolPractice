package print9_bank_1;
/**
 * 【銀行口座を表すクラス】
 */
public class Account {
	private String name;
	private String num;
	private int balance;
	private CreateDate createDate;
	
	Account(String name, String num, int balance, int year, int month, int day){
		this.setName(name);
		this.setNum(num);
		this.setBalance(balance);
		createDate = new CreateDate(year,month,day);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setNum(String num) {
		this.num = num;
	}
	
	String gettNum() {
		return this.num;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	int getBalance() {
		return this.balance;
	}
	
	CreateDate getCreateData() {
		return this.createDate;
	}
	
	void setCreateDate(int year, int month, int day){
		createDate.setYear(year);
		createDate.setMonth(month);
		createDate.setDay(day);
	}
	
	void deposit(int deposit) {
		this.balance += deposit;
	}
	
	void withdraw(int withdraw) {
		this.balance -= withdraw;
	}
	
	void showAccount() {
		System.out.println("口座名義:%s".formatted(this.getName()));
		System.out.println("口座番号:%s".formatted(this.gettNum()));
		System.out.println("口座預金:%d".formatted(this.getBalance()));
		createDate.showCreateData();
		System.out.println();
	}
	
	//(4-7)(4-8)で長文を２回入力するのがめんどくさいので作成
	void plusAlpha() {
		System.out.println("%sの預金額は%d円です".formatted
				(this.getName(),this.getBalance()));
	}
}