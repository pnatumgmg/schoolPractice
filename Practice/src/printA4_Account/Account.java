package printA4_Account;

public class Account {
	String name;
	int no;
	int balance;
	
	Account(String name,int no,int balance){
		this.setName(name);
		this.setNo(no);
		this.setBalance(balance);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setNo(int no) {
		this.no = no;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	String getName() {
		return this.name;
	}
	
	int getNo() {
		return this.no;
	}
	
	int getBalance() {
		return this.balance;
	}
	
	void deposit(int money) {
		setBalance(getBalance() + money); 
	}
	
	void withdraw(int money) {
		setBalance(getBalance() - money);
	}
	
	void transfer(Account p, int money) {
		this.setBalance(getBalance() - money);
		p.setBalance(p.getBalance() + money);
	}
	
	void show() {
		System.out.println();
		System.out.println("現在の登録名:%s".formatted(getName()));
		System.out.println("現在の口座番号:%d".formatted(getNo()));
		System.out.println("現在の普通預金残高:%d".formatted(getBalance()));
	}
	void show(String a) {
		System.out.println("現在の登録名:%s".formatted(getName()));
		System.out.println("現在の口座番号:%d".formatted(getNo()));
		System.out.println("現在の普通預金残高:%d".formatted(getBalance()));
	}
}